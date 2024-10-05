package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rjw extends rdv {
    public Handler b;
    protected final rjv c;
    protected final rju d;
    protected final rjs e;

    public rjw(rgt rgtVar) {
        super(rgtVar);
        this.c = new rjv(this);
        this.d = new rju(this);
        this.e = new rjs(this);
    }

    @Override // defpackage.rdv
    protected final boolean d() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long e(long j) {
        return this.d.a(j);
    }

    public final void o() {
        n();
        if (this.b == null) {
            this.b = new amcc(Looper.getMainLooper(), (byte[]) null);
        }
    }

    public final boolean p(boolean z, boolean z2, long j) {
        return this.d.b(z, z2, j);
    }
}
