package HandleFile;

import java.io.*;
import java.util.ArrayList;

public class FileIO<T> {
    public <T> void writeDataToFile(ArrayList<T> list, String fileName){
        File file = new File(fileName);
        try {
            if(file.exists()){
                file.createNewFile();}
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public <T> ArrayList<T> readDataFromFile(String fileName){
        File f = new File(fileName);
        ArrayList<T> list = new ArrayList<>();
        if(f.length() > 0){
            try {
                f.createNewFile();
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis);
                list = (ArrayList<T>) ois.readObject();
                ois.close();
                fis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}
