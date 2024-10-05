package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class cor implements ComponentCallbacks2, daq {
    private static final dbx e;
    protected final cnv a;
    protected final Context b;
    final dap c;
    public final CopyOnWriteArrayList d;
    private final day f;
    private final dax g;
    private final dbd h;
    private final Runnable i;
    private final dae j;
    private dbx k;

    static {
        dbx a = dbx.a(Bitmap.class);
        a.U();
        e = a;
        dbx.a(czl.class).U();
    }

    public cor(cnv cnvVar, dap dapVar, dax daxVar, Context context) {
        dae darVar;
        day dayVar = new day();
        did didVar = cnvVar.g;
        this.h = new dbd();
        coo cooVar = new coo(this);
        this.i = cooVar;
        this.a = cnvVar;
        this.c = dapVar;
        this.g = daxVar;
        this.f = dayVar;
        this.b = context;
        Context applicationContext = context.getApplicationContext();
        coq coqVar = new coq(this, dayVar);
        if (aih.c(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            darVar = new daf(applicationContext, coqVar);
        } else {
            darVar = new dar();
        }
        this.j = darVar;
        if (ddn.n()) {
            ddn.k(cooVar);
        } else {
            dapVar.a(this);
        }
        dapVar.a(darVar);
        this.d = new CopyOnWriteArrayList(cnvVar.b.d);
        p(cnvVar.b.a());
        synchronized (cnvVar.f) {
            if (cnvVar.f.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            cnvVar.f.add(this);
        }
    }

    public con a(Class cls) {
        return new con(this.a, this, cls, this.b);
    }

    public con b() {
        return a(Bitmap.class).l(e);
    }

    public con c() {
        return a(Drawable.class);
    }

    public con d(Drawable drawable) {
        return c().e(drawable);
    }

    public con e(Integer num) {
        return c().g(num);
    }

    public con f(Object obj) {
        return c().h(obj);
    }

    public con g(byte[] bArr) {
        return c().i(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized dbx h() {
        return this.k;
    }

    public final void i(View view) {
        j(new cop(view));
    }

    public final void j(dcl dclVar) {
        if (dclVar == null) {
            return;
        }
        boolean r = r(dclVar);
        dbs d = dclVar.d();
        if (r) {
            return;
        }
        cnv cnvVar = this.a;
        synchronized (cnvVar.f) {
            Iterator it = cnvVar.f.iterator();
            while (it.hasNext()) {
                if (((cor) it.next()).r(dclVar)) {
                    return;
                }
            }
            if (d != null) {
                dclVar.h(null);
                d.c();
            }
        }
    }

    @Override // defpackage.daq
    public final synchronized void k() {
        this.h.k();
        Iterator it = ddn.h(this.h.a).iterator();
        while (it.hasNext()) {
            j((dcl) it.next());
        }
        this.h.a.clear();
        day dayVar = this.f;
        Iterator it2 = ddn.h(dayVar.a).iterator();
        while (it2.hasNext()) {
            dayVar.a((dbs) it2.next());
        }
        dayVar.b.clear();
        this.c.e(this);
        this.c.e(this.j);
        ddn.g().removeCallbacks(this.i);
        cnv cnvVar = this.a;
        synchronized (cnvVar.f) {
            if (!cnvVar.f.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            cnvVar.f.remove(this);
        }
    }

    @Override // defpackage.daq
    public final synchronized void l() {
        o();
        this.h.l();
    }

    @Override // defpackage.daq
    public final synchronized void m() {
        n();
        this.h.m();
    }

    public final synchronized void n() {
        day dayVar = this.f;
        dayVar.c = true;
        for (dbs dbsVar : ddn.h(dayVar.a)) {
            if (dbsVar.n()) {
                dbsVar.f();
                dayVar.b.add(dbsVar);
            }
        }
    }

    public final synchronized void o() {
        day dayVar = this.f;
        dayVar.c = false;
        for (dbs dbsVar : ddn.h(dayVar.a)) {
            if (!dbsVar.l() && !dbsVar.n()) {
                dbsVar.b();
            }
        }
        dayVar.b.clear();
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void p(dbx dbxVar) {
        this.k = (dbx) ((dbx) dbxVar.clone()).r();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void q(dcl dclVar, dbs dbsVar) {
        this.h.a.add(dclVar);
        day dayVar = this.f;
        dayVar.a.add(dbsVar);
        if (!dayVar.c) {
            dbsVar.b();
        } else {
            dbsVar.c();
            dayVar.b.add(dbsVar);
        }
    }

    final synchronized boolean r(dcl dclVar) {
        dbs d = dclVar.d();
        if (d == null) {
            return true;
        }
        if (!this.f.a(d)) {
            return false;
        }
        this.h.a.remove(dclVar);
        dclVar.h(null);
        return true;
    }

    public final synchronized String toString() {
        StringBuilder sb;
        String obj = super.toString();
        String valueOf = String.valueOf(this.f);
        String valueOf2 = String.valueOf(this.g);
        int length = String.valueOf(obj).length();
        sb = new StringBuilder(length + 21 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append(obj);
        sb.append("{tracker=");
        sb.append(valueOf);
        sb.append(", treeNode=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
