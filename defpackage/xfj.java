package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xfj implements xfv {
    public final boolean a;
    public final String b;
    private final String c;
    private final apah d;

    public xfj(String str, apah apahVar, boolean z, String str2) {
        if (str == null) {
            throw new NullPointerException("Null getTriggerId");
        }
        this.c = str;
        if (apahVar != null) {
            this.d = apahVar;
            this.a = z;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException("Null getMediaCpn");
        }
        throw new NullPointerException("Null getTriggerType");
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
        return true;
    }

    @Override // defpackage.xfv
    public final void e() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xfj) {
            xfj xfjVar = (xfj) obj;
            if (this.c.equals(xfjVar.c) && this.d.equals(xfjVar.d) && this.a == xfjVar.a && this.b.equals(xfjVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 1231) * 1000003) ^ (true != this.a ? 1237 : 1231)) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.c;
        String valueOf = String.valueOf(this.d);
        boolean z = this.a;
        String str2 = this.b;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 140 + String.valueOf(valueOf).length() + str2.length());
        sb.append("MediaPlaybackStartedTrigger{getTriggerId=");
        sb.append(str);
        sb.append(", getTriggerType=");
        sb.append(valueOf);
        sb.append(", shouldOnlyTriggerOnce=true, shouldDisableIfVideoStartMuted=");
        sb.append(z);
        sb.append(", getMediaCpn=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public xfj() {
    }
}
