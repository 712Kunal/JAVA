class CountOfFibonacciInRange {
    public static void main(String[] args){
        int start=0;
        int end=2000;

        int n1=0;
        int n2=1;
        int ans;

        int cnt=0;

        while(n1<=end){
            if(n1>=start){
                cnt++;
            }

            ans=n1+n2;
            n1=n2;
            n2=ans;
        }

        System.out.println("Number of fibonacci numbers in the range "+start+" to "+end+" are "+cnt);
    }
}
