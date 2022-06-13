class LinkedList
{
	int data =0;
	int count=0;
	int height=0;
	LinkedList left = null;
	LinkedList right = null;
	LinkedList parent = null;

	public LinkedList(int data, LinkedList parent)
	{
		this.data = data;
		this.parent = parent;
		this.count = 1;
	}
}