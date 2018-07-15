package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class File {

//    public static void main(String[] args){
////        Scanner input = new Scanner(System.in);;
////        System.out.print("Digite o nome do arquivo:");
////        
////        Conta conta = new Conta("Fulaninho", "Hehe", 1000, 2001);
////        
////        if (escreva(input.nextLine(), conta)) {
////            System.out.println("Salvo com sucesso!");
////        }
//    }
    
    public static boolean escreva(String arquivo, Object o) {
        try (FileOutputStream arq = new FileOutputStream(arquivo)) {
            ObjectOutputStream obj = new ObjectOutputStream(arq);
            obj.writeObject(o);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
    
    public static Object leia(String arquivo) {
        try (FileInputStream arq = new FileInputStream(arquivo)) {
            ObjectInputStream obj = new ObjectInputStream(arq);
            return obj.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return false;
        }
    }
}