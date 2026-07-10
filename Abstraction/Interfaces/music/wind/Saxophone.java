package Abstraction.Interfaces.music.wind;
import Abstraction.Interfaces.music.Playable;


public class Saxophone implements Playable{
    @Override
    public void play(){
        System.out.println("Playing Saxophone");
    }
    
}
