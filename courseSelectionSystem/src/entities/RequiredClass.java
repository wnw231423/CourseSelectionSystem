package entities;
/**
 * 选修课类
 */
public class RequiredClass extends Course {
    private final static String classType = "必修课";
    /**
     * 默认构造器
     */
    public RequiredClass(int cid, String cname, String teacher) {
        super(cid, cname, teacher);
    }
}