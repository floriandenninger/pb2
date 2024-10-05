package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xgn implements xgi {
    public final String a;
    private final String b;
    private final apah c;

    public xgn(String str, apah apahVar, String str2) {
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
            throw new NullPointerException("Null getTriggeringSlotId");
        }
        throw new NullPointerException("Null getTriggerType");
    }

    public static xgn a(String str, String str2) {
        return new xgn(str, apah.TRIGGER_TYPE_SLOT_ID_SCHEDULED, str2);
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

    @Override // defpackage.xgi
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xgn) {
            xgn xgnVar = (xgn) obj;
            if (this.b.equals(xgnVar.b) && this.c.equals(xgnVar.c) && this.a.equals(xgnVar.a)) {
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
        StringBuilder sb = new StringBuilder(length + 105 + String.valueOf(valueOf).length() + str2.length());
        sb.append("SlotIdScheduledTrigger{getTriggerId=");
        sb.append(str);
        sb.append(", getTriggerType=");
        sb.append(valueOf);
        sb.append(", shouldOnlyTriggerOnce=false, getTriggeringSlotId=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public xgn() {
    }
}
