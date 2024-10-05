package defpackage;

import android.media.AudioManager;
import android.os.Handler;
import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pla implements AudioManager.OnAudioFocusChangeListener {
    final /* synthetic */ plc a;
    private final Handler b;

    public pla(plc plcVar, Handler handler) {
        this.a = plcVar;
        this.b = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i) {
        this.b.post(new Runnable() { // from class: pkz
            @Override // java.lang.Runnable
            public final void run() {
                pla plaVar = pla.this;
                int i2 = i;
                plc plcVar = plaVar.a;
                if (i2 == -3 || i2 == -2) {
                    if (i2 != -2) {
                        plcVar.c(3);
                        return;
                    } else {
                        plcVar.b(0);
                        plcVar.c(2);
                        return;
                    }
                }
                if (i2 == -1) {
                    plcVar.b(-1);
                    plcVar.a();
                } else if (i2 == 1) {
                    plcVar.c(1);
                    plcVar.b(1);
                } else {
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unknown focus change type: ");
                    sb.append(i2);
                    Log.w("AudioFocusManager", sb.toString());
                }
            }
        });
    }
}
