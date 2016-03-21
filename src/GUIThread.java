import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.graphics.Point;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Text;

public class GUIThread implements Runnable 
{
    private Display display;    
    // Bid & Ask Labels
    private Label lblBidEUR_USD;
    private Label lblAskEUR_USD;
    private Label lblBidUSD_JPY;
    private Label lblAskUSD_JPY;
    private Label lblBidGBP_USD;
    private Label lblAskGBP_USD;
    private Label lblBidUSD_CHF;
    private Label lblAskUSD_CHF;
    private Label lblBidAUD_USD;
    private Label lblAskAUD_USD;
    private Label lblBidUSD_CAD;
    private Label lblAskUSD_CAD;
    private Label lblBidEUR_CHF;
    private Label lblAskEUR_CHF;
    private Label lblBidNZD_USD;
    private Label lblAskNZD_USD;
    private Label lblBidEUR_SEK;
    private Label lblAskEUR_SEK;
    private Label lblBidEUR_NOK;
    private Label lblAskEUR_NOK;
    private Label lblBidUSD_SEK;
    private Label lblAskUSD_SEK;
    private Label lblBidUSD_NOK;
    private Label lblAskUSD_NOK;
    private Label lblBidEUR_JPY;
    private Label lblAskEUR_JPY;
    private Label lblBidXAU_USD;
    private Label lblAskXAU_USD;
    private Label lblBidWTICO_USD;
    private Label lblAskWTICO_USD;
    private Label lblBidDE30_EUR;
    private Label lblAskDE30_EUR;
    private Label lblBidSPX500_USD;
    private Label lblAskSPX500_USD;
    private Label lblBidCH20_CHF;
    private Label lblAskCH20_CHF;
    private Text txtLastUpdate;
    private Text lblTime;
    //###############################
    public Display getDisplay(){
        return display;
    }

