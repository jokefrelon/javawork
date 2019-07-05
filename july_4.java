public class july_4 {
	    public static void main(String[] args) {
		            int [] todo={23,34,45,56,6778,798,89};
			            String xitele=resort(todo);
				            System.out.println(xitele);
					        }

	        public static String resort(int[] jun) {
			        int stand =jun.length-1;
				        for (int wenot=0;wenot<stand;wenot++,stand--){
						            int temp = jun[wenot];
							                jun[wenot]=jun[stand];
									            jun[stand]=temp;
										            }
					        String bak ="";
						        for (int nuy=0;nuy<jun.length;nuy++){
								            bak=bak+jun[nuy]+" ";
									            }
							        return bak;
								    }
}
