package adiiapplication;

public class CreatngObj {

    // Member variables
    int a = 10;
    String web = "www.google.com";

    void showa()
    {
    	System.out.println(a);
    }
    
    // Method to show the value of the 'web' variable
    void showWeb() {
        System.out.println(web);
    }

    public static void main(String[] args) {
       
    	// Create an object of the class
    	CreatngObj co = new CreatngObj();

        // Call the method to display the 'web' value
        co.showWeb();
        co.showa();
    }
}

/*
O/P:
www.google.com
10
*/
