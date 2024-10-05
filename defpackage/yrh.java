package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.telephony.TelephonyManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yrh {
    public final Context a;
    public final yrf b;
    public volatile boolean d;
    private final ynx e;
    private final Handler f;
    private int i;
    private final Runnable g = new Runnable() { // from class: yqz
        @Override // java.lang.Runnable
        public final void run() {
            yrh yrhVar = yrh.this;
            TelephonyManager telephonyManager = (TelephonyManager) yrhVar.a.getSystemService("phone");
            if (telephonyManager == null) {
                yrhVar.d = false;
            } else {
                yrhVar.b.b(telephonyManager);
            }
        }
    };
    private ammv h = amlr.a;
    public final azqw c = azqv.aq(false).av();

    public yrh(Context context, ynx ynxVar, Handler handler) {
        yrf yrcVar;
        this.a = context;
        this.e = ynxVar;
        this.f = handler;
        if (aij.f()) {
            yrcVar = new yre(this);
        } else {
            yrcVar = Build.VERSION.SDK_INT >= 29 ? new yrc(this) : new yra();
        }
        this.b = yrcVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final aypn a() {
        return this.c.y();
    }

    public final synchronized void b() {
        if (this.d) {
            return;
        }
        this.f.removeCallbacks(this.g);
        this.b.a();
        this.d = this.f.postDelayed(this.g, this.i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        return this.b.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d() {
        if (!this.h.h()) {
            if (Build.VERSION.SDK_INT < 29) {
                this.h = ammv.j(false);
            } else {
                this.i = this.e.d().q;
                this.h = ammv.j(Boolean.valueOf(this.e.d().p));
            }
        }
        return ((Boolean) this.h.c()).booleanValue();
    }
}
