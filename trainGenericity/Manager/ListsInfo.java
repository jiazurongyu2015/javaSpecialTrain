package trainGenericity.Manager;

import lombok.Data;
import java.util.ArrayList;

/**
 * 可以添加SectInfo其他数据进去
 * @param <E>
 */
@Data
public class ListsInfo<E>{

    ArrayList<E> lists = new ArrayList<E>();

    public ArrayList<E> Packet(E element){
        lists.add(element);
        return lists;
    }
}
