package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tfq {
    public long a;

    public tfq() {
        this.a = -1L;
    }

    public tfq(byte[] bArr) {
    }

    public tfq(byte[] bArr, byte[] bArr2) {
        this.a = 0L;
    }

    public tfq(byte[] bArr, byte[] bArr2, byte[] bArr3) {
    }

    public final void a() {
        this.a = SystemClock.elapsedRealtime();
    }

    public final qfi b() {
        return new qfi(this.a);
    }
}
