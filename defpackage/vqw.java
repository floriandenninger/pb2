package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vqw {
    public final vqv a;
    public final vqr b;
    public final boolean c;
    public final axpg d;
    public final int e;
    public final int f;
    public final vqu g;
    public final ammv h;

    public vqw() {
    }

    public vqw(vqv vqvVar, vqr vqrVar, boolean z, axpg axpgVar, int i, int i2, vqu vquVar, ammv ammvVar) {
        this.a = vqvVar;
        this.b = vqrVar;
        this.c = z;
        this.d = axpgVar;
        this.e = i;
        this.f = i2;
        this.g = vquVar;
        this.h = ammvVar;
    }

    public static vqt a() {
        vqt vqtVar = new vqt(null);
        vqtVar.a = true;
        return vqtVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vqw) {
            vqw vqwVar = (vqw) obj;
            if (this.a.equals(vqwVar.a) && this.b.equals(vqwVar.b) && this.c == vqwVar.c && this.d.equals(vqwVar.d) && this.e == vqwVar.e && this.f == vqwVar.f && this.g.equals(vqwVar.g) && this.h.equals(vqwVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        boolean z = this.c;
        String valueOf3 = String.valueOf(this.d);
        int i = this.e;
        int i2 = this.f;
        String valueOf4 = String.valueOf(this.g);
        String valueOf5 = String.valueOf(this.h);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 153 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("SuggestionTab{kind=");
        sb.append(valueOf);
        sb.append(", fragmentStartMode=");
        sb.append(valueOf2);
        sb.append(", enabled=");
        sb.append(z);
        sb.append(", fragmentLazy=");
        sb.append(valueOf3);
        sb.append(", tabNameRes=");
        sb.append(i);
        sb.append(", visualElementId=");
        sb.append(i2);
        sb.append(", iconApplier=");
        sb.append(valueOf4);
        sb.append(", onTabSelected=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
