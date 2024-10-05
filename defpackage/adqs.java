package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adqs {
    public final adgf a;
    public final adgj b;
    public final adgg c;
    public final boolean d;
    public final adkt e;
    public final String f;

    public adqs() {
    }

    public adqs(adgf adgfVar, adgj adgjVar, adgg adggVar, boolean z, adkt adktVar, String str) {
        this.a = adgfVar;
        this.b = adgjVar;
        this.c = adggVar;
        this.d = z;
        this.e = adktVar;
        this.f = str;
    }

    public final boolean a() {
        return this.a != null;
    }

    public final boolean b() {
        return this.b != null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adqs) {
            adqs adqsVar = (adqs) obj;
            adgf adgfVar = this.a;
            if (adgfVar != null ? adgfVar.equals(adqsVar.a) : adqsVar.a == null) {
                adgj adgjVar = this.b;
                if (adgjVar != null ? adgjVar.equals(adqsVar.b) : adqsVar.b == null) {
                    adgg adggVar = this.c;
                    if (adggVar != null ? adggVar.equals(adqsVar.c) : adqsVar.c == null) {
                        if (this.d == adqsVar.d && this.e.equals(adqsVar.e) && this.f.equals(adqsVar.f)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        boolean z = this.d;
        String valueOf4 = String.valueOf(this.e);
        String str = this.f;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 106 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(str).length());
        sb.append("ConnectionProperties{method=");
        sb.append(valueOf);
        sb.append(", params=");
        sb.append(valueOf2);
        sb.append(", pairingInfo=");
        sb.append(valueOf3);
        sb.append(", userInitiated=");
        sb.append(z);
        sb.append(", loungeTokenProvider=");
        sb.append(valueOf4);
        sb.append(", magmaKey=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        adgf adgfVar = this.a;
        int hashCode = ((adgfVar == null ? 0 : adgfVar.hashCode()) ^ 1000003) * 1000003;
        adgj adgjVar = this.b;
        int hashCode2 = (hashCode ^ (adgjVar == null ? 0 : adgjVar.hashCode())) * 1000003;
        adgg adggVar = this.c;
        return ((((((hashCode2 ^ (adggVar != null ? adggVar.b : 0)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }
}
