package com.google.android.libraries.ar.faceviewer.runtime;

import com.google.research.xeno.effect.AssetDownloader;
import defpackage.amxh;
import defpackage.amxj;
import defpackage.ansa;
import defpackage.scy;
import defpackage.set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class RuntimeJni {
    private static final amxj b = amxj.l("com/google/android/libraries/ar/faceviewer/runtime/RuntimeJni");
    public long a;

    public RuntimeJni(long j) {
        this.a = j;
    }

    public static void a(AssetDownloader assetDownloader, String str, ansa ansaVar, String str2, scy scyVar) {
        nativeCreate(assetDownloader, str, ansaVar.toByteArray(), str2, NativeCallback.b(scyVar, set.c));
    }

    private static native void nativeCreate(AssetDownloader assetDownloader, String str, byte[] bArr, String str2, NativeCallback nativeCallback);

    protected final void finalize() {
        if (this.a != 0) {
            ((amxh) ((amxh) b.f()).i("com/google/android/libraries/ar/faceviewer/runtime/RuntimeJni", "finalize", 58, "RuntimeJni.java")).q("RuntimeJni finalized with non-null nativeHandle.");
        }
    }

    public native void nativeDestroy(long j);

    public native void nativeMakeExperience(long j, byte[] bArr, NativeCallback nativeCallback);
}
