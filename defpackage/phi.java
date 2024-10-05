package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class phi implements bfe {
    private final phg a;
    private final int b;
    private ath c;
    private long d;
    private File e;
    private OutputStream f;
    private FileOutputStream g;
    private long h;
    private long i;
    private phw j;

    public phi(phg phgVar, int i) {
        pse.h(true, "fragmentSize must be positive or C.LENGTH_UNSET.");
        this.a = phgVar;
        this.b = i;
    }

    private final void d() {
        OutputStream outputStream = this.f;
        if (outputStream != null) {
            try {
                outputStream.flush();
                this.g.getFD().sync();
                pts.O(this.f);
                this.f = null;
                File file = this.e;
                this.e = null;
                this.a.h(file, this.h);
            } catch (Throwable th) {
                pts.O(this.f);
                this.f = null;
                File file2 = this.e;
                this.e = null;
                file2.delete();
                throw th;
            }
        }
    }

    private final void e() {
        long j = this.c.h;
        long min = j != -1 ? Math.min(j - this.i, this.d) : -1L;
        phg phgVar = this.a;
        ath athVar = this.c;
        this.e = phgVar.e(athVar.i, athVar.f + this.i, min);
        FileOutputStream fileOutputStream = new FileOutputStream(this.e);
        this.g = fileOutputStream;
        int i = this.b;
        if (i > 0) {
            phw phwVar = this.j;
            if (phwVar == null) {
                this.j = new phw(this.g, i);
            } else {
                phwVar.a(fileOutputStream);
            }
            this.f = this.j;
        } else {
            this.f = fileOutputStream;
        }
        this.h = 0L;
    }

    @Override // defpackage.bfe
    public final void b(ath athVar) {
        if (athVar.h != -1 || !athVar.g(2)) {
            this.c = athVar;
            this.d = true != athVar.g(4) ? Long.MAX_VALUE : 5242880L;
            this.i = 0L;
            try {
                e();
                return;
            } catch (IOException e) {
                throw new phh(e);
            }
        }
        this.c = null;
    }

    @Override // defpackage.bfe
    public final void c(byte[] bArr, int i, int i2) {
        if (this.c != null) {
            int i3 = 0;
            while (i3 < i2) {
                try {
                    if (this.h == this.d) {
                        d();
                        e();
                    }
                    int min = (int) Math.min(i2 - i3, this.d - this.h);
                    this.f.write(bArr, i + i3, min);
                    i3 += min;
                    long j = min;
                    this.h += j;
                    this.i += j;
                } catch (IOException e) {
                    throw new phh(e);
                }
            }
        }
    }

    @Override // defpackage.bfe
    public final void a() {
        if (this.c == null) {
            return;
        }
        try {
            d();
        } catch (IOException e) {
            throw new phh(e);
        }
    }
}
