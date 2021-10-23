package OOPS;

public class penmain {
    public static void main(String[] args) {
        pen p = new pen();

        System.out.println(p.company);
        System.out.println(p.color);
        System.out.println(p.font);
        System.out.println("Before Clicked value :" + p.clicked);

        p.click();

        System.out.println("After Clicked value :" + p.clicked);

        p.unClick();

        System.out.println("After Unclick value :" + p.clicked);
    }
}
