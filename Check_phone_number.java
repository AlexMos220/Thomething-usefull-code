public class Test {


    static ArrayList<String> numbers = new ArrayList<>();

    static {
        numbers.add("09(000)65555");
    }


    public static boolean checkTelNumber(String telNumber) {
        if (telNumber == null) {
            return false;
        }
        return (telNumber.matches("^\\+(\\d[()]?){12}$") || telNumber.matches("^([()]?\\d){10}$"))
                && telNumber.matches("^(\\+)?(\\d+)?(\\(\\d{3}\\))?\\d+$");
    }

    public static void main(String[] args) {

        for (String str : numbers) {
            System.out.println(str + " - " + checkTelNumber(str));
        }

    }
}