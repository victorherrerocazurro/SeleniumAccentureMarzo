package test.concordion.execute.vacio;

import org.concordion.integration.junit3.ConcordionTestCase;

public class Despertador extends ConcordionTestCase {
	private String time;
	
	public void setCurrentTime(String time) {
       this.time = time;
    }

    public String getSaludo() {
        if(time.equals("09:00AM")){
        	return "Buenos Dias Mundo!";
        } else {
        	return "";
        }
    	
    }
}
