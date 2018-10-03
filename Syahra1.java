
public class Syahra1 {
	public static void main(String[] args) {
	 		String sy = "NURSYAHRAH";
			System.out.println("Bentuk Plaintextnya adalah	:"+sy);
			
			String ns = encript(sy);
			System.out.println("Bentuk Enkripsinya adalah	:"+ns);
			
			String sy1 = decript(ns);
			System.out.println("Bentuk Dekripsinya adalah	:"+sy1);  
			
			
		}
		public static final String[] sy = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"," "};
		public static final String[] ns = {"D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","A","B","C"," "};
		
		
		public static String encript(String plaintext){
			String ciphertext = "";
			for(int i=0 ; i<plaintext.length(); i++){
				String s0 = plaintext.substring(i, i+1);
				String s1 = " ";							
				//
				for(int j=0; j<sy.length; j++){				
					if(s0.equals(sy[j])){					
						s1 = ns[j];
						break;
					}
				}
				ciphertext+=s1;
			}
					
			return ciphertext;
		}
		public static String decript(String ciphertext){
			String plaintext = "";
					for(int i=0 ; i<ciphertext.length(); i++){
						String s0 = ciphertext.substring(i, i+1);
						String s1 = " ";							
						//
						for(int j=0; j<ns.length; j++){				
							if(s0.equals(ns[j])){					
								s1 = sy[j];
								break;
							}
						}
						plaintext+=s1;
					}
			return plaintext;
		}
	}



