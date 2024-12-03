package SingleDimensionArray;

public class SDA {
int [] arr;
public SDA(int size) {
	arr=new int[size];
	for (int i = 0; i < size; i++) {
		arr[i]=Integer.MIN_VALUE;
	}
}
public void insertion(int index,int value)
{
	try {
		if(arr[index]==Integer.MIN_VALUE)
		{
			arr[index]=value;
			System.out.println("the value"+value+"is inserted");
		}else {
			System.out.println("the cell is already fill");
		}
	}catch (ArrayIndexOutOfBoundsException e)
	{
		System.out.println("invalid index");
	}
}

public void traverse() {
	for (int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
}

public void Searching(int value) {
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]==value) {
			System.out.println("the value is present in index of:"+i);
			return;
		}
	}
	System.out.println("the value is not present");
}

public void deletion(int index) {
	try {
		if(arr[index]!=Integer.MIN_VALUE) {
			arr[index]=Integer.MIN_VALUE;
			System.out.println("the value is deleted");
			
		}else {
			System.out.println("no element inserted");
		}
	}catch(ArrayIndexOutOfBoundsException e){
		System.out.println("invalid index");
	}
}






}
