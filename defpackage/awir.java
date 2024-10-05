package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awir {
    public final awiv a;

    public awir(awiv awivVar) {
        this.a = awivVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awir) && this.a.equals(((awir) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append("DownloadedItemModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
