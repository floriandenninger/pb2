package defpackage;

import android.support.v4.app.FragmentState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dl {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public de d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ce a(String str) {
        dj djVar = (dj) this.b.get(str);
        if (djVar != null) {
            return djVar.b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ce b(String str) {
        for (dj djVar : this.b.values()) {
            if (djVar != null) {
                ce ceVar = djVar.b;
                if (!str.equals(ceVar.l)) {
                    ceVar = ceVar.B.a.b(str);
                }
                if (ceVar != null) {
                    return ceVar;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final FragmentState c(String str, FragmentState fragmentState) {
        if (fragmentState != null) {
            return (FragmentState) this.c.put(str, fragmentState);
        }
        return (FragmentState) this.c.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dj d(String str) {
        return (dj) this.b.get(str);
    }

    public final List e() {
        ArrayList arrayList = new ArrayList();
        for (dj djVar : this.b.values()) {
            if (djVar != null) {
                arrayList.add(djVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List f() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(ce ceVar) {
        if (!this.a.contains(ceVar)) {
            synchronized (this.a) {
                this.a.add(ceVar);
            }
            ceVar.r = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + ceVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        this.b.values().removeAll(Collections.singleton(null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(dj djVar) {
        ce ceVar = djVar.b;
        if (l(ceVar.l)) {
            return;
        }
        this.b.put(ceVar.l, djVar);
        if (ceVar.f154J) {
            if (ceVar.I) {
                this.d.a(ceVar);
            } else {
                this.d.e(ceVar);
            }
            ceVar.f154J = false;
        }
        if (dd.W(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Added fragment to active set ");
            sb.append(ceVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(dj djVar) {
        ce ceVar = djVar.b;
        if (ceVar.I) {
            this.d.e(ceVar);
        }
        if (((dj) this.b.put(ceVar.l, null)) != null && dd.W(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Removed fragment from active set ");
            sb.append(ceVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(ce ceVar) {
        synchronized (this.a) {
            this.a.remove(ceVar);
        }
        ceVar.r = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean l(String str) {
        return this.b.get(str) != null;
    }
}
