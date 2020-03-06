package multiThreadedHS;

import java.util.ArrayList;
import multiThreadedHS.*;



public class SortedList
{
	public ArrayList<Integer> _list = new ArrayList<>();
	public TemplatePattern temp;

	public SortedList(ArrayList<Integer> _list)
	{
		this._list=_list;
	}

	/*public void SetSortStrategy(TemplatePattern tempPattern)
	{
		this.temp=tempPattern;
	}*/

	public void sort(ArrayList<Integer> _list)
	{
		sorting(_list);
	}
}