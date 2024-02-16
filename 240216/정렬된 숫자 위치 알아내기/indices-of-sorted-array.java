import java.util.*;

public class Main {
    static class Node implements Comparable<Node> {
        int index, value;

        Node(int index, int value) {
            this.index = index;
            this.value = value;
        }

        @Override
        public int compareTo(Node o) {
            if(this.value == o.value) {
                return this.index - o.index;
            } else {
                return this.value - o.value;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Node[] nodes = new Node[N];
        int[] answer = new int[N];
        
        for(int i=0; i<N; i++) {
            nodes[i] = new Node(i, sc.nextInt());
        }
        
        Arrays.sort(nodes);
        
        for(int i=0; i<N; i++) {
            answer[nodes[i].index] = i+1;
        }
        
        for(int i=0; i<N; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}