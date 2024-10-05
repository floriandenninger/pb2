package defpackage;

import android.graphics.Rect;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zat {
    public final amru a;
    private final Rect b;

    public zat(Rect rect, amru amruVar) {
        this.b = rect;
        if (amruVar == null) {
            throw new NullPointerException("Null boundingRects");
        }
        this.a = amruVar;
    }

    public static zat e(Rect rect, List list) {
        return new zat(rect, amru.o(list));
    }

    public static zat f() {
        return e(new Rect(), amru.q());
    }

    public final int a() {
        return this.b.bottom;
    }

    public final int b() {
        return this.b.left;
    }

    public final int c() {
        return this.b.right;
    }

    public final int d() {
        return this.b.top;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zat) {
            zat zatVar = (zat) obj;
            if (this.b.equals(zatVar.b) && amkq.aV(this.a, zatVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48 + String.valueOf(valueOf2).length());
        sb.append("DisplayCutoutCompat{safeInsets=");
        sb.append(valueOf);
        sb.append(", boundingRects=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public zat() {
    }
}
