package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tdv implements Application.ActivityLifecycleCallbacks {
    public final wne c;
    private final tet g;
    public final rwh d = new rwh();
    public final Map a = new HashMap();
    public final Map b = new HashMap();
    private final Map e = new HashMap();
    private final Set f = new HashSet();

    public tdv(tdq tdqVar, wne wneVar) {
        this.c = wneVar;
        this.g = new tet(tdqVar);
        Application a = tdqVar.a();
        if (a != null) {
            a.registerActivityLifecycleCallbacks(this);
        }
    }

    public final tdt a(String str, tfa tfaVar) {
        tey teyVar = (tey) this.b.get(str);
        if (teyVar == null) {
            return null;
        }
        tfa tfaVar2 = tfa.START;
        int ordinal = tfaVar.ordinal();
        if (ordinal == 10) {
            this.g.a(teyVar, tfaVar);
            teyVar.r();
        } else if (ordinal == 16) {
            this.g.a(teyVar, tfaVar);
            teyVar.n = true;
        } else if (ordinal == 17) {
            this.g.a(teyVar, tfaVar);
            teyVar.n = false;
        } else {
            switch (ordinal) {
                case 0:
                    teyVar.l = false;
                    teyVar.b = System.currentTimeMillis();
                    this.g.a(teyVar, tfaVar);
                    teyVar.o(tfa.START);
                    break;
                case 1:
                case 2:
                case 3:
                    this.g.a(teyVar, tfaVar);
                    teyVar.o(tfaVar);
                    break;
                case 4:
                    this.g.a(teyVar, tfaVar);
                    teyVar.o(tfa.COMPLETE);
                    break;
                case 5:
                    this.g.a(teyVar, tfaVar);
                    teyVar.l = false;
                    break;
                case 6:
                case 7:
                case 8:
                    this.g.a(teyVar, tfaVar);
                    teyVar.l = true;
                    break;
                default:
                    this.g.a(teyVar, tfaVar);
                    break;
            }
        }
        tdt i = teyVar.i(tfaVar);
        if (!tfaVar.t) {
            teyVar.n(tfaVar);
        }
        if (tfaVar.a() && !tfaVar.equals(tfa.COMPLETE)) {
            teyVar.p(tfaVar.u + 1);
        }
        return i;
    }

    public final void b(String str, View view, tea teaVar) {
        if (this.c.a()) {
            teb tebVar = (teb) this.e.get(str);
            if (tebVar != null) {
                if (view != tebVar.a()) {
                    tebVar.d(view);
                }
                tebVar.l = false;
                g(str, tebVar);
                return;
            }
            if (this.f.contains(str)) {
                return;
            }
            f(str, new teb(view, teaVar, str, this));
        }
    }

    public final void c(String str) {
        teb tebVar;
        if (this.a.containsKey(str)) {
            tebVar = (teb) this.a.get(str);
        } else {
            tebVar = (teb) this.e.get(str);
        }
        tebVar.j();
    }

    public final void d(String str) {
        teb tebVar;
        if (this.c.a()) {
            if (this.a.containsKey(str)) {
                tebVar = (teb) this.a.get(str);
            } else {
                tebVar = (teb) this.e.get(str);
            }
            if (tebVar == null) {
                return;
            }
            if (!tebVar.m) {
                tebVar.l = true;
                if (tebVar.b().booleanValue() || tebVar.k) {
                    return;
                }
                h(str);
                return;
            }
            c(str);
            e(str);
        }
    }

    public final void e(String str) {
        this.f.add(str);
        teb tebVar = (teb) this.a.remove(str);
        if (tebVar != null) {
            this.g.e(tebVar);
        }
        this.e.remove(str);
    }

    final void f(String str, teb tebVar) {
        this.a.put(str, tebVar);
        tet tetVar = this.g;
        tetVar.d(tebVar);
        boolean isEmpty = tetVar.b.isEmpty();
        tetVar.b.add(tebVar);
        if (isEmpty) {
            tetVar.f();
        }
    }

    public final void g(String str, teb tebVar) {
        this.e.remove(str);
        f(str, tebVar);
    }

    public final void h(String str) {
        teb tebVar = (teb) this.a.get(str);
        if (tebVar != null) {
            this.e.put(str, tebVar);
            this.a.remove(str);
            this.g.e(tebVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        ArrayList arrayList = new ArrayList();
        for (String str : this.a.keySet()) {
            View a = ((teb) this.a.get(str)).a();
            if (a == null || activity == rwh.R(a)) {
                arrayList.add(str);
            }
        }
        for (String str2 : this.e.keySet()) {
            View a2 = ((teb) this.e.get(str2)).a();
            if (a2 == null || activity == rwh.R(a2)) {
                arrayList.add(str2);
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str3 = (String) arrayList.get(i);
            c(str3);
            e(str3);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String str : this.a.keySet()) {
            teb tebVar = (teb) this.a.get(str);
            View a = tebVar.a();
            if (a == null || tebVar.m) {
                arrayList.add(str);
            } else if (activity == rwh.R(a)) {
                tebVar.a = true;
                arrayList2.add(str);
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str2 = (String) arrayList.get(i);
            c(str2);
            e(str2);
        }
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            h((String) arrayList2.get(i2));
        }
        for (tey teyVar : this.b.values()) {
            View a2 = teyVar.a();
            if (a2 != null && activity == rwh.R(a2)) {
                teyVar.a = true;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String str : this.e.keySet()) {
            teb tebVar = (teb) this.e.get(str);
            View a = tebVar.a();
            if (a == null) {
                arrayList.add(str);
            } else if (activity == rwh.R(a)) {
                tebVar.a = false;
                arrayList2.add(str);
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str2 = (String) arrayList.get(i);
            c(str2);
            e(str2);
        }
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            String str3 = (String) arrayList2.get(i2);
            g(str3, (teb) this.e.get(str3));
        }
        for (tey teyVar : this.b.values()) {
            View a2 = teyVar.a();
            if (a2 != null && activity == rwh.R(a2)) {
                teyVar.a = false;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
