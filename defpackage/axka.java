package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axka {
    public static final axka a = new axka();
    public final boolean b;
    public final String c;
    public final Integer d;
    public final Integer e;
    public final axiq f;
    public final boolean g;

    private axka() {
        this.b = false;
        this.c = "";
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = false;
    }

    public axka(String str, Integer num, Integer num2, axiq axiqVar, boolean z) {
        this.b = true;
        this.c = str;
        this.d = num;
        this.e = num2;
        this.f = axiqVar;
        this.g = z;
    }

    public final String toString() {
        String str;
        if (!this.b) {
            return "Unsupported codec";
        }
        Integer num = this.d;
        String str2 = "N/A";
        if (num != null) {
            String valueOf = String.valueOf(Integer.toHexString(num.intValue()));
            str = valueOf.length() != 0 ? "0x".concat(valueOf) : new String("0x");
        } else {
            str = "N/A";
        }
        Integer num2 = this.e;
        if (num2 != null) {
            String valueOf2 = String.valueOf(Integer.toHexString(num2.intValue()));
            str2 = valueOf2.length() != 0 ? "0x".concat(valueOf2) : new String("0x");
        }
        String str3 = this.c;
        boolean z = this.g;
        axin b = axin.b(this.f.e);
        if (b == null) {
            b = axin.NONE;
        }
        int i = b.d;
        axiq axiqVar = this.f;
        int i2 = axiqVar.f;
        int i3 = axiqVar.g;
        long j = axiqVar.h;
        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 245 + String.valueOf(str).length() + String.valueOf(str2).length());
        sb.append(str3);
        sb.append(" Surface color format: ");
        sb.append(str);
        sb.append(" YUV color format: ");
        sb.append(str2);
        sb.append(" isH264HighProfileSupported: ");
        sb.append(z);
        sb.append(" bitrateAdjusterType ");
        sb.append(i);
        sb.append(" periodicKeyframeIntervalSec ");
        sb.append(i2);
        sb.append(" forcedKeyframeIntervalSec ");
        sb.append(i3);
        sb.append(" maxFrameGapBeforeRequestingKeyframeNs ");
        sb.append(j);
        return sb.toString();
    }
}
