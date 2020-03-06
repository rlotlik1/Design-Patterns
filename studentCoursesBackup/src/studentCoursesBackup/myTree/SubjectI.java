package studentCoursesBackup.myTree; 

public interface SubjectI
{
	public void register(Node observer);
	public void remove(Node observer);
	public void notifyAll(String course);
}