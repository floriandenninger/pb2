package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awna {
    public final aakv a;
    public final awnh b;

    public awna(awnh awnhVar, aakv aakvVar) {
        this.b = awnhVar;
        this.a = aakvVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awna) && this.b.equals(((awna) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
        sb.append("StyleRunModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
