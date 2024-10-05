package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amct {
    public final Class a;
    public final byo b;
    public final ammv c;
    public final amcr d;
    public final byr e;
    public final ammv f;
    public final ammv g;
    public final amsx h;

    public amct() {
    }

    public amct(Class cls, byo byoVar, ammv ammvVar, amcr amcrVar, byr byrVar, ammv ammvVar2, ammv ammvVar3, amsx amsxVar) {
        this.a = cls;
        this.b = byoVar;
        this.c = ammvVar;
        this.d = amcrVar;
        this.e = byrVar;
        this.f = ammvVar2;
        this.g = ammvVar3;
        this.h = amsxVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amct) {
            amct amctVar = (amct) obj;
            if (this.a.equals(amctVar.a) && this.b.equals(amctVar.b) && this.c.equals(amctVar.c) && this.d.equals(amctVar.d) && this.e.equals(amctVar.e) && this.f.equals(amctVar.f) && this.g.equals(amctVar.g) && this.h.equals(amctVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String valueOf7 = String.valueOf(this.g);
        String valueOf8 = String.valueOf(this.h);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        StringBuilder sb = new StringBuilder(length + 108 + length2 + length3 + length4 + length5 + length6 + String.valueOf(valueOf7).length() + String.valueOf(valueOf8).length());
        sb.append("TikTokWorkSpec{workerClass=");
        sb.append(valueOf);
        sb.append(", constraints=");
        sb.append(valueOf2);
        sb.append(", expedited=");
        sb.append(valueOf3);
        sb.append(", initialDelay=");
        sb.append(valueOf4);
        sb.append(", inputData=");
        sb.append(valueOf5);
        sb.append(", periodic=");
        sb.append(valueOf6);
        sb.append(", unique=");
        sb.append(valueOf7);
        sb.append(", tags=");
        sb.append(valueOf8);
        sb.append("}");
        return sb.toString();
    }
}
