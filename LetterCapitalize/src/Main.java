public class Main {

    public static String LetterCapitalize(String str){
        char [] arr =str.toCharArray();
        boolean isSpace=true;
        for (int i = 0;i<arr.length;i++){
            if (Character.isLetter(arr[i])){
                if (isSpace){
                    arr[i]=Character.toUpperCase(arr[i]);
                    isSpace=false;
                }
            }else {
                isSpace=true;
            }
        }
        String sentence=String.valueOf(arr);
        return sentence;

    }
    public static void main(String[] args) {
        String str = "Welcome to my project.";
        System.out.println(LetterCapitalize(str));
    }
}
