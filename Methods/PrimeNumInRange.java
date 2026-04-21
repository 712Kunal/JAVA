class PrimeNumInRange{
    public static int primeNum(int num){
        int den=2;

        while(den<=num){
            if(num%den==0){
                break;
            }

            den++;
        }

        if(den==num){
            return num;
        }

        return -1;
    }

    public static void main(String[] args){
        int start=1;
        int end=100;

        System.out.println("Prime Numbers between "+start+" to "+end+" are:");
        while(start<=end){
            int res=primeNum(start);

            if(res!=-1){
                System.out.print(res+" ");
            }

            start++;
        }
    }
}