package in.SystemDesign.patterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Mario mario = new BasicMario("sugam");
        System.out.println( mario.getDescription() + " power level "+ mario.getPower());

        Mario mario2 = new HeightUpDecorator( new BasicMario("bobby"));
        System.out.println( mario2.getDescription() + " power level "+ mario2.getPower());

        Mario mario3 =new GunAttackDecorator(
                new StarAttackDecorator(
                        new HeightUpDecorator(
                                new BasicMario("mota"))));
        System.out.println( mario3.getDescription() + " power level "+ mario3.getPower());

    }
}
