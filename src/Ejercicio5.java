import java.io.*;
import java.nio.charset.StandardCharsets;

public class Ejercicio5 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file=new File("Personas.txt");
        FileOutputStream fos=new FileOutputStream(file);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(new Persona(40,"Juan","Garcia","234578L","Hombre"));
        oos.close();

        FileInputStream fis=new FileInputStream(file);
        ObjectInputStream ois=new ObjectInputStream(fis);
        Persona p=new Persona((Persona) ois.readObject());
        System.out.println(p);
    }
}
