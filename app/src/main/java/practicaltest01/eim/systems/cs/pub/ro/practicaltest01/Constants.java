package practicaltest01.eim.systems.cs.pub.ro.practicaltest01;

/**
 * Created by Diana on 4/2/2017.
 */
import java.util.ArrayList;
import java.util.Arrays;

public interface Constants {

    final public static String TAG = "[Started Service]";

    int nrClicks = 4;

    final public static String ACTION_STRING = "ro.pub.cs.systems.eim.lab05.startedservice.string";
    final public static String ACTION_INTEGER = "ro.pub.cs.systems.eim.lab05.startedservice.integer";
    final public static String ACTION_ARRAY_LIST = "ro.pub.cs.systems.eim.lab05.startedservice.arraylist";

    final public static int MESSAGE_STRING = 1;
    final public static int MESSAGE_INTEGER = 2;
    final public static int MESSAGE_ARRAY_LIST = 3;

    final public static String DATA = "ro.pub.cs.systems.eim.lab05.startedservice.data";

    final public static String STRING_DATA = "EIM";
    final public static int INTEGER_DATA = 2017;
    final public static ArrayList<String> ARRAY_LIST_DATA = new ArrayList<>(Arrays.asList("EIM", "2017"));

    final public static long SLEEP_TIME = 5000;

    final public static String actionTypes[] = {ACTION_STRING, ACTION_INTEGER, ACTION_ARRAY_LIST};

    int SERVICE_STARTED = 1;
    int SERVICE_STOPPED = 0;
}