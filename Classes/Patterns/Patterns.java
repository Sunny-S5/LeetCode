package Classes.Patterns;

public class Patterns {
    public void SquareRectangle() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void HollowRectangle() {
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                if (i == 1 || i == 4 || j == 1 || j == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void LeftRightAngledTriangle() {
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void InvertedRightHalfPyramid() {
        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void LeftHalfPyramid() {
        int len = 4;
        for (int i = 0; i <= len; i++) {
            for (int j = 0; j <= len - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void NumRightHalfPyramid(){
        for(int i=4;i>=0;i--){
            for(int j=0;j<=i;j++){
              System.out.print(j);
            }
            System.out.println();
        }
    }

    public void FloydsTriangle(){
        int num=1;
        for(int i=1;i<6;i++){
          for( int j=1;j<=i;j++){
            System.out.print(num);
            num++;
          }
          System.err.println();
        }
    }
    /*  1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15 */


        public void EvenOddLeftHalfPyramid(){
            for(int i=0;i<5;i++){
                for(int j=0;j<=i;j++){
                    int sum=i+j;
                    if(sum%2==0){
                        System.out.print("1 ");
                    }
                    else{
                        System.out.print("0 ");
                    }
                }
                System.err.println();
            }
        }

        /*
         * 1 
            0 1
            1 0 1
            0 1 0 1
            1 0 1 0 1
         */

         
};
