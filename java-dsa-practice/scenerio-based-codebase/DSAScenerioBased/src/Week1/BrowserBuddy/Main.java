package Week1.BrowserBuddy;

public class Main {
public static void main(String[] args) {
    	
        //browser object
        Browser browser = new Browser();

        
        Tab tab1 = new Tab();
        browser.openTab(tab1);

        // Visit pages in tab1
        tab1.visit("google");
        tab1.visit("github");
        tab1.visit("leetcode");

        // Go back and forward
        tab1.back();    
        tab1.back();    
        tab1.forward(); 

        // Open second tab
        Tab tab2 = new Tab();
        browser.openTab(tab2);
        tab2.visit("youtube");

        
        browser.closeTab(tab1);

       
        browser.reopenTab();

        
        tab1.forward(); 
    }


}
