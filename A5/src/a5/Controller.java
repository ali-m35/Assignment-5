package a5;
/* **********************************************************
 * Programmer:	Rob Sveinson
 * Class:		CS20S
 * 
 * Assignment:	hospital mvc example project
 *
 * Description:	controller class to pass info between the model and the view 
 * *************************************************************
 */
 
 // import files here as needed
 import java.util.ArrayList;
 
 public class Controller
 {  // begin class
 	
 	// *********** class constants **********
 	
 	
 	// ********** instance variable **********
	 
            private GradeGUI ui;
            private ArrayList<Grade> gradeList = new ArrayList();
            private Grade gR = null;
 	
 	// ********** constructors ***********
	 
    //*****************************************************
    // Purpose: create a new controller object
    // Interface: IN: none
    // Returns: none
    // ***************************************************** 
	 public Controller(){
		 System.out.println("Controller Created!");
	 } // end contructor
	 
 	// ********** accessors **********
 	
        
         
       
         
 	// ********** mutators **********
        
        //*****************************************************
        // Purpose: get details of a grade record
        // Interface: IN: index of patient in list
        // Returns: grade detail: String
        // *****************************************************
         protected String toStringGrade() {
             String Output = gR.toString();
             
             return Output;
         }// end toStringGrade
        
        //*****************************************************
        // Purpose: creates a new grade object and adds to the list
        // Interface: IN: index of patient in list
        // Returns: 
        // *****************************************************
                public void submitButtonClicked(String fn, String ln, int g, String c, int m) {
                    System.out.println("submit button clicked");
                    
                    gR = new Grade(fn, ln, g, c, m);
                    gradeList.add(gR);
                    ui.gradeListModel.addElement(gR);
                }// end submitButtonClicked
                
        //*****************************************************
        // Purpose: registers view of controller
        // Interface: IN: index of patient in list
        // Returns: 
        // *****************************************************
                public void addUI(GradeGUI g) {
                    System.out.println("ui added to controller");
                    this.ui = g;
                }// end add UI
 }  // end class