package exam;

interface Playable {
    void play(); //
}
interface Bounceable {
    void play();
}
interface Rollable extends Playable, Bounceable {
	Interface1_Test ball = new Interface1_Test("PingPang");
}


public class Interface1_Test implements Rollable {
    private String name;
    public String getName() {
        return name;
    }
    public Interface1_Test(String name) {
        this.name = name;        
    }
   public void play() {
//	    ball = new Ball("Football");//编译报错。因为ball为public static final
        System.out.println(ball.getName());
    }
}
