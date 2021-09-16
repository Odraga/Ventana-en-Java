import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class Formulario extends JFrame implements ActionListener{

    JMenuBar mb;
    JMenu archivo, insertar, menu3, vista, menu5;


    //Submenu del Menu 1: Archivo
    JMenuItem nuevo, abrir, guardar, guardarComo, salir;

    //Submenu del Menu 4: Vista
    JMenuItem tamanoVentana, tamano1, tamano2, tamano3;

    //Submenu del Menu 5: Ayuda
    JMenuItem verAyuda, enviarComentario, acercaDe;

    public Formulario() {
        setLayout(null);
        mb = new JMenuBar();
        setJMenuBar(mb);

        //Menu 1: Archivo
        archivo = new JMenu("Archivo");
        mb.add(archivo);

        nuevo = new JMenuItem("Nuevo");
        nuevo.addActionListener(this);
        archivo.add(nuevo);

        abrir = new JMenuItem("Abrir");
        abrir.addActionListener(this);
        archivo.add(abrir);

        guardar = new JMenuItem("Guardar");
        guardar.addActionListener(this);
        archivo.add(guardar);

        guardarComo = new JMenuItem("Guardar Como");
        guardarComo.addActionListener(this);
        archivo.add(guardarComo);

        salir = new JMenuItem("Salir");
        salir.addActionListener(this);
        archivo.add(salir);

        //Menu 2: Insertar
        insertar = new JMenu("Insertar");
        mb.add(insertar);

        //mi2=new JMenuItem("Verde");
       // mi2.addActionListener(this);
       // menu2.add(mi2);

        //Menu 3
        menu3 = new JMenu("Revisión");
        mb.add(menu3);

       // mi3=new JMenuItem("Azul");
       // mi3.addActionListener(this);
       // menu1.add(mi3);

        //Menu 4: Vista
        vista = new JMenu("Vista");
        mb.add(vista);
        tamanoVentana = new JMenu("Tamaño Ventana");
        vista.add(tamanoVentana);

        //Tamaño ventana 900x900
        tamano1 = new JMenuItem("Tamaño: 900x900");
        tamano1.addActionListener(this);
        tamanoVentana.add(tamano1);
        //Tamaño ventana 500x500
        tamano2 = new JMenuItem("Tamaño: 500x500");
        tamano2.addActionListener(this);
        tamanoVentana.add(tamano2);
        //Tamaño ventana 300x300
        tamano3 = new JMenuItem("Tamaño: 300x300");
        tamano3.addActionListener(this);
        tamanoVentana.add(tamano3);

        //Menu 5
        menu5 = new JMenu("Ayuda");
        mb.add(menu5);

        verAyuda=new JMenuItem("Ver la Ayuda");
        verAyuda.addActionListener(this);
        menu5.add(verAyuda);

        enviarComentario=new JMenuItem("Enviar comentario");
        enviarComentario.addActionListener(this);
        menu5.add(enviarComentario);

        acercaDe = new JMenuItem("Acerca de System Store");
        acercaDe.addActionListener(this);
        menu5.add(acercaDe);
    }

    public void actionPerformed(ActionEvent e) {

        //Container f = this.getContentPane();

        //menu 1: Archivo
        if (e.getSource() == nuevo) {
            JOptionPane.showMessageDialog(null,"Nuevo Archivo");
        }
        if (e.getSource() == salir) {
            System.exit(0);
        }

        //menu 4: Vista
        if (e.getSource() == tamano1){
            setSize(900,900);
        }
        if (e.getSource() == tamano2){
            setSize(500,500);
        }
        if (e.getSource() == tamano3){
            setSize(300,300);
        }

        //Menu 5: Ayuda
        if(e.getSource() == verAyuda){
            URL url;
            try {
                url = new URL("https://ufhec.edu.do/wp-content/uploads/2019/07/PENSUM-INGENIERI-de-software.pdf");
                try {
                    Desktop.getDesktop().browse(url.toURI());
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            } catch (MalformedURLException e1) {
                e1.printStackTrace();
            }
        }
    }

    public static void main(String[] arg) {
        Formulario formulario1 = new Formulario();
        formulario1.setBounds(0,0,500,500);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton botonNuevo = new JButton();
        JButton botonAceptar = new JButton();
        JButton botonCancelar = new JButton();

        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();

        botonNuevo.setSize(150, 50);
        botonNuevo.setLocation(180, 80);
        botonNuevo.setText("Nuevo");

        botonAceptar.setSize(150, 50);
        botonAceptar.setLocation(180, 190);
        botonAceptar.setText("Aceptar");

        botonCancelar.setSize(150, 50);
        botonCancelar.setLocation(180, 320);
        botonCancelar.setText("Cancelar");


        label1.setText("Bienvenido a esta practica");
        label1.setSize(200,30);
        label1.setLocation(180, 10);

        label2.setText("Matricula: SD-20-30015");
        label2.setSize(200,30);
        label2.setLocation(190, 30);

        label3.setText("Prof: Martin Uribe de la Cruz");
        label3.setSize(200,30);
        label3.setLocation(175, 50);

        //agregar botones a la ventana
        formulario1.add(botonNuevo);
        formulario1.add(botonAceptar);
        formulario1.add(botonCancelar);

        //agregar labels a la ventana
        formulario1.add(label1);
        formulario1.add(label2);
        formulario1.add(label3);
    }
}
