package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ccy {
    public String a;
    public int b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccy)) {
            return false;
        }
        ccy ccyVar = (ccy) obj;
        if (this.b != ccyVar.b) {
            return false;
        }
        return this.a.equals(ccyVar.a);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int i = this.b;
        abm.e(i);
        return (hashCode * 31) + i;
    }
}
