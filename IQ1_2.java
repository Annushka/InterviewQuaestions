package InterviewQuaestions;

/**
 * Created with IntelliJ IDEA.
 * User: Анна
 * Date: 28.06.13
 * Time: 14:03
 * To change this template use File | Settings | File Templates.
 */
//1.2 Дан массив из целых чисел. Известно, что одно из чисел встречается дважды. Найти это число за O(n)
public class IQ1_2 {
    int findDublicate() {
        int n = 7;
        int[] Arr = {1, 5, 7, 6, 5, 2, 3, 4};
        boolean[] a = {false, false, false, false, false, false, false, false};
        for (int i = 0; i < n; i++) {
            if (!a[Arr[i]]) {
                a[Arr[i]] = true;
            } else {
                return Arr[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        IQ1_2 p = new IQ1_2();
        System.out.println(p.findDublicate());
    }
}
