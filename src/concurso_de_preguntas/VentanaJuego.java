
package concurso_de_preguntas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VentanaJuego extends JFrame {
    

    public VentanaJuego(){
        setTitle ("Juego");
        setSize(500,500);
        setLocationRelativeTo(null);
        LaminaJuego laminaJUno = new LaminaJuego ();
        setResizable(false);
        add(laminaJUno);
    }
    
}
