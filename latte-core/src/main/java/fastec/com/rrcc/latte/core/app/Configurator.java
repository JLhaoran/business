package fastec.com.rrcc.latte.core.app;

import java.util.HashMap;

/**
 * @ProjectName: Latte
 * @Package: fastec.com.rrcc.latte.core.app
 * @ClassName: Configurator
 * @Description: java类作用描述
 * @Author: haoran.li
 * @CreateDate: 2020/2/10 上午10:38
 * @UpdateUser: haoran.li
 * @UpdateDate: 2020/2/10 上午10:38
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Configurator {
    private static final HashMap<String,Object> LATTE_CONSTANCE = new HashMap<>();

    private Configurator(){
        LATTE_CONSTANCE.put(ConfigType.CONFIG_READ.name(),false);
    }

    public static Configurator getInstance(){
        return Holder.INSTANCE;
    }

    public final HashMap<String,Object> getConfigurations(){
        return LATTE_CONSTANCE;
    }

    public final void configure(){
        LATTE_CONSTANCE.put(ConfigType.CONFIG_READ.name(),true);
    }

    private static class Holder{
        private static final Configurator INSTANCE = new Configurator();
    }

    public final Configurator withApiHost(String str){
        LATTE_CONSTANCE.put(ConfigType.API_HOST.name(),str);
        return this;
    }

    public void checkConfiguration(){
        boolean isReady = (boolean)LATTE_CONSTANCE.get(ConfigType.CONFIG_READ.name());
        if(!isReady==true){
            throw new RuntimeException("coonfiguration is not read;call for configure ");
        }
    }

    public <T> T getConfiguration(Enum<ConfigType> key){
        checkConfiguration();
        return (T) LATTE_CONSTANCE.get(key.name());
    }

}
