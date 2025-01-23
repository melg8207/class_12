package super_sub_classes.program_10;
public class FindMax {
    int m,n;
    public FindMax(int nx,int ny) {
        m=nx;
        n=ny;
    }
    // find largest from two integers
    public int GetMax(int x,int y) {
        int g=Math.max(x,y);
        return g;
    }
}
