public class Markscalculator {
    /*public static void main(String[] args) {
        int arr[]={94, 88, 92, 90, 89};
        for(int i=0;i<arr.length;i++){
           int sum= arr[i]+arr[i+1];
           i++;
           float div= sum/300;
           double percent= div*100;
            System.out.println("The percentage of student is: "+ percent+ "%");
        }*/
    public static void main(String[] args) {  
        int a=96;
        int b=88;
        int c=95;
        int d=87;
        int e=90;
        int f=81;
        double div= (a+b+c+d+e+f)/600d;
        double percent= div*100d;
        System.out.println("The percentage of student is: "+ percent + "%");
    }
}
