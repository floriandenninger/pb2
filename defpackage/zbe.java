package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zbe {
    public final Rect a;
    public final zat b;
    public final Rect c;
    public final Rect d;

    public zbe(Rect rect, zat zatVar, Rect rect2, Rect rect3) {
        this.a = rect;
        this.b = zatVar;
        if (rect2 == null) {
            throw new NullPointerException("Null mandatorySystemGestureInsets");
        }
        this.c = rect2;
        if (rect3 != null) {
            this.d = rect3;
            return;
        }
        throw new NullPointerException("Null stableInsets");
    }

    public static zbe a(Rect rect, zat zatVar, Rect rect2, Rect rect3) {
        return new zbe(rect, zatVar, rect2, rect3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zbe) {
            zbe zbeVar = (zbe) obj;
            if (this.a.equals(zbeVar.a) && this.b.equals(zbeVar.b) && this.c.equals(zbeVar.c) && this.d.equals(zbeVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 89 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("Insets{systemWindowInsets=");
        sb.append(valueOf);
        sb.append(", displayCutout=");
        sb.append(valueOf2);
        sb.append(", mandatorySystemGestureInsets=");
        sb.append(valueOf3);
        sb.append(", stableInsets=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }

    public zbe() {
    }
}
