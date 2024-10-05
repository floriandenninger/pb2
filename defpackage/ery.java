package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ery extends etb {
    private final ammv a;

    public ery(ammv ammvVar) {
        this.a = ammvVar;
    }

    @Override // defpackage.etb
    public ammv a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof etb) {
            return this.a.equals(((etb) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 54);
        sb.append("ChannelListSelectionChangeEvent{selectedChannelIndex=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
