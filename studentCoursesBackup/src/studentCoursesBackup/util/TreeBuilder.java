package studentCoursesBackup.util;

import studentCoursesBackup.myTree.Node;

import java.util.ArrayList;

public class TreeBuilder
{
	Node original_root;
	public String print;

	public TreeBuilder()
	{
		original_root=null;
		print="";
		
	}


	public Node insert(Node node)
	{
		original_root=insertBST(original_root,node);
		return original_root;
	}

	public Node insertBST(Node root,Node node)
	{
		if(root==null)
		{
			root=node;
			return root;
		}

		if(node.bNumber < root.bNumber)
		{
			root.left=insertBST(root.left,node);

		}
		else if(node.bNumber > root.bNumber)
		{
			root.right=insertBST(root.right,node);
		}

		if(node.bNumber==root.bNumber)
		{
			if(!root.course.contains(node.course))
			{
				root.courses.add(node.course);
			}
		}

		return root;
	}

	public void delete(Node root,String course)
	{
		if(root.courses.contains(course))
		{
			root.courses.remove(course);
		}
    }

    public Node search(int bNumber) {
        Node temp = original_root;
        if (temp != null)
        {
            if (temp.bNumber == bNumber) {
                return temp;
            } 
            else if (temp.bNumber < bNumber)
            {
                temp = temp.right;
            } 
            else if(temp.bNumber>bNumber)
            {
                temp = temp.left;
            }
        }
        return null;
    }

    public void inorderBST()
    {
    	inorderBST(original_root);
    }

	public void inorderBST(Node root) 
	{

		if (root != null) 
		{
			inorderBST(root.left);
	        print=print + root.bNumber + ":" + courselist(root.courses) + "\n";
	        System.out.println();
			inorderBST(root.right);
	    }
	}

	public String courselist(ArrayList<String> courses)
	{
		String list="";
		int i=0;
		for(String course:courses)
		{
			if(i==0)
			{
				list=list+" "+course;
				i++;
			}
			else
			{
				list=list+","+course;
			}
		}
		return list;
	}
    
    
    public void printNodes(Results original_results) {
    	original_results.storeResult(print);
    }
}
