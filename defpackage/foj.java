package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class foj extends foq {
    private final boolean a;

    public foj(boolean z) {
        this.a = z;
    }

    @Override // defpackage.foq
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof foq) && this.a == ((foq) obj).a();
    }

    public int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public String toString() {
        boolean z = this.a;
        StringBuilder sb = new StringBuilder(48);
        sb.append("SwipeRefreshEvent{wasSectionListRefreshed=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
