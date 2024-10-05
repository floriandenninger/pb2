package com.google.android.libraries.notifications.entrypoints.systemtray;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import defpackage.tyo;
import defpackage.tzb;
import defpackage.tzc;
import defpackage.tzk;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SystemTrayActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        tzc tzcVar;
        final Context applicationContext = getApplicationContext();
        final Intent intent = getIntent();
        if (intent == null) {
            tzk.b("SystemTrayActivity", "SystemTrayActivity received null intent", new Object[0]);
        } else {
            tzk.d("SystemTrayActivity", "Intent received for action [%s] package [%s].", intent.getAction(), intent.getPackage());
            try {
                tzcVar = tzb.a(getApplicationContext());
            } catch (IllegalStateException e) {
                tzk.f("SystemTrayActivity", e, "Chime component not initialized: Activity stopped.", new Object[0]);
                tzcVar = null;
            }
            if (tzcVar != null) {
                tyo.j(applicationContext);
                tzcVar.ke();
                super.onCreate(bundle);
                if (!intent.getBooleanExtra("com.google.android.libraries.notifications.HANDLE_IN_FOREGROUND", false)) {
                    Intent intent2 = new Intent(intent);
                    intent2.setFlags(268435456);
                    tzk.d("SystemTrayActivity", "Forwarding Intent from Activity to %s", SystemTrayBroadcastReceiver.class);
                    intent2.setClass(this, SystemTrayBroadcastReceiver.class);
                    sendBroadcast(intent2);
                } else {
                    tzb.a(applicationContext).aG().b(new Runnable() { // from class: tyk
                        @Override // java.lang.Runnable
                        public final void run() {
                            Context context = applicationContext;
                            Intent intent3 = intent;
                            int threadPriority = Process.getThreadPriority(0);
                            try {
                                Process.setThreadPriority(10);
                                tya tyaVar = (tya) tzb.a(context).im().get("systemtray");
                                if (tyaVar != null) {
                                    tyaVar.b(intent3, twd.b(), TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()));
                                }
                            } finally {
                                Process.setThreadPriority(threadPriority);
                            }
                        }
                    });
                }
            }
        }
        finish();
    }
}
