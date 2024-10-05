package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ryv {
    public Object a;
    public Object b;

    public ryv(Object obj, Object obj2) {
        b(obj, obj2);
    }

    public final ryv a() {
        return new ryv(this.a, this.b);
    }

    public final void b(Object obj, Object obj2) {
        sbt.h(obj);
        this.a = obj;
        sbt.h(obj2);
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ryv) {
            ryv ryvVar = (ryv) obj;
            if (this.a.equals(ryvVar.a) && this.b.equals(ryvVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return String.format("[%s, %s]", this.a.toString(), this.b.toString());
    }
}
