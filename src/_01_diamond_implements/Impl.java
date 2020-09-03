package _01_diamond_implements;

public class Impl extends Base implements ISubSuper{
    @Override
    public void foo () {
        super.foo();
        System.out.println("this is impl");
    }
}
