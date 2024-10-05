package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class bakf implements bakb {
    @Override // defpackage.bakb
    public final int a(bajr bajrVar) {
        int a = e().a(bajrVar);
        if (a == -1) {
            return 0;
        }
        return b(a);
    }

    @Override // defpackage.bakb
    public final int c() {
        return e().b();
    }

    @Override // defpackage.bakb
    public final bajr d(int i) {
        return e().b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bakb)) {
            return false;
        }
        bakb bakbVar = (bakb) obj;
        if (c() != bakbVar.c()) {
            return false;
        }
        int c = c();
        for (int i = 0; i < c; i++) {
            if (b(i) != bakbVar.b(i) || d(i) != bakbVar.d(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int c = c();
        int i = 17;
        for (int i2 = 0; i2 < c; i2++) {
            i = (((i * 27) + b(i2)) * 27) + d(i2).hashCode();
        }
        return i;
    }

    public final String toString() {
        return aynu.v().a(this);
    }
}
