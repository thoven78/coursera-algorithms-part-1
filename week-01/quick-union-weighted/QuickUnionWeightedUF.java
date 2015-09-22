public class QuickUnionWeightedUF {
    private int[] id;
    private int[] sz;

    // Constructor
    public QuickUnionWeightedUF(int N) {
        // Initialize our array setting each object connected to itself
        id = new int[N];
        sz = new int[N];
        for(int i = 0; i < N; i++) {
            id[i] = i;
            sz[i] = 1;
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
        if (i == j) return;

        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        } else {
            id[j] = i;
            sz[i] += sz[j];
        }
        print();
    }

    // Show the id
    public void print() {
        String out = "";
        for( int i = 0; i < id.length; i++) {
            out += id[i];
            if (i < id.length - 1 ) out += " ";
        }
        System.out.println(out);
    }
}
