package defpackage;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public abstract class aif extends Service {
    static final Object a = new Object();
    static final HashMap b = new HashMap();
    aie c;
    ahx d;
    boolean e = false;
    final ArrayList f;
    aic g;

    public aif() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f = null;
        } else {
            this.f = new ArrayList();
        }
    }

    static aie a(Context context, ComponentName componentName, boolean z, int i) {
        aie ahyVar;
        HashMap hashMap = b;
        aie aieVar = (aie) hashMap.get(componentName);
        if (aieVar != null) {
            return aieVar;
        }
        if (Build.VERSION.SDK_INT < 26) {
            ahyVar = new ahy(context, componentName);
        } else {
            if (!z) {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            ahyVar = new aid(context, componentName, i);
        }
        aie aieVar2 = ahyVar;
        hashMap.put(componentName, aieVar2);
        return aieVar2;
    }

    public static void d(Context context, Class cls, Intent intent) {
        ComponentName componentName = new ComponentName(context, (Class<?>) cls);
        synchronized (a) {
            aie a2 = a(context, componentName, true, 1000);
            a2.e(1000);
            a2.a(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(boolean z) {
        if (this.d == null) {
            this.d = new ahx(this);
            aie aieVar = this.c;
            if (aieVar != null && z) {
                aieVar.c();
            }
            this.d.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        ArrayList arrayList = this.f;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.d = null;
                ArrayList arrayList2 = this.f;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    b(false);
                } else if (!this.e) {
                    this.c.b();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void e();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        aic aicVar = this.g;
        if (aicVar != null) {
            return aicVar.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.g = new aic(this);
            this.c = null;
        } else {
            this.g = null;
            this.c = a(this, new ComponentName(this, getClass()), false, 0);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.e = true;
                this.c.b();
            }
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (this.f == null) {
            return 2;
        }
        this.c.d();
        synchronized (this.f) {
            ArrayList arrayList = this.f;
            if (intent == null) {
                new Intent();
            }
            arrayList.add(new ahz(this, i2));
            b(true);
        }
        return 3;
    }
}
