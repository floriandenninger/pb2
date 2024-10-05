package defpackage;

import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vcs extends vdx {
    private final List a;

    public vcs(OutputStream outputStream, List list) {
        super(outputStream);
        this.a = list;
        vls.k(true, "Output was null", new Object[0]);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((vel) it.next()).close();
            } catch (Throwable unused) {
            }
        }
        super.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        this.out.write(i);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((vel) it.next()).a(1);
        }
    }

    @Override // defpackage.vdx, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        this.out.write(bArr);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((vel) it.next()).a(bArr.length);
        }
    }

    @Override // defpackage.vdx, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((vel) it.next()).a(i2);
        }
    }
}
