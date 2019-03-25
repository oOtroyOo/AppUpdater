package com.king.app.updater.callback;

import java.io.File;

public class AppUpdateProgressCallback extends AppUpdateCallback {
    public static int Progress;
    public static int Total;
    public static String FinishPath;

    @Override
    public void onProgress(int progress, int total, boolean isChange) {
        Progress = progress;
        Total = total;

    }

    @Override
    public void onFinish(File file) {
        FinishPath = file.getPath();
    }
}
