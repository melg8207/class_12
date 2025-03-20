import java.io.*;
public class database implements Serializable {
    @Serial
    private static final long serialVersionUID=1L;
    account[] data;
    public database() {
        data=new account[250];
    }
    public boolean isIdInUse(String id) {
        for(account acc:data) {
            if(acc!=null&&acc.id.equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }
}