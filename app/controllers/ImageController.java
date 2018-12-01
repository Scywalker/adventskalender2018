package controllers;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.Calendar;
import play.mvc.*;
import views.html.*;

/**
 * This controller demonstrates how to use dependency injection to
 * bind a component into a controller class. The class contains an
 * action that shows an incrementing count to users. The {@link Counter}
 * object is injected by the Guice dependency injection system.
 */
@Singleton
public class ImageController extends Controller {

    @Inject
    public ImageController() {}

    public Result showImage(int day) {
  
		Calendar today = Calendar.getInstance();
		if(today.get(Calendar.DATE) >= day)
			return ok(image.render(day));
		return ok(calendar.render());
    }
}
