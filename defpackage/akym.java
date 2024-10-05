package defpackage;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Environment;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akym extends akye {
    private static final akyr b = akyr.a(2);
    private final BroadcastReceiver c;
    private final Application d;

    public akym(Context context) {
        super(2);
        this.c = new akyl(this);
        this.d = (Application) context.getApplicationContext();
    }

    @Override // defpackage.akye
    protected final void e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addDataScheme("file");
        this.d.registerReceiver(this.c, intentFilter);
    }

    @Override // defpackage.akye
    protected final void f() {
        this.d.unregisterReceiver(this.c);
    }

    @Override // defpackage.akyq
    public final akyr g() {
        String externalStorageState = Environment.getExternalStorageState();
        if (!"mounted".equals(externalStorageState) && !"mounted_ro".equals(externalStorageState)) {
            return b;
        }
        return akyr.a;
    }
}
