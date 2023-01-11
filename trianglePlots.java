/*
author: Kathryn White
purpose: This program reads positive integer n and calls three methods to plot triangles of 
size n as shown below in the method notes.
*/

//class to store triangle methods to be called upon later in main method
class Triangle{
  
    //first method
    //will plot a triangle as follows:
    /*
    1 2 3 4 5
    6 7 8 9
    10 11 12
    13 14
    15
    */
    void plotTri1(int n){
        int k=1;
        int m=n;
        
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=m;j++){ //prints as many numbers in the row as there are in int m
                System.out.printf("%-4d", k);
                k++;
            }
            
            System.out.println(); //prints new line
            m--;
        }
    }
    
    //second method
    //will plot a triangle as follows:
    /*
    1
    2 6
    3 7 10
    4 8 11 13
    5 9 12 14 15
    */
    void plotTri2(int n){
        
        for(int i=1;i<=n;i++){
            int m=i;
            
            for(int j=1;j<=i;j++){
                System.out.printf("%-4d", m);
                m = m+n-j; //takes int m and adds 5 and subtracts by int j to get next number displayed
            }
            
            System.out.println(); //prints out new line
        }
    }
    
    //third method
    //will plot a triangle as follows:
    /*
            1
          1 3 1
        1 3 9 3 1
      1 3 9 27 9 3 1
   1 3 9 27 81 27 9 3 1
    */
    void plotTri3(int n){
        
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=n-i;j++)
                System.out.printf("%4s"," ");
            
            int m=1;
            
            for(int j=1;j<=i;j++){
                System.out.printf("%4d", m);
                m *= 3;
            }
            
            m /= 9; 
            
            for(int j=1;j<i;j++){
                System.out.printf("%4d",m);
                m /= 3; //each corresponding number will be divided by 3
            }
           
            System.out.println(); //prints out new line
        }
       
    }


}
public class Lab05 {

    //main method
    public static void main(String[] args) {
        
        //creates object of Triangle class for test
        Triangle test = new Triangle();
        
        //test
        test.plotTri1(5);
        System.out.println();
        test.plotTri2(3);
        System.out.println();
        test.plotTri3(5);
    }
    
}
