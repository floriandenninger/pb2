package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahat extends BroadcastReceiver {
    public boolean a;
    public final /* synthetic */ ahaw b;

    public ahat(ahaw ahawVar) {
        this.b = ahawVar;
    }

    public final void a() {
        if (this.a) {
            return;
        }
        this.b.a.registerReceiver(this, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
        this.a = true;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ahaw ahawVar = this.b;
        if (!ahawVar.i.a || ahawVar.h == null || ahawVar.b.m) {
            return;
        }
        aifo.a(aifn.AUDIOMANAGER, "AudioFocus Noisy", new Object[0]);
        this.b.f.c(new ahcp());
        this.b.h.a();
        ahau ahauVar = this.b.e;
        int i = ahau.e;
        ahauVar.a = false;
        ahauVar.b = false;
    }
}
