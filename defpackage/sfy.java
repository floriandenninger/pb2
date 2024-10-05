package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sfy {
    public final ammv a;
    public final ammv b;
    public final ammv c;
    public final ammv d;
    public final ammv e;
    public final int f;
    public final ammv g;
    public final ammv h;

    public sfy() {
    }

    public sfy(ammv ammvVar, ammv ammvVar2, ammv ammvVar3, ammv ammvVar4, ammv ammvVar5, int i, ammv ammvVar6, ammv ammvVar7) {
        this.a = ammvVar;
        this.b = ammvVar2;
        this.c = ammvVar3;
        this.d = ammvVar4;
        this.e = ammvVar5;
        this.f = i;
        this.g = ammvVar6;
        this.h = ammvVar7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sfy) {
            sfy sfyVar = (sfy) obj;
            if (this.a.equals(sfyVar.a) && this.b.equals(sfyVar.b) && this.c.equals(sfyVar.c) && this.d.equals(sfyVar.d) && this.e.equals(sfyVar.e) && this.f == sfyVar.f && this.g.equals(sfyVar.g) && this.h.equals(sfyVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.f) * 1000003) ^ 2040732332) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        int i = this.f;
        String valueOf6 = String.valueOf(this.g);
        String valueOf7 = String.valueOf(this.h);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        StringBuilder sb = new StringBuilder(length + 179 + length2 + length3 + length4 + length5 + String.valueOf(valueOf6).length() + String.valueOf(valueOf7).length());
        sb.append("StartupConfigs{queryString=");
        sb.append(valueOf);
        sb.append(", proactiveModeEnabled=");
        sb.append(valueOf2);
        sb.append(", suppressTtsForTextQueries=");
        sb.append(valueOf3);
        sb.append(", clientInput=");
        sb.append(valueOf4);
        sb.append(", customizedSource=");
        sb.append(valueOf5);
        sb.append(", inputModality=");
        sb.append(i);
        sb.append(", expandToFullScreen=");
        sb.append(valueOf6);
        sb.append(", micClickedTimeNs=");
        sb.append(valueOf7);
        sb.append("}");
        return sb.toString();
    }
}
