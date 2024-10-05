package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ainv extends BroadcastReceiver {
    public boolean a;
    final /* synthetic */ ainy b;
    private Handler c;

    public ainv(ainy ainyVar) {
        this.b = ainyVar;
    }

    public final void a() {
        if (aifk.e(this.b.i.a).N) {
            return;
        }
        if (this.c == null) {
            this.c = new Handler();
        }
        if (this.a) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        this.b.a.registerReceiver(this, intentFilter);
        this.a = true;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            if (this.b.s.h() || this.b.c.i().b <= 0) {
                return;
            }
            this.c.postDelayed(new Runnable() { // from class: ainu
                @Override // java.lang.Runnable
                public final void run() {
                    ainv ainvVar = ainv.this;
                    if (ainvVar.b.s.h()) {
                        return;
                    }
                    ainvVar.b.r();
                }
            }, 180000L);
            return;
        }
        this.c.removeCallbacksAndMessages(null);
    }
}
