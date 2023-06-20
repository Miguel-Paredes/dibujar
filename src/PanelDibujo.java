import javax.swing.*;
import java.awt.*;

public class PanelDibujo extends JPanel {
    String nom;
    public void usuario(String nombre){
        this.nom=nombre;
    }
    float peso_us, altura_us, imc_usuario;
    String usuario=Float.toString(imc_usuario);
    public void imc(float peso, float altura){
        this.peso_us=peso;
        this.altura_us=altura;
        imc_usuario=peso_us/(altura_us*altura_us);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int anchura=getWidth();
        int altura=getHeight();
        /*g.drawLine(0,0,anchura,altura);
        g.drawLine(0,altura,anchura,0);*/
        /*g.drawLine(10,0,10,altura);
        g.drawLine(10,0,250,250);
        g.drawLine(440,0,250,250);
        g.drawLine(440,0,440,altura);*/
        //g.drawRoundRect(0,0,50,50,30,30);
        //g.drawString("jp",20,20);
        //g.drawString(nom,400,400);
        g.drawString(usuario,400,400);

    }
}
