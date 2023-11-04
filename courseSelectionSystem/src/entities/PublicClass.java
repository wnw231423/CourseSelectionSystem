package entities;
/**
 * 公共课类
 */
public class PublicClass extends Course {
    private final static String classType = "公共课";
    /**
     * 默认构造器
     */
    public PublicClass(int cid, String cname, String teacher) {
        super(cid, cname, teacher);
    }
}