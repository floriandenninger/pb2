package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asxu {
    public final asxv a;

    public asxu(asxv asxvVar) {
        this.a = asxvVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof asxu) && this.a.equals(((asxu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
        sb.append("MainVideoUserStateMetadataModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
