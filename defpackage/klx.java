package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class klx {
    public final boolean a;
    public final klt b;

    public klx() {
    }

    public klx(klt kltVar, boolean z) {
        this.b = kltVar;
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof klx) {
            klx klxVar = (klx) obj;
            if (this.b.equals(klxVar.b) && this.a == klxVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ (true != this.a ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        boolean z = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
        sb.append("StateTransition{midUiAction=");
        sb.append(valueOf);
        sb.append(", shouldAnimate=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
