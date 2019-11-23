package TestBoi;

class Employee {
    String name;
    String username;
    String password;
    String email;
    // first name, a period, and then their surname, an email address of their first initial and last name
    // constructor will call checkName to check if the name contains a space. If it does, it will call setUsername and setEmail, passing the name in to both. If it doesn't contain a space, set the username to "default" and the email to "user@oracleacademy.Test"
    //The constructor will accept a String for name (firstname and surname) and String for password.
    //setUsername will set the username field to the first initial of the first name and then the last name, all lowercase.

//setEmail will set the email field to the first name, then a period, then the last name (all lowercase) followed by @oracleacademy.Test

    //The constructor will call isValidPassword. If the password is valid (containing a lowercase letter, uppercase letter, and a special character) the password field gets set to the supplied password. If the password is invalid, the password field gets set to "pw".
    Employee(String name, String password){
        boolean passCheck = false;
        // isValidPassword(password);
        passCheck = isValidPassword(password);
        if(passCheck){
            this.password = password;
        } else {
            this.password = "pw";
        }

        if(checkName(name)){
            setEmail(name);
            setUsername(name);
            this.name = name;
        }else {
            this.username = "default";
            this.email = "user@oracleacademy.Test";
            this.name = name;
        }
    }

     public String toString(){
       return "Employee Details\n" + "Name : " + this.name + "\nUsername : " + this.username + "\nEmail : " + this.email + "\nInitial Password : " + this.password;
     }
    private void setUsername(String name){
        //this.username = name.replaceAll(" ", ".");
        StringBuilder sb = new StringBuilder(name.toLowerCase());
        for(int i = 0; i<sb.length(); i++){
            String s = " ";
            char c = s.charAt(0);
            if(sb.charAt(i) == c){
                sb.delete(1,i+1);
            }
        }
        this.username = sb.toString();
    }

    private boolean checkName(String name){
        for(int i = 0; i<name.length(); i++){
            char ch = name.charAt(i);
            if(Character.isWhitespace(ch)){
                return true;
            }
        }
         return false;
    }

    private void setEmail(String name){
        StringBuilder sb = new StringBuilder(name);

        String s = " ";
        char c = s.charAt(0);

        int i;
        for(i = 0; i<sb.length(); i++){
            if(sb.charAt(i) == c){
                sb.replace(i,i+1,".");
                String change = sb.toString().toLowerCase();
                sb.replace(0,sb.length(),change);
               // sb.delete(1,i+1);
                break;
            }
        }
        sb.append("@oracleacademy.Test");
        this.email = sb.toString();
    }

    private boolean isValidPassword(String password){
        boolean capFlag = false;
        boolean lowerFlag = false;
        boolean specialFlag = false;
        for(int i=0; i<password.length();i++){
            char ch = password.charAt(i);
            if(Character.isUpperCase(ch)){
                capFlag = true;
            }
            if(Character.isLowerCase(ch)){
                lowerFlag = true;
            }
            if (!password.matches("[^a-zA-Z0-9 ]")){
                specialFlag = true;
            }
            if(capFlag && lowerFlag && specialFlag){
                return true;
            }
        }
        return false;
    }
}