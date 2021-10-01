package lab1;

public class Variant5 {
    public int segmentLong(int a,int b){
        assert a>=b:"a should be more than b";
        int c = a%b;
        return c;
    }

    public boolean segmentTwoNumber(int a,int b){
        return (a >= 0) | ( b < -2);
    }

    public int[] threenumber(int a,int b,int c){
        int i=0;
        int k=0;
        if (a>0)
            i++;
        else k++;
        if (b>0)
            i++;
        else k++;
        if (c>0)
            i++;
        else k++;
        return new int[] {i,k};
    }

    public double actionsNumber(int action,double a,double b){
        assert b!=0:"b should be not equal than 0";
        switch (action){
            case 1:return a+b;
            case 2:return a-b;
            case 3:return a*b;
            case 4:return a/b;
        }
        return 0;
    }

    public double[] forNumber(double c){
        double[] result = new double[10];
        int i=0;
        for (double m = 0.1;m <= 1.0;m+= 0.1) {
            result[i++] = c * m;
        }
        return result;
    }

    public int while5(int n){
        int k=0;
        while (n>=2){
            ++k;
            n/=2;
        }
        return k;
    }

    public double[] minmax(int n, double[] m, double[] v){
        double[] result = new double[n];
        double pmax=m[0]/v[0];
        int maxnum=0;
        for (int i=1;i<n;++i){
            double result1 = m[i]/v[i];
            if  (result1 > pmax) {
                pmax=result1;
                maxnum=i;
            }
        }
        result[0]=++maxnum;
        result[1]=pmax;
        return result;
    }


    public int[] array5(int n){
        int[] result = new int[n];
        int i;
        int a[];
        a = new int[n];
        a[0]=1;
        a[1]=1;
        for (i=2;i<n;++i) {
            a[i] = a[i - 2] + a[i - 1];
        }
        for (i=0;i<n;++i) {
            result[i]=a[i];
        }
        return result;
    }



    public int[][]  twoDimensionArrayTask(int m, int n, int d,int[] mass){
        int a[][] = new int[m][n];
        for(int i = 0; i < m; ++i){
            a[i][0]=mass[i];
        }
        for(int i = 0; i < m; ++i){
            for(int j = 1; j < n; ++j) {
                a[i][j] = a[i][j - 1] + d;
            }
        }
        return a;
    }
    public static void main(String... strings) {
        System.out.println("Start of zero lab");
        System.out.println("Done!!!");
    }
}
