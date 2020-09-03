package _01_diamond_implements;

public abstract class Base implements ISuper{
    @Override
    public void foo () {
        System.out.println("Base");
    }
}
