import java.util.Locale;

public class Tests {
    public static void main(String[] args) {
        String nome = "Alura";

        String outra = nome.replace('A', 'a');
        String testCaseUp = nome;
        String testCaseLow = nome;

        testCaseUp = testCaseUp.toUpperCase(Locale.ROOT);
        testCaseLow = testCaseLow.toLowerCase(Locale.ROOT);

        System.out.println(nome);
        System.out.println(outra);
        System.out.println(testCaseUp);
        System.out.println(testCaseLow);

        char c = 'A';
        char d = 'a';
        String outra2 = nome.replace(c, d);
        System.out.println(outra2);
        c = nome.charAt(1);
        System.out.println(c);

        int pos = nome.indexOf("ur");
        System.out.println(pos);

        String sub = nome.substring(1);
        System.out.println(sub);

        System.out.println(nome.length());

        for(int i = 0; i < nome.length(); i++){
            System.out.println(nome.charAt(i));
        }

        String vazio = "";
        System.out.println(vazio.isEmpty());
        String vazio2 = " ";
        System.out.println(vazio2);
        String vazio3 = vazio2.trim();
        System.out.println(vazio3.isEmpty());
        System.out.println(vazio3.isBlank());
        System.out.println(vazio.contains("Alu"));
    }
}
