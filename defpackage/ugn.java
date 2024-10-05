package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ugn {
    public final Drawable a;
    public final String b;
    public final int c;
    public final View.OnClickListener d;
    private final int e;

    public ugn() {
    }

    public ugn(int i, Drawable drawable, String str, int i2, View.OnClickListener onClickListener) {
        this.e = i;
        this.a = drawable;
        this.b = str;
        this.c = i2;
        this.d = onClickListener;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ugn) {
            ugn ugnVar = (ugn) obj;
            if (this.e == ugnVar.e && this.a.equals(ugnVar.a) && this.b.equals(ugnVar.b) && this.c == ugnVar.c && this.d.equals(ugnVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.e ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        int i = this.e;
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        int i2 = this.c;
        String valueOf2 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 83 + String.valueOf(str).length() + String.valueOf(valueOf2).length());
        sb.append("SimpleActionSpec{id=");
        sb.append(i);
        sb.append(", icon=");
        sb.append(valueOf);
        sb.append(", label=");
        sb.append(str);
        sb.append(", veId=");
        sb.append(i2);
        sb.append(", onClickListener=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
