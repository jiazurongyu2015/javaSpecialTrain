package trainGenericity;

import trainGenericity.Manager.ListsInfo;
import trainGenericity.Manager.SectInfo;

/**
 * 基础泛型操练
 * 泛型需要了解类型擦除和推糖写法
 * 后续练习设计不同的例子，完成5次。
 * 其中一次需要支持过滤检查，比如支持基础数据类型，但传入泛型传入char类型不通过
 */
public class runSect {

    public static void main(String[] args) {
        SectInfo info  =new SectInfo();
        info.getSectInfoA();
        info.getSectInfoB();
        ListsInfo listInfo = new ListsInfo();
        listInfo.Packet(info.getSectList()).add("abc");
        System.out.println(listInfo.getLists());
    }
}
