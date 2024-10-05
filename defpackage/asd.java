package defpackage;

import android.media.AudioAttributes;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asd implements plg {
    public static final asd a = new asc().a();
    public final int b;
    public final int c;
    private AudioAttributes d;

    public asd(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public final AudioAttributes a() {
        if (this.d == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.b).setFlags(0).setUsage(this.c);
            if (pts.a >= 29) {
                usage.setAllowedCapturePolicy(1);
            }
            this.d = usage.build();
        }
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            asd asdVar = (asd) obj;
            if (this.b == asdVar.b && this.c == asdVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b + 527) * 961) + this.c) * 31) + 1;
    }
}
