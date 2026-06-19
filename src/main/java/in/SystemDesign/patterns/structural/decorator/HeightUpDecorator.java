package in.SystemDesign.patterns.structural.decorator;

public class HeightUpDecorator extends MarioDecorator {
    HeightUpDecorator(Mario mario) {
        super(mario);
    }

    @Override
    public String getDescription() {
        return mario.getDescription() + " + Height Up";
    }

    @Override
    public int getPower() {
        return mario.getPower() +  10;
    }
}
