public class DoWhile {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int n = 10;
        System.out.println("While");
        int i = 1;

        while (i <= n) {
            System.out.println("ok" + i);

            if (i % 5 == 0) {
                System.out.println(i);
            }

            i++;
        }
    }
}
/*
O/P:While
ok1
ok2
ok3
ok4
ok5
5
ok6
ok7
ok8
ok9
ok10
10
*/