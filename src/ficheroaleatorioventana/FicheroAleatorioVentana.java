/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheroaleatorioventana;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import javax.swing.JFrame;

/**
 *
 * @author LuciiaCasadoo
 */
public class FicheroAleatorioVentana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        JFrame f = new JFrame("DEPARTAMENTOS.");
        RandomAccessFile file;
        file = new RandomAccessFile(new File("AleatorioDep.dat"), "rw");
        file.close();

        VentanaDepart v = new VentanaDepart(f);
        v.setVisible(true);

        FicheroAleatorioVentana fa = new FicheroAleatorioVentana();
        ClaseAnidada ej = new ClaseAnidada();
        ej.entrada();
        System.out.println("Llamo a Salida: " + ej.salida(10));
           

    }//fin main
}//fin class

