package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class byw extends abd {
    public final byr a = byr.a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((byw) obj).a);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.a + '}';
    }

    public final int hashCode() {
        return 3039488 + this.a.hashCode();
    }
}
