package defpackage;

import android.graphics.Rect;
import com.facebook.litho.ComponentTree;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dic {
    public static final Map a = new HashMap();
    public djr b;
    private int c;

    private dic() {
    }

    static synchronized dic d(djr djrVar, int i) {
        synchronized (dic.class) {
            dic dicVar = new dic();
            dhe X = djrVar.X();
            if (i >= djrVar.av().size()) {
                return null;
            }
            k(X, (dha) djrVar.av().get(i));
            dicVar.b = djrVar;
            dicVar.c = i;
            djrVar.aF(dicVar);
            return dicVar;
        }
    }

    public static dic f(dkp dkpVar) {
        return e(dkpVar.r);
    }

    public static String k(dhe dheVar, dha dhaVar) {
        ComponentTree componentTree = dheVar.j;
        String str = dhaVar.m;
        int identityHashCode = System.identityHashCode(componentTree);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11);
        sb.append(identityHashCode);
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void n(dhe dheVar, djr djrVar) {
        if (djrVar.av() == null || djrVar.av().isEmpty()) {
            return;
        }
        dib dibVar = (dib) a.get(k(dheVar, (dha) djrVar.av().get(0)));
        if (dibVar != null) {
            new die(djrVar);
            dibVar.b();
        }
    }

    private static int q(djr djrVar) {
        if (djrVar == null) {
            return 0;
        }
        return djrVar.I() + q(s(djrVar));
    }

    private static int r(djr djrVar) {
        if (djrVar == null) {
            return 0;
        }
        return djrVar.J() + r(s(djrVar));
    }

    private static djr s(djr djrVar) {
        djr al = djrVar.al();
        return al != null ? al : djrVar.ak();
    }

    public final Rect a() {
        int I = this.b.I();
        int J2 = this.b.J();
        return new Rect(I, J2, this.b.H() + I, this.b.C() + J2);
    }

    public final Rect b() {
        if (this.c != 0 || this.b.al() != null) {
            int q = q(this.b);
            int r = r(this.b);
            return new Rect(q, r, this.b.H() + q, this.b.C() + r);
        }
        return new Rect(0, 0, this.b.H(), this.b.C());
    }

    public final dha c() {
        return (dha) this.b.av().get(this.c);
    }

    public final die g() {
        if (o()) {
            return new die(this.b);
        }
        return null;
    }

    public final dkp h() {
        dhe X = this.b.X();
        ComponentTree componentTree = X == null ? null : X.j;
        if (componentTree == null) {
            return null;
        }
        return componentTree.getLithoView();
    }

    public final dut i() {
        return this.b.ap();
    }

    public final Object j() {
        dgx dgxVar = ((dha) this.b.av().get(this.c)).s;
        if (dgxVar != null) {
            return dgxVar.e;
        }
        return null;
    }

    public final String l() {
        dgx dgxVar = ((dha) this.b.av().get(this.c)).s;
        if (dgxVar == null || (dgxVar.a & 2) == 0) {
            return null;
        }
        return dgxVar.d;
    }

    public final List m() {
        if (!o()) {
            dic d = d(this.b, this.c - 1);
            if (d != null) {
                return Collections.singletonList(d);
            }
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int c = this.b.c();
        for (int i = 0; i < c; i++) {
            dic d2 = d(this.b.g(i), Math.max(0, ((dii) r4).b.size() - 1));
            if (d2 != null) {
                arrayList.add(d2);
            }
        }
        djr aj = this.b.aj();
        if (aj != null && aj.aU()) {
            int c2 = aj.c();
            for (int i2 = 0; i2 < c2; i2++) {
                dic d3 = d(aj.g(i2), Math.max(0, ((dii) r5).b.size() - 1));
                if (d3 != null) {
                    arrayList.add(d3);
                }
            }
        }
        return arrayList;
    }

    public final boolean o() {
        return this.c == 0;
    }

    public final boolean p(dic dicVar) {
        return this.b == dicVar.b;
    }

    public static dic e(ComponentTree componentTree) {
        djx djxVar = componentTree == null ? null : componentTree.t;
        djr djrVar = djxVar == null ? null : djxVar.k;
        if (djrVar == null || djrVar == dhe.a) {
            return null;
        }
        return d(djrVar, Math.max(0, djrVar.av().size() - 1));
    }
}
