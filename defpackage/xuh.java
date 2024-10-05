package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xuh {
    public final Uri a;
    public final int b;
    public final Drawable c;
    public final argf d;
    public final int e;
    public final String f;

    public xuh() {
    }

    public xuh(Uri uri, int i, Drawable drawable, argf argfVar, int i2, String str) {
        this.a = uri;
        this.b = i;
        this.c = drawable;
        this.d = argfVar;
        this.e = i2;
        this.f = str;
    }

    public static xug a() {
        xug xugVar = new xug();
        xugVar.c(0);
        return xugVar;
    }

    public final xug b() {
        return new xug(this);
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        argf argfVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof xuh) {
            xuh xuhVar = (xuh) obj;
            if (this.a.equals(xuhVar.a) && this.b == xuhVar.b && ((drawable = this.c) != null ? drawable.equals(xuhVar.c) : xuhVar.c == null) && ((argfVar = this.d) != null ? argfVar.equals(xuhVar.d) : xuhVar.d == null) && this.e == xuhVar.e) {
                String str = this.f;
                String str2 = xuhVar.f;
                if (str != null ? str.equals(str2) : str2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003;
        Drawable drawable = this.c;
        int hashCode2 = (hashCode ^ (drawable == null ? 0 : drawable.hashCode())) * 1000003;
        argf argfVar = this.d;
        int hashCode3 = (((hashCode2 ^ (argfVar == null ? 0 : argfVar.hashCode())) * 1000003) ^ this.e) * 1000003;
        String str = this.f;
        return hashCode3 ^ (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        int i2 = this.e;
        String str = this.f;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 128 + length2 + String.valueOf(valueOf3).length() + String.valueOf(str).length());
        sb.append("PostCreationImage{uri=");
        sb.append(valueOf);
        sb.append(", rotationAngle=");
        sb.append(i);
        sb.append(", drawable=");
        sb.append(valueOf2);
        sb.append(", previewCoordinates=");
        sb.append(valueOf3);
        sb.append(", uploadingState=");
        sb.append(i2);
        sb.append(", encryptedBlobId=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
