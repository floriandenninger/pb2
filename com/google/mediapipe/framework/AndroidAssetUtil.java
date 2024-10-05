package com.google.mediapipe.framework;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AndroidAssetUtil {
    private AndroidAssetUtil() {
    }

    public static synchronized void a(Context context) {
        synchronized (AndroidAssetUtil.class) {
            nativeInitializeAssetManager(context, context.getCacheDir().getAbsolutePath());
        }
    }

    private static native boolean nativeInitializeAssetManager(Context context, String str);
}
