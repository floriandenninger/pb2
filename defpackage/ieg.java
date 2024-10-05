package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ieg {
    public final boolean a;
    public final Rect b;

    public ieg(boolean z, Rect rect) {
        this.a = z;
        if (rect == null) {
            throw new NullPointerException("Null rect");
        }
        this.b = rect;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ieg) {
            ieg iegVar = (ieg) obj;
            if (this.a == iegVar.a && this.b.equals(iegVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 63);
        sb.append("ExperimentAndViewRectHolder{shortsOnTabletEnabled=");
        sb.append(z);
        sb.append(", rect=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public ieg() {
    }
}
