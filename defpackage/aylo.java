package defpackage;

import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aylo extends OutputStream {
    final /* synthetic */ aylq a;

    public aylo(aylq aylqVar) {
        this.a = aylqVar;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.a.d(bArr, i, i2);
    }
}
