import java.util.regex.*;

import static java.util.regex.Matcher.*;

public class MyRegex {
    public static void main(String[] args) {
        String input = "I have just read your memoir. I have reason to believe that we are cousins. My maiden name is \"Schwart\" (not my father's actual name, I think it was changed at Ellis Island in 1936), but my mother's maiden name was \"Morgenstern\" and all her family was from Kaufbeuren as yours were. We were to meet in 1941 when we were small children, you and your parents and sister and brother were coming to live with my parents, my two brothers, and me in Milburn, New York. But the boat that was carrying you and other refugees, the Marea, was turned back by U.S. Immigration at New York Harbor.";

        Pattern ptn = Pattern.compile("(?:[aeiou]{2,})");
        Matcher mtch = ptn.matcher(input);

        while (mtch.find()) {
            System.out.println(mtch.group());
        }
    }
}
