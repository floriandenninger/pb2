package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class huy {
    public final Context a;
    public final Handler b;
    public View c;
    public View d;
    public int e;
    public View f;
    final Runnable g = new Runnable() { // from class: huw
        @Override // java.lang.Runnable
        public final void run() {
            huy.this.a();
        }
    };

    public huy(Context context, Handler handler) {
        this.a = context;
        this.b = handler;
    }

    public final void a() {
        this.b.removeCallbacks(this.g);
        whu.I(this.c, false);
    }
}
