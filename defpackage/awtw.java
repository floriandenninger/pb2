package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awtw {
    private final awtx a;

    public awtw(awtx awtxVar) {
        this.a = awtxVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awtw) && this.a.equals(((awtw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
        sb.append("MentionRunModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
