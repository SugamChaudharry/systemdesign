package in.SystemDesign.patterns.structural.decorator;

public class StarAttackDecorator extends  MarioDecorator{

    StarAttackDecorator(Mario mario) {
        super(mario);
    }

    @Override
    public String getDescription() {
        return mario.getDescription() + " + Star Attack Activate";
    }

    @Override
    public int getPower() {
        return mario.getPower() + 20;
    }
}
