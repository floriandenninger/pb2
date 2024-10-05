package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fzq {
    public final boolean a;
    public final fzo b;
    public final boolean c;

    public fzq() {
    }

    public fzq(boolean z, fzo fzoVar, boolean z2) {
        this.a = z;
        this.b = fzoVar;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fzq) {
            fzq fzqVar = (fzq) obj;
            if (this.a == fzqVar.a && this.b.equals(fzqVar.b) && this.c == fzqVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true == this.c ? 1231 : 1237);
    }

    public final String toString() {
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        boolean z2 = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 89);
        sb.append("MySubsFilterBarModel{isFilterApplied=");
        sb.append(z);
        sb.append(", shownCallback=");
        sb.append(valueOf);
        sb.append(", isAccessibilityEnabled=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
