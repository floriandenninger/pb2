package defpackage;

import com.google.cardboard.sdk.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xgf implements xgx {
    public final xgb a;
    private final String b;
    private final apah c;

    public xgf(String str, apah apahVar, xgb xgbVar) {
        if (str == null) {
            throw new NullPointerException("Null getTriggerId");
        }
        this.b = str;
        if (apahVar != null) {
            this.c = apahVar;
            if (xgbVar != null) {
                this.a = xgbVar;
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
        return this.b;
    }

    @Override // defpackage.xgx
    public final boolean d() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xgf) {
            xgf xgfVar = (xgf) obj;
            if (this.b.equals(xgfVar.b) && this.c.equals(xgfVar.c) && this.a.equals(xgfVar.a)) {
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
        String valueOf2 = String.valueOf(this.a);
        int length = str.length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_windowMinWidthMajor + length2 + String.valueOf(valueOf2).length());
        sb.append("SequenceItemInPlayerSpaceUnavailableTrigger{getTriggerId=");
        sb.append(str);
        sb.append(", getTriggerType=");
        sb.append(valueOf);
        sb.append(", shouldOnlyTriggerOnce=false, getReelAdMetadata=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public xgf() {
    }
}
