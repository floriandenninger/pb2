package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.lidar.VisibilityChangeEventData;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class xca implements tez, wmu {
    protected static final amrz a = amvo.b;
    public long b;
    public boolean c;
    public final long d;
    public tdt e;
    protected boolean f;
    protected boolean g;
    protected final woz h;
    private final xev i;

    public xca(xev xevVar, long j, boolean z, boolean z2, woz wozVar) {
        this.i = xevVar;
        this.d = j;
        this.f = z;
        this.g = z2;
        this.h = wozVar;
    }

    @Override // defpackage.tez
    public final tfd a() {
        return new tfd((int) this.d, (int) this.b, this.f, this.g);
    }

    @Override // defpackage.tez
    public final void c(tdt tdtVar) {
        this.e = tdtVar;
        woz wozVar = this.h;
        ((woa) wozVar.e.get()).b(this.i.a);
    }

    @Override // defpackage.tez
    public final void d(tdt tdtVar) {
        this.e = tdtVar;
        woz wozVar = this.h;
        ((woa) wozVar.e.get()).d(this.i.a);
    }

    @Override // defpackage.tez
    public final void e(tdt tdtVar) {
        this.e = tdtVar;
        woz wozVar = this.h;
        ((woa) wozVar.e.get()).e(this.i.a);
    }

    public abstract tdt f(int i);

    public final Boolean g(xev xevVar) {
        return Boolean.valueOf(TextUtils.equals(xevVar.a, this.i.a));
    }

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n();

    public abstract void o(VisibilityChangeEventData visibilityChangeEventData);

    public abstract void p();

    public abstract void q(aigf aigfVar);

    public void r(long j) {
        this.b = j;
    }

    public abstract void s(int i, int i2, int i3, int i4);
}
