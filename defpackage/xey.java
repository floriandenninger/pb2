package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xey implements xew {
    public final String a;
    public final int b;
    private final String c;
    private final apah d;

    public xey(String str, apah apahVar, String str2, int i) {
        if (str == null) {
            throw new NullPointerException("Null getTriggerId");
        }
        this.c = str;
        if (apahVar != null) {
            this.d = apahVar;
            if (str2 != null) {
                this.a = str2;
                this.b = i;
                return;
            }
            throw new NullPointerException("Null getTriggeringLayoutId");
        }
        throw new NullPointerException("Null getTriggerType");
    }

    public static xey e(String str, String str2, int i) {
        return new xey(str, apah.TRIGGER_TYPE_LAYOUT_EXITED_FOR_REASON, str2, i);
    }

    @Override // defpackage.xew
    public final String a() {
        return this.a;
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
        if (obj instanceof xey) {
            xey xeyVar = (xey) obj;
            if (this.c.equals(xeyVar.c) && this.d.equals(xeyVar.d) && this.a.equals(xeyVar.a) && this.b == xeyVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 1237) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b;
    }

    public final String toString() {
        String str = this.c;
        String valueOf = String.valueOf(this.d);
        String str2 = this.a;
        int i = this.b;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 146 + String.valueOf(valueOf).length() + str2.length());
        sb.append("LayoutExitedForReasonTrigger{getTriggerId=");
        sb.append(str);
        sb.append(", getTriggerType=");
        sb.append(valueOf);
        sb.append(", shouldOnlyTriggerOnce=false, getTriggeringLayoutId=");
        sb.append(str2);
        sb.append(", getLayoutExitReason=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }

    public xey() {
    }
}
