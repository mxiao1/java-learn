package learn;
//Array array = [4,5,2,3,7]
public class Bubble {
    public static void main(String[] args){
        int[] a = {5,4,3,1,8,6};
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }

        }
        for(int num:a) {
            System.out.println(num);
        }
    }
}
