package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xez implements xew, xgi {
    public final String a;
    public final String b;
    private final String c;
    private final apah d;

    public xez(String str, apah apahVar, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null getTriggerId");
        }
        this.c = str;
        if (apahVar != null) {
            this.d = apahVar;
            this.a = str2;
            if (str3 != null) {
                this.b = str3;
                return;
            }
            throw new NullPointerException("Null getAssociatedSlotId");
        }
        throw new NullPointerException("Null getTriggerType");
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

    @Override // defpackage.xgi
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xez) {
            xez xezVar = (xez) obj;
            if (this.c.equals(xezVar.c) && this.d.equals(xezVar.d) && this.a.equals(xezVar.a) && this.b.equals(xezVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 1237) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.c;
        String valueOf = String.valueOf(this.d);
        String str2 = this.a;
        String str3 = this.b;
        int length = str.length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 142 + length2 + str2.length() + str3.length());
        sb.append("LayoutIdEnteredAndSlotFilledTrigger{getTriggerId=");
        sb.append(str);
        sb.append(", getTriggerType=");
        sb.append(valueOf);
        sb.append(", shouldOnlyTriggerOnce=false, getAssociatedLayoutId=");
        sb.append(str2);
        sb.append(", getAssociatedSlotId=");
        sb.append(str3);
        sb.append("}");
        return sb.toString();
    }

    public xez() {
    }
}
