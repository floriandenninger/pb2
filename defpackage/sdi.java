package defpackage;

import com.google.android.libraries.ar.faceviewer.runtime.RuntimeJni;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sdi implements AutoCloseable {
    public static final /* synthetic */ int b = 0;
    public final RuntimeJni a;

    public sdi(RuntimeJni runtimeJni) {
        this.a = runtimeJni;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        RuntimeJni runtimeJni = this.a;
        long j = runtimeJni.a;
        if (j != 0) {
            runtimeJni.nativeDestroy(j);
            runtimeJni.a = 0L;
        }
    }
}
