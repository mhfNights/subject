//1. 定义类 Test2,类中定义 main方法
//        2. 定义doCheck方法,参数为(int iVar),返回值boolean类型
//        3. doCheck方法内,定义变量boolean flag.
//        4. doCheck方法内,判断num是否为偶数.
//        5. 如果是偶数,使用for循环,初始化值i为0,i<=20进入循环,步进表达式i++
//        6. 循环内,num-=i;
//        7. flag赋值为true.
//        8. 否则是奇数,使用for循环,初始化值i为0,i<=20进入循环,步进表达式i++
//        9. 循环内,num+=i;
//        10. flag赋值为false.
//        11. 输出num的值
//        12. 返回flag
//        13. 调用doCheck方法,传入2,保存返回值,并输出
//        14. 调用doCheck方法,传入3,保存返回值,并输出
public class Test02 {
    public static void main(String[] args) {
        System.out.println(doCheck(2));
        System.out.println(doCheck(3));
    }
    public static boolean doCheck(int num){
        boolean flag;
        if(num % 2==0){
            for(int i = 0;i <= 20; i++){
                num -= i;
            }
            flag = true;
        }else {
            for (int i= 0;i<= 20; i++){
                num += i;
            }
            flag = false;
        }
        System.out.println("num:"+num);
        return flag;
    }
}
