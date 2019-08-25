import java.util.Scanner;

public class Main {

    public static class Coordinate
    {
        int x;
        int y;
        int z;

        public Coordinate(int x, int y, int z)
        {
            this.x = x;
            this.y = y;
            this.z = z;

        }

        public String toString(){

            return "(" + x + ", " + y + ", "  + z + ")";
        }
    }

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        System.out.println(new Coordinate(x, y, z).toString() );


    }

}
