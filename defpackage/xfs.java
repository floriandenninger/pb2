package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xfs implements xgx {
    public final String a;
    public final boolean b;
    private final String c;
    private final apah d;

    public xfs(String str, apah apahVar, String str2, boolean z) {
        if (str == null) {
            throw new NullPointerException("Null getTriggerId");
        }
        this.c = str;
        if (apahVar != null) {
            this.d = apahVar;
            if (str2 != null) {
                this.a = str2;
                this.b = z;
                return;
            }
            throw new NullPointerException("Null getContentVideoId");
        }
        throw new NullPointerException("Null getTriggerType");
    }

    public static xfs a(String str, String str2) {
        return new xfs(str, apah.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID, str2, false);
    }

    public static xfs e(String str, String str2) {
        return new xfs(str, apah.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID, str2, true);
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
        if (obj instanceof xfs) {
            xfs xfsVar = (xfs) obj;
            if (this.c.equals(xfsVar.c) && this.d.equals(xfsVar.d) && this.a.equals(xfsVar.a) && this.b == xfsVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 1237) * 1000003) ^ this.a.hashCode()) * 1000003) ^ (true == this.b ? 1231 : 1237);
    }

    public final String toString() {
        String str = this.c;
        String valueOf = String.valueOf(this.d);
        String str2 = this.a;
        boolean z = this.b;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 156 + String.valueOf(valueOf).length() + str2.length());
        sb.append("OnNewPlaybackAfterContentVideoIdTrigger{getTriggerId=");
        sb.append(str);
        sb.append(", getTriggerType=");
        sb.append(valueOf);
        sb.append(", shouldOnlyTriggerOnce=false, getContentVideoId=");
        sb.append(str2);
        sb.append(", onlyTriggersIfSlotNotEntered=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    public xfs() {
    }
}
