package Abstraction.Interfaces.music.string;
import  Abstraction.Interfaces.music.Playable;


public class Veena implements Playable {
    @Override
    public void play(){
        System.out.println("Playing Veena");
    }
    
}
