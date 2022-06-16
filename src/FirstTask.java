import java.util.Objects;
import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer = sc.next();
        String attempt = sc.next();
        sc.close();

        String[] arrAnswer = answer.split("");
        String[] arrAttempt = attempt.split("");

        int N = arrAnswer.length;

        String[] result = new String[N];

        for (int i = 0; i < N; i++) {
            if (Objects.equals(arrAnswer[i], arrAttempt[i])) {
                arrAnswer[i] = "*";
                result[i] = "correct";
            }
        }

        for (int i = 0; i < N; i++) {
            if (!Objects.equals(result[i], "correct")) {
                for (int j = 0; j < N; j++) {
                    if (Objects.equals(arrAttempt[i], arrAnswer[j])) {
                        arrAnswer[j] = "*";
                        result[i] = "present";
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < N; i++) {
            if (result[i] == null) {
                result[i] = "absent";
            }
        }


        for (String s : result) {
            System.out.println(s);
        }
    }
}
