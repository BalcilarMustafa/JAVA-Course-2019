package Part_16;

public class Methods_with_Return8_Validate_Task_163 {

public boolean validateTask(boolean notEmpty,int taskId,int currentId) {
		    
	 if(notEmpty==false) {return false;}  
	 else {
		 if(taskId==currentId+1) {return true;}   
		 else {return false;}
	      }
   }
}

