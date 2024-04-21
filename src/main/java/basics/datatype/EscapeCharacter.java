package basics.datatype;

/**
 * @author Felixovo
 * @create
 * @update 2024-04-21 14:52:34
 * @description 转义字符
 */
public class EscapeCharacter {
    public static void main(String[] args) {
        // \t 制表位
        System.out.println("北京\t上海\t天津\t重庆");
        // \n 换行符
        System.out.println("Hello\nWorld");
        // \\ 字符\
        System.out.println("\\");
        // \" 字符"
        System.out.println("\"");
        // \' 字符'
        System.out.println("\'");
        // \r 回车
        System.out.println("abc\rdef");

        /*  */
        System.out.println("书名\t\t\t作者\t\t\t价格");
        System.out.println("西游记\t\t吴承恩\t\t￥96.00");
        System.out.println("三国演义\t\t罗贯中\t\t￥83.00");
        System.out.println("水浒传\t\t施耐庵\t\t￥103.00");
        System.out.println("红楼梦\t\t曹雪芹\t\t￥116.00");
    }
}
