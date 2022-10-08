public class Main {

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;

    }
    public static void main(String[] args) {

        int[] arr = generateRandomArray();
        //Задание 1
        int sumOfExpense = 0;
        for (int i = 0; i < arr.length; i++){
            sumOfExpense = sumOfExpense + arr[i];
        }
        System.out.print(sumOfExpense);

        System.out.println();
        //Задание 2
        int minExpense  = arr[0];
        int maxExpense  = arr[0];
        for (int j = 0; j < arr.length; j++){
            if (arr[j] < minExpense ) {
                 minExpense  = arr[j];
            }
             if (arr[j] > maxExpense ){
                 maxExpense = arr[j];
             }
        }
        System.out.println(maxExpense  + " " + minExpense);

        //Задание 3
        double averageExpense = 0;
        for (int a = 0; a < arr.length; a++){
            averageExpense = averageExpense + arr[a]/30;

        }
        System.out.println("Средняя сумма трат за месяц составила " + averageExpense + " рублей");

      //Задание 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int d = reverseFullName.length - 1; d >= 0; d--){
            System.out.print(reverseFullName[d]);
        }

    }



}