package in.SystemDesign.patterns.structural.decorator;

public class BasicMario implements Mario{
    private final String name;
    BasicMario(String name){
        this.name = name;
    }
    @Override
    public String getDescription() {
        return "Mario" + "-"+ name;
    }

    @Override
    public int getPower() {
        return 0;
    }
}
