/*3. 다음 형태로 표현된 2차원 배열이 존재한다고 가정해보자
1   2    3   //1행
4   5    6   //2행
7   8    9   //3행
이러한 형태를 갖는 int형 2차원 배열이 인자로 전달되면, 다음의 형태로 배열의 구조를 변경시키는 메소드를 정의하자
7   8    9   //1행
1   2    3   //2행
4   5    6   //3행
물론 배열의 가로와 세로길이에 상관없이 위와 같이 동작하도록 메소드를 정의해야 한다.
 if (i == 0) {
                    arr[1][j] = arr[i][j];
                } else if (i == 1) {
                    arr[2][j] = arr[i][j];
                } else {
                    arr[0][j] = new int[]{1, 2, 3};
                }
*/
package org.example;

class Arr {
    int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
int[][] krr= new int[][];
    public Arr() {
    }
    public Arr(int[][] arr) {
        this.arr = arr;
    }

    public int Change() {

            for (int j = 0; j < 3; j++) {
               krr[][]=arr[0][j];
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        return 0;
    }
}

public class test03 {
    public static void main(String[] args) {
        Arr arr = new Arr();
        arr.Change();
    }

}
