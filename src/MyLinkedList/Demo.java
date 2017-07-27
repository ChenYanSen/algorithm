package MyLinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by 跃 on 2017/7/18.
 */
public class Demo {
    /** 请完成下面这个函数，实现题目要求的功能 **/
    /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Long res;
        int dimension_size = Integer.parseInt(in.nextLine().trim());
        List<Long[]> dimList = new ArrayList<Long[]>();

        for (int _dimension_i = 0; _dimension_i < dimension_size; _dimension_i++) {
            Long[] dimension_item = new Long[5];
            String dimItemStr = in.nextLine().trim();
            String[] dimItemStrs = dimItemStr.split(" ");
            for (int j = 0; j < 5; j++) {
                dimension_item[j] = Long.parseLong(dimItemStrs[j]);
            }
            dimList.add(dimension_item);
        }
        res = guessMyPath(dimList);
        System.out.println(res);
    }

    private static Long guessMyPath(List<Long[]> dimList) {
        int [][][][][] arr=new int[dimList.size()][dimList.size()][dimList.size()][dimList.size()][dimList.size()];
             for(int i=0;i<dimList.size();i++)
                 for (int j=0;j<dimList.size();j++)
                     for (int k=0;k<dimList.size();k++)
                         for(int m=0;m<dimList.size();m++)
                             for (int n=0;n<dimList.size();n++)
                             {
                       //   arr[i][j][k][m][n]=(dimList.get(i)[j-1]+arr[i][i][i][i][i])>(dimList.get(i-1)[j]+arr[j][j][j][j]))?dimList.get(i-1)[j]+arr[j][j][j][j]):dimList.get(i)[j-1]+arr[i][i][i][i][i];
                             }
    for (int i=0;i<dimList.size();i++){

        }
      return null;
    }

}
