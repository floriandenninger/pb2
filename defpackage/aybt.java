package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aybt extends aybk {
    public abstract String b();

    public abstract void c();

    public abstract void d();

    public ayck e() {
        throw null;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final String toString() {
        ammu Y = amkq.Y(this);
        Y.b("policy", b());
        Y.e("priority", 5);
        Y.g("available", true);
        return Y.toString();
    }
}
