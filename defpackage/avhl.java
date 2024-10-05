package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avhl {
    private final avhm a;

    public avhl(avhm avhmVar) {
        this.a = avhmVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof avhl) && this.a.equals(((avhl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
        sb.append("TimestampModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
