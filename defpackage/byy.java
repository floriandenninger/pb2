package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class byy extends abd {
    public final byr a;

    public byy() {
        this(byr.a);
    }

    public byy(byr byrVar) {
        this.a = byrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((byy) obj).a);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.a + '}';
    }

    public final int hashCode() {
        return 3039550 + this.a.hashCode();
    }
}
