public class San {
	    public static void main(String[] args) {
		            int[] awm = { 12, 34, 35, 123, 346, 247, 943 };
			            for (int sd = 0; sd < awm.length - 1; sd++) {
					                for (int ss = sd + 1; ss < awm.length; ss++) {
								                if (awm[sd] > awm[sd + 1]) {
											                    int temp = awm[sd + 1];
													                        awm[sd + 1] = awm[sd];
																                    awm[sd] = temp;
																		                    }
										            }
							        }
				            String silly = "";
					            for (int uc = 0; uc < awm.length; uc++) {
							                silly = silly + awm[uc] + " ";
									        }
						            System.out.println(silly);
							        }
}
