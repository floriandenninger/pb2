package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import java.io.EOFException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bit {
    private final pth a = new pth(10);

    public final Metadata a(bii biiVar, ppi ppiVar) {
        Metadata metadata = null;
        int i = 0;
        while (true) {
            try {
                biiVar.j(this.a.a, 0, 10);
                this.a.G(0);
                if (this.a.k() != 4801587) {
                    break;
                }
                this.a.H(3);
                int h = this.a.h();
                int i2 = h + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.a.a, 0, bArr, 0, 10);
                    biiVar.j(bArr, 10, h);
                    metadata = new ppj(ppiVar).c(bArr, i2);
                } else {
                    biiVar.f(h);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        biiVar.l();
        biiVar.f(i);
        return metadata;
    }
}
