package defpackage;

import com.google.android.apps.youtube.embeddedplayer.service.model.a;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class opl {
    public final String a;
    public final int b;
    public final int c;

    public opl() {
    }

    public opl(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public static a a() {
        return new a();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof opl) {
            opl oplVar = (opl) obj;
            if (this.a.equals(oplVar.a) && this.b == oplVar.b && this.c == oplVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        int i2 = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 78);
        sb.append("PaneCorrelation{pivotIdentifier=");
        sb.append(str);
        sb.append(", tabIndex=");
        sb.append(i);
        sb.append(", paneIndex=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
