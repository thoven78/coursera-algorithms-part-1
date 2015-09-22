public class QuickUnionUF {
    private int[] id;

    // Constructor
    public QuickUnionUF(int N) {
        // Initialize our array setting each object connected to itself
        id = new int[N];
        for(int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    // Find the root of an object
    private int root(int i) {
        while( i != id[i] ) {
            i = id[i];
        }
        return i;
    }

    // Find operation
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    // Join to objects into the same component
    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
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
