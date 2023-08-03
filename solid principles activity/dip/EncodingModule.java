package solid.live.dip;


import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 13, 2011
 * Time: 10:05:38 AM
 * To change this template use File | Settings | File Templates.
 */
public class EncodingModule {
    public static void readEncodeWrite(Reader reader, Encoder encoder, Writer writer) throws IOException {
        String inputData = reader.read();
        String encodedData = encoder.encode(inputData);
        writer.write(encodedData);
    }

    /*
    public void encodeBasedOnNetworkAndDatabase() {
        URL url = null;
        try {
            url = new URL("http", "myfirstappwith.appspot.com", "index.html");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        InputStream in = null;
        try {
            in = url.openStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder inputString1 = new StringBuilder();
        try {
            int c;
            c = reader.read();
            while (c != -1) {
                inputString1.append((char) c);
                c = reader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String inputString = inputString1.toString();
        String encodedString = Base64.encodeBytes(inputString.getBytes());
        MyDatabase database = new MyDatabase();
        database.write(encodedString);
    }

     */
}

