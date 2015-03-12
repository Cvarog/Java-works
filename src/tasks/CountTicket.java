package tasks;

/**
 * Created by Артем on 14.02.2015.
 */
public class CountTicket
{
    public static void main(String[] args)

    {
        int sum = 0;
        for (int i = 1; i <= 30; i++)
        {

            sum += i;
            System.out.println("Размер тикета равен " + i + " Сумма равна " + sum);
        }
        int a = 47;
        String b = "собака";
        String c = "выдра";
        System.out.println(Integer.toString(a));
        System.out.println(b.toUpperCase());
        System.out.println(b.compareTo(c));

        int z = (int) (Math.random()*100);
        System.out.println(z);

        String x = "123";
        String y = "1123";
        if (!(x.equals(y)))
        {
            System.out.println("Не равны");
        }
    }
}
