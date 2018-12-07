package easy;

public class PlusOne{

	public int[] plusOne(int[] digits) {
        int degree=digits.length-1;
        Long sum=0L;
        for (int i=0; i<digits.length; i++){
            sum+=digits[i]*(long)Math.pow(10,degree);
            degree--;
        }
        sum+=1;
        long[] arr=new long[sum.toString().length()];
        int[] arrInt=new int[arr.length];
        for (int i=arr.length-1; i>=0; i--){
            arr[i]=sum%10;
            sum/=10;
        }
        for (int i=0; i<arr.length; i++){
            arrInt[i]=(int)arr[i];
        }
        return arrInt;
    }

}