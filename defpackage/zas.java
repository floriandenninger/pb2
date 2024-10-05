package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import org.chromium.net.NetError;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zas extends OrientationEventListener {
    public static final /* synthetic */ int b = 0;
    public boolean a;
    private final zaq c;
    private int d;

    public zas(Context context, WindowManager windowManager) {
        super(context, 3);
        this.d = -1;
        this.c = new zaq(context, windowManager);
    }

    public final void a(zar zarVar) {
        zaq zaqVar = this.c;
        zarVar.getClass();
        zaqVar.b.add(zarVar);
    }

    @Override // android.view.OrientationEventListener
    public final void disable() {
        super.disable();
        this.a = false;
        this.d = -1;
        zaq zaqVar = this.c;
        zaqVar.a.removeCallbacks(zaqVar);
        zaqVar.c = true;
        zaqVar.d = -1;
    }

    @Override // android.view.OrientationEventListener
    public final void enable() {
        this.a = true;
        super.enable();
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        int i2 = 0;
        if (!yjk.A(i + NetError.ERR_HTTP2_INADEQUATE_TRANSPORT_SECURITY, -20, 0) && !yjk.B(i, 0)) {
            i2 = yjk.B(i + (-90), -20) ? 1 : yjk.B(i + NetError.ERR_TLS13_DOWNGRADE_DETECTED, -20) ? 2 : yjk.B(i + (-270), -20) ? 3 : -1;
        }
        if (this.d == i2) {
            return;
        }
        this.d = i2;
        zaq zaqVar = this.c;
        if (i2 == -1) {
            return;
        }
        zaqVar.a.removeCallbacks(zaqVar);
        zaqVar.d = i2;
        zaqVar.a.postDelayed(zaqVar, true != zaqVar.c ? 200L : 0L);
    }

    @Deprecated
    public zas(Context context, WindowManager windowManager, zar zarVar) {
        this(context, windowManager);
        a(zarVar);
    }
}
