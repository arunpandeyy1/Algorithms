/**
 * @author Arun Pandey
 */
public class QuickUnion 
{
    static int id[];
    public static void quickUnion(int n)
    {
        id = new int[n];
        for(int i=0;i<n;i++)
        {
            id[i] = i;
        }
    }
    static public int root(int i)
    {
        while(i!=id[i])
        {
            i = id[i];
        }
        return i;
    }
    static public boolean connected(int p,int q)
    {
        return root(p)==root(q);
    }
     static public void union(int p,int q)
    {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }
}