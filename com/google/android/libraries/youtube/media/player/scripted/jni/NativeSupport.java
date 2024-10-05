package com.google.android.libraries.youtube.media.player.scripted.jni;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class NativeSupport {
    private NativeSupport() {
    }

    public static native byte[] nativeCall(long j, long j2, String str, byte[] bArr);

    public static native long nativeCreateContext(long j);

    public static native long nativeCreateIsolate();

    public static native void nativeDestroyContext(long j);

    public static native void nativeDestroyIsolate(long j);

    public static native void nativeDestroyPersistentValue(long j, long j2);

    private static native Object nativeGetObjectByReference(byte[] bArr);

    public static native long nativeLoadScript(long j, byte[] bArr);

    public static native void nativeReleaseObjectReference(byte[] bArr);

    public static native byte[] nativeRetainObjectReference(Object obj);
}
