import javax.swing.*;
import java.util.Scanner;

public class PruebaPanelDibujo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //creo una instancia de la clase PanelDibujo
        PanelDibujo panel = new PanelDibujo();
        //creo un marco en la ventana
        JFrame aplicacion = new JFrame();
        //pongo un boton para cerrar la ventana
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*String nombre;
        System.out.printf("Ingrese su nombre: ");
        nombre=entrada.nextLine();
        panel.usuario(nombre);*/

        float peso, altura;
        System.out.printf("Ingrese su peso en kg: ");
        peso= entrada.nextFloat();
        System.out.printf("Ingrese su altura en m: ");
        altura= entrada.nextFloat();
        panel.imc(peso,altura);

        aplicacion.add(panel);//agrego un "panel" a la ventana
        aplicacion.setSize(800,800);//seteo el tamaño de la ventana
        aplicacion.setVisible(true);//permito que se vea la ventana

    }
}
