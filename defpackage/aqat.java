package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqat {
    public final aqax a;

    public aqat(aqax aqaxVar) {
        this.a = aqaxVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aqat) && this.a.equals(((aqat) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append("PlayBillingClientPayloadModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
