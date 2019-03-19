package Triangle;

public class Triangle {
    public static String check(int a, int b, int c){        
        String str = "";
        if(a == b && b == c){
            str = "该三角形为等边三角形";
        }else if(a == b || a == c || b ==c){
            str = "该三角形为等腰三角形";
        }else if(a + b > c && a + c > b && b + c > a){
            str = "该三角形为不规则三角形";
        }else{
            str = "这不是一个三角形";
        }

        return str;     
    }

}
	

