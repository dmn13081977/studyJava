
class ArrayOperations {
    public static int[][][] createCube() {
        int[][][] array = new int[3][3][3];
        int a;
        for (int i = 0; i < array.length; i++) {
            a = 0;
            for (int j = 0; j < array[i].length; j++) {
                for (int z = 0; z < array[j].length; z++) {
                    array[i][j][z] = a++;
                }
            }
        }
        return array;
    }
}
