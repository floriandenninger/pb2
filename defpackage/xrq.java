package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class xrq extends xtx {
    private final xuh a;
    private final int b;

    public xrq(xuh xuhVar, int i) {
        if (xuhVar == null) {
            throw new NullPointerException("Null updatedImage");
        }
        this.a = xuhVar;
        this.b = i;
    }

    @Override // defpackage.xtx
    public int a() {
        return this.b;
    }

    @Override // defpackage.xtx
    public xuh b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xtx) {
            xtx xtxVar = (xtx) obj;
            if (this.a.equals(xtxVar.b()) && this.b == xtxVar.a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 55);
        sb.append("ImageItemUpdatedEvent{updatedImage=");
        sb.append(valueOf);
        sb.append(", index=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
