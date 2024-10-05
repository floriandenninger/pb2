package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xgm implements xgi {
    private final String a;
    private final apah b;
    private final String c;

    public xgm(String str, apah apahVar, String str2) {
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
            throw new NullPointerException("Null getTriggeringSlotId");
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

    @Override // defpackage.xgi
    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xgm) {
            xgm xgmVar = (xgm) obj;
            if (this.a.equals(xgmVar.a) && this.b.equals(xgmVar.b) && this.c.equals(xgmVar.c)) {
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
        StringBuilder sb = new StringBuilder(length + 113 + String.valueOf(valueOf).length() + str2.length());
        sb.append("SlotIdFulfilledNonEmptyTrigger{getTriggerId=");
        sb.append(str);
        sb.append(", getTriggerType=");
        sb.append(valueOf);
        sb.append(", shouldOnlyTriggerOnce=false, getTriggeringSlotId=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public xgm() {
    }
}
