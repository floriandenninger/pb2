package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aief {
    public final Bitmap a;
    private final Rect b;

    public aief() {
    }

    public aief(Bitmap bitmap, Rect rect) {
        this.a = bitmap;
        this.b = rect;
    }

    public static aief a(Bitmap bitmap) {
        return new aief(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aief) {
            aief aiefVar = (aief) obj;
            if (this.a.equals(aiefVar.a) && this.b.equals(aiefVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31 + String.valueOf(valueOf2).length());
        sb.append("StoryboardFrame{mosaic=");
        sb.append(valueOf);
        sb.append(", rect=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
