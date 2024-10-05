package defpackage;

import android.app.Application;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fay implements acsn {
    public long a = -1;
    public long b = -1;
    private final ypa c;
    private final azrw d;

    public fay(azrw azrwVar, ypa ypaVar) {
        this.c = ypaVar;
        this.d = azrwVar;
    }

    public final void a() {
        this.b = -2L;
    }

    public final void b(long j, long j2, boolean z, boolean z2) {
        yjk.f();
        this.a = j2;
        this.c.f(new fcr(j, z, z2));
    }

    @Override // defpackage.acsn
    public final void c() {
        a();
        this.c.f(new fco());
    }

    public final void d() {
        this.c.d(new fde());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e() {
        return this.b >= 0 && this.a >= 0;
    }

    public final void f(Application application) {
        acso acsoVar = (acso) this.d.get();
        if (acsoVar.g()) {
            acsoVar.d().h(eng.j).V(new ayrs() { // from class: faw
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    fay.this.c();
                }
            }, eoo.g);
        }
        application.registerActivityLifecycleCallbacks(new fax(this));
    }
}
