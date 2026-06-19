package in.SystemDesign.patterns.structural.decorator;

public class GunAttackDecorator extends MarioDecorator{

    GunAttackDecorator(Mario mario) {
        super(mario);
    }

    @Override
    public String getDescription() {
        return mario.getDescription() +  " + Gun Attack Activate";
    }

    @Override
    public int getPower() {
        return mario.getPower() + 40;
    }
}
