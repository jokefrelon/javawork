public class sort {
	public static void main(String[] args) {
		int[] kill = { 12, 22, 21, 41, 11, 532, 57, 98 };
		String kill2 = bigger(kill);
		System.out.println(kill2);
									}

	public static String bigger(int[] log)
	{
		for (int num_y = 0; num_y < log.length - 1; num_y++)
		{
			for (int num_x = num_y + 1; num_x < log.length; num_x++)
			{
				if (log[num_y] > log[num_x])
				{
					int temp = log[num_x];
					log[num_x] = log[num_y];
					log[num_y] = temp;
				}
 			}
		}
		String loog = " ";
		    for (int i = 0; i < log.length - 1; i++) {
			    String ssl = loog + log[i] + " ";
				loog = ssl;
			}
		return loog;
	}
}