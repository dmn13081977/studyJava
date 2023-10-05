class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {
        int corner1 = 0;
        int corner2 = 0;
        int corner3 = 0;
        int corner4 = 0;

        for (int i = 0; i <twoDimArray.length; i++) {
            for (int j = 0; j <twoDimArray [i].length; j++) {
                corner1 = twoDimArray[0][0];
                corner2 = twoDimArray[0][twoDimArray [0].length - 1];
                corner3 = twoDimArray[twoDimArray.length - 1][0];
                corner4 = twoDimArray[twoDimArray.length - 1][twoDimArray [twoDimArray.length - 1].length - 1];
            }
        }
        System.out.println(corner1 + " " + corner2);
        System.out.println(corner3 + " " + corner4);
    }
}