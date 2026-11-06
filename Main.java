public class Main {
    public static void main(String[] args) {

        Userinput input = new Userinput();
        int[] size = input.getSize();

        Arraydata data = new Arraydata();
        int[][] a = data.getArray(size[0], size[1]);

        Rowsum row = new Rowsum();
        int[] r = row.getSum(a);

        Columnsum col = new Columnsum();
        int[] c = col.getSum(a);

        Duplicate duplicate = new Duplicate();
        String d = duplicate.find(a);

        Display display = new Display();
        display.show(a, r, c, d);
    }
}