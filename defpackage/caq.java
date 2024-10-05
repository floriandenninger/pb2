package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class caq implements bzs, cbh, bzo {
    Boolean a;
    private final Context b;
    private final caj c;
    private final cbi d;
    private final cap f;
    private boolean g;
    private final Set e = new HashSet();
    private final Object h = new Object();

    static {
        ajbh.S("GreedyScheduler");
    }

    public caq(Context context, bym bymVar, cfa cfaVar, caj cajVar) {
        this.b = context;
        this.c = cajVar;
        this.d = new cbi(context, cfaVar, this);
        this.f = new cap(this, bymVar.d);
    }

    private final void g() {
        this.a = Boolean.valueOf(cdx.a(this.b, this.c.c));
    }

    private final void h() {
        if (this.g) {
            return;
        }
        this.c.f.b(this);
        this.g = true;
    }

    @Override // defpackage.bzo
    public final void a(String str, boolean z) {
        synchronized (this.h) {
            Iterator it = this.e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                cda cdaVar = (cda) it.next();
                if (cdaVar.c.equals(str)) {
                    ajbh X = ajbh.X();
                    String.format("Stopping tracking for %s", str);
                    X.T(new Throwable[0]);
                    this.e.remove(cdaVar);
                    this.d.a(this.e);
                    break;
                }
            }
        }
    }

    @Override // defpackage.bzs
    public final void b(String str) {
        Runnable runnable;
        if (this.a == null) {
            g();
        }
        if (!this.a.booleanValue()) {
            ajbh.X();
            ajbh.V(new Throwable[0]);
            return;
        }
        h();
        ajbh X = ajbh.X();
        String.format("Cancelling work ID %s", str);
        X.T(new Throwable[0]);
        cap capVar = this.f;
        if (capVar != null && (runnable = (Runnable) capVar.c.remove(str)) != null) {
            capVar.b.a(runnable);
        }
        this.c.l(str);
    }

    @Override // defpackage.bzs
    public final void c(cda... cdaVarArr) {
        if (this.a == null) {
            g();
        }
        if (!this.a.booleanValue()) {
            ajbh.X();
            ajbh.V(new Throwable[0]);
            return;
        }
        h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (cda cdaVar : cdaVarArr) {
            long a = cdaVar.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (cdaVar.r == 1) {
                if (currentTimeMillis < a) {
                    cap capVar = this.f;
                    if (capVar != null) {
                        Runnable runnable = (Runnable) capVar.c.remove(cdaVar.c);
                        if (runnable != null) {
                            capVar.b.a(runnable);
                        }
                        cao caoVar = new cao(capVar, cdaVar);
                        capVar.c.put(cdaVar.c, caoVar);
                        capVar.b.b(cdaVar.a() - System.currentTimeMillis(), caoVar);
                    }
                } else if (cdaVar.c()) {
                    if (Build.VERSION.SDK_INT < 23 || !cdaVar.k.c) {
                        if (Build.VERSION.SDK_INT < 24 || !cdaVar.k.a()) {
                            hashSet.add(cdaVar);
                            hashSet2.add(cdaVar.c);
                        } else {
                            ajbh X = ajbh.X();
                            String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", cdaVar);
                            X.T(new Throwable[0]);
                        }
                    } else {
                        ajbh X2 = ajbh.X();
                        String.format("Ignoring WorkSpec %s, Requires device idle.", cdaVar);
                        X2.T(new Throwable[0]);
                    }
                } else {
                    ajbh X3 = ajbh.X();
                    String.format("Starting work for %s", cdaVar.c);
                    X3.T(new Throwable[0]);
                    this.c.k(cdaVar.c);
                }
            }
        }
        synchronized (this.h) {
            if (!hashSet.isEmpty()) {
                ajbh X4 = ajbh.X();
                String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2));
                X4.T(new Throwable[0]);
                this.e.addAll(hashSet);
                this.d.a(this.e);
            }
        }
    }

    @Override // defpackage.bzs
    public final boolean d() {
        return false;
    }

    @Override // defpackage.cbh
    public final void e(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ajbh X = ajbh.X();
            String.format("Constraints met: Scheduling work ID %s", str);
            X.T(new Throwable[0]);
            this.c.k(str);
        }
    }

    @Override // defpackage.cbh
    public final void f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ajbh X = ajbh.X();
            String.format("Constraints not met: Cancelling work ID %s", str);
            X.T(new Throwable[0]);
            this.c.l(str);
        }
    }
}
