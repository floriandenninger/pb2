package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avjh {
    public final aakv a;
    public final avjl b;

    public avjh(avjl avjlVar, aakv aakvVar) {
        this.b = avjlVar;
        this.a = aakvVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof avjh) && this.b.equals(((avjh) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
        sb.append("TranscriptSegmentDataModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
