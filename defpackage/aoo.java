package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aoo extends Service implements aok {
    private final apl a = new apl(this);

    @Override // defpackage.aok
    public final aof getLifecycle() {
        return this.a.a;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        this.a.a(aod.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.a.a(aod.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        apl aplVar = this.a;
        aplVar.a(aod.ON_STOP);
        aplVar.a(aod.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        this.a.a(aod.ON_START);
        super.onStart(intent, i);
    }
}
