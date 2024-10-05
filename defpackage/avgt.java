package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avgt {
    public final aakv a;
    public final avgu b;

    public avgt(avgu avguVar, aakv aakvVar) {
        this.b = avguVar;
        this.a = aakvVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof avgt) && this.b.equals(((avgt) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("TimedListDataModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
