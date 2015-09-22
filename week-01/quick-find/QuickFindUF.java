public class QuickFindUF {

    private int[] id;

    public static void main(String[] args) {
      // unionized the following 6-3 4-2 5-7 9-7 2-0 7-0
      QuickFindUF x = new QuickFindUF(10);
      x.union(6, 3);
      x.union(4, 2);
      x.union(5, 7);
      x.union(9, 7);
      x.union(2, 0);
      x.union(7, 0);

      x.print(); // 0 1 0 3 0 0 3 0 8 0

      // Explanation
      // Here is the id[] array after each union operation:

      //       0 1 2 3 4 5 6 7 8 9 
      // 6-3:  0 1 2 3 4 5 3 7 8 9
      // 4-2:  0 1 2 3 2 5 3 7 8 9
      // 5-7:  0 1 2 3 2 7 3 7 8 9
      // 9-7:  0 1 2 3 2 7 3 7 8 7
      // 2-0:  0 1 0 3 0 7 3 7 8 7
      // 7-0:  0 1 0 3 0 0 3 0 8 0
    }

    // Constructor
    public QuickFindUF(int N) {
        // Initialize our array setting each object connected to itself
        id = new int[N];
        for(int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    // Find operation
    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    // Join two objects into the same component
    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for(int i=0; i<id.length; i++) {
            if(id[i] == pid) {
                id[i] = qid;
            }
        }
    }

    // Displays the id string
    public void print() {
        String out = "";
        for(int i = 0; i < id.length; i++) {
            out += id[i];
            if (i < id.length - 1) out += ' ';
        }
        System.out.println(out);
    }
}
