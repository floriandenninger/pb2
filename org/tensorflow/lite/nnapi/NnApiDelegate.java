package org.tensorflow.lite.nnapi;

import defpackage.banz;
import org.tensorflow.lite.TensorFlowLite;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class NnApiDelegate implements AutoCloseable, banz {
    private long a;

    public NnApiDelegate() {
        TensorFlowLite.a();
        this.a = createDelegate(-1, null, null, null, -1, false, true, false, 0L);
    }

    private static native long createDelegate(int i, String str, String str2, String str3, int i2, boolean z, boolean z2, boolean z3, long j);

    private static native void deleteDelegate(long j);

    private static native int getNnapiErrno(long j);

    @Override // defpackage.banz
    public final long a() {
        return this.a;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        long j = this.a;
        if (j != 0) {
            deleteDelegate(j);
            this.a = 0L;
        }
    }
}
