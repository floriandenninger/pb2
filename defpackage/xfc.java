package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xfc implements xgx {
    private final String a;
    private final apah b;
    private final String c;

    public xfc(String str, apah apahVar, String str2) {
        if (str == null) {
            throw new NullPointerException("Null getTriggerId");
        }
        this.a = str;
        if (apahVar != null) {
            this.b = apahVar;
            if (str2 != null) {
                this.c = str2;
                return;
            }
            throw new NullPointerException("Null getCuePointIdentifier");
        }
        throw new NullPointerException("Null getTriggerType");
    }

    @Override // defpackage.xgx
    public final apah b() {
        return this.b;
    }

    @Override // defpackage.xgx
    public final String c() {
        return this.a;
    }

    @Override // defpackage.xgx
    public final boolean d() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xfc) {
            xfc xfcVar = (xfc) obj;
            if (this.a.equals(xfcVar.a) && this.b.equals(xfcVar.b) && this.c.equals(xfcVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ 1237) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String str2 = this.c;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 112 + String.valueOf(valueOf).length() + str2.length());
        sb.append("LiveStreamBreakEndedTrigger{getTriggerId=");
        sb.append(str);
        sb.append(", getTriggerType=");
        sb.append(valueOf);
        sb.append(", shouldOnlyTriggerOnce=false, getCuePointIdentifier=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public xfc() {
    }
}
