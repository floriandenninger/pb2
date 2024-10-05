package defpackage;

import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vcr extends vdw implements vdq {
    private final List a;

    public vcr(InputStream inputStream, List list) {
        super(inputStream);
        this.a = list;
        vls.k(true, "Input was null", new Object[0]);
    }

    @Override // defpackage.vdq
    public final Long a() {
        if (this.in instanceof vdq) {
            return ((vdq) this.in).a();
        }
        return null;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((vek) it.next()).close();
            } catch (Throwable unused) {
            }
        }
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = this.in.read();
        if (read != -1) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((vek) it.next()).a();
            }
        }
        return read;
    }

    @Override // defpackage.vdw, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        int read = this.in.read(bArr);
        if (read != -1) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((vek) it.next()).a();
            }
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((vek) it.next()).a();
            }
        }
        return read;
    }
}
