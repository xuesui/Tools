package com.example.tools.logcat;

import android.util.Log;

/**
 * Created by Xuesui
 * package com.example.subassembly.logcat
 * on 2019/11/4
 * at 17:34
 */
public class LogUtil {
    private static int currentCode;
    private final static int VERBOSE = 1;
    private final static int DEBUG = 2;
    private final static int INFO = 3;
    private final static int WARN = 4;
    private final static int ERROR = 5;
    private final static int NOTHING = 6;
    private final static String TAG = "From xuesui:";


    private LogUtil(){}


    public static void v(String tag, String msg) {
        if (currentCode <= VERBOSE) {
            Log.v(TAG + tag, msg);

        }
    }

    public static void d(String tag, String msg) {
        if (currentCode <= DEBUG) {
            Log.d(TAG + tag, msg);
        }
    }

    public static void i(String tag, String msg) {
        if (currentCode <= INFO) {
            Log.i(TAG + tag, msg);
        }
    }

    public static void w(String tag, String msg) {
        if (currentCode <= WARN) {
            Log.w(TAG + tag, msg);
        }
    }

    public static void e(String tag, String msg) {
        if (currentCode <= ERROR) {
            Log.e(TAG + tag, msg);
        }
    }

    public static void setLogCode(int currentCode) {
        LogUtil.currentCode = currentCode;
    }

    public static class Code{
        public final static int VERBOSE = LogUtil.VERBOSE;
        public final static int DEBUG = LogUtil.DEBUG;
        public final static int INFO = LogUtil.INFO;
        public final static int WARN = LogUtil.WARN;
        public final static int ERROR = LogUtil.ERROR;
        public final static int NOTHING = LogUtil.NOTHING;
    }
}

