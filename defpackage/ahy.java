package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahy extends aie {
    boolean a;
    boolean b;
    private final Context f;
    private final PowerManager.WakeLock g;
    private final PowerManager.WakeLock h;

    public ahy(Context context, ComponentName componentName) {
        super(componentName);
        this.f = context.getApplicationContext();
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
        this.g = newWakeLock;
        newWakeLock.setReferenceCounted(false);
        PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
        this.h = newWakeLock2;
        newWakeLock2.setReferenceCounted(false);
    }

    @Override // defpackage.aie
    public final void a(Intent intent) {
        Intent intent2 = new Intent(intent);
        intent2.setComponent(this.c);
        if (this.f.startService(intent2) != null) {
            synchronized (this) {
                if (!this.a) {
                    this.a = true;
                    if (!this.b) {
                        this.g.acquire(60000L);
                    }
                }
            }
        }
    }

    @Override // defpackage.aie
    public final void b() {
        synchronized (this) {
            if (this.b) {
                if (this.a) {
                    this.g.acquire(60000L);
                }
                this.b = false;
                this.h.release();
            }
        }
    }

    @Override // defpackage.aie
    public final void c() {
        synchronized (this) {
            if (!this.b) {
                this.b = true;
                this.h.acquire(600000L);
                this.g.release();
            }
        }
    }

    @Override // defpackage.aie
    public final void d() {
        synchronized (this) {
            this.a = false;
        }
    }
}
