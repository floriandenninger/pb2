package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avgk {
    private final avgf a;

    public avgk(avgf avgfVar) {
        this.a = avgfVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof avgk) && this.a.equals(((avgk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
        sb.append("ThumbnailModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
