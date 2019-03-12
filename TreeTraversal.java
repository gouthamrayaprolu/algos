import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.TreeMap;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class TreeTraversal {

    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new Node(6);
        node.right.right = new Node(7);
        System.out.println("Vertical order: ");
        printVerticalOrder(node);
        System.out.println("Top view: ");
        topView(node);

    }

    static void printVerticalOrder(Node node) {
        Map<Integer, List<Integer>> map = new TreeMap<Integer, List<Integer>>();
        int hd = 0;
        List<Integer> list = null;
        map = verticalView(map, hd, node);

        for (Entry e : map.entrySet()) {
            List<Integer> l = (List) e.getValue();
            System.out.println(l);
        }
    }

    static Map verticalView(Map map, int hd, Node node) {
        List<Integer> list = null;
        if (!map.containsKey(hd)) {

            list = new ArrayList<Integer>();
            list.add(node.data);
            map.put(hd, list);
        }
        else {
            list = (List<Integer>) map.get(hd);
            list.add(node.data);
            map.put(hd, list);
        }
        if (node.left != null) {
            verticalView(map, hd - 1, node.left);
        }
        if (node.right != null) {
            verticalView(map, hd + 1, node.right);
        }

        return map;
    }

    static void topView(Node node) {

        class QueueObj {
            int hd;
            Node nd;

            QueueObj(int hd, Node nd) {
                this.hd = hd;
                this.nd = nd;
            }

        }
        Map<Integer, Integer> map = new TreeMap();

        Queue<QueueObj> q = new LinkedList<QueueObj>();

        QueueObj qqq = new QueueObj(0, node);
        q.add(qqq);
        while (!q.isEmpty()) {
            QueueObj qObj = (QueueObj) q.poll();

            if (!map.containsKey(qObj.hd)) {
                map.put(qObj.hd, qObj.nd.data);

            }

            if (qObj.nd.left != null) {
                q.add(new QueueObj(qObj.hd - 1, qObj.nd.left));
            }
            if (qObj.nd.right != null) {
                q.add(new QueueObj(qObj.hd + 1, qObj.nd.right));

            }
        }

        for (Entry e : map.entrySet()) {
            System.out.print(e.getValue() + " ");
        }
    }

}
