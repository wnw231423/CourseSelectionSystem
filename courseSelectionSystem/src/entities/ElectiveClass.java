package entities;
/**
 * 选修课类
 */
public class ElectiveClass extends Course {
    private final static int classType = 3;
    /**
     * 默认构造器
     */
    public ElectiveClass(int cid, String cname, String teacher) {
        super(cid, cname, teacher);
    }
}