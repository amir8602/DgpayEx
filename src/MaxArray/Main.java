package MaxArray;

public class Main {
    public static void main(String[] args) {
        int [] ints = new int[]{16,17,6,2,5,3};

        int [] ints1 = new int[6];
        int max = 0;
        for (int i = 0; i <ints.length-1; i++) {
            max = ints[i+1];
            for (int j =i+1; j <ints.length ; j++) {
                if (max<ints[j]){
                    max=ints[j];
                }
            }
            ints1[i]=max;
        }
        ints1[ints1.length-1]=-1;
        for (int i : ints1) {
            System.out.println(i);
        }
    }
}
