package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aahx implements aahv, aftf, aftc, ypd {
    private static final aahu a = new aahw();
    private final afsy b;
    private final azrw c;
    private final azrw d;
    private final aals e;
    private final amrz f;
    private final Executor g;
    private afsx h;
    private boolean i;
    private aaih j;

    public aahx(afsy afsyVar, azrw azrwVar, ypa ypaVar, azrw azrwVar2, aals aalsVar, Map map, Executor executor) {
        this.b = afsyVar;
        this.c = azrwVar;
        this.d = azrwVar2;
        this.e = aalsVar;
        this.f = amrz.j(map);
        this.g = executor;
        ypaVar.g(this);
    }

    @Override // defpackage.aahv
    public final synchronized aahu a(afsx afsxVar) {
        aaih d = d();
        afsx afsxVar2 = this.h;
        afsxVar2.getClass();
        if (whu.ac(afsxVar2, afsxVar)) {
            return d;
        }
        return a;
    }

    @Override // defpackage.aftc
    public final void b(afsx afsxVar) {
        e();
    }

    @Override // defpackage.aahv
    @Deprecated
    public final aahu c() {
        return d();
    }

    public final synchronized aaih d() {
        aaih aaihVar;
        try {
            e();
            aaihVar = this.j;
            aaihVar.getClass();
        } catch (Throwable th) {
            zga.d("Error loading store", th);
            throw th;
        }
        return aaihVar;
    }

    public final synchronized void e() {
        afsx c = this.b.c();
        boolean g = c.g();
        afsx afsxVar = this.h;
        if (afsxVar != null && whu.ac(afsxVar, c) && this.i == g) {
            return;
        }
        aaih aaihVar = this.j;
        if (aaihVar != null) {
            aaihVar.n();
        }
        this.h = c;
        this.i = c.g();
        this.j = new aaih(this.d, this.e, this.f, this.g);
    }

    @Override // defpackage.aakw
    public final void g() {
        ((afte) this.c.get()).i(this);
    }

    @Override // defpackage.aftf
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.aftf
    public final void k() {
        e();
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{afto.class};
        }
        if (i == 0) {
            e();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.aftf
    public final /* synthetic */ void l() {
    }
}
