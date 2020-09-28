package simulator.view;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Sound 
{
    public void sound()
    {       
        try{
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File("src/Sonidos/fondo.wav").getAbsoluteFile());
            Clip sonido = AudioSystem.getClip();
            sonido.open(audio);
            sonido.start();
            sonido.loop(Clip.LOOP_CONTINUOUSLY); //repetir siempre
        }catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex){System.out.println("Error");}
    }
}  
