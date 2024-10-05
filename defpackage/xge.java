package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xge implements xgx {
    public final String a;
    public final xgb b;
    private final apah c;

    public xge(String str, apah apahVar, xgb xgbVar) {
        if (str == null) {
            throw new NullPointerException("Null getTriggerId");
        }
        this.a = str;
        if (apahVar != null) {
            this.c = apahVar;
            if (xgbVar != null) {
                this.b = xgbVar;
                return;
            }
            throw new NullPointerException("Null getReelAdMetadata");
        }
        throw new NullPointerException("Null getTriggerType");
    }

    @Override // defpackage.xgx
    public final apah b() {
        return this.c;
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
        if (obj instanceof xge) {
            xge xgeVar = (xge) obj;
            if (this.a.equals(xgeVar.a) && this.c.equals(xgeVar.c) && this.b.equals(xgeVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ 1237) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.b);
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 122 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("SequenceItemInPlayerSpaceAvailableTrigger{getTriggerId=");
        sb.append(str);
        sb.append(", getTriggerType=");
        sb.append(valueOf);
        sb.append(", shouldOnlyTriggerOnce=false, getReelAdMetadata=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public xge() {
    }
}
