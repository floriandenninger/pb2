package defpackage;

import android.graphics.Rect;
import android.view.View;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class vo {
    protected final wd a;
    public int b = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
    final Rect c = new Rect();

    public vo(wd wdVar) {
        this.a = wdVar;
    }

    public static vo p(wd wdVar) {
        return new vm(wdVar);
    }

    public static vo q(wd wdVar, int i) {
        if (i != 0) {
            return r(wdVar);
        }
        return p(wdVar);
    }

    public static vo r(wd wdVar) {
        return new vn(wdVar);
    }

    public abstract int a(View view);

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l(View view);

    public abstract int m(View view);

    public abstract void n(int i);

    public final int o() {
        if (this.b == Integer.MIN_VALUE) {
            return 0;
        }
        return k() - this.b;
    }
}
