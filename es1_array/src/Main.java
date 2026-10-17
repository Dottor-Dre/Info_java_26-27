public class Main {
    public static void main(String[] args) {
        int []v;
        int a=0;
        v= new int[10];
        for (int i = 0; i < v.length; i++) {
            v[i] = a;
        }
        for (int i = 0; i < v.length; i++) {
            if (v[i]%2 == 0){
                System.out.println(v[i] + ",");
            }
        }
    }
}