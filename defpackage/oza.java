package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.WindowManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oza {
    public final WindowManager a;
    public final oyz b;
    public final oyy c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public boolean i;
    public long j;
    public long k;
    public long l;

    public oza() {
        this(null);
    }

    public final void a() {
        Display defaultDisplay = this.a.getDefaultDisplay();
        if (defaultDisplay != null) {
            double refreshRate = defaultDisplay.getRefreshRate();
            Double.isNaN(refreshRate);
            long j = (long) (1.0E9d / refreshRate);
            this.d = j;
            this.e = (j * 80) / 100;
        }
    }

    public final boolean b(long j, long j2) {
        return Math.abs((j2 - this.j) - (j - this.k)) > 20000000;
    }

    public oza(Context context) {
        DisplayManager displayManager;
        oyy oyyVar = null;
        if (context != null) {
            context = context.getApplicationContext();
            this.a = (WindowManager) context.getSystemService("window");
        } else {
            this.a = null;
        }
        if (this.a != null) {
            if (pgz.a >= 17 && (displayManager = (DisplayManager) context.getSystemService("display")) != null) {
                oyyVar = new oyy(this, displayManager);
            }
            this.c = oyyVar;
            this.b = oyz.a;
        } else {
            this.c = null;
            this.b = null;
        }
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
    }
}
