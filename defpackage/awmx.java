package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awmx {
    public final aakv a;
    public final awnf b;

    public awmx(awnf awnfVar, aakv aakvVar) {
        this.b = awnfVar;
        this.a = aakvVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awmx) && this.b.equals(((awmx) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("DecorationRunModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
