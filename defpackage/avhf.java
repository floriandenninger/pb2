package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avhf {
    private final avhg a;

    public avhf(avhg avhgVar) {
        this.a = avhgVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof avhf) && this.a.equals(((avhf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("TimedSyncDataItemModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
