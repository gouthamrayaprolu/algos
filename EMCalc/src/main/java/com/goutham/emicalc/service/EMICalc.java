package com.goutham.emicalc.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goutham.emicalc.dao.EMIModelRepo;
import com.goutham.emicalc.model.EMIModel;

@Service
public class EMICalc {

	@Autowired
	EMIModelRepo repo;

    public Double calcEmi(double p, double r, double n) {
    		//EMI = [P x R x (1+R)^N]/[(1+R)^N-1]

            double R = (r / 12) / 100;
            double e = (p * R * (Math.pow((1 + R), n)) / ((Math.pow((1 + R), n)) - 1));

            return e;
    }

    public List<EMIModel> calcEmiAllMonths(double p, double r, double n) {

            double R = (r / 12) / 100;
            double P = p;
            double e = calcEmi(P, r, n);
            double totalInt = Math.round((e * n) - p);
            double totalAmt = Math.round((e * n));
            double intPerMonth = Math.round(totalInt / n);
            List<EMIModel> schedule = new LinkedList<EMIModel>();
            for (double i = 1; i <= n; i++) {
            		EMIModel model = new EMIModel();
                    intPerMonth = (P * R);
                    P = ((P) - ((e) - (intPerMonth)));
                    model.setMonth((int) i);
                    model.setInterest(Math.round(intPerMonth));
                    model.setPrincipal(Math.round((Math.round(e) - intPerMonth)));
                    model.setBalance(Math.round(P));
                    model.setEmi(Math.round((e)));
                    schedule.add(model);
                    repo.save(model);
            }
			return schedule;
    }

}