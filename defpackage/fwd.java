package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fwd implements Comparable, fwc {
    final WeakReference a;
    final long b;

    public fwd(fwc fwcVar, long j) {
        this.a = new WeakReference(fwcVar);
        this.b = j;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.valueOf(this.b).compareTo(Long.valueOf(((fwd) obj).b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fwd)) {
            return false;
        }
        fwc fwcVar = (fwc) this.a.get();
        fwc fwcVar2 = (fwc) ((fwd) obj).a.get();
        if (fwcVar != fwcVar2) {
            return fwcVar != null && fwcVar.equals(fwcVar2);
        }
        return true;
    }

    @Override // defpackage.fwc
    public final void g(String str) {
        fwc fwcVar = (fwc) this.a.get();
        if (fwcVar != null) {
            fwcVar.g(str);
        }
    }

    public final int hashCode() {
        fwc fwcVar = (fwc) this.a.get();
        if (fwcVar != null) {
            return fwcVar.hashCode();
        }
        return 0;
    }
}
