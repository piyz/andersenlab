package by.aazqsc.home.in_action;

public class test {
    public static void main(String[] args) {
        float f = 98.999f;
        double d =  9813456.99993456745699;

        long l = (long) d;
        System.out.println(l);

        //System.out.println((int)getPercentage()); //0.9999001
        //System.out.println((int)d);               //0.9999001026153564
    }

    public static float getPercentage() {
        return (float) (100.01f / 99.02f);
    }
}
