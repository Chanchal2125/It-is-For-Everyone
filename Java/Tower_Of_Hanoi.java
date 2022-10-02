public class TowerOfHanoiExample
 {

 // A recursive method to find the solution of Tower of Hanoi
 static void twrOfHanoi(int disk, char fromPole, char toPole, char auxPole)
 {
    
     if (disk == 1)
     {
           System.out.println("Moving disk 1 from pole " + fromPole + " to pole " + toPole);
            return;
      }
      // The first recursive call             
      
      twrOfHanoi(disk - 1, fromPole, auxPole, toPole);

       
       System.out.println("Moving disk " + disk + " from pole " + fromPole + " to pole " + toPole);
       // The second recursive call
      
       twrOfHanoi(disk - 1, auxPole, toPole, fromPole);
 }
       
        public static void main(String argvs[])
        {
                int disks = 3; // total number of disks
                char firstPole = 'A'; // first pole
                char secondPole = 'B'; // second pole
                char thirdPole = 'C'; // third pole
                // invoking the method twrOfHanoi
                twrOfHanoi( disks, firstPole, thirdPole, secondPole );
       }
 } 
 
