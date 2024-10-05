package defpackage;

import java.io.ByteArrayOutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bez implements bfe {
    public ByteArrayOutputStream a;

    @Override // defpackage.bfe
    public final void a() {
        ByteArrayOutputStream byteArrayOutputStream = this.a;
        int i = pts.a;
        byteArrayOutputStream.close();
    }

    @Override // defpackage.bfe
    public final void b(ath athVar) {
        long j = athVar.h;
        if (j == -1) {
            this.a = new ByteArrayOutputStream();
        } else {
            pse.e(j <= 2147483647L);
            this.a = new ByteArrayOutputStream((int) athVar.h);
        }
    }

    @Override // defpackage.bfe
    public final void c(byte[] bArr, int i, int i2) {
        ByteArrayOutputStream byteArrayOutputStream = this.a;
        int i3 = pts.a;
        byteArrayOutputStream.write(bArr, i, i2);
    }
}
