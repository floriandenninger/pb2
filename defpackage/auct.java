package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auct {
    public final aakv a;
    public final aucv b;

    public auct(aucv aucvVar, aakv aakvVar) {
        this.b = aucvVar;
        this.a = aakvVar;
    }

    public final aucs a() {
        aucv aucvVar = this.b;
        return new aucs((aucu) (aucvVar.b == 2 ? (aucu) aucvVar.c : aucu.a).toBuilder().build(), this.a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof auct) && this.b.equals(((auct) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
        sb.append("PlaylistThumbnailDataModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
