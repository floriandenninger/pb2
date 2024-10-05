package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqni {
    private final aqnj a;

    public aqni(aqnj aqnjVar) {
        this.a = aqnjVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aqni) && this.a.equals(((aqni) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
        sb.append("DownloadsPageFeatureVisibilityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
