package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqpa {
    private final aqpd a;

    public aqpa(aqpd aqpdVar) {
        this.a = aqpdVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aqpa) && this.a.equals(((aqpa) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append("DrmLicenseInfoModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
