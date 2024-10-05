package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Bundle;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zfe {
    private static final IntentFilter g = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    public final BatteryManager a;
    public final shf b;
    public final aypy c;
    public long d;
    public int e;
    public boolean f;
    private final Context h;

    public zfe(Context context, ExecutorService executorService, shf shfVar) {
        context.getClass();
        this.h = context;
        shfVar.getClass();
        this.b = shfVar;
        this.a = (BatteryManager) context.getSystemService("batterymanager");
        executorService.getClass();
        ayqi b = azre.b(executorService);
        this.c = aypy.V(0L, 1L, TimeUnit.SECONDS, b).ab(b).O(new ayrv() { // from class: zfc
            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                final zfe zfeVar = zfe.this;
                final Long l = (Long) obj;
                return ayps.u(new Callable() { // from class: zfd
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        zfe zfeVar2 = zfe.this;
                        long longValue = l.longValue();
                        zfb zfbVar = null;
                        if (zfeVar2.a != null) {
                            long d = zfeVar2.b.d();
                            if (longValue > 0 && zfeVar2.f) {
                                zfbVar = new zfb(zfeVar2.e, d - zfeVar2.d);
                            }
                            zfeVar2.d = d;
                            if (zfeVar2.b()) {
                                zfeVar2.f = false;
                            } else {
                                zfeVar2.f = true;
                                zfeVar2.e = zfeVar2.a.getIntProperty(2);
                            }
                        }
                        return zfbVar;
                    }
                });
            }
        }).ae();
    }

    private final Bundle c() {
        Intent registerReceiver = this.h.registerReceiver(null, g);
        if (registerReceiver == null) {
            return new Bundle();
        }
        return registerReceiver.getExtras();
    }

    public final float a() {
        Bundle c = c();
        float f = c.getInt("level", -1);
        float f2 = c.getInt("scale", -1);
        if (f < 0.0f || f2 <= 0.0f) {
            return -1.0f;
        }
        return f / f2;
    }

    public final boolean b() {
        return c().getInt("plugged", 0) != 0;
    }
}
