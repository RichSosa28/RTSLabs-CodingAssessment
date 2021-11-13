public class Main{
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,5,6};
        aboveBelow(array, 3);
        stringRotation("MyString", 2);
    }

    public static void aboveBelow(int[] int_list, int value){
        int above = 0;
        int below = 0;
        for(int i = 0; i < int_list.length; i++){
            below++;
            if(int_list[i] == value){
                above = int_list.length - below;
                below = below - 1;
                System.out.println("above:" + above + " below:" + below);
            }
        }
    }

    public static void stringRotation(String string, int amount){
        int x = string.length() - amount;
        String rotated = string.substring(x) + string.substring(0, x);
        System.out.println(rotated);

    }
}
