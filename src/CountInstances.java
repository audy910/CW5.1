public class CountInstances {
    public static void main (String[] args)
    {
        Slogan obj;
        obj = new Slogan ("Remember the Almo.");
        System.out.println((obj));
        obj = new Slogan("Don't Worry. Be Happy.");
        System.out.println(obj);
        obj = new Slogan ("Live Free or Die");
        System.out.println(obj);
        obj = new Slogan ("Talk is cheap");
        System.out.println(obj);
        obj = new Slogan ("Write Once, Run Anywhere");
        System.out.println(obj);
        System.out.println();
        System.out.println("Slogans created: " + Slogan.getCount());
    }
}
