package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ww extends ic {
    final wx b;
    public final Map c = new WeakHashMap();

    public ww(wx wxVar) {
        this.b = wxVar;
    }

    @Override // defpackage.ic
    public final kw a(View view) {
        ic icVar = (ic) this.c.get(view);
        if (icVar != null) {
            return icVar.a(view);
        }
        return super.a(view);
    }

    @Override // defpackage.ic
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        ic icVar = (ic) this.c.get(view);
        if (icVar != null) {
            icVar.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // defpackage.ic
    public final void d(View view, ks ksVar) {
        wd wdVar;
        if (this.b.l() || (wdVar = this.b.b.n) == null) {
            super.d(view, ksVar);
            return;
        }
        wdVar.aN(view, ksVar);
        ic icVar = (ic) this.c.get(view);
        if (icVar != null) {
            icVar.d(view, ksVar);
        } else {
            super.d(view, ksVar);
        }
    }

    @Override // defpackage.ic
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        ic icVar = (ic) this.c.get(view);
        if (icVar != null) {
            icVar.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // defpackage.ic
    public final void f(View view, int i) {
        ic icVar = (ic) this.c.get(view);
        if (icVar != null) {
            icVar.f(view, i);
        } else {
            super.f(view, i);
        }
    }

    @Override // defpackage.ic
    public final void g(View view, AccessibilityEvent accessibilityEvent) {
        ic icVar = (ic) this.c.get(view);
        if (icVar != null) {
            icVar.g(view, accessibilityEvent);
        } else {
            super.g(view, accessibilityEvent);
        }
    }

    @Override // defpackage.ic
    public final boolean h(View view, AccessibilityEvent accessibilityEvent) {
        ic icVar = (ic) this.c.get(view);
        if (icVar != null) {
            return icVar.h(view, accessibilityEvent);
        }
        return super.h(view, accessibilityEvent);
    }

    @Override // defpackage.ic
    public final boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        ic icVar = (ic) this.c.get(viewGroup);
        if (icVar != null) {
            return icVar.i(viewGroup, view, accessibilityEvent);
        }
        return super.i(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.ic
    public final boolean j(View view, int i, Bundle bundle) {
        if (this.b.l() || this.b.b.n == null) {
            return super.j(view, i, bundle);
        }
        ic icVar = (ic) this.c.get(view);
        if (icVar != null) {
            if (icVar.j(view, i, bundle)) {
                return true;
            }
        } else if (super.j(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.b.b.n.u;
        wk wkVar = recyclerView.d;
        ws wsVar = recyclerView.M;
        return false;
    }
}
