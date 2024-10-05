package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abzq {
    final boolean a;
    final int d;
    int b = 44100;
    int c = 1;
    boolean e = false;

    public abzq(int i, boolean z) {
        this.d = i;
        this.a = z;
    }

    public final String toString() {
        boolean z = this.a;
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        boolean z2 = this.e;
        StringBuilder sb = new StringBuilder(114);
        sb.append("[ specifyProfile=");
        sb.append(z);
        sb.append(", sampleRate=");
        sb.append(i);
        sb.append(", channelCount=");
        sb.append(i2);
        sb.append(", bitrate=");
        sb.append(i3);
        sb.append(", isSupported=");
        sb.append(z2);
        sb.append(" ]");
        return sb.toString();
    }
}
