import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.models.Message;
import com.mailosaur.models.MessageSearchParams;
import com.mailosaur.models.SearchCriteria;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class MailoSaurDemoTest {

    @Test
    public void testExample() throws IOException, MailosaurException {
        // Available in the API tab of a server
        String apiKey = "T4VevsnSv8xnASGC0RIMNhC4r0QTD14H";
        String serverId = "l1qbfvla";
        String serverDomain = "l1qbfvla.mailosaur.net";

        MailosaurClient mailosaur = new MailosaurClient(apiKey);

        MessageSearchParams searchParams = new MessageSearchParams();
        searchParams.withServer(serverId);

        SearchCriteria criteria = new SearchCriteria();
        criteria.withSubject("Hello World");

        Message message = mailosaur.messages().get(searchParams, criteria);

        assertNotNull(message);
        assertEquals("Hello World", message.subject());

        System.out.println(message.subject());
        System.out.println(message.received().toString());
        System.out.println(message.html().body());
    }
}
