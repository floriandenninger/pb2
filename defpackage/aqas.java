package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqas {
    public final aqav a;

    public aqas(aqav aqavVar) {
        this.a = aqavVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aqas) && this.a.equals(((aqas) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
        sb.append("CommerceAcquisitionClientPayloadModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
