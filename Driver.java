import java.util.Scanner;

public class Driver {
    static int n;
    static int[] array = new int[10001];

    public static void main(String[] args) {
        array[0] =1;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        search(n,1);

    }

    public static void search(int s,int t){
        for(int i = array[t-1]; i <= s; i++)
        {
            if(i<n)
            {
                array[t]=i;
                s-=i;
                if(s==0){
                    print(t);
                }
                else {
                    search(s,t+1);
                }
                s+=i;
            }
        }
    }

    public static void print(int t)
    {
        for (int i = 1;i <= t-1;i++)
        {
            System.out.print(array[i]+"+");
        }
        System.out.println(array[t]);
    }

}



