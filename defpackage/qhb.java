package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qhb implements qgx {
    final /* synthetic */ qhc a;

    public qhb(qhc qhcVar) {
        this.a = qhcVar;
    }

    @Override // defpackage.qgx
    public final /* bridge */ /* synthetic */ void a(qgv qgvVar, int i) {
        this.a.e((qfy) qgvVar, i);
    }

    @Override // defpackage.qgx
    public final /* bridge */ /* synthetic */ void b(qgv qgvVar) {
    }

    @Override // defpackage.qgx
    public final /* bridge */ /* synthetic */ void c(qgv qgvVar, int i) {
        this.a.e((qfy) qgvVar, i);
    }

    @Override // defpackage.qgx
    public final /* bridge */ /* synthetic */ void d(qgv qgvVar, boolean z) {
        this.a.c((qfy) qgvVar);
        qip.an(this.a.e);
        qhc qhcVar = this.a;
        andk a = qhcVar.c.a(qhcVar.e);
        qhe.d(a, z);
        this.a.b.a((andl) a.build(), 227);
        this.a.f();
        this.a.g();
    }

    @Override // defpackage.qgx
    public final /* bridge */ /* synthetic */ void e(qgv qgvVar, String str) {
        qhc qhcVar = this.a;
        SharedPreferences sharedPreferences = qhcVar.d;
        if (qhcVar.h(str)) {
            qip.an(qhcVar.e);
        } else {
            qhcVar.e = qhd.b(sharedPreferences);
            if (!qhcVar.h(str)) {
                qhcVar.e = qhd.a();
                qhcVar.e.b = qhc.a();
                qhcVar.e.f = str;
            } else {
                qip.an(qhcVar.e);
                qhd.a = qhcVar.e.d + 1;
            }
        }
        qip.an(this.a.e);
        qhc qhcVar2 = this.a;
        andk a = qhcVar2.c.a(qhcVar2.e);
        aone createBuilder = andj.a.createBuilder(((andl) a.instance).a());
        createBuilder.copyOnWrite();
        andj andjVar = (andj) createBuilder.instance;
        andjVar.b |= 64;
        andjVar.f = 10;
        andj andjVar2 = (andj) createBuilder.build();
        a.copyOnWrite();
        ((andl) a.instance).p(andjVar2);
        qhe.d(a, true);
        this.a.b.a((andl) a.build(), 226);
    }

    @Override // defpackage.qgx
    public final /* bridge */ /* synthetic */ void f(qgv qgvVar, int i) {
        this.a.e((qfy) qgvVar, i);
    }

    @Override // defpackage.qgx
    public final /* bridge */ /* synthetic */ void g(qgv qgvVar, String str) {
        this.a.c((qfy) qgvVar);
        qhc qhcVar = this.a;
        qhd qhdVar = qhcVar.e;
        qhdVar.f = str;
        this.a.b.a(qhcVar.c.b(qhdVar), 222);
        this.a.f();
        this.a.g();
    }

    @Override // defpackage.qgx
    public final /* bridge */ /* synthetic */ void h(qgv qgvVar) {
        qfy qfyVar = (qfy) qgvVar;
        if (this.a.e != null) {
            qhc.a.d("Start a session while there's already an active session. Create a new one.", new Object[0]);
        }
        this.a.d(qfyVar);
        qhc qhcVar = this.a;
        qhe qheVar = qhcVar.c;
        qhd qhdVar = qhcVar.e;
        andk a = qheVar.a(qhdVar);
        if (qhdVar.i == 1) {
            aone createBuilder = andj.a.createBuilder(((andl) a.instance).a());
            createBuilder.copyOnWrite();
            andj andjVar = (andj) createBuilder.instance;
            andjVar.b |= 64;
            andjVar.f = 17;
            andj andjVar2 = (andj) createBuilder.build();
            a.copyOnWrite();
            ((andl) a.instance).p(andjVar2);
        }
        this.a.b.a((andl) a.build(), 221);
    }

    @Override // defpackage.qgx
    public final /* bridge */ /* synthetic */ void i(qgv qgvVar, int i) {
        this.a.c((qfy) qgvVar);
        qip.an(this.a.e);
        qhc qhcVar = this.a;
        this.a.b.a(qhcVar.c.c(qhcVar.e, i), 225);
        this.a.f();
        this.a.b();
    }
}
