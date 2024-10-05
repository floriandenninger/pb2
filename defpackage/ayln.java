package defpackage;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayln extends OutputStream {
    public final List a = new ArrayList();
    private ayfb b;

    @Override // java.io.OutputStream
    public final void write(int i) {
        ayfb ayfbVar = this.b;
        if (ayfbVar == null || ayfbVar.b() <= 0) {
            write(new byte[]{(byte) i}, 0, 1);
        } else {
            this.b.a.put((byte) i);
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (this.b == null) {
            ayfb a = ayeq.a(i2);
            this.b = a;
            this.a.add(a);
        }
        while (i2 > 0) {
            int min = Math.min(i2, this.b.b());
            if (min == 0) {
                int a2 = this.b.a();
                ayfb a3 = ayeq.a(Math.max(i2, a2 + a2));
                this.b = a3;
                this.a.add(a3);
            } else {
                this.b.c(bArr, i, min);
                i += min;
                i2 -= min;
            }
        }
    }
}
