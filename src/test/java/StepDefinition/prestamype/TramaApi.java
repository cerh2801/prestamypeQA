package StepDefinition.prestamype;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class TramaApi {
    public static void main(String[] args) throws IOException {
        try {

            String apiurl = "https://public.test.prestamype.com";
            URL url = new URL(apiurl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            int responsecode = connection.getResponseCode();
            if (responsecode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();


                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);

                }
                in.close();

                String trama = response.toString();
                System.out.println(trama);
            }
                else{
                    System.out.println("Error al obtener la trama, codigo de estado : " +responsecode);

                }
                } catch(Exception e){
                 e.printStackTrace();


            }


            }

        }


