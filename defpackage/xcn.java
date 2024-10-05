package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xcn extends xfr {
    private final String a;
    private final apah b;
    private final String c;

    public xcn(String str, apah apahVar, String str2) {
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
            throw new NullPointerException("Null getMediaCpn");
        }
        throw new NullPointerException("Null getTriggerType");
    }

    @Override // defpackage.xfr
    public final String a() {
        return this.c;
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
        return true;
    }

    @Override // defpackage.xfv
    public final void e() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xfr) {
            xfr xfrVar = (xfr) obj;
            if (this.a.equals(xfrVar.c()) && this.b.equals(xfrVar.b())) {
                xfrVar.d();
                xfrVar.e();
                if (this.c.equals(xfrVar.a())) {
                    xfrVar.f();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.xfr
    public final void f() {
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ 1231) * 1000003) ^ 1237) * 1000003) ^ this.c.hashCode()) * 1000003) ^ 1231;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String str2 = this.c;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 181 + String.valueOf(valueOf).length() + str2.length());
        sb.append("OnMediaPlaybackErrorTrigger{getTriggerId=");
        sb.append(str);
        sb.append(", getTriggerType=");
        sb.append(valueOf);
        sb.append(", shouldOnlyTriggerOnce=true, shouldDisableIfVideoStartMuted=false, getMediaCpn=");
        sb.append(str2);
        sb.append(", getShouldOnlyTriggerForFatalError=true}");
        return sb.toString();
    }
}
