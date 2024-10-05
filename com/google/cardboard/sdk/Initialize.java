package com.google.cardboard.sdk;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class Initialize {
    static {
        System.loadLibrary("cardboard_sdk_jni");
    }

    private Initialize() {
    }

    public static void initialize(Context context) {
        nativeInitialize(context);
    }

    private static native void nativeInitialize(Context context);
}
