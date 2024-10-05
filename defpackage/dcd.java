package defpackage;

import android.graphics.drawable.Drawable;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dcd implements dcl {
    private final int a;
    private final int b;
    public dbs c;

    public dcd() {
        this(CellularSignalStrengthError.ERROR_NOT_SUPPORTED, CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
    }

    @Override // defpackage.dcl
    public void a(Drawable drawable) {
    }

    @Override // defpackage.dcl
    public final dbs d() {
        return this.c;
    }

    @Override // defpackage.dcl
    public final void e(dck dckVar) {
        dckVar.g(this.a, this.b);
    }

    @Override // defpackage.dcl
    public void f(Drawable drawable) {
    }

    @Override // defpackage.dcl
    public final void g(dck dckVar) {
    }

    @Override // defpackage.dcl
    public final void h(dbs dbsVar) {
        this.c = dbsVar;
    }

    @Override // defpackage.daq
    public final void k() {
    }

    @Override // defpackage.daq
    public final void l() {
    }

    @Override // defpackage.daq
    public final void m() {
    }

    public dcd(int i, int i2) {
        if (ddn.p(i, i2)) {
            this.a = i;
            this.b = i2;
            return;
        }
        StringBuilder sb = new StringBuilder(111);
        sb.append("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ");
        sb.append(i);
        sb.append(" and height: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }
}
