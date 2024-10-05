package defpackage;

import com.google.android.exoplayer.ColorInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahlp {
    public final ColorInfo a;
    public final asf b;

    public ahlp(asf asfVar) {
        this.a = null;
        this.b = asfVar;
    }

    public ahlp(ColorInfo colorInfo) {
        this.a = colorInfo;
        this.b = null;
    }

    public final int a() {
        ColorInfo colorInfo = this.a;
        return colorInfo != null ? colorInfo.a : this.b.b;
    }

    public final int b() {
        ColorInfo colorInfo = this.a;
        return colorInfo != null ? colorInfo.c : this.b.d;
    }

    public final byte[] c() {
        ColorInfo colorInfo = this.a;
        return colorInfo != null ? colorInfo.d : this.b.e;
    }

    public final int hashCode() {
        ColorInfo colorInfo = this.a;
        return colorInfo != null ? colorInfo.hashCode() : this.b.hashCode();
    }

    public final String toString() {
        ColorInfo colorInfo = this.a;
        return colorInfo != null ? colorInfo.toString() : this.b.toString();
    }
}
