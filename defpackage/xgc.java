package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xgc implements xgx {
    private final String a;
    private final apah b;

    public xgc(String str, apah apahVar) {
        if (str == null) {
            throw new NullPointerException("Null getTriggerId");
        }
        this.a = str;
        if (apahVar != null) {
            this.b = apahVar;
            return;
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
        if (obj instanceof xgc) {
            xgc xgcVar = (xgc) obj;
            if (this.a.equals(xgcVar.a) && this.b.equals(xgcVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ 1237;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(str.length() + 93 + String.valueOf(valueOf).length());
        sb.append("ReelItemSequenceAbandonedTrigger{getTriggerId=");
        sb.append(str);
        sb.append(", getTriggerType=");
        sb.append(valueOf);
        sb.append(", shouldOnlyTriggerOnce=false}");
        return sb.toString();
    }

    public xgc() {
    }
}
