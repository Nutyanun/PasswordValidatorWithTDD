package lib;

public class PasswordValidator {

    /**
     * คุณจะต้องเขียน Javadoc ที่สมบูรณ์ที่นี่ในอนาคต
     * เพื่ออธิบายกฎการทำงานของเมธอด
     * เช็คตัวอักษร และตัวเลขในการตั้ง password แต่ละตัว ว่าสามารถใช้ตั้งได้มั้ยถ้าตั้งได้ password มีความยาก ปานกลาง หรือง่าย
     * @param การรับ string และ integer ที่ผู้ใช้งานนำมาตั้งรหัส
     * @return การส่งกลับ Password ที่ผู้ใช้งานส่งมาว่าสามารถตั้งได้มั้ย ถ้าตั้งไม่ได้ส่งกลับ INVALID ถ้าตั้งได้จะส่งกลับ WEAK,MEDIUM,STRONG
     */
    public static PasswordStrength validate(String password) { 
        
        if(password==null || password.length()<8)
            return PasswordStrength.INVALID ;
        
        boolean hasLower = false ;
        boolean hasUpper = false ;
        boolean hasdigit = false ;
        boolean hasspecial = false ;
        

        for(int i = 0 ; i < password.length() ; i++ ){
            if(Character.isLowerCase(password.charAt(i)))
                hasLower = true ;
            else if(Character.isUpperCase(password.charAt(i)))
                hasUpper = true ;
            else if(Character.isDigit(password.charAt(i)))
                hasdigit = true ;
            else hasspecial = true ;
        }
        
        if(hasUpper && hasLower && hasdigit && hasspecial) 
            return PasswordStrength.STRONG ;
        if(hasLower && hasUpper) 
            return PasswordStrength.MEDIUM ;
        if(hasLower && hasdigit)
            return PasswordStrength.MEDIUM ;
        if(hasUpper && hasdigit)
            return PasswordStrength.MEDIUM ;
        if(hasLower && !hasUpper) 
            return PasswordStrength.WEAK ;
        if(!hasLower && hasUpper) 
            return PasswordStrength.WEAK ;
        if(hasdigit) 
            return PasswordStrength.WEAK ;
        
        
        

            return PasswordStrength.INVALID ; // TODO: การคืนค่านี้ถูกต้องหรือไม่?

        
    }

}

