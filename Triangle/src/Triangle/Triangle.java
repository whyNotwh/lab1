package Triangle;

public class Triangle {
    public static String check(int a, int b, int c){        
        String str = "";
        if(a == b && b == c){
            str = "��������Ϊ�ȱ�������";
        }else if(a == b || a == c || b ==c){
            str = "��������Ϊ����������";
        }else if(a + b > c && a + c > b && b + c > a){
            str = "��������Ϊ������������";
        }else{
            str = "�ⲻ��һ��������";
        }

        return str;     
    }

}
	

