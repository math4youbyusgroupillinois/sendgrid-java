import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;

import java.io.IOException;

/* Retrieve a specific whitelisted IP
GET /access_settings/whitelist/{rule_id}
*/

public class GetIPFromAccessSettings extends Example {

    private void run() throws IOException {
        try {
            String endPoint = "access_settings/whitelist";
            String body = "{\"ids\":[1,2,3]}";
            Request request = createRequest(Method.DELETE, endPoint, body);
            Response response = execute(request);
            printResponseInfo(response);
        } catch (IOException ex) {
            throw ex;
        }
    }

    public static void main(String[] args) throws IOException {
        GetIPFromAccessSettings getIPFromAccessSettings = new GetIPFromAccessSettings();
        getIPFromAccessSettings.run();
    }
}