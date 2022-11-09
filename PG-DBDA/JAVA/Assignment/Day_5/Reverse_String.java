     String str, strReverse="";
      int len, i;
      char ch;
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter the String: ");
      str = s.nextLine();
      
      len = str.length();
      for(i=(len-1); i>=0; i--)
      {
         ch = str.charAt(i);
         strReverse = strReverse + ch;
      }
      
      System.out.println("\nReverse = " +strReverse);
