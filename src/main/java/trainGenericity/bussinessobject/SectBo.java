package trainGenericity.bussinessobject;

import lombok.Data;//需要安装插件，否则编译器识别不到

@Data
public class SectBo<E> {

    private E sectName;//门派名称

    private E sectLevel;//门派等级

    private E[] sectPerson;//门派人数

}
