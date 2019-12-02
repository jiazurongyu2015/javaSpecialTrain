package trainGenericity.Manager;

import lombok.Data;
import trainGenericity.bussinessobject.SectBo;

import java.util.ArrayList;


@Data
public class SectInfo{

    private ArrayList<SectBo>sectList = new ArrayList<SectBo>();

    public void getSectInfoA(){
        SectBo sect = new SectBo();
        sect.setSectName("武当派");
        sect.setSectLevel(5);
        sect.setSectPerson(new String[]{"张三丰","清风","明月"});
        sectList.add(sect);
    }

    public void getSectInfoB(){
        SectBo sect = new SectBo();
        sect.setSectName(1200);
        sect.setSectLevel(5.7);
        sect.setSectPerson(new String[]{"外星人","拉面","馒头"});
        sectList.add(sect);
    }


}
