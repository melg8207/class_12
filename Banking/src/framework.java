import java.io.*;
public class framework {
    database database;
    public framework() {
        database=new database();
    }
    public void uploadChanges() throws IOException {
        try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("bankDatabase.txt"))) {
            out.writeObject(database);
        }
    }
    public void init() throws IOException,ClassNotFoundException {
        File file=new File("bankDatabase.txt");
        if(!file.exists()) {
            database=new database();
            uploadChanges();
        }else {
            try(ObjectInputStream in=new ObjectInputStream(new FileInputStream(file))) {
                database=(database)in.readObject();
            }catch(EOFException|StreamCorruptedException e) {
                database=new database();
                uploadChanges();
            }
        }
    }
}