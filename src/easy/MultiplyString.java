package easy;

public class MultiplyString {

    /*
    Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.
    Example 1:
    Input: num1 = "2", num2 = "3"
    Output: "6"
    Example 2:
    Input: num1 = "123", num2 = "456"
    Output: "56088"
    */

    public String multiply(String num1, String num2){
        long[] aArr=new long[num1.length()];
        long[] bArr=new long[num2.length()];
        int aDegree=num1.length()-1;
        int bDegree=num2.length()-1;
        for (int i=0; i<num1.length(); i++) {
            Character c=num1.charAt(i);
            aArr[i]=Character.getNumericValue(c)*(long)Math.pow(10,aDegree);
            aDegree--;
        }
        for (int i=0; i<num2.length(); i++){
            Character c=num2.charAt(i);
            bArr[i]=Character.getNumericValue(c)*(long)Math.pow(10,bDegree);
            bDegree--;
        }
        Long sum=0L;
        for (int i=0; i<aArr.length; i++){
            for (int j=0; j<bArr.length; j++){
                sum+=(aArr[i]*bArr[j]);
            }
        }
        return sum.toString();
    }

}
