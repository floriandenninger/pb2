package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acvl {
    private static final int e = (int) TimeUnit.HOURS.toSeconds(1);
    private static final int f = (int) TimeUnit.MINUTES.toSeconds(5);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;

    public acvl() {
    }

    public acvl(boolean z, int i, int i2, int i3) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public static acvk a() {
        acvk acvkVar = new acvk();
        acvkVar.c(10);
        acvkVar.e(e);
        acvkVar.d(f);
        acvkVar.b(false);
        return acvkVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof acvl) {
            acvl acvlVar = (acvl) obj;
            if (this.a == acvlVar.a && this.b == acvlVar.b && this.c == acvlVar.c && this.d == acvlVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d;
    }

    public final String toString() {
        boolean z = this.a;
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        StringBuilder sb = new StringBuilder(165);
        sb.append("MdxBackgroundScanConfig{enabled=");
        sb.append(z);
        sb.append(", scanDurationSeconds=");
        sb.append(i);
        sb.append(", scanPeriodNoDevicesDetectedSeconds=");
        sb.append(i2);
        sb.append(", scanPeriodDevicesDetectedSeconds=");
        sb.append(i3);
        sb.append("}");
        return sb.toString();
    }
}
