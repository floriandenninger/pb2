package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awtr {
    public final aakv a;
    public final awts b;

    public awtr(awts awtsVar, aakv aakvVar) {
        this.b = awtsVar;
        this.a = aakvVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awtr) && this.b.equals(((awtr) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
        sb.append("EmojiRunModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
