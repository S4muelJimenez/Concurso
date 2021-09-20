
package concurso_de_preguntas;

import java.io.*;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LaminaJuego extends JPanel implements ActionListener {
    
    private boolean A= false;
    private boolean B= false;
    private boolean C= false;
    private boolean D= false;
    private int nivel=1;
    private int puntos=0;
    private String nombre;
    JButton opcionA =new JButton("A");
    JButton opcionB =new JButton("B");
    JButton opcionC =new JButton("C");
    JButton opcionD =new JButton("D");
    TextField textOpcionA = new TextField();
    TextField textOpcionB = new TextField();
    TextField textOpcionC = new TextField();
    TextField textOpcionD = new TextField();
    TextField pregunta = new TextField();
    TextField puntoAcumulados = new TextField();
    
    

    
    public LaminaJuego() {
        
        this.setLayout(null);
        
        // propiedades seccion pregunta
       puntoAcumulados.setEditable(false);
       puntoAcumulados.setBounds(10,50, 460,50);
       puntoAcumulados.setText("Puntos acumulados: "+getPuntos());
       Font font1 = new Font("Dialog",0, 28);
       puntoAcumulados.setFont(font1);
       add(puntoAcumulados);
        
        // propiedades seccion pregunta
       pregunta.setEditable(false);
       pregunta.setBounds(10,150, 460,150);
       
       add(pregunta);
        
       //propiedades sección opción-A 
       textOpcionA.setEditable(false);
       textOpcionA.setBounds(90,350,130,50);
       opcionA.setBounds(20,350, 50,50);
       add(opcionA);
       add(textOpcionA);
       
       
       //propiedades sección opción-B
       textOpcionB.setEditable(false);
       textOpcionB.setBounds(90,405,130,50);
       opcionB.setBounds(20,405, 50,50);
       add(opcionB);
       add(textOpcionB);
       
       
       //propiedades sección opción-C
       textOpcionC.setEditable(false);
       opcionC.setBounds(270,350, 50,50);
       textOpcionC.setBounds(340,350,130,50);
       add(opcionC);
       add(textOpcionC);
       
       
       //propiedades sección  opción-D
       textOpcionD.setEditable(false);
       textOpcionD.setBounds(340,405,130,50);
       opcionD.setBounds(270,405,50,50);
       add(opcionD);
       add(textOpcionD);
       
       
       
       opcionA.addActionListener(this);
       opcionB.addActionListener(this);
       opcionC.addActionListener(this);
       opcionD.addActionListener(this);
        
       insertarPreguntas();
       String nombreJugador=JOptionPane.showInputDialog("Introduce tu nombre"); 
       nombre=nombreJugador;
    }
    
    // Setters y Getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public boolean isA() {
        return A;
    }

    public void setA(boolean A) {
        this.A = A;
    }

    public boolean isB() {
        return B;
    }

    public void setB(boolean B) {
        this.B = B;
    }

    public boolean isC() {
        return C;
    }

    public void setC(boolean C) {
        this.C = C;
    }

    public boolean isD() {
        return D;
    }

    public void setD(boolean D) {
        this.D = D;
    }
    
    //_______________________________________________________________________________________
    
    public void actionPerformed (ActionEvent e) {
    
    Object botonPulsado=e.getSource();
    
    
    if (botonPulsado==opcionA && A == true){
        
        
        puntuacionTotal ();
        int n = JOptionPane.showConfirmDialog(
        this, "Has acumulado "+getPuntos()+" puntos ¿deseas continuar?",
        "Felicidades",
        JOptionPane.YES_NO_OPTION);
        System.out.print(n);
        if(n==0){
            insertarPreguntas();
            if(getPuntos()==16400){
                JOptionPane.showMessageDialog(this,"Felicidades haz ganado todos los puntos posibles. El programa se cerrara" );
                System.exit(0);  
            }
        }
        else{
            JOptionPane.showMessageDialog(this,"Gracias por participar has ganado"+getPuntos()+" puntos");
             System.exit(0);
        }
    }
    else if (botonPulsado==opcionB && B == true){
        
        
        puntuacionTotal ();
        int n = JOptionPane.showConfirmDialog(
        this, "Has acumulado "+getPuntos()+" puntos ¿deseas continuar?",
        "Felicidades",
        JOptionPane.YES_NO_OPTION);
        System.out.print(n);
        if(n==0){
            insertarPreguntas();
            if(getPuntos()==16400){
                JOptionPane.showMessageDialog(this,"Felicidades haz ganado todos los puntos posibles. El programa se cerrara" );
                System.exit(0);  
            }
        }
        else{
            JOptionPane.showMessageDialog(this,"Gracias por participar has ganado"+getPuntos()+" puntos. El programa se cerrara");
            System.exit(0);
        }
    }
    else if (botonPulsado==opcionC && C == true){
        
        
        puntuacionTotal ();
        int n = JOptionPane.showConfirmDialog(
        this, "Has acumulado "+getPuntos()+" puntos ¿deseas continuar?",
        "Felicidades",
        JOptionPane.YES_NO_OPTION);
        System.out.print(n);
        if(n==0){
            insertarPreguntas();
            if(getPuntos()==16400){
                JOptionPane.showMessageDialog(this,"Felicidades haz ganado todos los puntos posibles. El programa se cerrara" );
                System.exit(0);  
            }
        }
        else{
            JOptionPane.showMessageDialog(this,"Gracias por participar has ganado"+getPuntos()+" puntos. . El programa se cerrara");
            System.exit(0);
        }
    }
    else if (botonPulsado==opcionD && D == true){
        
        
        puntuacionTotal ();
        int n = JOptionPane.showConfirmDialog(
        this, "Has acumulado "+getPuntos()+" puntos ¿deseas continuar?",
        "Felicidades",
        JOptionPane.YES_NO_OPTION);
        System.out.print(n);
        if(n==0){
            insertarPreguntas();
            if(getPuntos()==16400){
                JOptionPane.showMessageDialog(this,"Felicidades haz ganado todos los puntos posibles. El programa se cerrara" );
                System.exit(0);  
            }
        }
        else{
            JOptionPane.showMessageDialog(this,"Gracias por participar has ganado"+getPuntos()+" puntos. El programa se cerrara" );
            System.exit(0);
        }
    }
    else {
    
        JOptionPane.showMessageDialog(this,"Lo sentimos, has perdido. El programa se cerrara. Gracias por jugar");
        try {
            GuardarDatos();
        } catch (IOException ex) {
            Logger.getLogger(LaminaJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        System.exit(0);
    }
    
    
    }
    
    public void insertarPreguntas (){
    int randomNum = ThreadLocalRandom.current().nextInt(1,6);
        
    if (this.getNivel()==1){
       switch(randomNum){
           case 1:
              pregunta.setText("Pregunta Nivel 1: ¿Cómo se llama el hermano de Mario Bros?");
              textOpcionA.setText("Yoshi");
              textOpcionB.setText("Bowser");
              textOpcionC.setText("Peach");
              textOpcionD.setText("Luigi");
              this.setA(false);
              this.setB(false);
              this.setC(false);
              this.setD(true);
              break;
           case 2:
              pregunta.setText("Pregunta Nivel 1: ¿En qué cordillera se encuentra el Monte Everest?");
              textOpcionA.setText("Himalaya");
              textOpcionB.setText("Andes");
              textOpcionC.setText("Béticas");
              textOpcionD.setText("Alpes");
              this.setA(true);
              this.setB(false);
              this.setC(false);
              this.setD(false);
              break;
           case 3:
              pregunta.setText("Pregunta Nivel 1: ¿Cuál es la red social más usada del mundo?  ");
              textOpcionA.setText("Instagram");
              textOpcionB.setText("Twitter");
              textOpcionC.setText("Facebook");
              textOpcionD.setText("Youtube");
              this.setA(false);
              this.setB(false);
              this.setC(true);
              this.setD(false);
              break;
           case 4:
              pregunta.setText("Pregunta Nivel 1: ¿ Qué marca vende más teléfonos en el mundo? ");
              textOpcionA.setText("Samsung");
              textOpcionB.setText("Huwaei");
              textOpcionC.setText("Apple");
              textOpcionD.setText("Xiaomi");
              this.setA(true);
              this.setB(false);
              this.setC(false);
              this.setD(false);
              break;
           default:
              pregunta.setText("Pregunta Nivel 1: ¿Cuál es el edificio más alto del mundo? ");
              textOpcionA.setText("Pearl River Tower");
              textOpcionB.setText("Shanghai Tower");
              textOpcionC.setText("Burj Khalifa");
              textOpcionD.setText("KXJB-TV Tower");
              this.setA(true);
              this.setB(false);
              this.setC(false);
              this.setD(false);
              break;
    
       }
    this.setNivel(getNivel()+1);    
        
    }
    else if (this.getNivel()==2){
       switch(randomNum){
           case 1:
              pregunta.setText("Pregunta Nivel 2: ¿Con qué nombre se conoció a Mario Bros por primera vez? ");
              textOpcionA.setText("Plumber Man");
              textOpcionB.setText("Mario");
              textOpcionC.setText("Jumpman");
              textOpcionD.setText("Hero");
              this.setA(false);
              this.setB(false);
              this.setC(true);
              this.setD(false);
              break;
           case 2:
              pregunta.setText("Pregunta Nivel 2: ¿Cuál es la isla más grande del mar Caribe?");
              textOpcionA.setText("Puerto Rico");
              textOpcionB.setText("Trinidad");
              textOpcionC.setText("Cuba");
              textOpcionD.setText("Alto Velo");
              this.setA(false);
              this.setB(false);
              this.setC(true);
              this.setD(false);
              break;
           case 3:
              pregunta.setText("Pregunta Nivel 2: ¿Cuál es el atleta con más medallas olímpicas?");
              textOpcionA.setText("Usain Bolt");
              textOpcionB.setText("Michael Phelps");
              textOpcionC.setText("Novak Djokovic");
              textOpcionD.setText("Simone Biles");
              this.setA(false);
              this.setB(true);
              this.setC(false);
              this.setD(false);
              break;
           case 4:
              pregunta.setText("Pregunta Nivel 2: ¿Cuál es el animal que más muertes provoca cada año? ");
              textOpcionA.setText("La Serpiente");
              textOpcionB.setText("El Tiburon");
              textOpcionC.setText("El mosquito");
              textOpcionD.setText("El Cocodrilo");
              this.setA(false);
              this.setB(false);
              this.setC(true);
              this.setD(false);
              break;
           default:
              pregunta.setText("Pregunta Nivel 2: ¿Qué emperador romano legalizó el cristianismo? ");
              textOpcionA.setText("Nerón");
              textOpcionB.setText("Adriano");
              textOpcionC.setText("Trajano");
              textOpcionD.setText("Constantino"); 
              this.setA(false);
              this.setB(false);
              this.setC(false);
              this.setD(true);
              break;
    
       }
    this.setNivel(getNivel()+1);    
      
    }
    else if (this.getNivel()==3){
       switch(randomNum){
           case 1:
              pregunta.setText("Pregunta Nivel 3:¿Cuál es el océano más grande del mundo? ");
              textOpcionA.setText("Pacífico");
              textOpcionB.setText("Índico");
              textOpcionC.setText("Antártico");
              textOpcionD.setText("Atlántico");
              this.setA(true);
              this.setB(false);
              this.setC(false);
              this.setD(false);
              break;
           case 2:
              pregunta.setText("Pregunta Nivel 3: ¿Quiénes crearon el número 0?");
              textOpcionA.setText("Los rusos");
              textOpcionB.setText("Los romanos");
              textOpcionC.setText("Los árabes");
              textOpcionD.setText("los hindús");
              this.setA(false);
              this.setB(false);
              this.setC(false);
              this.setD(true);
              break;
           case 3:
              pregunta.setText("Pregunta Nivel 3: ¿Qué científico es considerado el Padre de la Bomba Atómica?");
              textOpcionA.setText("Robert Oppenheimer");
              textOpcionB.setText("Richard Feynman");
              textOpcionC.setText("Jonas Salk");
              textOpcionD.setText("Niels Bohr");
              this.setA(true);
              this.setB(false);
              this.setC(false);
              this.setD(false);
              break;
           case 4:
              pregunta.setText("Pregunta Nivel 3: ¿Cuál es el desierto más grande del mundo? ");
              textOpcionA.setText("Sahara");
              textOpcionB.setText("Atacama");
              textOpcionC.setText("Médanos de Coro");
              textOpcionD.setText("La Antartida");
              this.setA(false);
              this.setB(false);
              this.setC(false);
              this.setD(true);
              break;
           default:
              pregunta.setText("Pregunta Nivel 3: ¿Cuál videojuego se estrenó primero? ");
              textOpcionA.setText("Pac-man");
              textOpcionB.setText("Tetris");
              textOpcionC.setText("Pong");
              textOpcionD.setText("Donkey Kong");
              this.setA(false);
              this.setB(false);
              this.setC(true);
              this.setD(false);
              break;
    
       }
    this.setNivel(getNivel()+1);    
        
        
    }
    else if (this.getNivel()==4){
       switch(randomNum){
           case 1:
              pregunta.setText("Pregunta Nivel 4: ¿De qué está hecho el escudo del Capitán América?");
              textOpcionA.setText("Adamantium");
              textOpcionB.setText("Vibranio");
              textOpcionC.setText("Prometeo");
              textOpcionD.setText("Carbonadio");
              this.setA(true);
              this.setB(false);
              this.setC(false);
              this.setD(false);
              break;
           case 2:
              pregunta.setText("Pregunta Nivel 4: ¿Cuál es el principal río que recorre el Gran Cañón de USA?");
              textOpcionA.setText("rio Mississippi");
              textOpcionB.setText("río Grande");
              textOpcionC.setText("río Colorado");
              textOpcionD.setText("río Missouri");
              this.setA(false);
              this.setB(false);
              this.setC(true);
              this.setD(false);
              break;
           case 3:
              pregunta.setText("Pregunta Nivel 4: ¿Cómo se llama el principal enemigo de Sonic? ");
              textOpcionA.setText("Dr malo");
              textOpcionB.setText("Robotech");
              textOpcionC.setText("Tails");
              textOpcionD.setText("Dr. Robonik");
              this.setA(false);
              this.setB(false);
              this.setC(false);
              this.setD(true);
              break;
           case 4:
              pregunta.setText("Pregunta Nivel 4: ¿Cuál es la batalla en la que fue derrotado Napoleón Bonaparte? ");
              textOpcionA.setText("Stalingrado");
              textOpcionB.setText("Waterloo");
              textOpcionC.setText("Verdún");
              textOpcionD.setText("Leningrado");
              this.setA(false);
              this.setB(true);
              this.setC(false);
              this.setD(false);
              break;
           default:
              pregunta.setText("Pregunta Nivel 4: ¿En qué país se encuentra Transilvania? ");
              textOpcionA.setText("Rumanía");
              textOpcionB.setText("Rusia");
              textOpcionC.setText("Lituania");
              textOpcionD.setText("No existe ");
              this.setA(true);
              this.setB(false);
              this.setC(false);
              this.setD(false);
              break;
    
       }
    this.setNivel(getNivel()+1);    
        
        
    }
    else if (this.getNivel()==5){
       switch(randomNum){
           case 1:
              pregunta.setText("Pregunta Nivel 5: ¿Cómo se llama el martillo de Thor?");
              textOpcionA.setText("Mjolnir");
              textOpcionB.setText("Aesir");
              textOpcionC.setText("Vanir");
              textOpcionD.setText("Norn");
              this.setA(true);
              this.setB(false);
              this.setC(false);
              this.setD(false);
              break;
           case 2:
              pregunta.setText("Pregunta Nivel 5: ¿En qué país se originó el videojuego Tetris?");
              textOpcionA.setText("Estados unidos");
              textOpcionB.setText("China");
              textOpcionC.setText("Japón");
              textOpcionD.setText("Rusia");
              this.setA(false);
              this.setB(false);
              this.setC(false);
              this.setD(true);
              break;
           case 3:
              pregunta.setText("Pregunta Nivel 5: ¿Quién fue el primero en recibir un premio Nobel de Literatura?");
              textOpcionA.setText("Novelista");
              textOpcionB.setText("Dramaturgo");
              textOpcionC.setText("Poeta");
              textOpcionD.setText("Ensayista");
              this.setA(false);
              this.setB(false);
              this.setC(true);
              this.setD(false);
              break;
           case 4:
              pregunta.setText("Pregunta Nivel 5: ¿Cuántos mares rodean la península de los Balcanes? ");
              textOpcionA.setText("3");
              textOpcionB.setText("4");
              textOpcionC.setText("5");
              textOpcionD.setText("6");
              this.setA(false);
              this.setB(false);
              this.setC(false);
              this.setD(true);
              break;
           default:
              pregunta.setText("Pregunta Nivel 5: ¿Cuál es la ciudad más antigua del mundo? ");
              textOpcionA.setText("Damasco");
              textOpcionB.setText("Tebas");
              textOpcionC.setText("Cirene");
              textOpcionD.setText("Cnosos"); 
              this.setA(true);
              this.setB(false);
              this.setC(false);
              this.setD(false);
              break;
    
       }
    this.setNivel(getNivel()+1);    
        
        
    }
    else {
    }
    }
    public void puntuacionTotal (){
    
        switch (this.getNivel()) {
            case 1:
                this.setPuntos(this.getPuntos()+0);
                break;
            case 2:
                this.setPuntos(this.getPuntos()+100);
                break;
            case 3:
                this.setPuntos(this.getPuntos()+300);
                break;
            case 4:
                this.setPuntos(this.getPuntos()+1000);
                break;
            case 5:
                this.setPuntos(this.getPuntos()+5000);
                break;
            default:
                this.setPuntos(this.getPuntos()+10000);
                break;
        }
    puntoAcumulados.setText("Puntos acumulados: "+getPuntos());
    }
    
    public void GuardarDatos() throws IOException{
        




    BufferedWriter objetoBuffer = null;
    FileWriter objetoFile = null;

    try {
        String data = "Nombre: "+this.getNombre()+" - puntaje: "+getPuntos()+";  ";
        File file = new File("puntuaciones.txt");
        // Si el archivo no existe, se crea!
        if (!file.exists()) {
            file.createNewFile();
        }
        // flag true, indica adjuntar información al archivo.
        objetoFile = new FileWriter(file.getAbsoluteFile(), true);
        objetoBuffer = new BufferedWriter(objetoFile);
        objetoBuffer.write(data);
        System.out.println("información agregada!");
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        try {
                        //Cierra instancias de FileWriter y BufferedWriter
            if (objetoBuffer != null)
                objetoBuffer.close();
            if (objetoFile != null)
                objetoFile.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
      
    }
    
    
}
