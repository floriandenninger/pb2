package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqow {
    private final aqpb a;

    public aqow(aqpb aqpbVar) {
        this.a = aqpbVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aqow) && this.a.equals(((aqow) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
        sb.append("DrmErrorInfoModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
