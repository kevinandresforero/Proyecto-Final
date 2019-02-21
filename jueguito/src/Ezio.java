
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;


public class Ezio extends Personaje{

    public Ezio(Juego jueguito) {
        super(jueguito);
    }
  

         
    public void paint (Graphics2D g){
        int contador=0;
        Image[] correr = {
            new ImageIcon(getClass().getResource("../Imagenes/k1.png")).getImage(),
            new ImageIcon(getClass().getResource("../Imagenes/k2.png")).getImage(),
            new ImageIcon(getClass().getResource("../Imagenes/k3.png")).getImage(),
            new ImageIcon(getClass().getResource("../Imagenes/k4.png")).getImage()};
   
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
		
        if (e.getKeyCode() == KeyEvent.VK_SPACE)
            {
                saltando=true;
            }
    }
}
