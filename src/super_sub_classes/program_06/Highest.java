package super_sub_classes.program_06;
public class Highest extends Record {
    int index;
    public Highest(int cap) {
        super(cap);
        index=-1;
    }
    // finds index of the student getting the highest mark and assigns it to index
    public void find() {
        index=0;                        // assumption of the first student with the highest marks
        for(int i=1;i<size;i++) {
            if(m[i]>m[index]) {
                index=i;                // updating the index to the current highest
            }
        }
    }
    public void displayHighest() {
        for(int i=0;i<size;i++) {
            if(m[i]==m[index])  {
                System.out.println("Highest mark obtained by: "+n[i]+" - "+m[i]+"%");
            }
        }
    }
}
