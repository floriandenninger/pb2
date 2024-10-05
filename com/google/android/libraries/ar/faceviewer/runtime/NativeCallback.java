package com.google.android.libraries.ar.faceviewer.runtime;

import defpackage.amxj;
import defpackage.scy;
import defpackage.ses;
import defpackage.set;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class NativeCallback {
    public static final amxj a = amxj.l("com/google/android/libraries/ar/faceviewer/runtime/NativeCallback");
    private final ses b;
    private final scy c;

    private NativeCallback(scy scyVar, ses sesVar) {
        this.c = scyVar;
        this.b = sesVar;
    }

    public static NativeCallback a(scy scyVar) {
        return new NativeCallback(scyVar, set.b);
    }

    public static NativeCallback b(scy scyVar, ses sesVar) {
        return new NativeCallback(scyVar, sesVar);
    }

    public void setNativeHandle(long j) {
        this.c.c(this.b.a(j));
    }

    public void setStatus(int i, String str) {
        Throwable th;
        if (i == 0) {
            th = null;
        } else if (i == 3) {
            th = new IllegalArgumentException(str);
        } else if (i == 5) {
            th = new FileNotFoundException(str);
        } else if (i == 11) {
            th = new IndexOutOfBoundsException(str);
        } else if (i == 12) {
            th = new UnsupportedOperationException(str);
        } else {
            th = new IllegalStateException(str);
        }
        if (th == null) {
            this.c.c(null);
        } else {
            this.c.a.d(th);
        }
    }
}
