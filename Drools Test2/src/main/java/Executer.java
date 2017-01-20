
import java.io.InputStreamReader;
import java.io.Reader;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class Executer {

	public static void main(String[] args) {
		// load the knowledge base
		KieServices ks = KieServices.Factory.get();
 	    KieContainer kContainer = ks.getKieClasspathContainer();
     	KieSession kSession = kContainer.newKieSession("ksession-dtables");

		// add facts to working memory
		Customers c1 = new Customers();
		/*
		String c1Name = "Test"; 
		String c1Type = "Business";
		c1.setName(c1Name);
		c1.setCustomerType(c1Type);
		*/
		CustomerType customerType; // = CustomerType.Business;

		//c1.setCustomerType();
		Customers c2 = new Customers("Testi", "Private");
		
		//kSession.insert(message);
        kSession.fireAllRules();
		
		System.out.println(c2.getName());
		
	}

}
