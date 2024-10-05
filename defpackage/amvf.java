package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amvf extends amvg implements Serializable, ammy {
    public static final amvf a = new amvf(amqg.a, amqe.a);
    private static final long serialVersionUID = 0;
    public final amqi b;
    public final amqi c;

    private amvf(amqi amqiVar, amqi amqiVar2) {
        this.b = amqiVar;
        this.c = amqiVar2;
        if (amqiVar.compareTo(amqiVar2) > 0 || amqiVar == amqe.a || amqiVar2 == amqg.a) {
            String valueOf = String.valueOf(n(amqiVar, amqiVar2));
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Invalid range: ".concat(valueOf) : new String("Invalid range: "));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    public static amvd c() {
        return amve.a;
    }

    public static amvf d(Comparable comparable, Comparable comparable2) {
        return f(amqi.f(comparable), new amqf(comparable2));
    }

    public static amvf e(Comparable comparable, Comparable comparable2) {
        return f(amqi.f(comparable), amqi.f(comparable2));
    }

    public static amvf f(amqi amqiVar, amqi amqiVar2) {
        return new amvf(amqiVar, amqiVar2);
    }

    private static String n(amqi amqiVar, amqi amqiVar2) {
        StringBuilder sb = new StringBuilder(16);
        amqiVar.c(sb);
        sb.append("..");
        amqiVar2.d(sb);
        return sb.toString();
    }

    @Override // defpackage.ammy
    public final boolean equals(Object obj) {
        if (obj instanceof amvf) {
            amvf amvfVar = (amvf) obj;
            if (this.b.equals(amvfVar.b) && this.c.equals(amvfVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final Comparable g() {
        return this.b.b();
    }

    public final Comparable h() {
        return this.c.b();
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    @Override // defpackage.ammy
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final boolean a(Comparable comparable) {
        comparable.getClass();
        return this.b.e(comparable) && !this.c.e(comparable);
    }

    public final boolean j(amvf amvfVar) {
        return this.b.compareTo(amvfVar.b) <= 0 && this.c.compareTo(amvfVar.c) >= 0;
    }

    public final boolean k() {
        return this.c != amqe.a;
    }

    public final boolean l(amvf amvfVar) {
        return this.b.compareTo(amvfVar.c) <= 0 && amvfVar.b.compareTo(this.c) <= 0;
    }

    public final boolean m() {
        return this.b.equals(this.c);
    }

    Object readResolve() {
        amvf amvfVar = a;
        return equals(amvfVar) ? amvfVar : this;
    }

    public final String toString() {
        return n(this.b, this.c);
    }
}
