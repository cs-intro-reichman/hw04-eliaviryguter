public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        if (n < 2) {
            System.out.println("Prime numbers up to " + n + ":");
            System.out.println("There are 0 primes between 2 and " + n +
                               " (0% are primes)");
            return;
        }
        
        boolean [] arr = new boolean [n+1];
        int i = 2;

        while (i<=n)
        {
            arr[i] = true;
            i++;
        }
        for (int j = 2; j<n;j++)
        {
            i = j+1;
            while (i<=n)
            {
                if ((i%j==0)&&(arr[i]==true))
                {
                    arr[i] = false;
                }
            i++;
            }
        }

        int counter = 0;
        System.out.println("Prime numbers up to "+n+":");
        for (int j = 2; j<=n; j++)
        {
            if (arr[j]==true)
            {
            System.out.println(j);
            counter++;
            }
        }
        System.out.println("There are "+counter+" primes between 2 and "+n+"("+(100*counter)/(n-1)+"% are primes)");
    }
}