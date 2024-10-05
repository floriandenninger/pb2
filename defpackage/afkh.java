package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afkh {
    private final int a;
    private final int b;
    private final int c;
    private final int d;

    static {
        new afkh(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
    }

    public afkh(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static boolean a(FormatStreamModel formatStreamModel, afkh afkhVar) {
        int d = formatStreamModel.d();
        int i = formatStreamModel.i();
        int i2 = afkhVar.a;
        return i2 <= d && d <= afkhVar.b && i2 <= i && i <= afkhVar.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof afkh)) {
            return false;
        }
        afkh afkhVar = (afkh) obj;
        return this.a == afkhVar.a && this.b == afkhVar.b && this.c == afkhVar.c && this.d == afkhVar.d;
    }

    public final int hashCode() {
        return (((((((this.a * 101) + 5363) * 31) + (this.b * 103)) * 31) + (this.c * 107)) * 31) + (this.d * 109);
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        StringBuilder sb = new StringBuilder(67);
        sb.append("minh.");
        sb.append(i);
        sb.append(";maxh.");
        sb.append(i2);
        sb.append(";minw.");
        sb.append(i3);
        sb.append(";maxw.");
        sb.append(i4);
        return sb.toString();
    }
}
