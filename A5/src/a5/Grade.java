package a5;

/* **********************************************************
 * Programmer:	Hanzala ALi
 * Class:CS30S
 * 
 * Assignment: Assignment 5
 *
 * Description: this class wil create a grade object wih its own properties to add to the gui
 *its will take your mark for the course and calculate yoyur gpa and grade
 * 
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class Grade
 {  // begin class
 	
 	// *********** class constants **********
            private static int nextID = 1000;       // id for student
            
            
            // gpas for each individual grade A+,B+,C+ ETC.
            private final double gpAPlus = 4.5;     
            private final double gpaA = 4.0;       
            private final double gpaBPlus = 3.5;   
            private final double gpaB = 3.0;
            private final double gpaCPlus = 2.5;
            private final double gpaC = 2.0; 
            private final double gpaD = 1.0;
            private final double gpaF = 0.0;
            
            // string for each individual grade
            private String gradeAPlus = "A+";
            private String gradeA = "A";
            private String gradeBPlus = "B+";
            private String gradeB = "B";
            private String gradeCPlus = "C+";
            private String gradeC = "C";
            private String gradeD = "D";
            private String gradeF = "F";
            
 	// ********** instance variable **********
            
                // Variables for imput inof used to make grade object
            private String firstName = "";
            private String lastName = "";
            private String course = "";
            private int studentID = 0;
            private int gradeLevel = 0;
            
            // variable to hod values for grade properties
            private int mark = 0;
            private double gpaFinal = 0.0;
            private String gradeFinal = "";
            
 	// ********** constructors ***********
            
            /*****************************************************
            Purpose: create grade objects
            Interface: student info
            Returns: grade object
            *****************************************************/
                    public Grade(String fn, String ln, int g, String c, int m) {
                        studentID = nextID++;
                        firstName = fn;
                        lastName = ln;
                        gradeLevel = g;
                        course = c;
                        mark = m;
                        
                        System.out.println("create a new grade object");
                    }// end grade
            
                    
 	// ********** accessors **********
 	
        /*****************************************************
            Purpose: gets first name
            Interface: student info
            Returns: first name
            *****************************************************/
                    public String getFirstName(){
                        return this.firstName;
                    }// end getFirstName
                    
            /*****************************************************
            Purpose: gets last name
            Interface: student info
            Returns: last name
            *****************************************************/
                    public String getLastName() {
                        return this.lastName;
                    }// end getLastName
                    
            /*****************************************************
            Purpose: gets grade level
            Interface: student info
            Returns: grade level
            *****************************************************/
                    public int getGradeLevel() {
                        return this.gradeLevel;
                    }// end getGradeLevel
                    
            /*****************************************************
            Purpose: gets course
            Interface: student info
            Returns: returns course
            *****************************************************/
                    public String getCourse() {
                        return this.course;
                    }// end getCourse
                    
            /*****************************************************
            Purpose: gets mark 
            Interface: student info
            Returns: mark
            *****************************************************/
                    public int getMark() {
                        return this.mark;
                    }// end getMark
                   
            /*****************************************************
            Purpose: gets id
            Interface: student info
            Returns: id
            *****************************************************/
                    public int getID() {
                        return this.studentID;
                    }
            
            /*****************************************************
            Purpose: gets your final grade
            Interface: student info
            Returns: final grade
            *****************************************************/
                    public String getGradeFinal() {
                        if(mark <= 100 && mark >= 90){
                            gradeFinal = gradeAPlus;
                        }
                        
                        else if(mark <= 89 && mark >= 80) {
                            gradeFinal = gradeA;
                            
                        }
                        
                        else if(mark <= 79 && mark >= 75) {
                            gradeFinal = gradeBPlus;
                        }
                        
                        else if(mark <= 74 && mark >= 70) {
                            gradeFinal = gradeB;
                        }
                        
                        else if(mark <= 69 && mark >= 65) {
                            gradeFinal = gradeCPlus;
                        }
                        
                        else if(mark <= 64 && mark >= 60) {
                             gradeFinal = gradeC;
                        }
                        
                        else if(mark <= 59 && mark >= 50){
                            gradeFinal = gradeD;
                        }
                        
                        else {
                            gradeFinal = gradeF;
                        }
                    
                    return this.gradeFinal;
                    
                    }// end getGradeFinal
                    
            /*****************************************************
            Purpose: get gpa
            Interface: student info
            Returns: gpa
            *****************************************************/
                    public double getGpaFinal() {
                        
                        if (gradeFinal == gradeAPlus) {
                            gpaFinal = gpAPlus;
                        }
                        
                        else if(gradeFinal == gradeA) {
                            gpaFinal = gpaA;
                        }
                        
                        else if(gradeFinal == gradeBPlus) {
                            gpaFinal = gpaBPlus;
                        }
                        
                        else if(gradeFinal == gradeB) {
                            gpaFinal = gpaB;
                        }
                        
                        else if(gradeFinal == gradeCPlus) {
                            gpaFinal = gpaCPlus;
                        }
                        
                        else if(gradeFinal == gradeC) {
                            gpaFinal = gpaCPlus;
                        }
                        
                        else if(gradeFinal == gradeD) {
                            gpaFinal = gpaD;
                        }
                        
                        else {
                            gpaFinal = gpaF;
                        }
                        
                        return this.gpaFinal;
                        
                    }// end getGpaFinal
                    
            /**************************************************
            * Purpose:    return a string of grade properties
            * 
            * Interface:
            * in:         none
            * returns:    info: sting
            **************************************************/
                    public String toString() {
                        String strout = "";
                        
                    strout = "Student ID: \n" + this.getID() + " \n ";
                    strout += "Name: \n" + this.getFirstName() + " \n " + this.getLastName() + " \n ";
                    strout += "Grade Level: \n"  + this.getGradeLevel() + " \n ";
                    strout += "Course: \n" + this.getCourse() + " \n ";
                    strout += ("Mark: \n" + this.getMark()) + " \n ";
                    strout += ("Grade: \n" + this.getGradeFinal()) + " \n ";
                    strout += ("GPA: \n" + this.getGpaFinal()) + " \n ";
                    strout += ("\n\n");
                        
                        return strout;
                    }// end toString
                    
 	// ********** mutators **********
 
 }  // end class