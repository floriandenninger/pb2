package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avgh {
    public final avgd a;

    public avgh(avgd avgdVar) {
        this.a = avgdVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof avgh) && this.a.equals(((avgh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("LowResThumbnailModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
