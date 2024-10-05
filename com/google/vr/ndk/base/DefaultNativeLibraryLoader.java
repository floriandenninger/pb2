package com.google.vr.ndk.base;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class DefaultNativeLibraryLoader {
    private static volatile boolean shouldIgnoreDefaultLibrary = false;

    public static void maybeLoadDefaultLibrary() {
        if (shouldIgnoreDefaultLibrary) {
            return;
        }
        try {
            System.loadLibrary("gvr");
        } catch (UnsatisfiedLinkError unused) {
        }
    }
}
