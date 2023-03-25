public class toUpperFirstCase {
    public static void main(String[] args) {
        String text = "hello worlid";
        char[] chars = text.toCharArray();
        String newText;

        chars[0] -= 32;// ilk harfi buyutur.

        for (int i = 0; i < chars.length; i++) {
            if (chars[i]== 32) { // bosluk bulma
                chars[i + 1] -= 32; // bosluktan bir sonrakini Buyutur.
            }
        }
        newText =new String(chars);
        System.out.println(newText);
    }
}
