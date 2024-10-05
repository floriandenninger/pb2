package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sbs {
    public final Object a;
    public final Object b;

    public sbs(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sbs)) {
            return false;
        }
        sbs sbsVar = (sbs) obj;
        Object obj2 = sbsVar.a;
        Object obj3 = this.a;
        if (obj2 != obj3) {
            return (obj2.equals(obj3) && sbsVar.b == this.b) || sbsVar.b.equals(this.b);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }
}
