package placement.DataStructure;

public class DynamicStack extends Stack {
	public DynamicStack() {
		super();
	}

	public DynamicStack(int capacity) throws Exception {
		super(capacity);
	}

	@Override
	public void push(int item) throws Exception {
		if (this.size() == this.data.length) {
			int arr[] = new int[2 * this.data.length];
			for(int i=0;i<this.size();i++) {
				arr[i]=this.data[i];
			}
			this.data=arr;

		}
//		top++;
//		data[top]=item;
//		or we can reuse push()
		super.push(item);
		
	}

}
