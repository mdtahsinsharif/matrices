
public class SpiralMatrix{
    
    /*print matrices in spiral form*/
    
    public static void spiral_matrix(int arr[][]){
        int RIGHT = 0, DOWN = 1, LEFT = 2, UP = 3;
        int dir = RIGHT;
        int right_bound = arr.length-1;
        int down_bound = (arr[ right_bound-1 ].length-1);
        int left_bound = 0;
        int up_bound = 0;
        int x = 0;
        int y = -1;
        
        while(left_bound < right_bound || up_bound <= down_bound) //base case
        {
            switch (dir){
                case 0:
                    y++;
                    while ( y <= right_bound)
                    {
                        System.out.println(arr[x][y++]);
                    }
                    y--;
                    dir++;
                    right_bound--;
                    
                case 1:
                    x++;
                    while(x <= down_bound)
                    {
                        System.out.println(arr[x++][y]);
                    }
                    x--;
                    dir++;
                    down_bound--;
                    
                case 2:
                    y--;
                    while(y >= left_bound)
                    {
                        System.out.println(arr[x][y--]);
                    }
                    y++;
                    dir++;
                    left_bound++;
                    
                case 3:
                    x--;
                    up_bound++;
                    while(x >= up_bound)
                    {
                        System.out.println(arr[x--][y]);
                    }
                    x++;
                    dir = RIGHT;
            }
        }
    }
    
    public static void main(String []args){
        int[][] mat= {{1,2,3,4,5},
            {16,17,18,19,6},
            {15,24,25,20,7},
            {14,23,22,21,8},
            {13,12,11,10,9}};
        spiral_matrix(mat);
    }
}
