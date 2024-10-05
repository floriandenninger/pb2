package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asyo {
    private final asys a;

    public asyo(asys asysVar) {
        this.a = asysVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof asyo) && this.a.equals(((asyo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("ActiveSectionInfoModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
