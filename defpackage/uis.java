package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uis {
    public final ammv a;
    public final ammv b;
    public final ammv c;
    public final ammv d;
    public final ammv e;
    public final ammv f;
    public final boolean g;

    public uis() {
    }

    public uis(ammv ammvVar, ammv ammvVar2, ammv ammvVar3, ammv ammvVar4, ammv ammvVar5, ammv ammvVar6, boolean z) {
        this.a = ammvVar;
        this.b = ammvVar2;
        this.c = ammvVar3;
        this.d = ammvVar4;
        this.e = ammvVar5;
        this.f = ammvVar6;
        this.g = z;
    }

    public static uir a() {
        uir uirVar = new uir((byte[]) null);
        uirVar.b = ammv.j(new uit(new tyo(), null, null));
        uirVar.c = true;
        return uirVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uis) {
            uis uisVar = (uis) obj;
            if (this.a.equals(uisVar.a) && this.b.equals(uisVar.b) && this.c.equals(uisVar.c) && this.d.equals(uisVar.d) && this.e.equals(uisVar.e) && this.f.equals(uisVar.f) && this.g == uisVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.d.hashCode() ^ (-2127709203)) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ (true != this.g ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        boolean z = this.g;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 195 + length2 + length3 + length4 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("ExpressSignInFeatures{signInWithoutAccountFeature=");
        sb.append(valueOf);
        sb.append(", disclaimerFeature=");
        sb.append(valueOf2);
        sb.append(", scrimAlwaysShownFeature=");
        sb.append(valueOf3);
        sb.append(", customHeaderContentFeature=");
        sb.append(valueOf4);
        sb.append(", logoViewFeature=");
        sb.append(valueOf5);
        sb.append(", cancelableFeature=");
        sb.append(valueOf6);
        sb.append(", supportAccountSwitching=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
