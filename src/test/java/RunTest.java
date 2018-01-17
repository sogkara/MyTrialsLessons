import Pages.HoverPage;
import org.testng.annotations.Test;

public class RunTest extends HoverPage {
HoverPage hoverpage = new HoverPage();
   @Test
    public void setUp() {

hoverpage.setup();
    }

    @Test
    public void textreturn(){
      hoverAvatar();
        }

}


