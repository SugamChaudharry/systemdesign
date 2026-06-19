package in.SystemDesign.patterns.structural.decorator;

public abstract class MarioDecorator implements Mario  {
    protected Mario mario;

    MarioDecorator(Mario mario){
       this.mario = mario;
    }
}
