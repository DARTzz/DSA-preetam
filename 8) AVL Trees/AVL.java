class AVL
{
	LinkedList root = null;

// Constructors :
	public AVL(int value)
	{
		root = new LinkedList(value,null);
	}

// Methods :
	public void add(int data)
	{
		LinkedList temp = root;
		LinkedList temp2 = null;
		while(true)
		{
			if(data < temp.data)
			{
				if(temp.left == null)
				{
					temp.left = new LinkedList(data,temp);
					temp2 = temp.left;
					temp.left.height = temp.height+1;
					break;
				}
				else if(data > temp.left.data && temp.left.right == null)
				{
					temp.left.right = new LinkedList(data, temp.left);
					temp2 = temp.left.right;
					temp.left.right.height = temp.left.height + 1;
					break;
				}
				else if(data < temp.left.data && temp.left.left == null)
				{
					temp.left.left = new LinkedList(data, temp.left);
					temp2 = temp.left.left;
					temp.left.left.height = temp.left.height + 1;
					break;
				}
				else if(temp.left.data == data)
				{
					temp.left.count++;
					break;
				}
				else
				{
					temp = temp.left;
					continue;
				}
			}
			else if(data > temp.data)
			{
				if(temp.right == null)
				{
					temp.right = new LinkedList(data, temp);
					temp2 = temp.right;
					temp.right.height = temp.height + 1;
				}
				if(data > temp.right.data && temp.right.right == null)
				{
					temp.right.right = new LinkedList(data, temp.right);
					temp2 = temp.right.right;
					temp.right.right.height = temp.right.height + 1;
					break;
				}
				else if(data < temp.right.data && temp.right.left == null)
				{
					temp.right.left = new LinkedList(data, temp.right);
					temp2 = temp.right.left;
					temp.right.left.height = temp.left.height + 1;
					break;
				}
				else if(temp.right.data == data)
				{
					temp.right.count++;
					break;
				}
				else
				{
					temp = temp.right;
					continue;
				}
			}
		}
		while(temp2 != null)
		{
			if()
		}
	}

	public void checkUnbalanced(LinkedList lst)
	{

	}

	public void balance(LinkedList lst)
	{

	}
}