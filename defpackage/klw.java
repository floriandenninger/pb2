package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class klw {
    public final kmb a;
    public final boolean b;

    public klw() {
    }

    public klw(kmb kmbVar, boolean z) {
        this.a = kmbVar;
        this.b = z;
    }

    public static klw a(kmb kmbVar, boolean z) {
        return new klw(kmbVar, z);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof klw) {
            klw klwVar = (klw) obj;
            if (this.a.equals(klwVar.a) && this.b == klwVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
        sb.append("ResultState{midUiModel=");
        sb.append(valueOf);
        sb.append(", shouldAnimate=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
