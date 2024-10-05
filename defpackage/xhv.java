package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xhv extends ajdd implements ypd {
    private final ypa a;
    private final aowt b;
    private final Context c;
    private int d;

    public xhv(Context context, aowt aowtVar, aahd aahdVar, ypa ypaVar, ajdh ajdhVar, Object obj) {
        super(aahdVar, ajdhVar, obj, null);
        this.a = ypaVar;
        ypaVar.g(this);
        aowtVar.getClass();
        this.b = aowtVar;
        this.c = context;
        this.d = -1;
    }

    @Override // defpackage.ajdd
    protected final void a(int i) {
        this.d = i;
        this.i.getButton(-1).setEnabled(true);
    }

    @Override // defpackage.ajdd
    protected final void e() {
        aowt aowtVar = this.b;
        if ((aowtVar.b & 8) != 0) {
            aahd aahdVar = this.g;
            apxf apxfVar = aowtVar.f;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.c(apxfVar, d());
        }
    }

    @Override // defpackage.ajdd
    protected final void f() {
        amkq.N(this.d != -1);
        aows aowsVar = (aows) this.b.g.get(this.d);
        if ((aowsVar.b & 2) != 0) {
            aahd aahdVar = this.g;
            apxf apxfVar = aowsVar.d;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.c(apxfVar, d());
        }
        aowt aowtVar = this.b;
        if ((aowtVar.b & 32) != 0) {
            Context context = this.c;
            aqyg aqygVar = aowtVar.h;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            whu.L(context, ajcq.b(aqygVar), 1);
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{xhu.class};
        }
        if (i == 0) {
            if (((xhu) obj).a() != 1) {
                return null;
            }
            i(7);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.ajdd
    protected final void lw(int i) {
        amkq.N(true);
        this.a.m(this);
    }
}
