package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avp {
    public static final avp a = new avp(-1, -1, -1);
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public avp(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = pts.U(i3) ? pts.j(i3, i2) : -1;
    }

    public final String toString() {
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        StringBuilder sb = new StringBuilder(83);
        sb.append("AudioFormat[sampleRate=");
        sb.append(i);
        sb.append(", channelCount=");
        sb.append(i2);
        sb.append(", encoding=");
        sb.append(i3);
        sb.append(']');
        return sb.toString();
    }
}
