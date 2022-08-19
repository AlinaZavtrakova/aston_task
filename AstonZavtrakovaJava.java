package ZavtrakovaJava;

import java.util.Scanner;

public class AstonZavtrakovaJava {
    public static void printHello() {
        System.out.println("Введите число \n");
        int aNumber = new Scanner(System.in).nextInt();
        if (aNumber > 7) {
            System.out.print("Привет \n");
        }
    }

    public static void checkRealName() {
        System.out.println("Введите имя \n");
        String yourName = new Scanner(System.in).nextLine();
                String realName = "Вячеслав";
        if (yourName.equals(realName)) {
            System.out.print("Привет, " + realName);
        } else {
            System.out.print("Нет такого имени \n");
        }
    }

    public static void arrayElement() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину числового массива \n");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Введите элементы числового массива: \n");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
            if (array[i] % 3 == 0) {
                System.out.print(array[i]);
            }
        }
    }

    public static void textAnswer() {
        System.out.print("Дана скобочная последовательность: [((())()(())]] \n" +
                "- Эта последовательность неправильная, т.к. содержит незакрытые пары скобок: \n" +
                "одну пару квадратных и одну пару круглых. \n" +
                "- Существует много способов привести данную последовательность к правильному виду. \n" +
                "Предлагаю алгоритм ;) \n" +
                "a) Добавить в начале одну [; \n" +
                "или b) Убрать любую ]. \n" +
                "После выполнения одного из пунктов можно: \n" +
                "1) Убрать любую (; \n" +
                "2) Добавить ) после первой круглой скобки в произвольное место посл-ти. \n" +
                "Результаты выполнения: \n" +
                "a1) [[(())()(())]] или [[((()))(())]] или [[((())()())]] \n" +
                "a2) [[((()))()(())]] или [[((())())(())]] или [[((())()(()))]] или [[((())()(())])] или [[((())()(())]]) \n" +
                "b1) [(())()(())] или [((()))(())] или [((())()())] \n" +
                "b2) [((()))()(())] или [((())())(())] или [((())()(()))] или [((())()(())])");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String textQuestion = "1.Здороваемся с 7+ \n" + "2. Здороваемся с Вячеславом \n" +
                "3. Делаем числовой массив, кратный 3 \n" + "4. Рассуждаем о скобках \n";
        System.out.print(textQuestion);
        System.out.print("Введите номер задания. Чтобы выйти из программы, нажмите 0 \n");
        int taskNumber = input.nextInt();
        if (taskNumber == 1) {
            printHello();
        } else if (taskNumber == 2) {
            checkRealName();
        } else if (taskNumber == 3) {
            arrayElement();
        } else if (taskNumber == 4) {
            textAnswer();
        } else if (taskNumber == 0) {
            System.exit(0);
        } else {
            System.out.print("Некорректный номер задания. Введите число от 1 до 4 или 0.");
        }
    }
}
