package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class upk {
    public final String a;
    public final boolean b;
    public final bact c;
    public final babg d;
    public final String e;
    public final Long f;
    public final boolean g;
    public final unw h;

    public upk() {
    }

    public upk(String str, boolean z, bact bactVar, babg babgVar, String str2, Long l, boolean z2, unw unwVar) {
        this.a = str;
        this.b = z;
        this.c = bactVar;
        this.d = babgVar;
        this.e = str2;
        this.f = l;
        this.g = z2;
        this.h = unwVar;
    }

    public static upj a() {
        upj upjVar = new upj();
        upjVar.b(false);
        upjVar.c(false);
        return upjVar;
    }

    public final boolean equals(Object obj) {
        babg babgVar;
        String str;
        Long l;
        if (obj == this) {
            return true;
        }
        if (obj instanceof upk) {
            upk upkVar = (upk) obj;
            String str2 = this.a;
            if (str2 != null ? str2.equals(upkVar.a) : upkVar.a == null) {
                if (this.b == upkVar.b && this.c.equals(upkVar.c) && ((babgVar = this.d) != null ? babgVar.equals(upkVar.d) : upkVar.d == null) && ((str = this.e) != null ? str.equals(upkVar.e) : upkVar.e == null) && ((l = this.f) != null ? l.equals(upkVar.f) : upkVar.f == null) && this.g == upkVar.g) {
                    unw unwVar = this.h;
                    unw unwVar2 = upkVar.h;
                    if (unwVar != null ? unwVar.equals(unwVar2) : unwVar2 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        String str = this.a;
        boolean z = this.b;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String str2 = this.e;
        String valueOf3 = String.valueOf(this.f);
        boolean z2 = this.g;
        String valueOf4 = String.valueOf(this.h);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 161 + length2 + length3 + length4 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("Metric{customEventName=");
        sb.append(str);
        sb.append(", isEventNameConstant=");
        sb.append(z);
        sb.append(", metric=");
        sb.append(valueOf);
        sb.append(", metricExtension=");
        sb.append(valueOf2);
        sb.append(", accountableComponentName=");
        sb.append(str2);
        sb.append(", sampleRatePermille=");
        sb.append(valueOf3);
        sb.append(", isUnsampled=");
        sb.append(z2);
        sb.append(", debugLogsTime=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = ((((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode()) * 1000003;
        babg babgVar = this.d;
        int hashCode2 = (hashCode ^ (babgVar == null ? 0 : babgVar.hashCode())) * 1000003;
        String str2 = this.e;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Long l = this.f;
        int hashCode4 = (((hashCode3 ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (true == this.g ? 1231 : 1237)) * 1000003;
        unw unwVar = this.h;
        return hashCode4 ^ (unwVar != null ? unwVar.hashCode() : 0);
    }
}
