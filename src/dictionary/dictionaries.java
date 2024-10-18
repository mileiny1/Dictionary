package dictionary;

		import java.util.HashMap;
		import java.util.Map;

		public class dictionaries {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Map<String,String> englspandictionaries = new HashMap<String,String>();
		        englspandictionaries.put("Spring", "Primavera");
		        englspandictionaries.put("Summer", "Verano");
		        englspandictionaries.put("Fall", "Otono");
		        englspandictionaries.put("Winter", "Invierno");
		        
		        // Result of ours dictionaries
		        
		        System.out.println(englspandictionaries.get("Spring"));
		        System.out.println( englspandictionaries.get("Summer"));
		        System.out.println( englspandictionaries.get("Fall"));
		        System.out.println( englspandictionaries.get("Winter"));
		        
		        // Print all keys
		        System.out.println(englspandictionaries.keySet());
		        // Print all values
		        System.out.println(englspandictionaries.values());
		        System.out.println("The size of our dictionary is: " + englspandictionaries.size());
		        
		        
		      
			}
		}
       
        
	

		

	


