package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asuo {
    public final aakv a;
    public final asus b;

    public asuo(asus asusVar, aakv aakvVar) {
        this.b = asusVar;
        this.a = aakvVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof asuo) && this.b.equals(((asuo) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
        sb.append("LoggingUrlModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
