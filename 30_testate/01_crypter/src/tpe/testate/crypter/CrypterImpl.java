package tpe.testate.crypter;

public class CrypterImpl implements Crypter {

	public String encrypt(String input) {

		input = input.toLowerCase();

		String encrypted = "";

		for(int i=0; i < input.length(); i++){
			if(input.charAt(i) == 'e'){        // e -> 3
				encrypted = encrypted + "3";
			}else if(input.charAt(i) == '3'){  // 3 -> e
				encrypted = encrypted + "e";
			}else if(input.charAt(i) == 'l'){  //l -> 1
				encrypted = encrypted + "1";
			}else if(input.charAt(i) == '1'){  // 1 -> l
				encrypted = encrypted + "l";
			}else if(input.charAt(i) == 'o'){  // o -> 0
				encrypted = encrypted + "0";
			}else if(input.charAt(i) == '0'){  // 0 -> o
				encrypted = encrypted + "o";
			}else if(input.charAt(i) == 'a'){  // a -> 4
				encrypted = encrypted + "4";
			}else if(input.charAt(i) == '4'){  // 4 -> a
				encrypted = encrypted + "a";
			}else if(input.charAt(i) == 't'){  // t -> 7
				encrypted = encrypted + "7";
			}else if(input.charAt(i) == '7'){  // 7 -> t
				encrypted = encrypted + "t";
			}else
				encrypted = encrypted + input.charAt(i);
		}

		return encrypted;
	}


	public String decrypt(String input) throws IllegalArgumentException {
		// Throws an exception if input has anything other than a-z or 1-9
		String allowed = "^[a-z0-9]*$";
		if(!input.matches(allowed)){
			throw new IllegalArgumentException("Your input must only lower case letters (a-z) or numbers (0-9)!!!");
		}


		// Decrypt the input
		String decrypted = "";
		for(int i=0; i < input.length(); i++){
			if(input.charAt(i) == 'e'){        // e -> 3
				decrypted = decrypted + "3";
			}else if(input.charAt(i) == '3'){  // 3 -> e
				decrypted = decrypted + "e";
			}else if(input.charAt(i) == 'l'){  //l -> 1
				decrypted = decrypted + "1";
			}else if(input.charAt(i) == '1'){  // 1 -> l
				decrypted = decrypted + "l";
			}else if(input.charAt(i) == 'o'){  // o -> 0
				decrypted = decrypted + "0";
			}else if(input.charAt(i) == '0'){  // 0 -> o
				decrypted = decrypted + "o";
			}else if(input.charAt(i) == 'a'){  // a -> 4
				decrypted = decrypted + "4";
			}else if(input.charAt(i) == '4'){  // 4 -> a
				decrypted = decrypted + "a";
			}else if(input.charAt(i) == 't'){  // t -> 7
				decrypted = decrypted + "7";
			}else if(input.charAt(i) == '7'){  // 7 -> t
				decrypted = decrypted + "t";   
			}else                              // If the letter doesn't need to be encrypted, it is added
				decrypted = decrypted + input.charAt(i);            // to the string
		}

		return decrypted;
	}

	public static void main(String[] args) {
		//Other Tests
		//String input = "^*)";
		//System.out.println(input);
		//Crypter encrypter = new CrypterImpl();
		//String crypted = encrypter.encrypt(input);
		//System.out.println(crypted);

	}

}
