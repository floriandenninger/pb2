package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class syb {
    public final azrw a;
    public final String b;
    public final sxw c;
    public final syg d;
    public final boolean e;
    public final Object f;
    public final syp g;
    public final boolean h;

    public syb() {
    }

    public syb(azrw azrwVar, String str, sxw sxwVar, syg sygVar, boolean z, Object obj, syp sypVar, boolean z2) {
        this.a = azrwVar;
        this.b = str;
        this.c = sxwVar;
        this.d = sygVar;
        this.e = z;
        this.f = obj;
        this.g = sypVar;
        this.h = z2;
    }

    public static sya a(sxt sxtVar) {
        sxz sxzVar = new sxz(sxtVar);
        sya syaVar = new sya();
        syaVar.a = sxzVar;
        syaVar.b(true);
        syaVar.c = sxw.a;
        syaVar.g = true;
        syaVar.b = "Elements";
        return syaVar;
    }

    public final boolean equals(Object obj) {
        syg sygVar;
        Object obj2;
        syp sypVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof syb) {
            syb sybVar = (syb) obj;
            if (this.a.equals(sybVar.a) && this.b.equals(sybVar.b) && this.c.equals(sybVar.c) && ((sygVar = this.d) != null ? sygVar.equals(sybVar.d) : sybVar.d == null) && this.e == sybVar.e && ((obj2 = this.f) != null ? obj2.equals(sybVar.f) : sybVar.f == null) && ((sypVar = this.g) != null ? sypVar.equals(sybVar.g) : sybVar.g == null) && this.h == sybVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * (-721379959)) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        syg sygVar = this.d;
        int hashCode2 = (((hashCode ^ (sygVar == null ? 0 : sygVar.hashCode())) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003;
        Object obj = this.f;
        int hashCode3 = (hashCode2 ^ (obj == null ? 0 : obj.hashCode())) * 1000003;
        syp sypVar = this.g;
        return ((hashCode3 ^ (sypVar != null ? sypVar.hashCode() : 0)) * 1000003) ^ (true == this.h ? 1231 : 1237);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        boolean z = this.e;
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.g);
        boolean z2 = this.h;
        int length = String.valueOf(valueOf).length();
        int length2 = "null".length();
        int length3 = String.valueOf(str).length();
        int length4 = String.valueOf(valueOf2).length();
        int length5 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 193 + length2 + length3 + length4 + length5 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("ElementsConfig{converterProvider=");
        sb.append(valueOf);
        sb.append(", layoutExecutor=");
        sb.append("null");
        sb.append(", logTag=");
        sb.append(str);
        sb.append(", perfLoggerFactory=");
        sb.append(valueOf2);
        sb.append(", elementsInteractionLogger=");
        sb.append(valueOf3);
        sb.append(", useIncrementalMount=");
        sb.append(z);
        sb.append(", userData=");
        sb.append(valueOf4);
        sb.append(", recyclerConfig=");
        sb.append(valueOf5);
        sb.append(", nestedScrollingEnabled=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
