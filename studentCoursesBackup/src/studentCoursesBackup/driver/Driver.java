
package studentCoursesBackup.driver;


import studentCoursesBackup.util.TreeBuilder;
import studentCoursesBackup.util.FileProcessor;
import studentCoursesBackup.util.Results;
import studentCoursesBackup.myTree.Node;
    
/**
 * @author Riya Lotlikar
 *
 */
    
    public class Driver {
	
	public static void main(String[] args) {
	    

	    String course;
	    String line="";
	    int bNumberArray_1;
	    /*
	     * As the build.xml specifies the arguments as argX, in case the
	     * argument value is not given java takes the default value specified in
	     * build.xml. To avoid that, below condition is used
	     */

	    // FIXME: update this if statement for this assignment
	    if ( (args.length != 5) || args[0].equals("${arg0}") || args[1].equals("${arg1}") || args[2].equals("${arg2}") || args[3].equals("${arg3}") || args[4].equals("${arg4}")) {
		    
		    System.err.println("Error: Incorrect number of arguments. Program accepts 6 argumnets.");
		    System.exit(0);
	    } // end of if*/
	    
	   else
	   {
	   		String inputFile=args[0];
	   		String deleteFile=args[1];
	   		String outputFile1=args[2];
	   		String outputFile2=args[3];
	   		String outputFile3=args[4];

	   		FileProcessor fp=new FileProcessor(inputFile);

	   		TreeBuilder tree=new TreeBuilder();
	   		TreeBuilder back1=new TreeBuilder();
	   		TreeBuilder back2=new TreeBuilder();

	   		Node node=null;
	   		Node backup_Node_1,backup_Node_2;
	   		Node currentNode=null;
	   		backup_Node_1=null;
	   		backup_Node_2=null;

	   		Results backup_Result_1=null;
	   		Results backup_Result_2=null;
	    	Results backup_Result_3=null;
	    	
	   		while((line=fp.readLine()) !=null)
	   		{
	   					
	   			bNumberArray_1=Integer.parseInt(line.split(":")[0].trim());
	   			course = line.split(":")[1].trim();
	   			currentNode=tree.search(bNumberArray_1);
	 
	   			if(currentNode!=null)
	   			{
	   				if(!currentNode.courses.contains(course))
	   				{
	   					currentNode.courses.add(course);
	   					currentNode.backuparray.get(0).courses.add(course);
	   					currentNode.backuparray.get(1).courses.add(course);
	   					currentNode.notifyAll(course);
	   				}		
	   			}

	   			else
	   			{
	   					node=new Node(bNumberArray_1,course);
	   				    backup_Node_1=(Node)node.clone();
	   					backup_Node_2=(Node)node.clone();
	   					node.register(backup_Node_1);
						node.register(backup_Node_2);
						tree.insert(node);
						back1.insert(backup_Node_1);
						back2.insert(backup_Node_2);	
	   			}

	   		
	   		}

	   		FileProcessor filep=new FileProcessor(deleteFile);
	   		while((line=filep.readLine())!=null)
	   		{
	   			bNumberArray_1=Integer.parseInt(line.split(":")[0].trim());
	   			 course = line.split(":")[1].trim();
	   			currentNode=tree.search(bNumberArray_1);

	   			if(currentNode!=null)
	   			{
	   				tree.delete(currentNode,course);
	   				currentNode.notifyAll(course);
	   			}
	   		    
	   		}

	   		backup_Result_1 = new Results(args[2]);
	   		tree.inorderBST();
        	tree.printNodes(backup_Result_1);
        	backup_Result_1.writeToFile(backup_Result_1.msg);

        	backup_Result_2 = new Results(args[3]);
        	back1.inorderBST();
        	back1.printNodes(backup_Result_2);
        	backup_Result_2.writeToFile(backup_Result_2.msg);


        	backup_Result_3 = new Results(args[4]);
        	back2.inorderBST();
        	back2.printNodes(backup_Result_3);
			backup_Result_3.writeToFile(backup_Result_3.msg);


	   	}
	    
	}  // end public static void main
    }  // end public class Driver
