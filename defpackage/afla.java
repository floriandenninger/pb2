package defpackage;

import android.content.Context;
import android.os.Looper;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class afla extends ViewGroup {
    private int WZ;

    public afla(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void M(Runnable runnable, Runnable runnable2, int i) {
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        if (i > 0) {
            postDelayed(runnable2, i);
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable2.run();
        } else {
            post(runnable2);
        }
    }

    public final void g(int i) {
        int i2 = i | this.WZ;
        this.WZ = i2;
        if (i2 != 0) {
            M(new afkz(this, 0), new afkz(this, 1), 0);
        }
    }

    public final void rE(int i) {
        int i2 = (i ^ (-1)) & this.WZ;
        this.WZ = i2;
        if (i2 == 0) {
            M(new afkz(this, 1), new afkz(this, 0), 0);
        }
    }
}
