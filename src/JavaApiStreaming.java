import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.apache.http.*;
import org.apache.http.client.methods.*;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.client.HttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JavaApiStreaming {
	public static void main(String[] args) throws IOException {

        HttpClient httpClient = HttpClientBuilder.create().build();
         
        System.out.println("Initialized");
        
        try {
        	
        	final GUIThread gui = new GUIThread();
        	Thread t = new Thread(gui);
        	t.start();

//        	Display d = gui.getDisplay();
        	        	        	        
            // Set these variables to whatever personal ones are preferred
            // Enter your Oanda Credentials here:
        	String domain = "https://stream-fxpractice.oanda.com";
            String access_token = "ACCESS-TOKEN";
            String account_id = "1234567";
            String instruments = "EUR_USD,USD_JPY,GBP_USD,USD_CHF,AUD_USD,USD_CAD,EUR_CHF,NZD_USD,EUR_SEK,EUR_NOK,USD_SEK,USD_NOK,EUR_JPY,XAU_USD,WTICO_USD,DE30_EUR,SPX500_USD,CH20_CHF";

            HttpUriRequest httpGet = new HttpGet(domain + "/v1/prices?accountId=" + account_id + "&instruments=" + instruments);
            httpGet.setHeader(new BasicHeader("Authorization", "Bearer " + access_token));

            System.out.println("Executing request: " + httpGet.getRequestLine());

            HttpResponse resp = httpClient.execute(httpGet);
            HttpEntity entity = resp.getEntity();  		
            ;		    		
    		
            if (resp.getStatusLine().getStatusCode() == 200 && entity != null) {
                InputStream stream = entity.getContent();
                String line;
                BufferedReader br = new BufferedReader(new InputStreamReader(stream));

                while ((line = br.readLine()) != null) {

                    Object obj = JSONValue.parse(line);
                    JSONObject tick = (JSONObject) obj;

                    // unwrap if necessary
                    if (tick.containsKey("tick")) {
                        tick = (JSONObject) tick.get("tick");
                    }

                    // ignore heartbeats
                    
                                       
                    if (tick.containsKey("instrument")) {
                        System.out.println("-------");

                        String instrument = tick.get("instrument").toString();
                        String time = tick.get("time").toString();
                        
                        double bid = Double.parseDouble(tick.get("bid").toString());
                        double ask = Double.parseDouble(tick.get("ask").toString());

                        System.out.println(instrument);
                        System.out.println(time);
                        System.out.println(bid);
                        System.out.println(ask);                                               
                                                
                        //String oldTime = gui.getTime(time);
                        
                        gui.updateTime(time);
                        
                        switch (instrument) {
                        	case "EUR_USD":
                        		gui.updateEUR_USD(bid, ask);
                        		break;                        		
                        	case "USD_JPY":			
                        		gui.updateUSD_JPY(bid, ask);		
                        		break;                        		
                        	case "GBP_USD":	
                        		gui.updateGBP_USD(bid, ask);
                        		break;                        
                        	case "USD_CHF":
                        		gui.updateUSD_CHF(bid, ask);
                        		break;                        
                    		case "AUD_USD":
                        		gui.updateAUD_USD(bid, ask);
                        		break;                        
                    		case "USD_CAD":
                        		gui.updateUSD_CAD(bid, ask);
                        		break;                        
                    		case "EUR_CHF":
                        		gui.updateEUR_CHF(bid, ask);
                        		break;                        
                    		case "NZD_USD":
                        		gui.updateNZD_USD(bid, ask);
                        		break;                        
                    		case "EUR_SEK":
                        		gui.updateEUR_SEK(bid, ask);
                        		break;                        
                    		case "EUR_NOK":
                        		gui.updateEUR_NOK(bid, ask);
                        		break;                        
                    		case "USD_SEK":
                        		gui.updateUSD_SEK(bid, ask);
                        		break;                        
                    		case "USD_NOK":
                        		gui.updateUSD_NOK(bid, ask);
                        		break;                        
                    		case "EUR_JPY":
                        		gui.updateEUR_JPY(bid, ask);
                        		break;       
                    		case "XAU_USD":
                        		gui.updateXAU_USD(bid, ask);
                        		break; 
                    		case "WTICO_USD":	
                       			gui.updateWTICO_USD(bid, ask);
                       			break;                        
                    		case "DE30_EUR":
                       			gui.updateDE30_EUR(bid, ask);
                       			break;                        
                   			case "SPX500_USD":
                       			gui.updateSPX500_USD(bid, ask);
                       			break;                        
                   			case "CH20_CHF":
                       			gui.updateCH20_CHF(bid, ask);
                       			break;                        
                        }
                    }
                }
            } else {
            	
                // print error message
                String responseString = EntityUtils.toString(entity, "UTF-8");
                System.out.println(responseString);
            }
                       		   
        } finally {
            httpClient.getConnectionManager().shutdown();
        }
    }
    }
    
