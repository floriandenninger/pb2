package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xfo implements xew {
    public final String a;
    public final apae b;
    public final apac c;
    private final String d;
    private final apah e;

    public xfo(String str, apah apahVar, String str2, apae apaeVar, apac apacVar) {
        if (str == null) {
            throw new NullPointerException("Null getTriggerId");
        }
        this.d = str;
        if (apahVar != null) {
            this.e = apahVar;
            if (str2 != null) {
                this.a = str2;
                if (apaeVar != null) {
                    this.b = apaeVar;
                    if (apacVar != null) {
                        this.c = apacVar;
                        return;
                    }
                    throw new NullPointerException("Null getLayoutType");
                }
                throw new NullPointerException("Null getSlotType");
            }
            throw new NullPointerException("Null getNonMatchingLayoutId");
        }
        throw new NullPointerException("Null getTriggerType");
    }

    public static xfo e(String str, String str2, apae apaeVar, apac apacVar) {
        return new xfo(str, apah.TRIGGER_TYPE_ON_DIFFERENT_LAYOUT_ID_ENTERED, str2, apaeVar, apacVar);
    }

    @Override // defpackage.xew
    public final String a() {
        return this.a;
    }

    @Override // defpackage.xgx
    public final apah b() {
        return this.e;
    }

    @Override // defpackage.xgx
    public final String c() {
        return this.d;
    }

    @Override // defpackage.xgx
    public final boolean d() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xfo) {
            xfo xfoVar = (xfo) obj;
            if (this.d.equals(xfoVar.d) && this.e.equals(xfoVar.e) && this.a.equals(xfoVar.a) && this.b.equals(xfoVar.b) && this.c.equals(xfoVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.e.hashCode()) * 1000003) ^ 1237) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String str = this.d;
        String valueOf = String.valueOf(this.e);
        String str2 = this.a;
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = str.length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = str2.length();
        StringBuilder sb = new StringBuilder(length + 149 + length2 + length3 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("OnDifferentLayoutIdEnteredTrigger{getTriggerId=");
        sb.append(str);
        sb.append(", getTriggerType=");
        sb.append(valueOf);
        sb.append(", shouldOnlyTriggerOnce=false, getNonMatchingLayoutId=");
        sb.append(str2);
        sb.append(", getSlotType=");
        sb.append(valueOf2);
        sb.append(", getLayoutType=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }

    public xfo() {
    }
}
