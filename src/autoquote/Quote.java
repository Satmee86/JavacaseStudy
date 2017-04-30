package autoquote;
import org.springframework.web.client.RestTemplate;

public class Quote {
	
	String quoteNumber;
	
	String quotedPrem;

	public String getQuoteNumber() {
		getquoteNum();
		return quoteNumber;
	}

	public void setQuoteNumber(String quoteNumber) {
		this.quoteNumber = quoteNumber;
	}

	public String getQuotedPremium() {
		return quotedPrem;
	}

	public void setQuotedPremium(String quotedPrem) {
		this.quotedPrem = quotedPrem;
	}
	public void getquoteNum() {
		
		RestTemplate temp = new RestTemplate();
		quoteNumber = temp.getForObject("http://localhost:8080/WebServices/rest/GetQuote/quote", String.class);	
	
	}
}
