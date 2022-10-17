public class Main {
    public static void main(String[] args) {
        for (int cnt = 1; cnt <= 30; cnt++)
            System.out.println(cnt);

        for (int cnt = 30; cnt >= 1; cnt--)
            System.out.println(cnt);

        for (int cnt = 0; cnt <= 18; cnt = cnt + 3)
            System.out.println(cnt);

        for (int cnt = 10; cnt >= 0; cnt = cnt - 2)
            System.out.println(cnt);

        int row = 5;

        for (int i = 1; i <= row; ++i)
        {
            for (int j = 1; j <= i; ++j)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }


        for(int i = 0; i < 5; i++)
        {
            for(int j = i; j < 5; j++)
            {
                System.out.print("*");
            }
            {
                System.out.println();
            }
        }

        int rows = 5;

        for (int i = 0; i < rows; i++)
        {
            for (int j = 1; j < rows; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
