package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        String pw = "123" ;
        PasswordStrength result1 = PasswordValidator.validate(pw);
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 : "+pw+" : Passed: Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 : "+pw+" : FAILED: Expected INVALID but got " + result1);
        }

        // Test Case 2: รหัสผ่านทั้งหมดเป็นตัวเล็กจะ WEAK
        pw = "abcdefghij" ;
        PasswordStrength result2 = PasswordValidator.validate(pw);
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 : "+pw+" : Passed: All lowercase password is WEAK.");
        } else {
            System.out.println("Test Case 2 : "+pw+" : FAILED: Expected WEAK but got " + result2);
        }

        // Test Case 3: รหัสผ่านทั้งหมดเป็นตัวเลขจะ WEAK
        pw = "0123456789" ;
        PasswordStrength result3 = PasswordValidator.validate(pw);
        if (result3 == PasswordStrength.WEAK) {
            System.out.println("Test Case 3 : "+pw+" : Passed: All integer password is WEAK.");
        } else {
            System.out.println("Test Case 3 : "+pw+" : FAILED: Expected WEAK but got " + result3);
        }

        // Test Case 4: รหัสผ่านทั้งหมดเป็นตัวใหญ่จะ WEAK
        pw = "ABCDEFGHIJ" ;
        PasswordStrength result4 = PasswordValidator.validate(pw);
        if (result4 == PasswordStrength.WEAK) {
            System.out.println("Test Case 4 : "+pw+" : Passed: All touppercase password is WEAK.");
        } else {
            System.out.println("Test Case 4 : "+pw+" : FAILED: Expected WEAK but got " + result4);
        }

        // Test Case 5: รหัสผ่านเป็นตัวใหญ่ และตัวเล็กผสมกันจะ MEDIUM
        pw = "ABCDEFGHIJabcdefghij" ;
        PasswordStrength result5 = PasswordValidator.validate(pw);
        if (result5 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 5 : "+pw+" : Passed: Uppercase and lowercase password is MEDIUM.");
        } else {
            System.out.println("Test Case 5 : "+pw+" : FAILED: Expected MEDIUM but got " + result5);
        }

        // Test Case 6: รหัสผ่านเป็นตัวเล็ก และตัวเลขผสมกันจะ MEDIUM
        pw = "abcdefghij012346789" ;
        PasswordStrength result6 = PasswordValidator.validate(pw);
        if (result6 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 6 : "+pw+" : Passed: Lowercase and integer password is MEDIUM.");
        } else {
            System.out.println("Test Case 6 : "+pw+" : FAILED: Expected MEDIUM but got " + result6);
        }

        // Test Case 7: รหัสผ่านเป็นตัวใหญ่ และตัวเลขผสมกันจะ MEDIUM
        pw = "ABCDEFGHIJ0123456789" ;
        PasswordStrength result7 = PasswordValidator.validate(pw);
        if (result7 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 7 : "+pw+" : Passed: Uppercase and integer password is MEDIUM.");
        } else {
            System.out.println("Test Case 7 : "+pw+" : FAILED: Expected MEDIUM but got " + result7);
        }

        // Test Case 8: รหัสผ่านเป็นตัวใหญ่ ตัวเล็ก ตัวเลข และตัวอักษรพิเศษผสมกันจะ STRONG
        pw = "ABCDabcd01234*" ;
        PasswordStrength result8 = PasswordValidator.validate(pw);
        if (result8 == PasswordStrength.STRONG) {
            System.out.println("Test Case 8 : "+pw+" : Passed: Uppercase , lowercase , integer and special char password is STRONG.");
        } else {
            System.out.println("Test Case 8 : "+pw+" : FAILED: Expected MEDIUM but got " + result8);
        }





        


        System.out.println("--------------------------------");
    }
}
