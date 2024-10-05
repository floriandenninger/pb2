package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amhn {
    public amir a;
    public amir b;
    public amis d;
    private final Activity f;
    private final Context g;
    private amis l;
    private amis m;
    private amis n;
    private final Runnable e = new Runnable() { // from class: amhl
        @Override // java.lang.Runnable
        public final void run() {
            amhn.this.a = null;
        }
    };
    private final amis h = new amhi(this, 3);
    private final amis i = new amhi(this, 1);
    private boolean j = false;
    private boolean k = false;
    public boolean c = false;

    private amhn(Activity activity, Context context) {
        this.f = activity;
        this.g = context;
    }

    private final void A() {
        if (this.j) {
            this.a = null;
            this.j = false;
        }
    }

    private final void B() {
        amis amisVar = this.d;
        if (amisVar == null) {
            return;
        }
        String valueOf = String.valueOf(amisVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
        sb.append("Expected lifecycleStepSpan to be null but was:");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    public static amhn a(Activity activity) {
        return new amhn(activity, activity);
    }

    private final amip w(amip amipVar) {
        return amip.d(amipVar, amip.c(((amiy) axfq.n(this.g, amiy.class)).kU()));
    }

    private final amis x(String str) {
        if (amjw.o()) {
            return amjw.m(str, w(amio.a));
        }
        return amkq.p(this.g).a(str);
    }

    private final String y(String str) {
        String simpleName = this.g.getClass().getSimpleName();
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(simpleName).length());
        sb.append(str);
        sb.append(" ");
        sb.append(simpleName);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v7, types: [amir, amis] */
    private final void z(String str, String str2, Intent intent) {
        amip amipVar;
        this.b = amjw.a();
        amir h = amjk.h(intent);
        amip amipVar2 = amiq.a;
        amhm amhmVar = new amhm(0);
        amin b = amip.b();
        b.a(amiq.c, amhmVar);
        amip e = ((amip) b).e();
        if (h != null) {
            amjw.e(h);
            this.a = h;
            amipVar = w(amipVar2);
        } else {
            this.k = amjw.q();
            if (!amjw.o()) {
                amir d = amjw.d();
                if (d != null) {
                    this.l = d;
                    amir f = d.f(y(str), e);
                    this.m = f;
                    amjw.e(f);
                    this.n = new amil(this.m);
                } else {
                    this.l = amkq.p(this.g).b(y(str), amipVar2);
                }
            } else {
                amipVar2 = w(amipVar2);
            }
            this.a = amjw.a();
            amipVar = amipVar2;
        }
        this.d = amjw.m(y(str2), amipVar);
        uqq.l(this.e);
    }

    public final amis b() {
        B();
        final amis x = x("Back pressed");
        final amis p = amjw.p();
        return new amis() { // from class: amhk
            @Override // defpackage.amis, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                amis amisVar = amis.this;
                try {
                    p.close();
                    amisVar.close();
                } catch (Throwable th) {
                    try {
                        amisVar.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            }
        };
    }

    public final amis c() {
        n("onDestroy");
        return new amhi(this, 0);
    }

    public final amis d(Intent intent) {
        amkq.N(this.f != null);
        z("Reintenting into", "onNewIntent", intent);
        return this.h;
    }

    public final amis e() {
        n("onPause");
        return this.i;
    }

    public final amis f() {
        this.b = amjw.a();
        amjw.e(this.a);
        return new amhi(this, 2);
    }

    public final amis g() {
        A();
        n("onResume");
        return this.h;
    }

    public final amis h() {
        A();
        n("onStart");
        return this.h;
    }

    public final amis i() {
        n("onStop");
        return this.i;
    }

    public final amis j() {
        B();
        return x("onSupportNavigateUp");
    }

    public final amis k() {
        B();
        return x("onUserInteraction");
    }

    public final void l(aod aodVar) {
        aod aodVar2 = aod.ON_CREATE;
        int ordinal = aodVar.ordinal();
        if (ordinal == 0) {
            if (this.c) {
                o();
                this.c = false;
                return;
            }
            return;
        }
        if (ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 5) {
            o();
            return;
        }
        String valueOf = String.valueOf(aodVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
        sb.append("Unknown lifecycle: ");
        sb.append(valueOf);
        throw new UnsupportedOperationException(sb.toString());
    }

    public final void m() {
        this.j = true;
        Activity activity = this.f;
        if (activity == null || activity.isChangingConfigurations() || this.f.isFinishing()) {
            return;
        }
        this.a = null;
    }

    public final void n(String str) {
        this.b = amjw.a();
        amip amipVar = amiq.a;
        amir amirVar = this.a;
        if (amirVar != null) {
            amjw.e(amirVar);
            amipVar = w(amipVar);
        } else {
            this.k = amjw.q();
            if (!amjw.o()) {
                amiu p = amkq.p(this.g);
                Class<?> cls = this.g.getClass();
                amip amipVar2 = amiq.a;
                String simpleName = cls.getSimpleName();
                StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + str.length());
                sb.append(simpleName);
                sb.append(": ");
                sb.append(str);
                this.l = p.a.b(sb.toString(), amip.d(p.b, amipVar2), p.c);
            } else {
                amipVar = w(amipVar);
            }
            this.a = amjw.a();
        }
        this.d = amjw.m(y(str), amipVar);
    }

    public final void o() {
        amis amisVar = this.d;
        amisVar.getClass();
        amisVar.close();
        this.d = null;
        if (this.k) {
            this.k = false;
            amjw.j();
        }
        amis amisVar2 = this.n;
        if (amisVar2 != null) {
            amisVar2.close();
            this.n = null;
            this.m = null;
        }
        amis amisVar3 = this.l;
        if (amisVar3 != null) {
            amisVar3.close();
            this.l = null;
        }
        amjw.e(this.b);
        this.b = null;
    }

    public final amis p() {
        B();
        return x("onActivityResult");
    }

    public final amis q() {
        Activity activity = this.f;
        if (activity != null) {
            z("Intenting into", "onCreate", activity.getIntent());
        } else {
            A();
            n("onCreate");
        }
        return this.h;
    }

    public final amis r() {
        amis f = amjw.f();
        if (amjw.o()) {
            return f;
        }
        amiu p = amkq.p(this.g);
        String simpleName = this.g.getClass().getSimpleName();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 19);
        sb.append(simpleName);
        sb.append(": onCreatePanelMenu");
        final amir a = p.a(sb.toString());
        return new amis() { // from class: amhj
            /* JADX WARN: Type inference failed for: r0v0, types: [amij, amir] */
            @Override // defpackage.amis, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                amjw.i(amij.this);
                amjw.j();
            }
        };
    }

    public final amis s() {
        B();
        return x("onOptionsItemSelected");
    }

    public final amis t() {
        A();
        n("onPostCreate");
        return this.h;
    }

    public final amis u() {
        return x("onRequestPermissionsResult");
    }

    public final amis v() {
        n("onSaveInstanceState");
        return this.i;
    }
}
