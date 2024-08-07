class countdown
{
    public static void main(int seconds)
    {
        for (int num = seconds; num>=0; --num)
        {
            System.out.println(num);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                
            }
        }
    }
}
