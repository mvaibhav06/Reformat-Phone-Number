public class ReformatPhoneNumber {
    public static String formatNumber(String number){
        String out = "";
        for (int i=0; i<number.length(); i++){
            char ch = number.charAt(i);
            if (Character.isDigit(ch)){
                out += ch;
            }
        }
        String formattedNumber = "";
        while (out.length() > 4){
            formattedNumber += out.substring(0,3) + "-";
            out = out.substring(3);
        }
        if (out.length() == 4){
            formattedNumber += out.substring(0,2) + "-" + out.substring(2);
        }else {
            formattedNumber += out;
        }
        return formattedNumber;
    }
    public static void main(String[] args) {
        System.out.println(formatNumber("123 4-5678"));
//        System.out.println(formatNumber("123 4-567"));
    }
}
