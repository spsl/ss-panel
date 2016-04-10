package controllers;

import javax.inject.*;
import play.*;
import play.mvc.*;

import services.Counter;

@Singleton
public class CountController extends Controller {

    private final Counter counter;

    @Inject
    public CountController(Counter counter) {
       this.counter = counter;
    }


    public Result count() {
        return ok(Integer.toString(counter.nextCount()));
    }

}
