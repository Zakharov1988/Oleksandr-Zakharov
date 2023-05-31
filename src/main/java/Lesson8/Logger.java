package Lesson8;

import jdk.dynalink.beans.StaticClass;

public class Logger {

    //private static final Logger LOGGER = Logger.getLogger(Static.class.getLevel());

   // public void nonStaticMethod() {

    //    LOGGER.Log (Level.INFO, msg: "non-staticMethod");
    //}



    public void setStatus (Level level) {
        System.out.println("Setting level:" + level);
    }




}
