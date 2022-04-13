/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficheroaleatorioventana;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.JFrame;

/**
 *
 * @author LuciiaCasadoo
 */
public class SuperClaseDepart extends JFrame {

    public SuperClaseDepart() {
    }

    void visualiza(int dep) {
        String nom = "";
        String loca = "";
        long pos;
        int depa;
        File fichero = new File("AleatorioDep.dat");
        try {
            RandomAccessFile file = new RandomAccessFile(fichero, "r");
            // Calculo del reg a leer
            pos = 44 * (dep - 1);
            file.seek(pos);
            depa = file.readInt();
            System.out.println("Depart leido:" + depa);
            char[] nom1 = new char[10];
            char aux;
            char[] loc1 = new char[10];
            for (int i = 0; i < 10; i++) {
                aux = file.readChar();
                nom1[i] = aux;
            }
            for (int i = 0; i < 10; i++) {
                aux = file.readChar();
                loc1[i] = aux;
            }
            nom = new String(nom1);
            loca = new String(loc1);
            System.out.println("DEP: " + dep + ", Nombre: " + nom + ", Localidad: " + loca);
            nombre.setText(nom);
            loc.setText(loca);
            file.close();
        } catch (IOException e1) {
            System.out.println("ERRROR AL LEEERRRRRR AleatorioDep.dat");
            e1.printStackTrace();
        }
    } // fin visualiza

    void grabar(int dep, String nom, String loc) {
        long pos;
        StringBuffer buffer = null;
        File fichero = new File("AleatorioDep.dat");
        try {
            RandomAccessFile file = new RandomAccessFile(fichero, "rw");
            // Calculo del reg a leer
            pos = 44 * (dep - 1);
            //if (file.length()==0) return false; // si est� vac�o
            file.seek(pos);
            file.writeInt(dep);
            buffer = new StringBuffer(nom);
            buffer.setLength(10);
            file.writeChars(buffer.toString()); //insertar nombre
            buffer = new StringBuffer(loc);
            buffer.setLength(10);
            file.writeChars(buffer.toString()); //insertar loc
            file.close();
            System.out.println(" GRABADOOO el " + dep);
        } catch (IOException e1) {
            System.out.println("ERRROR AL grabarr AleatorioDep.dat");
            e1.printStackTrace();
        }
    } // fin grabar

}
