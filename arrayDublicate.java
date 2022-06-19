import java.util.Arrays;
public class arrayDublicate {

    static boolean isFind(int array[], int val){
        for( int i  : array) {
            if( i==val){
                return true;

        }
        }
        return false;
    }
    public static void main(String[] args) {



        int[] arr = {2,3,4,6,7,2,5,6,7,5,2,4,11,22,62,22};
        int[] dubbli = new int[arr.length];
        int  startnum = 0;

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length;j++){
                if (i!=j&&(arr[i]==arr[j])&&arr[i]%2==0) {
                    if(!isFind(dubbli,arr[i])){
                        dubbli[startnum++]=arr[i];
                    }


                }

            }

        }

        for(int value: dubbli){
            if(value!=0){
                System.out.println(value);
            }
        }
    }
}
