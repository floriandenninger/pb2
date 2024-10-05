package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fhn extends BroadcastReceiver {
    public final azrw a;
    public final azrw b;
    public final shf c;
    private final azrl d = azrl.e();
    private final AtomicBoolean e = new AtomicBoolean(false);
    private final ayra f = new ayra();

    public fhn(azrw azrwVar, azrw azrwVar2, shf shfVar) {
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = shfVar;
    }

    public final void a(Context context) {
        if (Build.VERSION.SDK_INT >= 23 && !this.e.getAndSet(true)) {
            context.registerReceiver(this, new IntentFilter("android.os.action.DEVICE_IDLE_MODE_CHANGED"));
            this.f.a(this.d.B().w(1000L, TimeUnit.MILLISECONDS).ab(azre.c()).ax(new ayrs() { // from class: fhm
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    fhn fhnVar = fhn.this;
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    aaea aaeaVar = (aaea) fhnVar.a.get();
                    atoc b = afze.b(aaeaVar);
                    boolean z = false;
                    int i = b != null ? b.n : 0;
                    atoc b2 = afze.b(aaeaVar);
                    boolean z2 = b2 != null && b2.p;
                    atoc b3 = afze.b(aaeaVar);
                    if (b3 != null && b3.o) {
                        z = true;
                    }
                    if (booleanValue) {
                        if (!z2) {
                            return;
                        }
                    } else if (!z) {
                        return;
                    }
                    afze.e(aaeaVar, (ylf) fhnVar.b.get(), fhnVar.c, i, true);
                }
            }));
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if ("android.os.action.DEVICE_IDLE_MODE_CHANGED".equals(intent.getAction())) {
            this.d.c(Boolean.valueOf(powerManager.isDeviceIdleMode()));
        }
    }
}
