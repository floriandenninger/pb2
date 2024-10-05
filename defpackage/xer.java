package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xer implements xgx {
    public final String a;
    public final xgu b;
    private final String c;
    private final apah d;

    public xer(String str, apah apahVar, String str2, xgu xguVar) {
        if (str == null) {
            throw new NullPointerException("Null getTriggerId");
        }
        this.c = str;
        if (apahVar != null) {
            this.d = apahVar;
            if (str2 != null) {
                this.a = str2;
                this.b = xguVar;
                return;
            }
            throw new NullPointerException("Null getActivatingMediaLayoutId");
        }
        throw new NullPointerException("Null getTriggerType");
    }

    @Override // defpackage.xgx
    public final apah b() {
        return this.d;
    }

    @Override // defpackage.xgx
    public final String c() {
        return this.c;
    }

    @Override // defpackage.xgx
    public final boolean d() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xer) {
            xer xerVar = (xer) obj;
            if (this.c.equals(xerVar.c) && this.d.equals(xerVar.d) && this.a.equals(xerVar.a) && this.b.equals(xerVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 1237) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ 1231) * 1000003) ^ 1231;
    }

    public final String toString() {
        String str = this.c;
        String valueOf = String.valueOf(this.d);
        String str2 = this.a;
        String valueOf2 = String.valueOf(this.b);
        int length = str.length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 236 + length2 + str2.length() + String.valueOf(valueOf2).length());
        sb.append("InMediaTimeRangeAndSlotFulfilledNonEmptyTrigger{getTriggerId=");
        sb.append(str);
        sb.append(", getTriggerType=");
        sb.append(valueOf);
        sb.append(", shouldOnlyTriggerOnce=false, getActivatingMediaLayoutId=");
        sb.append(str2);
        sb.append(", getTimeRange=");
        sb.append(valueOf2);
        sb.append(", shouldPreventActivationOnTriggerRegistration=true, getSlotMustBeFilledFirst=true}");
        return sb.toString();
    }

    public xer() {
    }
}
