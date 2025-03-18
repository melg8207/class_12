import java.io.*;
class database implements Serializable {
    @Serial
    private static final long serialVersionUID=1L;
    account[] data;
    database() {
        data=new account[250];
    }
    boolean isIdInUse(String id) {
        for (account acc:data) {
            if(acc!=null&&acc.id.equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }
}