
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import static java.lang.Thread.sleep;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sathindu
 */
public class Main_1 extends JFrame {
    private JButton button,button1,button2;
    private ImageIcon image1;
    private JLabel label1,labe;
    private JLabel img;
    private JLabel l1,l2,l3;
    private JLabel label[] =new JLabel[9];
     private JTextField th[]= new JTextField [9];
     private JTextField tm[]= new JTextField[9];
     private JTextField gata1,gata2,f1,f2;
     private JFileChooser jf;
     private int x=0,y=0;     
     int hr[]= new int[9]; 
     int mi[]=new int[9];
     int g1=0;
     int g2=0;
     int fg1=0;
     int fg2=0;
     int  a=0;
     int b=0;
     int c=0;
     int d=0;
     int f=0;
     int j=0;
     int k=0;     
     int hour=0;
    int minute=0;
    int second=0;
    int g=0;
    
   Thread music;
   Clip clip,clip1; 
   
   public Main_1(){
      
    setLayout( new FlowLayout());
    
    image1 = new ImageIcon(getClass().getResource("dharmasoka1.png"));
    img = new JLabel(image1);
    add(img);
    
    labe= new JLabel("Dharmasoka College");
    labe.setFont(new java.awt.Font("Ubuntu", 1, 36));
    labe.setForeground(Color.BLUE);
    add (labe);
    
    label1 = new JLabel("");             
    add(label1);   
     label[0] = new JLabel("2nd period                :               ");
     label[0].setFont(new java.awt.Font("Ubuntu",2,20));
     add(label[0]); 
   
     th[0]= new JTextField("8");
     th[0].setColumns(2);
     th[0].setFont(new java.awt.Font("Ubuntu",1,20));
     add(th[0]);
    
    tm[0]= new JTextField("30");
    tm[0].setColumns(2);
    tm[0].setFont(new java.awt.Font("Ubuntu",1,20));
    add(tm[0]);
                           
    label[1] = new JLabel("3rd period              :               ");
   label[1].setFont(new java.awt.Font("Ubuntu",2,20));
   add(label[1]);   
   th[1]= new JTextField("9");
   th[1].setColumns(2);
   th[1].setFont(new java.awt.Font("Ubuntu",1,20));
   add(th[1]);
   tm[1]= new JTextField("10");
   tm[1].setColumns(2);
   tm[1].setFont(new java.awt.Font("Ubuntu",1,20));
   add(tm[1]);
   label[2] = new JLabel("4rd period              :               ");
   label[2].setFont(new java.awt.Font("Ubuntu",2,20));
   add(label[2]);
   th[2]= new JTextField("9");
   th[2].setColumns(2);
   th[2].setFont(new java.awt.Font("Ubuntu",1,20));
   add(th[2]);
   tm[2]= new JTextField("50");
   tm[2].setColumns(2);
   tm[2].setFont(new java.awt.Font("Ubuntu",1,20));
   add(tm[2]);
      
   label[3] = new JLabel("Interval                  :               ");
   label[3].setFont(new java.awt.Font("Ubuntu",2,20));
   add(label[3]);
   th[3]= new JTextField("10");
   th[3].setColumns(2);
   th[3].setFont(new java.awt.Font("Ubuntu",1,20));
   add(th[3]);
   tm[3]= new JTextField("30");
   tm[3].setColumns(2);
   tm[3].setFont(new java.awt.Font("Ubuntu",1,20));
   add(tm[3]);
   
   l1=new JLabel("Music                    :               ");
   l1.setFont(new java.awt.Font("Ubuntu",2,20));
   add(l1);
   gata1=new JTextField("10");
   gata1.setColumns(2);
   gata1.setFont(new java.awt.Font("Ubuntu",2,20));
   add(gata1);
   gata2=new JTextField("47");
   gata2.setColumns(2);
   gata2.setFont(new java.awt.Font("Ubuntu",2,20));
   add(gata2);   
  
  
   label[4] = new JLabel("5th period              :               ");
   label[4].setFont(new java.awt.Font("Ubuntu",2,20));
   add(label[4]);
   th[4]= new JTextField("10");
   th[4].setColumns(2);
   th[4].setFont(new java.awt.Font("Ubuntu",1,20));
   add(th[4]);
  tm[4]= new JTextField("52");
  tm[4].setColumns(2);
   tm[4].setFont(new java.awt.Font("Ubuntu",1,20));
   add(tm[4]);
   
   label[5] = new JLabel("6th period              :               ");
   label[5].setFont(new java.awt.Font("Ubuntu",2,20));
   add(label[5]);
   th[5]= new JTextField("11");
   th[5].setColumns(2);
   th[5].setFont(new java.awt.Font("Ubuntu",1,20));
   add(th[5]);
   tm[5]= new JTextField("30");
   tm[5].setColumns(2);
   tm[5].setFont(new java.awt.Font("Ubuntu",1,20));
   add(tm[5]);
 
   label[6] = new JLabel("7th period              :               ");
   label[6].setFont(new java.awt.Font("Ubuntu",2,20));
   add(label[6]);
   th[6]= new JTextField("12");
   th[6].setColumns(2);
   th[6].setFont(new java.awt.Font("Ubuntu",1,20));
   add(th[6]);
   tm[6]= new JTextField("10");
   tm[6].setColumns(2);
   tm[6].setFont(new java.awt.Font("Ubuntu",1,20));
   add(tm[6]);

   label[7] = new JLabel("8th period              :               ");
   label[7].setFont(new java.awt.Font("Ubuntu",2,20));
   add(label[7]);
   th[7]= new JTextField("12");
   th[7].setColumns(2);
   th[7].setFont(new java.awt.Font("Ubuntu",1,20));
   add(th[7]);
   tm[7]= new JTextField("50");
   tm[7].setColumns(2);
   tm[7].setFont(new java.awt.Font("Ubuntu",1,20));
   add(tm[7]);
   
   label[8] = new JLabel("Last Bell                :               ");
   label[8].setFont(new java.awt.Font("Ubuntu",2,20));
   add(label[8]);
   th[8]= new JTextField("13");
   th[8].setColumns(2);
   th[8].setFont(new java.awt.Font("Ubuntu",1,20));
   add(th[8]);
   tm[8]= new JTextField("26");
   tm[8].setColumns(2);
   tm[8].setFont(new java.awt.Font("Ubuntu",1,20));
   add(tm[8]);
   
    l2 = new JLabel("Final Gata              :               ");
    l2.setFont(new java.awt.Font("Ubuntu",2,20));
    add(l2);
   f1= new JTextField("13");
   f1.setColumns(2);
   f1.setFont(new java.awt.Font("Ubuntu",1,20));
   add(f1);
   f2= new JTextField("29");
   f2.setColumns(2);
   f2.setFont(new java.awt.Font("Ubuntu",1,20));
   add(f2);
 
   button1 = new JButton("Bell");
   button1.setFont(new java.awt.Font("Ubuntu",1,20));   
   add(button1);		
    event1 e1 = new event1();
    button1.addActionListener(e1);
   
   button = new JButton("Stop");
   button.setFont(new java.awt.Font("Ubuntu",1,20));   
   add(button);		
  event e = new event();
  button.addActionListener(e);
   
  
  currentTime();
  sound();
   }
   public class event1 implements ActionListener{
           public void actionPerformed(ActionEvent e1){
             play();
                WaitForBell(a);
            }
    }
   public class event implements ActionListener{
	public void actionPerformed(ActionEvent e){
            if(x==0){
		    button.setText("Play");
                    music.suspend();
		    x=1;
		}
		else if(x==1){
			button.setText("Stop");
                        music.resume();
			x=0;
		}
	}	
	
    }
   public void gata1(){
    try{
        g1= Integer.parseInt(gata1.getText());
        g2= Integer.parseInt(gata2.getText());
        fg1=Integer.parseInt(f1.getText());
        fg2=Integer.parseInt(f2.getText());
       // g = Integer.parseInt(tm[4].getText());
    }catch(NumberFormatException e){        
    }
    
}
public void Rhours(){
    for(int i=0;i<th.length;i++){
        try{
            hr[i]= Integer.parseInt(th[i].getText());
             }catch(NumberFormatException e){
             }
        }
         
}
    

public void Rminute(){
    
    for(int i=0;i<tm.length;i++){
        try{
            mi[i]= Integer.parseInt(tm[i].getText());
             }catch(NumberFormatException e){
             }
        }
         
    
}
public void currentTime(){
   
   Thread clock = new Thread(){
       public void run(){
           for (;;){
            LocalDateTime cal = LocalDateTime.now();
             
                    second = cal.getSecond();
                    minute = cal.getMinute();
                    hour = cal.getHour();
                    
     label1.setText(hour+" : "+minute+" : "+second);
    label1.setFont(new java.awt.Font("Ubuntu", 1, 36));
        try  {
        sleep(1000);
         } catch (Exception e){
        JOptionPane.showMessageDialog(null, e);
    }  
    }
    
           }   
         
   }; 
   clock.start();
   
  

    
}
public void WaitForBell(int x){
     try{
         sleep(x);
         }catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
                  }
}
public void sound(){
   //int status = 0;
      music = new Thread(){
        public void run(){
        boolean bell=false;
        boolean mor=false;        
        boolean ga=false;
         
         
        
        for(;;){             
            int i=0;
            Rhours();
            Rminute();
            gata1();
            //inter();
            //setWindow();
            
            for(i=0;i< 9;i++){
                if (hour== hr[i] & minute== mi[i] & second <10){
                    bell = true;
                    break;
                }    
            }
            
             if (bell){
                 label[i].setForeground(Color.RED);
                 
                  play();
                 WaitForBell(a);
                 bell=false;
             }
             
             if (hour== g1 & minute== g2 & second <10){
                    mor = true;
                    }    
            
             if (mor){
                 l1.setForeground(Color.RED);
                  damso();
                 WaitForBell(c);
                  Bhawana();
                 WaitForBell(b);                 
                                  
                 mor=false;
             }
                 if (hour== fg1 & minute== fg2 & second <10){
                    ga = true;
                    }    
            
             if (ga){
                 l2.setForeground(Color.RED);
                   Final();
                   WaitForBell(f);
                             
                   ga=false;
             }
             if (hour == 14){
                 Runtime runtime = Runtime.getRuntime();
                try {
                    Process proc = runtime.exec("shutdown -s -t 0");
                } catch (IOException ex) {
                    Logger.getLogger(Main_1.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.exit(0);                 
             }
                 
     
         try  {
               sleep(1000);
         } catch (Exception e){
          JOptionPane.showMessageDialog(null, e);
         }  
            
        }
    }
    };
   music.start();
    
}
   public void play(){    
        try{
         ClassLoader CL = this.getClass().getClassLoader();
         AudioInputStream audioStream = AudioSystem.getAudioInputStream(this.getClass().getResourceAsStream("BELL.WAV"));
         AudioFormat format = audioStream.getFormat();
         DataLine.Info info = new DataLine.Info(Clip.class, format);
        
           Clip audioClip = (Clip) AudioSystem.getLine(info);
            
            audioClip.open(audioStream);
            audioClip.start();
            a = (int)audioClip.getMicrosecondLength()/1000;
            System.out.println(a);
        /*    
        InputStream bell=CL.getResourceAsStream("BELL.WAV");
        BufferedInputStream bin= new BufferedInputStream(bell);    
        AudioInputStream ais = AudioSystem.getAudioInputStream(bell);            
        Clip clip = AudioSystem.getClip();
        clip.open(ais);           
        clip.start();
         */   
        }
            catch(UnsupportedAudioFileException Exception ){} catch (IOException ex) {
                Logger.getLogger(Main_1.class.getName()).log(Level.SEVERE, null, ex);
            } catch (LineUnavailableException ex) {
                Logger.getLogger(Main_1.class.getName()).log(Level.SEVERE, null, ex);
            }
            
 
}
   public void Bhawana(){
    try{
         ClassLoader CL = this.getClass().getClassLoader();
         AudioInputStream audioStream = AudioSystem.getAudioInputStream(this.getClass().getResourceAsStream("Bhawana.wav"));
         AudioFormat format = audioStream.getFormat();
         DataLine.Info info = new DataLine.Info(Clip.class, format);
        
           Clip audioClip = (Clip) AudioSystem.getLine(info);
            
            audioClip.open(audioStream);
            audioClip.start();
            b = (int)audioClip.getMicrosecondLength()/1000;
            System.out.println(a);
            
            }
            catch(UnsupportedAudioFileException Exception ){} catch (IOException ex) {
                Logger.getLogger(Main_1.class.getName()).log(Level.SEVERE, null, ex);
            } catch (LineUnavailableException ex) {
                Logger.getLogger(Main_1.class.getName()).log(Level.SEVERE, null, ex);
            }
}
public void damso(){
    try{
         ClassLoader CL = this.getClass().getClassLoader();
         AudioInputStream audioStream = AudioSystem.getAudioInputStream(this.getClass().getResourceAsStream("damso.wav"));
         AudioFormat format = audioStream.getFormat();
         DataLine.Info info = new DataLine.Info(Clip.class, format);
        
           Clip audioClip = (Clip) AudioSystem.getLine(info);
            
            audioClip.open(audioStream);
            audioClip.start();
            c = (int)audioClip.getMicrosecondLength()/1000;
            System.out.println(a);
            
            }
            catch(UnsupportedAudioFileException Exception ){} catch (IOException ex) {
                Logger.getLogger(Main_1.class.getName()).log(Level.SEVERE, null, ex);
            } catch (LineUnavailableException ex) {
                Logger.getLogger(Main_1.class.getName()).log(Level.SEVERE, null, ex);
            }
}
public void Final(){
     try{
         ClassLoader CL = this.getClass().getClassLoader();
         AudioInputStream audioStream = AudioSystem.getAudioInputStream(this.getClass().getResourceAsStream("final.wav"));
         AudioFormat format = audioStream.getFormat();
         DataLine.Info info = new DataLine.Info(Clip.class, format);
        
           Clip audioClip = (Clip) AudioSystem.getLine(info);
            
            audioClip.open(audioStream);
            audioClip.start();
            f = (int)audioClip.getMicrosecondLength()/1000;
            System.out.println(a);
            
            }
            catch(UnsupportedAudioFileException Exception ){} catch (IOException ex) {
                Logger.getLogger(Main_1.class.getName()).log(Level.SEVERE, null, ex);
            } catch (LineUnavailableException ex) {
                Logger.getLogger(Main_1.class.getName()).log(Level.SEVERE, null, ex);
            }

}
    
    public static void main(String[] agrs){
        Main_1 gui = new Main_1();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               gui.setVisible(true);
                //gui.pack();
	        gui.setSize(380,700);
		gui.setTitle("My Window");
                gui.setBackground(new java.awt.Color(55, 219, 243));
    }
    
}
