import java.io.*;
class framework {
    database database;
    framework() {
        database=new database();
    }
    void uploadChanges() throws IOException {
        try (ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("bankDatabase.txt"))) {
            out.writeObject(database);
        }
    }
    void init() throws IOException, ClassNotFoundException {
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