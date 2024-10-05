package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abzr {
    final boolean a;
    final int b;
    final int c;
    final int d;
    final int e;
    final int f;
    boolean g = false;

    public abzr(int i, int i2, int i3, int i4, boolean z) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i4;
        this.a = z;
    }

    public final String toString() {
        boolean z = this.a;
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        int i4 = this.e;
        int i5 = this.f;
        boolean z2 = this.g;
        StringBuilder sb = new StringBuilder(151);
        sb.append("[ specifyProfile=");
        sb.append(z);
        sb.append(", width=");
        sb.append(i);
        sb.append(", height=");
        sb.append(i2);
        sb.append(", minBitrate=");
        sb.append(i3);
        sb.append(", bitrate=");
        sb.append(i4);
        sb.append(", maxBitrate=");
        sb.append(i5);
        sb.append(", isSupported=");
        sb.append(z2);
        sb.append(" ]");
        return sb.toString();
    }
}
