package ResolucçaoDeTela;
import javax.swing.JFrame;
import java.awt.Dimension;
public class ResoluçãoTela 
{
    public static void main(String[] args) 
    {
         JFrame janela = new JFrame();
          Dimension dim = janela.getToolkit().getScreenSize();  
    System.out.println("A largura em pixel da tela é:"+ dim.width);
    System.out.println("A altura em pixel é:%d "+dim.height);
    
    }
}

