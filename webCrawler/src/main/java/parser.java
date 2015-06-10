import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import static java.lang.System.out;
import java.io.IOException;
import java.util.ArrayList;

public class parser {

    private static ArrayList<String> urls = new ArrayList<String>();



    public static void main(String[] args) {
        urls.add("http://www.noob-club.ru/");
        urls.add("http://dota2.ru/");
        for (String url : urls){
            linksGenerator(url);
        }


    }

    public static void linksGenerator (String url){
        try {
            Document doc = Jsoup.connect(url).get();
            Elements links = doc.select("a[href]");
            System.out.println("Links for " + url + "\n");
            for (Element link : links) {

                System.out.println(link.attr("abs:href"));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
