package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xfl implements xgx {
    public final String a;
    public final boolean b;
    public final String c;
    public final xgu d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    private final apah h;

    public xfl(String str, apah apahVar, boolean z, String str2, xgu xguVar, boolean z2, boolean z3, boolean z4) {
        if (str == null) {
            throw new NullPointerException("Null getTriggerId");
        }
        this.a = str;
        if (apahVar != null) {
            this.h = apahVar;
            this.b = z;
            if (str2 != null) {
                this.c = str2;
                this.d = xguVar;
                this.e = z2;
                this.f = z3;
                this.g = z4;
                return;
            }
            throw new NullPointerException("Null getActivatingMediaLayoutId");
        }
        throw new NullPointerException("Null getTriggerType");
    }

    public static xfl a(String str, String str2, xgu xguVar, boolean z, boolean z2, boolean z3, boolean z4) {
        return new xfl(str, apah.TRIGGER_TYPE_MEDIA_TIME_RANGE, z, str2, xguVar, z2, z3, z4);
    }

    @Override // defpackage.xgx
    public final apah b() {
        return this.h;
    }

    @Override // defpackage.xgx
    public final String c() {
        return this.a;
    }

    @Override // defpackage.xgx
    public final boolean d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xfl) {
            xfl xflVar = (xfl) obj;
            if (this.a.equals(xflVar.a) && this.h.equals(xflVar.h) && this.b == xflVar.b && this.c.equals(xflVar.c) && this.d.equals(xflVar.d) && this.e == xflVar.e && this.f == xflVar.f && this.g == xflVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.h.hashCode()) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true == this.g ? 1231 : 1237);
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.h);
        boolean z = this.b;
        String str2 = this.c;
        String valueOf2 = String.valueOf(this.d);
        boolean z2 = this.e;
        boolean z3 = this.f;
        boolean z4 = this.g;
        int length = str.length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 262 + length2 + str2.length() + String.valueOf(valueOf2).length());
        sb.append("MediaTimeRangeTrigger{getTriggerId=");
        sb.append(str);
        sb.append(", getTriggerType=");
        sb.append(valueOf);
        sb.append(", shouldOnlyTriggerOnce=");
        sb.append(z);
        sb.append(", getActivatingMediaLayoutId=");
        sb.append(str2);
        sb.append(", getTimeRange=");
        sb.append(valueOf2);
        sb.append(", shouldPreventActivationOnTriggerRegistration=");
        sb.append(z2);
        sb.append(", shouldActivateOnVideoTimeEvent=");
        sb.append(z3);
        sb.append(", shouldAttachActiveViewDataOnActivation=");
        sb.append(z4);
        sb.append("}");
        return sb.toString();
    }

    public xfl() {
    }
}
