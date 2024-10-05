package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qqj {
    public final Object a;
    public final String b;

    public qqj(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qqj)) {
            return false;
        }
        qqj qqjVar = (qqj) obj;
        return this.a == qqjVar.a && this.b.equals(qqjVar.b);
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 31) + this.b.hashCode();
    }
}
