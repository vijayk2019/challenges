package sqaurechallenge;

import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

	private static class Nuts {
		int row, col;
		Boolean covered;

		Nuts(int rowin, int colin) {
			row = rowin;
			col = colin;
			covered = false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = new int[2][3];
		int Tree_row, Tree_col, sq_row, sq_col, nuts_row, nuts_col, i = 0, num_nut = 0, min = 0, index = 0, j = 0, sum;
		Nuts[] nut;
		int steps = 0;
		Nuts distmin;
		Scanner in = new Scanner(System.in);
		sq_row = in.nextInt();
		sq_col = in.nextInt();
		Tree_row = in.nextInt();
		Tree_col = in.nextInt();
		num_nut = in.nextInt();
		Nuts[] nuts = new Nuts[num_nut];
		while (in.hasNextInt()) {
			nuts_row = in.nextInt();
			nuts_col = in.nextInt();
			nuts[i] = new Nuts(nuts_row, nuts_col);
			i++;
		}
		while (j < i) {
			distmin = nuts[j];
			for (int k = 0; k < num_nut; k++) {
				if (nuts[k].covered != true) {
					sum = Math.abs(sq_row - nuts[k].row)
							+ Math.abs(sq_col - nuts[k].col);
					if (sum < (Math.abs(distmin.row) + Math.abs(distmin.col))) {
						index = k;
						min = sum;
						distmin = nuts[k];
					}
				}
			}
			nuts[index].covered = true;
			steps += min + Math.abs(nuts[index].row - Tree_row)
					+ Math.abs(nuts[index].col - Tree_col);
			sq_row = Tree_row;
			sq_col = Tree_col;
			j++;
		}
		System.out.println(steps);
	}

}
