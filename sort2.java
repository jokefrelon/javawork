public class sort2 {
	    public static void main(String[] args) {
		            int [] frp={128,234,734,23,345,642,29,9};
			            String fulkli=sort(frp);
				            System.out.println(fulkli);
					        }

	        public static String sort(int[] svip) {
			        for(int x=0;x<svip.length-1;x++){
					            for(int y = x+1;y < svip.length;y++){
							                    if(svip[x]>svip[y]){
										                        int temp=svip[x];
													                    svip[x]=svip[y];
															                        svip[y]=temp;
																		                }
									                }
						            }
				        String two =" ";
					        for (int six=0;six<svip.length;six++){
							            two=two+svip[six]+" ";
								            }
						        String two2 = two;
							        return two2;
								    }
}
