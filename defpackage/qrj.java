package defpackage;

import com.google.android.gms.common.data.DataHolder;
import java.io.Closeable;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qrj implements Iterable, Closeable, qoj {
    protected final DataHolder a;

    public qrj(DataHolder dataHolder) {
        this.a = dataHolder;
    }

    @Override // defpackage.qoj
    public final void b() {
        this.a.close();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new qrk(this);
    }
}
