package dataStructure;

public class PerformanceDemo {

	public static void main(String[] args) {
		int size = 100000000;
		int[] arr = new int[size];

		System.out.println(sample(arr, size));
	}

	static int sample(int[] data, int n) {

		int k = n / 2;
		int result = data[k];
		System.out.println("수행횟수");
		return result;
	}

}
