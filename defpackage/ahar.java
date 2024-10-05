package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahar extends BroadcastReceiver {
    boolean a;
    private final Context b;
    private aifs c;

    public ahar(Context context) {
        context.getClass();
        this.b = context;
    }

    public final synchronized void a(aifs aifsVar) {
        aifsVar.getClass();
        this.c = aifsVar;
        if (this.a) {
            return;
        }
        this.b.registerReceiver(this, new IntentFilter("android.intent.action.HEADSET_PLUG"));
        this.a = true;
    }

    public final synchronized void b() {
        if (this.a) {
            try {
                this.b.unregisterReceiver(this);
            } catch (IllegalArgumentException unused) {
                Log.w("HeadsetPlugReceiver", "Receiver already unregistered");
            }
            this.a = false;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        aige aigeVar;
        if (this.c != null && intent.hasExtra("state")) {
            boolean z = intent.getIntExtra("state", 1) == 1;
            aifs aifsVar = this.c;
            if (z != aifsVar.p) {
                aifsVar.p = z;
                if (z) {
                    aigeVar = new aige(3, 5);
                } else {
                    aigeVar = new aige();
                }
                aifsVar.o(aigeVar);
            }
        }
    }
}
