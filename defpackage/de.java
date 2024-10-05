package defpackage;

import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class de extends apm {
    public static final apo a = new apz(1);
    public final boolean e;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public boolean f = false;
    public boolean g = false;

    public de(boolean z) {
        this.e = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(ce ceVar) {
        if (this.g || this.b.containsKey(ceVar.l)) {
            return;
        }
        this.b.put(ceVar.l, ceVar);
        if (dd.W(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Updating retained Fragments: Added ");
            sb.append(ceVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(ce ceVar) {
        if (dd.W(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing non-config state for ");
            sb.append(ceVar);
        }
        c(ceVar.l);
    }

    public final void c(String str) {
        de deVar = (de) this.c.get(str);
        if (deVar != null) {
            deVar.d();
            this.c.remove(str);
        }
        apt aptVar = (apt) this.d.get(str);
        if (aptVar != null) {
            aptVar.c();
            this.d.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.apm
    public final void d() {
        if (dd.W(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCleared called for ");
            sb.append(this);
        }
        this.f = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(ce ceVar) {
        if (this.g || this.b.remove(ceVar.l) == null || !dd.W(2)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Updating retained Fragments: Removed ");
        sb.append(ceVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            de deVar = (de) obj;
            if (this.b.equals(deVar.b) && this.c.equals(deVar.c) && this.d.equals(deVar.d)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f(ce ceVar) {
        if (this.b.containsKey(ceVar.l) && this.e) {
            return this.f;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
