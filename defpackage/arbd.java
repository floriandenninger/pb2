package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arbd {
    private final arbe a;

    public arbd(arbe arbeVar) {
        this.a = arbeVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof arbd) && this.a.equals(((arbd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append("GestureLoggingDirectivesModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
