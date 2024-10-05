package com.google.android.libraries.ar.faceviewer.runtime;

import defpackage.amxh;
import defpackage.amxj;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ExperienceJni {
    public static final amxj a = amxj.l("com/google/android/libraries/ar/faceviewer/runtime/ExperienceJni");
    public long b;

    public ExperienceJni(long j) {
        this.b = j;
    }

    private native List nativeGetActiveItemIds(long j);

    private native List nativeGetAllItemIds(long j);

    private native List nativeGetInitialItemIds(long j);

    private native void nativeLoadItems(long j, List list, NativeCallback nativeCallback);

    protected final void finalize() {
        if (this.b != 0) {
            ((amxh) ((amxh) a.f()).i("com/google/android/libraries/ar/faceviewer/runtime/ExperienceJni", "finalize", 82, "ExperienceJni.java")).q("ExperienceJni finalized with non-null nativeHandle.");
        }
    }

    public native void nativeActivateItems(long j, List list, long j2, NativeCallback nativeCallback);

    public native void nativeDestroy(long j);

    public native byte[] nativeGetWebConfigProto(long j);

    public native void nativePreloadAllItems(long j, NativeCallback nativeCallback);
}