    /**
     * @wbp.parser.entryPoint
     */
    public void run() 
    {
        display = new Display();
        Shell shlZuppiStreamer = new Shell(display);
        // shlZuppiStreamer.setImage(SWTResourceManager.getImage("xyz"));
        shlZuppiStreamer.setText("rate stream");
        shlZuppiStreamer.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_GRAY));
        shlZuppiStreamer.setMinimumSize(new Point(270, 600));
        shlZuppiStreamer.setSize(302, 600);
        shlZuppiStreamer.setLayoutData(new GridData(SWT.FILL,SWT.FILL,true,false));
        shlZuppiStreamer.open();
        shlZuppiStreamer.pack();
        
        // Securities Bids & Asks
        
        lblBidEUR_USD = new Label(shlZuppiStreamer, SWT.NONE);
        lblBidEUR_USD.setBounds(111, 29, 55, 15);
        lblBidEUR_USD.setText("--");
        lblAskEUR_USD = new Label(shlZuppiStreamer, SWT.NONE);
        lblAskEUR_USD.setBounds(179, 29, 55, 15);
        lblAskEUR_USD.setText("--");
        lblBidUSD_JPY = new Label(shlZuppiStreamer, SWT.NONE);
        lblBidUSD_JPY.setBounds(111, 50, 55, 15);
        lblBidUSD_JPY.setText("--");
        lblAskUSD_JPY = new Label(shlZuppiStreamer, SWT.NONE);
        lblAskUSD_JPY.setBounds(179, 50, 55, 15);
        lblAskUSD_JPY.setText("--");
        lblBidGBP_USD = new Label(shlZuppiStreamer, SWT.NONE);
        lblBidGBP_USD.setBounds(111, 71, 55, 15);
        lblBidGBP_USD.setText("--");
        lblAskGBP_USD = new Label(shlZuppiStreamer, SWT.NONE);
        lblAskGBP_USD.setBounds(179, 71, 55, 15);
        lblAskGBP_USD.setText("--");
        lblBidUSD_CHF = new Label(shlZuppiStreamer, SWT.NONE);
        lblBidUSD_CHF.setBounds(111, 92, 55, 15);
        lblBidUSD_CHF.setText("--");
        lblAskUSD_CHF = new Label(shlZuppiStreamer, SWT.NONE);
        lblAskUSD_CHF.setBounds(179, 92, 55, 15);
        lblAskUSD_CHF.setText("--");
        lblBidAUD_USD = new Label(shlZuppiStreamer, SWT.NONE);
        lblBidAUD_USD.setBounds(111, 113, 55, 15);
        lblBidAUD_USD.setText("--");
        lblAskAUD_USD = new Label(shlZuppiStreamer, SWT.NONE);
        lblAskAUD_USD.setBounds(179, 113, 55, 15);
        lblAskAUD_USD.setText("--");
        lblBidUSD_CAD = new Label(shlZuppiStreamer, SWT.NONE);
        lblBidUSD_CAD.setBounds(111, 134, 55, 15);
        lblBidUSD_CAD.setText("--");
        lblAskUSD_CAD = new Label(shlZuppiStreamer, SWT.NONE);
        lblAskUSD_CAD.setBounds(179, 134, 55, 15);
        lblAskUSD_CAD.setText("--");
        lblBidEUR_CHF = new Label(shlZuppiStreamer, SWT.NONE);
        lblBidEUR_CHF.setBounds(111, 176, 55, 15);
        lblBidEUR_CHF.setText("--");
        lblAskEUR_CHF = new Label(shlZuppiStreamer, SWT.NONE);
        lblAskEUR_CHF.setBounds(179, 176, 55, 15);
        lblAskEUR_CHF.setText("--");
        lblBidNZD_USD = new Label(shlZuppiStreamer, SWT.NONE);
        lblBidNZD_USD.setBounds(111, 197, 55, 15);
        lblBidNZD_USD.setText("--");
        lblAskNZD_USD = new Label(shlZuppiStreamer, SWT.NONE);
        lblAskNZD_USD.setBounds(179, 197, 55, 15);
        lblAskNZD_USD.setText("--");
        lblBidEUR_SEK = new Label(shlZuppiStreamer, SWT.NONE);
        lblBidEUR_SEK.setBounds(111, 218, 55, 15);
        lblBidEUR_SEK.setText("--");
        lblAskEUR_SEK = new Label(shlZuppiStreamer, SWT.NONE);
        lblAskEUR_SEK.setBounds(179, 218, 55, 15);
        lblAskEUR_SEK.setText("--");
        lblBidEUR_NOK = new Label(shlZuppiStreamer, SWT.NONE);
        lblBidEUR_NOK.setBounds(111, 239, 55, 15);
        lblBidEUR_NOK.setText("--");
        lblAskEUR_NOK = new Label(shlZuppiStreamer, SWT.NONE);
        lblAskEUR_NOK.setBounds(179, 239, 55, 15);
        lblAskEUR_NOK.setText("--");
        lblBidUSD_SEK = new Label(shlZuppiStreamer, SWT.NONE);
        lblBidUSD_SEK.setBounds(111, 260, 55, 15);
        lblBidUSD_SEK.setText("--");
        lblAskUSD_SEK = new Label(shlZuppiStreamer, SWT.NONE);
        lblAskUSD_SEK.setBounds(179, 260, 55, 15);
        lblAskUSD_SEK.setText("--");
        lblBidUSD_NOK = new Label(shlZuppiStreamer, SWT.NONE);
        lblBidUSD_NOK.setBounds(111, 281, 55, 15);
        lblBidUSD_NOK.setText("--");
        lblAskUSD_NOK = new Label(shlZuppiStreamer, SWT.NONE);
        lblAskUSD_NOK.setBounds(179, 281, 55, 15);
        lblAskUSD_NOK.setText("--");
        lblBidEUR_JPY = new Label(shlZuppiStreamer, SWT.NONE);
        lblBidEUR_JPY.setBounds(111, 323, 55, 15);
        lblBidEUR_JPY.setText("--");
        lblAskEUR_JPY = new Label(shlZuppiStreamer, SWT.NONE);
        lblAskEUR_JPY.setBounds(179, 323, 55, 15);
        lblAskEUR_JPY.setText("--");
        lblBidXAU_USD = new Label(shlZuppiStreamer, SWT.NONE);
        lblBidXAU_USD.setBounds(111, 365, 55, 15);
        lblBidXAU_USD.setText("--");        
        lblAskXAU_USD = new Label(shlZuppiStreamer, SWT.NONE);
        lblAskXAU_USD.setBounds(179, 365, 55, 15);
        lblAskXAU_USD.setText("--");
        lblBidWTICO_USD = new Label(shlZuppiStreamer, SWT.NONE);
        lblBidWTICO_USD.setBounds(111, 386, 55, 15);
        lblBidWTICO_USD.setText("--");        
        lblAskWTICO_USD = new Label(shlZuppiStreamer, SWT.NONE);
        lblAskWTICO_USD.setBounds(179, 386, 55, 15);
        lblAskWTICO_USD.setText("--");
        lblBidDE30_EUR = new Label(shlZuppiStreamer, SWT.NONE);
        lblBidDE30_EUR.setBounds(111, 428, 55, 15);
        lblBidDE30_EUR.setText("--");
        lblAskDE30_EUR = new Label(shlZuppiStreamer, SWT.NONE);
        lblAskDE30_EUR.setBounds(179, 428, 55, 15);
        lblAskDE30_EUR.setText("--");
        lblBidSPX500_USD = new Label(shlZuppiStreamer, SWT.NONE);
        lblBidSPX500_USD.setBounds(111, 449, 55, 15);
        lblBidSPX500_USD.setText("--");
        lblAskSPX500_USD = new Label(shlZuppiStreamer, SWT.NONE);
        lblAskSPX500_USD.setBounds(179, 449, 55, 15);
        lblAskSPX500_USD.setText("--");
        lblBidCH20_CHF = new Label(shlZuppiStreamer, SWT.NONE);
        lblBidCH20_CHF.setBounds(111, 470, 55, 15);
        lblBidCH20_CHF.setText("--");
        lblAskCH20_CHF = new Label(shlZuppiStreamer, SWT.NONE);
        lblAskCH20_CHF.setBounds(179, 470, 55, 15);
        lblAskCH20_CHF.setText("--");



	        // Titles Securities
        
	        Label lblEUR_USD = new Label(shlZuppiStreamer, SWT.NONE);
	        lblEUR_USD.setBounds(10, 29, 55, 15);
	        lblEUR_USD.setText("EURUSD");
	        
	        Label lblUSD_JPY = new Label(shlZuppiStreamer, SWT.NONE);
	        lblUSD_JPY.setBounds(10, 50, 55, 15);
	        lblUSD_JPY.setText("USDJPY");
	        
	        Label lblGBP_USD = new Label(shlZuppiStreamer, SWT.NONE);
	        lblGBP_USD.setBounds(10, 71, 55, 15);
	        lblGBP_USD.setText("GBPUSD");
	        
	        Label lblUSD_CHF = new Label(shlZuppiStreamer, SWT.NONE);
	        lblUSD_CHF.setBounds(10, 92, 55, 15);
	        lblUSD_CHF.setText("USDCHF");
	        
	        Label lblAUD_USD = new Label(shlZuppiStreamer, SWT.NONE);
	        lblAUD_USD.setBounds(10, 113, 55, 15);
	        lblAUD_USD.setText("AUDUSD");
	        
	        Label lblUSD_CAD = new Label(shlZuppiStreamer, SWT.NONE);
	        lblUSD_CAD.setBounds(10, 134, 55, 15);
	        lblUSD_CAD.setText("USDCAD");
	        
	        Label lblEUR_CHF = new Label(shlZuppiStreamer, SWT.NONE);
	        lblEUR_CHF.setBounds(10, 176, 55, 15);
	        lblEUR_CHF.setText("EURCHF");
	        
	        Label lblNZD_USD = new Label(shlZuppiStreamer, SWT.NONE);
	        lblNZD_USD.setBounds(10, 197, 55, 15);
	        lblNZD_USD.setText("NZDUSD");
	        
	        Label lblEUR_SEK = new Label(shlZuppiStreamer, SWT.NONE);
	        lblEUR_SEK.setBounds(10, 218, 55, 15);
	        lblEUR_SEK.setText("EURSEK");
	        
	        Label lblEUR_NOK = new Label(shlZuppiStreamer, SWT.NONE);
	        lblEUR_NOK.setBounds(10, 239, 55, 15);
	        lblEUR_NOK.setText("EURNOK");
	        
	        Label lblUSD_SEK = new Label(shlZuppiStreamer, SWT.NONE);
	        lblUSD_SEK.setBounds(10, 260, 55, 15);
	        lblUSD_SEK.setText("USDSEK");
	        
	        Label lblUSD_NOK = new Label(shlZuppiStreamer, SWT.NONE);
	        lblUSD_NOK.setBounds(10, 281, 55, 15);
	        lblUSD_NOK.setText("USDNOK");
	        
	        Label lblNOK_SEK = new Label(shlZuppiStreamer, SWT.NONE);
	        lblNOK_SEK.setBounds(10, 302, 55, 15);
	        lblNOK_SEK.setText("NOKSEK");
	        
	        Label lblEUR_JPY = new Label(shlZuppiStreamer, SWT.NONE);
	        lblEUR_JPY.setBounds(10, 323, 55, 15);
	        lblEUR_JPY.setText("EURJPY");
	               
	        Label lblXAU_USD = new Label(shlZuppiStreamer, SWT.NONE);
	        lblXAU_USD.setBounds(10, 365, 55, 15);
	        lblXAU_USD.setText("XAUUSD");
	        
	        Label lblWti = new Label(shlZuppiStreamer, SWT.NONE);
	        lblWti.setBounds(10, 386, 55, 15);
	        lblWti.setText("WTI");
	        
	        Label lblEquity = new Label(shlZuppiStreamer, SWT.NONE);
	        lblEquity.setBounds(10, 407, 55, 15);
	        lblEquity.setText("EQUITY");
	        
	        Label lblDax = new Label(shlZuppiStreamer, SWT.NONE);
	        lblDax.setBounds(10, 428, 55, 15);
	        lblDax.setText("DAX");
	        
	        Label lblSp = new Label(shlZuppiStreamer, SWT.NONE);
	        lblSp.setBounds(10, 449, 55, 15);
	        lblSp.setText("SP500");
	        
	        Label lblSmi = new Label(shlZuppiStreamer, SWT.NONE);
	        lblSmi.setBounds(10, 470, 55, 15);
	        lblSmi.setText("SMI");
        
        // Labels Titles #############################################
                
	        Label lblMajors = new Label(shlZuppiStreamer, SWT.NONE);
	        lblMajors.setBounds(10, 8, 55, 15);
	        lblMajors.setText("MAJORS");        
	        
	        Label lblCommodities = new Label(shlZuppiStreamer, SWT.NONE);
	        lblCommodities.setBounds(10, 344, 86, 15);
	        lblCommodities.setText("COMMODITIES");
	        
	        Label lblBid = new Label(shlZuppiStreamer, SWT.NONE);
	        lblBid.setBounds(111, 8, 55, 15);
	        lblBid.setText("BID");
	        
	        Label lblAsk = new Label(shlZuppiStreamer, SWT.NONE);
	        lblAsk.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
	        lblAsk.setBounds(179, 8, 55, 15);
	        lblAsk.setText("ASK");
	        
	        Label lblCrosses = new Label(shlZuppiStreamer, SWT.NONE);
	        lblCrosses.setBounds(10, 155, 55, 15);
	        lblCrosses.setText("CROSSES");     
	        
	        txtLastUpdate = new Text(shlZuppiStreamer, SWT.NONE);
	        txtLastUpdate.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.ITALIC));
	        txtLastUpdate.setText("Last Update:");
	        txtLastUpdate.setBounds(10, 503, 78, 21);
	        
	        lblTime = new Text(shlZuppiStreamer, SWT.NONE);
	        lblTime.setBounds(10, 530, 224, 21);
        // ############################################################

        while (!shlZuppiStreamer.isDisposed()) {
        if (!display.readAndDispatch ()) display.sleep ();
        }
        display.dispose();
    }

    public synchronized void updateEUR_USD(final double vbid, final double vask)
    {
        if (display == null || display.isDisposed()) 
            return;
        display.asyncExec(new Runnable() {

            public void run() {            	
             	lblBidEUR_USD.setText(Double.toString(vbid));
             	lblAskEUR_USD.setText(Double.toString(vask));
            }
        });
    }

    public synchronized void updateUSD_JPY(final double vbid, final double vask)						
    {						
        if (display == null || display.isDisposed()) 						
            return;						
        display.asyncExec(new Runnable() {						
						
            public void run() {            						
             	lblBidUSD_JPY.setText(Double.toString(vbid));					
             	lblAskUSD_JPY.setText(Double.toString(vask));					
            }						
        });						
    }						
    public synchronized void updateGBP_USD(final double vbid, final double vask)	
    {	
        if (display == null || display.isDisposed()) 	
            return;	
        display.asyncExec(new Runnable() {	
	
            public void run() {            	
             	lblBidGBP_USD.setText(Double.toString(vbid));
             	lblAskGBP_USD.setText(Double.toString(vask));
            }	
        });	
    }	

    public synchronized void updateUSD_CHF(final double vbid, final double vask)	
    {	
        if (display == null || display.isDisposed()) 	
            return;	
        display.asyncExec(new Runnable() {	
	
            public void run() {            	
             	lblBidUSD_CHF.setText(Double.toString(vbid));
             	lblAskUSD_CHF.setText(Double.toString(vask));
            }	
        });	
    }	
	
    public synchronized void updateAUD_USD(final double vbid, final double vask)	
    {	
        if (display == null || display.isDisposed()) 	
            return;	
        display.asyncExec(new Runnable() {	
	
            public void run() {            	
             	lblBidAUD_USD.setText(Double.toString(vbid));
             	lblAskAUD_USD.setText(Double.toString(vask));
            }	
        });	
    }	
	
    public synchronized void updateUSD_CAD(final double vbid, final double vask)	
    {	
        if (display == null || display.isDisposed()) 	
            return;	
        display.asyncExec(new Runnable() {	
	
            public void run() {            	
             	lblBidUSD_CAD.setText(Double.toString(vbid));
             	lblAskUSD_CAD.setText(Double.toString(vask));
            }	
        });	
    }	
	
    public synchronized void updateEUR_CHF(final double vbid, final double vask)	
    {	
        if (display == null || display.isDisposed()) 	
            return;	
        display.asyncExec(new Runnable() {	
	
            public void run() {            	
             	lblBidEUR_CHF.setText(Double.toString(vbid));
             	lblAskEUR_CHF.setText(Double.toString(vask));
            }	
        });	
    }	
	
    public synchronized void updateNZD_USD(final double vbid, final double vask)	
    {	
        if (display == null || display.isDisposed()) 	
            return;	
        display.asyncExec(new Runnable() {	
	
            public void run() {            	
             	lblBidNZD_USD.setText(Double.toString(vbid));
             	lblAskNZD_USD.setText(Double.toString(vask));
            }	
        });	
    }	
	
    public synchronized void updateEUR_SEK(final double vbid, final double vask)	
    {	
        if (display == null || display.isDisposed()) 	
            return;	
        display.asyncExec(new Runnable() {	
	
            public void run() {            	
             	lblBidEUR_SEK.setText(Double.toString(vbid));
             	lblAskEUR_SEK.setText(Double.toString(vask));
            }	
        });	
    }	
	
    public synchronized void updateEUR_NOK(final double vbid, final double vask)	
    {	
        if (display == null || display.isDisposed()) 	
            return;	
        display.asyncExec(new Runnable() {	
	
            public void run() {            	
             	lblBidEUR_NOK.setText(Double.toString(vbid));
             	lblAskEUR_NOK.setText(Double.toString(vask));
            }	
        });	
    }	
	
    public synchronized void updateUSD_SEK(final double vbid, final double vask)	
    {	
        if (display == null || display.isDisposed()) 	
            return;	
        display.asyncExec(new Runnable() {	
	
            public void run() {            	
             	lblBidUSD_SEK.setText(Double.toString(vbid));
             	lblAskUSD_SEK.setText(Double.toString(vask));
            }	
        });	
    }	
	
    public synchronized void updateUSD_NOK(final double vbid, final double vask)	
    {	
        if (display == null || display.isDisposed()) 	
            return;	
        display.asyncExec(new Runnable() {	
	
            public void run() {            	
             	lblBidUSD_NOK.setText(Double.toString(vbid));
             	lblAskUSD_NOK.setText(Double.toString(vask));
            }	
        });	
    }	
	
    public synchronized void updateEUR_JPY(final double vbid, final double vask)	
    {	
        if (display == null || display.isDisposed()) 	
            return;	
        display.asyncExec(new Runnable() {	
	
            public void run() {            	
             	lblBidEUR_JPY.setText(Double.toString(vbid));
             	lblAskEUR_JPY.setText(Double.toString(vask));
            }	
        });	
    }	
    public synchronized void updateXAU_USD(final double vbid, final double vask)	
    {	
        if (display == null || display.isDisposed()) 	
            return;	
        display.asyncExec(new Runnable() {	
	
            public void run() {            	
             	lblBidXAU_USD.setText(Double.toString(vbid));
             	lblAskXAU_USD.setText(Double.toString(vask));
            }	
        });	
    }	
    public synchronized void updateWTICO_USD(final double vbid, final double vask)	
    {	
        if (display == null || display.isDisposed()) 	
            return;	
        display.asyncExec(new Runnable() {	
	
            public void run() {            	
             	lblBidWTICO_USD.setText(Double.toString(vbid));
             	lblAskWTICO_USD.setText(Double.toString(vask));
            }	
        });	
    }	
    public synchronized void updateDE30_EUR(final double vbid, final double vask)	
    {	
        if (display == null || display.isDisposed()) 	
            return;	
        display.asyncExec(new Runnable() {	
	
            public void run() {            	
             	lblBidDE30_EUR.setText(Double.toString(vbid));
             	lblAskDE30_EUR.setText(Double.toString(vask));
            }	
        });	
    }	
	
    public synchronized void updateSPX500_USD(final double vbid, final double vask)	
    {	
        if (display == null || display.isDisposed()) 	
            return;	
        display.asyncExec(new Runnable() {	
	
            public void run() {            	
             	lblBidSPX500_USD.setText(Double.toString(vbid));
             	lblAskSPX500_USD.setText(Double.toString(vask));
            }	
        });	
    }	
	
    public synchronized void updateCH20_CHF(final double vbid, final double vask)	
    {	
        if (display == null || display.isDisposed()) 	
            return;	
        display.asyncExec(new Runnable() {	
	
            public void run() {            	
             	lblBidCH20_CHF.setText(Double.toString(vbid));
             	lblAskCH20_CHF.setText(Double.toString(vask));
            }	
        });	
    }	
   
    public synchronized void updateTime(final String time)	
    {	
        if (display == null || display.isDisposed()) 	
            return;	
        display.asyncExec(new Runnable() {	
	
            public void run() {            	
             	lblTime.setText(time);
            }	
        });	
    }	
}
