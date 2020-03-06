package studentCoursesBackup.myTree;
import java.util.ArrayList; 

public class Node implements ObserverI,SubjectI,Cloneable{

public int bNumber=0;
public Node left=null;
public Node right=null;
public ArrayList<String> courses=new ArrayList<String>();
public ArrayList<Node> backuparray=new ArrayList<Node>();;
public String course="";
		

	public Node(int bNumber, String course) {
		this.courses = new ArrayList<String>();
        this.backuparray = new ArrayList<Node>();
        this.bNumber = bNumber;
        this.left = null;
        this.right = null;
        this.course = course;
        this.bNumber = bNumber;
        this.courses.add(course);
    }

	

	public Object clone(){
		return new Node(bNumber,course);
	}

	public void update(Node node,String course)
	{
		if(node.courses.contains(course))
		{
			node.courses.remove(course);
		}
	}

	public void register(Node observer)
	{
			backuparray.add(observer);
	}

	public void remove(Node observer)
	{
		if(backuparray.contains(observer))
		{
		backuparray.remove(observer);
		}
	}

	public void notifyAll(String course)
	{
		for(Node node:backuparray)
		{
			update(node,course);
		}
	}

	

}