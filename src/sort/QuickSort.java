package sort;

import java.util.*;

public class QuickSort {

	private static <T extends Comparable<T>> int partition(T[] list, int lo,
			int hi) {
		int left = lo + 1;
		int right = hi;
		T pivot = list[lo];

		while (true) {
			while (left <= right) {
				if (list[left].compareTo(pivot) < 0) {
					left++;
				} else {
					break;
				}
			}
			while (right > left) {
				if (list[right].compareTo(pivot) >= 0) {
					right--;
				} else {
					break;
				}
			}

			if (left >= right) {
				break;
			}

			T temp = list[left];
			list[left] = list[right];
			list[right] = temp;
			left++;
			right--;
		}

		list[lo] = list[left - 1];
		list[left - 1] = pivot;
		return left - 1;
	}

	private static <T extends Comparable<T>> void sort(T[] list, int lo, int hi) {
		if ((hi - lo) <= 0) {
			return;
		}

		int partitionPoint = partition(list, lo, hi);
		sort(list, lo, partitionPoint - 1);
		sort(list, partitionPoint + 1, hi);

	}

	public static <T extends Comparable<T>> void sort(T[] list) {
		if (list.length <= 1) {
			return;
		}

		sort(list, 0, list.length - 1);

	}

}
