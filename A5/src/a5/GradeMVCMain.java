package a5;

// **********************************************************************
// Programmer:	Hanzala ALI
// Class:		CS30S
//
// Assignment:Assignment 5
//
// Description:	creates a grade calculaor gui you must enter your info into the gui then submit
//
//
//	Input:		n/a
//
//  Output: gui of grade input
// ***********************************************************************

import a5.Controller;
import a5.GradeGUI;
import javax.swing.*;
import java.text.DecimalFormat;

public class GradeMVCMain/*CHANGE THIS TO THE NAME OF THE FILE*/
{  // begin class
	public static void main(String args[])
	{  // begin main
	// ***** declaration of constants *****
	
	// ***** declaration of variables *****
	
	// ***** create objects *****
		
		
	// ***** create input stream *****
	
		//ConsoleReader console = new ConsoleReader(System.in);
		
	// ***** Print Banner *****
	
		System.out.println("**********************************");
		System.out.println("NAME: Hanzala ALi");
		System.out.println("Class:       CS30S");
		System.out.println("Assignment:  Assignment 5");
		System.out.println("**********************************");
		
	// ***** get input *****
	
		// all input is gathered in this section
		// remember to put ConsoleReader.class into the
		// same folder.
	
	// ***** processing *****
            
            GradeGUI gradeUI = new GradeGUI();
            gradeUI.setVisible(true);
            
            Controller controller = new Controller();
            
            gradeUI.addController(controller);      // register controller with view
              controller.addUI(gradeUI);         // register view with controller
                                              
		
	// ***** output *****
	
		// all formatted ouput is printed in this section

	// ***** closing message *****
	
		System.out.println("end of processing");
	
	}  // end main	
}  // end class