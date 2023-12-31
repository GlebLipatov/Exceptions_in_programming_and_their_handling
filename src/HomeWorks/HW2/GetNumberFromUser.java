package HomeWorks.HW2;

import java.util.Scanner;

/**
 * Класс который получает от пользователя число и проверяет его на валидность.
 */
public class GetNumberFromUser {
    /**
     * Метод который получает от пользователя число и проверяет его на валидность().
     *
     * @param message Сообщение содержащее информацию для ввода.
     * @return валидное число(меньше нуля, ровно нулю, больше нуля).
     */
    public static Integer getNumber(String message) {
        Scanner scanner = new Scanner(System.in);
        String inputFromUser;

        while (true) {
            System.out.printf("Введите %s: ", message);
            inputFromUser = scanner.nextLine();

            // Леонид, большое спасибо за комментарий в прошлой дз по валидации =)
            // Очень удобно и красиво так!
            // Может знаете, где можно потренировать регулярки?
            if (inputFromUser.matches("-?\\d+")) {
                return Integer.parseInt(inputFromUser);
            }
        }
    }
}
