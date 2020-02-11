package fastec.com.rrcc.latte.core.app;

import android.content.Context;

import java.util.HashMap;

/**
 * @ProjectName: Latte
 * @Package: fastec.com.rrcc.latte.core.app
 * @ClassName: Latte
 * @Description: java类作用描述
 * @Author: haoran.li
 * @CreateDate: 2020/2/10 上午10:35
 * @UpdateUser: haoran.li
 * @UpdateDate: 2020/2/10 上午10:35
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public final class Latte {
    public static Configurator init(Context context){
     getConfigurations().put(ConfigType.APPLICATION_CONTEXT.name(),context.getApplicationContext());
     return Configurator.getInstance();
    }

    private static HashMap<String,Object> getConfigurations(){
      return Configurator.getInstance().getConfigurations();
    }
}
