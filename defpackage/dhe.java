package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Looper;
import android.util.Log;
import com.facebook.litho.ComponentTree;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dhe {
    public static final djr a = new dkz();
    public final Context b;
    public final String c;
    public final dlr d;
    public String e;
    public dha f;
    public final dlj g;
    public int h;
    public int i;
    public ComponentTree j;
    public djw k;
    public final taz l;
    public amsj m;
    private final dli n;

    public dhe(Context context) {
        this(context, (String) null, (taz) null, (amsj) null, (byte[]) null, (byte[]) null, (byte[]) null);
    }

    public static dhe d(dhe dheVar, dha dhaVar) {
        dhe c = dheVar.c();
        c.f = dhaVar;
        c.j = dheVar.j;
        return c;
    }

    private final void o() {
        String str = this.e;
        if (str == null) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 107);
        sb.append("Updating the state of a component during ");
        sb.append(str);
        sb.append(" leads to unexpected behaviour, consider using lazy state updates.");
        throw new IllegalStateException(sb.toString());
    }

    public final Context a() {
        return this.b.getApplicationContext();
    }

    public final Resources b() {
        return this.b.getResources();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dhe c() {
        return new dhe(this, this.d, this.m, this.k, (byte[]) null, (byte[]) null, (byte[]) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final djx e() {
        djw djwVar = this.k;
        if (djwVar == null) {
            return null;
        }
        return djwVar.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        this.e = null;
    }

    public void g(dlp dlpVar, String str) {
        o();
        ComponentTree componentTree = this.j;
        if (componentTree == null) {
            return;
        }
        String str2 = this.f.m;
        boolean i = i();
        if (componentTree.m) {
            synchronized (componentTree) {
                if (componentTree.s == null) {
                    return;
                }
                componentTree.w.m(str2, dlpVar, false);
                dqm.c.addAndGet(1L);
                componentTree.q(true, str, i);
                return;
            }
        }
        throw new RuntimeException("Triggering async state updates on this component tree is disabled, use sync state updates.");
    }

    public void h(dlp dlpVar, String str) {
        o();
        ComponentTree componentTree = this.j;
        if (componentTree == null) {
            return;
        }
        String str2 = this.f.m;
        boolean i = i();
        synchronized (componentTree) {
            if (componentTree.s == null) {
                return;
            }
            componentTree.w.m(str2, dlpVar, false);
            dqm.b.addAndGet(1L);
            Looper myLooper = Looper.myLooper();
            if (myLooper == null) {
                Log.w(ComponentTree.a, "You cannot update state synchronously from a thread without a looper, using the default background layout thread instead");
                synchronized (componentTree.f) {
                    dhu dhuVar = componentTree.g;
                    if (dhuVar != null) {
                        componentTree.o.a(dhuVar);
                    }
                    componentTree.g = new dhu(componentTree, str, i);
                    componentTree.o.b();
                    componentTree.o.c(componentTree.g);
                }
                return;
            }
            WeakReference weakReference = (WeakReference) ComponentTree.b.get();
            dkf dkfVar = weakReference != null ? (dkf) weakReference.get() : null;
            if (dkfVar == null) {
                dkfVar = new dke(myLooper);
                ComponentTree.b.set(new WeakReference(dkfVar));
            }
            synchronized (componentTree.f) {
                dhu dhuVar2 = componentTree.g;
                if (dhuVar2 != null) {
                    dkfVar.a(dhuVar2);
                }
                componentTree.g = new dhu(componentTree, str, i);
                dkfVar.c(componentTree.g);
            }
        }
    }

    final boolean i() {
        djx djxVar;
        djw djwVar = this.k;
        if (djwVar == null || (djxVar = djwVar.a) == null) {
            return false;
        }
        return djxVar.s;
    }

    public final boolean j() {
        ComponentTree componentTree = this.j;
        return componentTree != null ? componentTree.y : doa.j;
    }

    public final boolean k() {
        dhr dhrVar;
        djw djwVar = this.k;
        if (djwVar == null || (dhrVar = djwVar.b) == null) {
            return false;
        }
        return dhrVar.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean l() {
        djw djwVar = this.k;
        if (djwVar == null) {
            return false;
        }
        return djwVar.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public amsj m() {
        return this.m;
    }

    public final amsj n() {
        return amsj.E(this.m);
    }

    public dhe(Context context, String str, taz tazVar, amsj amsjVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (tazVar != null && str == null) {
            throw new IllegalStateException("When a ComponentsLogger is set, a LogTag must be set");
        }
        this.b = context;
        this.n = dli.a(context.getResources().getConfiguration());
        this.g = new dlj(this);
        this.m = amsjVar;
        this.l = tazVar;
        this.c = str;
        this.d = null;
    }

    public dhe(dhe dheVar, dlr dlrVar, amsj amsjVar, djw djwVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = dheVar.b;
        this.n = dheVar.n;
        this.g = dheVar.g;
        this.h = dheVar.h;
        this.i = dheVar.i;
        this.f = dheVar.f;
        ComponentTree componentTree = dheVar.j;
        this.j = componentTree;
        this.k = djwVar;
        this.l = dheVar.l;
        String str = dheVar.c;
        if (str == null && componentTree != null) {
            str = componentTree.f();
        }
        this.c = str;
        this.d = dlrVar == null ? dheVar.d : dlrVar;
        this.m = amsjVar == null ? dheVar.m : amsjVar;
    }
}
