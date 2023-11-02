package entities;
/**
 * 公共课类
 */
public class PublicClass extends Course {
    private final static int classType = 1;
    /**
     * 默认构造器
     */
    public PublicClass(int cid, String cname, String teacher) {
        super(cid, cname, teacher);
    }
}