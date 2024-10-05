package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aucs {
    public final aakv a;
    public final aucu b;

    public aucs(aucu aucuVar, aakv aakvVar) {
        this.b = aucuVar;
        this.a = aakvVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aucs) && this.b.equals(((aucs) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("CollageThumbnailDataModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
