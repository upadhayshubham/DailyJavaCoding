package SubrectangleQueries;

public class SubrectangleQueries {
    int[][] rectangle;
    public SubrectangleQueries(int[][] rectangle) {
        this.rectangle = rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for(int i = row1; i<= row2; i++) {
            for(int j = col1; j<= col2; j++) {
                rectangle[i][j] = newValue;
            }
        }
    }

    public int getValue(int row, int col) {
        return rectangle[row][col];
    }

    public static void main(String[] args) {
        int[][] param = new int[][] {{1,1,1},{2,2,2},{3,3,3}};
        SubrectangleQueries subrectangleQueries = new SubrectangleQueries(param);
        int res1 = subrectangleQueries.getValue(0,0);
        System.out.println(res1);

        subrectangleQueries.updateSubrectangle(0, 0, 2, 2, 100);
        int res2 = subrectangleQueries.getValue(0, 0); // return 100
        System.out.println(res2);
        int res3 = subrectangleQueries.getValue(2, 2); // return 100
        System.out.println(res3);
        subrectangleQueries.updateSubrectangle(1, 1, 2, 2, 20);
        int res4 = subrectangleQueries.getValue(2, 2); // return 20
        System.out.println(res4);
    }
}

/**
 * Your SubrectangleQueries object will be instantiated and called as such:
 * SubrectangleQueries obj = new SubrectangleQueries(rectangle);
 * obj.updateSubrectangle(row1,col1,row2,col2,newValue);
 * int param_2 = obj.getValue(row,col);
 */