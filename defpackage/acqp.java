package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acqp {
    private final Object a;
    private final int b;
    private final int c;

    public acqp(Object obj, int i, int i2) {
        this.a = obj;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof acqp)) {
            return false;
        }
        acqp acqpVar = (acqp) obj;
        if (this.c != acqpVar.c) {
            return false;
        }
        Object obj2 = this.a;
        if (obj2 == null ? acqpVar.a == null : obj2.equals(acqpVar.a)) {
            return this.b == acqpVar.b;
        }
        return false;
    }

    public final int hashCode() {
        return (this.b * 31) + this.c;
    }
}
