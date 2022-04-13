/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ficheroaleatorioventana;

import java.awt.event.ActionEvent;

/**
 *
 * @author LuciiaCasadoo
 */
public interface InterfaceVentanaDepart {

    /**
     *
     * @param e
     * @param existeDepart1
     */
    public void modifdepart(ActionEvent e, String existeDepart1);

    /**
     *
     * @param e
     * @param existeDepart1
     */
    public void borradepart(ActionEvent e, String existeDepart1);

    /**
     *
     * @param e
     * @param existeDepart1
     */
    public void consuldepart(ActionEvent e, String existeDepart1);

    /**
     *
     * @param e
     * @param existeDepart1
     * @param prueba
     * @return
     */
    public int altadepart(ActionEvent e, String existeDepart1, String prueba);

}
