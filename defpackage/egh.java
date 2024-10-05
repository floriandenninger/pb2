package defpackage;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.SystemClock;
import java.io.Closeable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class egh extends egk implements byl {
    static {
        usw uswVar = usw.a;
        if (uswVar.c == 0) {
            uswVar.c = SystemClock.elapsedRealtime();
            uswVar.m.a = true;
        }
    }

    @Override // defpackage.byl
    public final bym a() {
        if (!h()) {
            byk bykVar = new byk();
            bykVar.e = 4;
            return bykVar.a();
        }
        return (bym) this.d.get();
    }

    protected abstract void f();

    @Override // defpackage.egk
    protected final void g() {
        f();
        super.onCreate();
    }

    protected final boolean h() {
        String C = fav.C(this);
        if (C != null && !getPackageName().equals(C)) {
            Intent intent = new Intent("com.google.android.youtube.api.service.START");
            intent.setPackage(getApplicationInfo().packageName);
            ResolveInfo resolveService = getPackageManager().resolveService(intent, 0);
            String str = null;
            if (resolveService != null && resolveService.serviceInfo != null) {
                str = resolveService.serviceInfo.processName;
            }
            if (str != null && str.equals(C)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ameh, android.app.Application
    public final void onCreate() {
        if (!h() || this.a) {
            return;
        }
        final int i = 1;
        this.a = true;
        final usw uswVar = usw.a;
        if (uqq.n() && uswVar.c > 0 && uswVar.d == 0) {
            uswVar.d = SystemClock.elapsedRealtime();
            uswVar.m.b = true;
            uqq.l(new Runnable() { // from class: usn
                @Override // java.lang.Runnable
                public final void run() {
                    usw uswVar2 = usw.this;
                    uswVar2.b = uswVar2.n.b != null;
                }
            });
            registerActivityLifecycleCallbacks(new usu(uswVar, this));
            new Closeable() { // from class: usm
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    usw uswVar2 = usw.this;
                    if (uswVar2.e == 0) {
                        uswVar2.e = SystemClock.elapsedRealtime();
                        uswVar2.m.c = true;
                    }
                }
            };
        }
        g();
        long f = this.m.f(yxx.K);
        final int i2 = 0;
        if (f != 0) {
            if ((4 & f) != 0) {
                ayrv ayrvVar = new ayrv() { // from class: egi
                    @Override // defpackage.ayrv
                    public final Object a(Object obj) {
                        int i3 = i;
                        if (i3 == 0) {
                            return new azos((Executor) this.j.get());
                        }
                        if (i3 == 1) {
                            return new azos(anaf.E(this.i));
                        }
                        return new azos((Executor) this.k.get());
                    }
                };
                boolean z = aynu.w;
                aynu.d = ayrvVar;
            }
            if ((8 & f) != 0) {
                ayrv ayrvVar2 = new ayrv() { // from class: egi
                    @Override // defpackage.ayrv
                    public final Object a(Object obj) {
                        int i3 = i2;
                        if (i3 == 0) {
                            return new azos((Executor) this.j.get());
                        }
                        if (i3 == 1) {
                            return new azos(anaf.E(this.i));
                        }
                        return new azos((Executor) this.k.get());
                    }
                };
                boolean z2 = aynu.w;
                aynu.c = ayrvVar2;
            }
            if ((f & 16) != 0) {
                final int i3 = 2;
                ayrv ayrvVar3 = new ayrv() { // from class: egi
                    @Override // defpackage.ayrv
                    public final Object a(Object obj) {
                        int i32 = i3;
                        if (i32 == 0) {
                            return new azos((Executor) this.j.get());
                        }
                        if (i32 == 1) {
                            return new azos(anaf.E(this.i));
                        }
                        return new azos((Executor) this.k.get());
                    }
                };
                boolean z3 = aynu.w;
                aynu.e = ayrvVar3;
            }
        }
        yys yysVar = ((eni) this.c.get()).b;
        yysVar.h(0);
        egm egmVar = this.b;
        zga.k("YouTube");
        long f2 = egmVar.g.f(yxx.E);
        long j = f2 & 128;
        if (j == 0) {
            ((aadr) egmVar.b.get()).c();
            egmVar.a();
        }
        ((emu) egmVar.c.get()).a();
        if (j == 0) {
            egmVar.a();
        }
        if ((8192 & f2) == 0) {
            egmVar.e.execute(new egl(egmVar));
        }
        if (j == 0 && (f2 & 8448) != 8448) {
            egmVar.a();
        }
        this.b.a();
        long f3 = this.m.f(yxx.E);
        if ((f3 & 128) == 0) {
            ((16 & this.m.f(yxx.C)) != 0 ? this.i : (Executor) this.l.get()).execute(new bqc(3, (short[]) null));
        }
        this.h.get();
        if ((f3 & 131072) == 0) {
            egj egjVar = (egj) alta.t(this, egj.class);
            egjVar.jS();
            egjVar.jQ();
            egjVar.jT();
            egjVar.jW();
            egjVar.jU();
            egjVar.jP();
            egjVar.jR();
            this.b.a();
        }
        ((egn) (((eni) this.c.get()).a ? this.g : this.f).get()).a();
        yysVar.d(0);
    }
}
