public class Array2 {
    public static void main(String[]args) {

        //loop
        String[] bikes = {"fz", "pulsar", "cbz", "apache"};
        for (String i : bikes) {
            System.out.println(i);

        }


        //multi dimensional
        int[][] values = {{1, 1, 3, 4}, {5, 6, 3, 2}};
        for (int i = 0; i < values.length; ++i) {
            for(int j=0; j< values[i].length;++j){
                System.out.print(values[i][j]+" ");}
            System.out.println();


        }
    }


}
