import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
import java.lang.*;
import java.util.*;
/**buffered
 * Write a description of class SaveGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SaveGame extends Actor
{
    private static SaveGame save;
    
    public SaveGame(){   
    }
    
    public static SaveGame getGameRecords(){
        if (save == null){
            save = new SaveGame();
        }
        return save;
    }
    
    public void setFile(int vida, int puntaje, int nivel){
        String vidaActual = String.valueOf(vida);
        String puntajeActual = String.valueOf(puntaje);
        String nivelActual = String.valueOf(nivel);
        
        try {
            
            String contenido = vidaActual + puntajeActual +nivelActual;
            File file = new File("files/gameRecord.txt");
            
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(vidaActual+"\n");
            bw.write(puntajeActual+"\n");
            bw.write(nivelActual+"\n");
            
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public int [] readFile(String nameFile){
        Scanner archivo = null;
        int datos[];
        datos = new int[3];
        try{
            archivo = new Scanner(new File(nameFile));
            
        }catch(Exception e){
            System.err.println("no hay archivo");
        }
        
        int num = 0, i = 1;
        int vidas = 1, puntaje = 2;
        int nivel = 3;
        while (archivo.hasNext()){
            if (i == vidas){
                datos[0] = num;
                System.out.println("Vidas: "+datos[0]);
            }
            if (i == puntaje){
                datos[1] = num;
                System.out.println("Puntaje: "+datos[1]);
            }
            if (i == nivel){
                datos[2] = num;
                System.out.println("Nivel: "+datos[2]);
            }
            i++;
        }
        return datos;
    }
    
}
