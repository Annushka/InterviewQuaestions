package InterviewQuaestions;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Анна
 * Date: 28.06.13
 * Time: 14:04
 * To change this template use File | Settings | File Templates.
 */

//Вывести центральные коэффициенты треугольника Паскаля.
// Например, для треугольника это будет: 1, 1, 2, 3, 6, 10, 20.
// Как это сделать наиболее оптимальным способом?
public class IQ2_1 {
    void triengle() {
        ArrayList<Integer> listArr = new ArrayList<Integer>();
        listArr.add(1);
        int toDouble = 1;
        for (int i = 1; i < 30; i++) {
            for (int k = listArr.size() - 1; k > 0; k--) {
                int mem = listArr.get(k) + listArr.get(k - 1);
                if (i % 2 != 0 && k == listArr.size() - 1) {
                    toDouble = listArr.get(listArr.size() - 1);
                }
                listArr.set(k, mem);
            }
            if (i % 2 != 0 && i > 1) {
                int forAdd = toDouble * 2;
                listArr.add(forAdd);
            }
            System.out.println("middle is - " + listArr.get(listArr.size() - 1));
        }
    }

    public static void main(String[] args) {
        IQ2_1 p = new IQ2_1();
        p.triengle();
    }

}
