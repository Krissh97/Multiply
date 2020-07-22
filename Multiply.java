public class Multiply {
    public static void main(String args[]){
        String a = "12783458736467451341236469347530458347564358634257348569843";
        String b = "40327468923479786523854273165498727340971234";
        System.out.println(mtol(a, b));
    }
    public static String mtol(String a , String b){
        int[] res = new int[a.length()+b.length()];
        int sum, ati, carry, ar1=0, ar2=0;
        for(int i=a.length()-1;i>=0;i--){

            carry = 0;
            ar2=0;

            ati = a.charAt(i)-'0';
            for(int j=b.length()-1;j>=0;j--){
                sum=res[ar1+ar2]+(ati*(b.charAt(j)-'0'))+carry;

                res[ar1+ar2] = sum%10;
                carry = sum/10;
                sum =0;
                ar2++;
            }
            res[ar1+ar2]+=carry;
            ar1++;
        }
        int start=Integer.MAX_VALUE;
        for(int i=res.length-1;i>=0;i--){
            if(res[i]==0)
                continue;
            else{
                start = i;
                break;
            }
        }
        String ans = new String();
        for(int i=start;i>=0;i--){
            ans = ans+res[i];
        }
        return ans;
    }
}
