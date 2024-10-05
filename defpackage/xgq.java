package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xgq implements xew {
    public final String a;
    private final String b;
    private final apah c;

    public xgq(String str, apah apahVar, String str2) {
        if (str == null) {
            throw new NullPointerException("Null getTriggerId");
        }
        this.b = str;
        if (apahVar != null) {
            this.c = apahVar;
            if (str2 != null) {
                this.a = str2;
                return;
            }
            throw new NullPointerException("Null getLayoutId");
        }
        throw new NullPointerException("Null getTriggerType");
    }

    public static xgq e(String str, String str2) {
        return new xgq(str, apah.TRIGGER_TYPE_SURVEY_SUBMITTED, str2);
    }

    @Override // defpackage.xew
    public final String a() {
        return this.a;
    }

    @Override // defpackage.xgx
    public final apah b() {
        return this.c;
    }

    @Override // defpackage.xgx
    public final String c() {
        return this.b;
    }

    @Override // defpackage.xgx
    public final boolean d() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xgq) {
            xgq xgqVar = (xgq) obj;
            if (this.b.equals(xgqVar.b) && this.c.equals(xgqVar.c) && this.a.equals(xgqVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ 1237) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        String str = this.b;
        String valueOf = String.valueOf(this.c);
        String str2 = this.a;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 97 + String.valueOf(valueOf).length() + str2.length());
        sb.append("SurveySubmittedTrigger{getTriggerId=");
        sb.append(str);
        sb.append(", getTriggerType=");
        sb.append(valueOf);
        sb.append(", shouldOnlyTriggerOnce=false, getLayoutId=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public xgq() {
    }
}
