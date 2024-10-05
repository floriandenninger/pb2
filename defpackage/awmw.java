package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awmw {
    public final aakv a;
    public final awne b;

    public awmw(awne awneVar, aakv aakvVar) {
        this.b = awneVar;
        this.a = aakvVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awmw) && this.b.equals(((awmw) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
        sb.append("CommandRunModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
