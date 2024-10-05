package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adgg {
    public final boolean a;
    public final int b;

    public adgg(int i) {
        this(i, false);
    }

    public adgg(int i, boolean z) {
        this.b = i;
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof adgg)) {
            return false;
        }
        adgg adggVar = (adgg) obj;
        return this.b == adggVar.b && this.a == adggVar.a;
    }

    public final int hashCode() {
        return this.b;
    }
}
