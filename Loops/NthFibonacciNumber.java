
class NthFibonacciNumber{
    public static void main(String[] args){
        int num=10;

        int n1=0;
        int n2=1;
        int ans;

        int cnt=1;

        while(true){
            System.out.println(n1);

            if(cnt==num){
                System.out.println("The "+num+"th"+" fibonacci number is "+n1);
                break;
            }

            ans=n1+n2;
            n1=n2;
            n2=ans;
            cnt++;
        }
    }
}