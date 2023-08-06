public class Main {
    public static void main(String[] args) {
        String str1 = "Мы хотим наших тестировщиков видеть fullstack-QA-инженерами. Под fullstack мы подразумеваем, что тестировщики могут не только руками проверить функциональность сервисов, но и смогут проверки автоматизировать. Чтобы руками делать как можно меньше и тратить время н";
        String[] arr = str1.split(" ");
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            result.append(arr[i].substring(0, 1).toUpperCase());
            result.append(arr[i].substring(1));
            result.append(" ");
        }
        String res = result.toString().trim();
        System.out.println(res);

    }
}
