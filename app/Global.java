import com.fasterxml.jackson.databind.ObjectMapper;
import configs.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import play.Application;
import play.GlobalSettings;
import play.Logger;
import play.Play;
import play.libs.Json;

/**
 * Created by saeed on 9/March/15 AD.
 */
public class Global extends GlobalSettings {

    protected ApplicationContext applicationContext;

    @Override
    public void onStart(Application app) {
        applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
    }

    @Override
    public final <A> A getControllerInstance(Class<A> clazz) {
        return applicationContext.getBean(clazz);
    }

}
