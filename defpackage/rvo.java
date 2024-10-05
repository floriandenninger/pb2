package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rvo implements rwi, rvp {
    public final AccessibilityManager a;
    public ruv b;
    public final Map c;
    final Map d;
    public Map e;
    final List f;
    public final rvm g;
    private final rwh h;

    public rvo(Context context) {
        rvm rvmVar = new rvm(context);
        this.h = new rvk(this);
        this.c = rwh.t();
        this.d = rwh.t();
        this.f = rwh.x();
        this.g = rvmVar;
        this.a = (AccessibilityManager) context.getSystemService("accessibility");
    }

    @Override // defpackage.rvp
    public final List a() {
        ArrayList y = rwh.y(this.d.keySet());
        Collections.sort(y);
        return y;
    }

    @Override // defpackage.rwi
    public final void b(ruv ruvVar) {
        sbt.g(ruvVar, "chart");
        sbt.c(this.b == null, "Already attached to a chart");
        this.b = ruvVar;
        ruvVar.z(this.h);
    }

    @Override // defpackage.rwi
    public final void c(ruv ruvVar) {
        ruv ruvVar2 = this.b;
        if (ruvVar2 != ruvVar) {
            return;
        }
        ruvVar2.A(this.h);
        this.b = null;
    }

    public final void d(Set set) {
        int i;
        Iterator it = this.b.l().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            rvg rvgVar = (rvg) it.next();
            saw c = rvgVar.c();
            sba sbaVar = rvgVar.a;
            Iterator it2 = sbaVar.a.iterator();
            while (it2.hasNext()) {
                set.add(c.a(it2.next(), i, sbaVar));
                i++;
            }
        }
        for (Object obj : set) {
            Map map = this.c;
            Integer valueOf = Integer.valueOf(i);
            map.put(obj, valueOf);
            this.d.put(valueOf, obj);
            i++;
        }
    }

    @Override // defpackage.rvp
    public final rvn e(int i) {
        return new rvn(this, this.d.get(Integer.valueOf(i)), 0.0f);
    }

    @Override // defpackage.rvp
    public final rvn f(float f, float f2) {
        int paddingLeft = ((int) f) - this.b.getPaddingLeft();
        int paddingTop = ((int) f2) - this.b.getPaddingTop();
        Iterator it = this.f.iterator();
        float f3 = Float.MAX_VALUE;
        Object obj = null;
        while (it.hasNext()) {
            for (say sayVar : ((rwo) it.next()).b(paddingLeft, paddingTop, true)) {
                float f4 = sayVar.f;
                if (f4 < f3) {
                    obj = sayVar.e;
                    f3 = f4;
                }
            }
        }
        if (obj == null) {
            return null;
        }
        return new rvn(this, obj, f3);
    }
}
