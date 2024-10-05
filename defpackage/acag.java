package defpackage;

import android.os.Process;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acag implements Runnable {
    final /* synthetic */ acai a;
    private final /* synthetic */ int b;

    public acag(acai acaiVar, int i) {
        this.b = i;
        this.a = acaiVar;
    }

    public /* synthetic */ acag(acai acaiVar, int i, byte[] bArr) {
        this.b = i;
        this.a = acaiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.k(18);
            return;
        }
        if (i != 1) {
            if (i == 2) {
                this.a.k(16);
                return;
            } else if (i == 3) {
                this.a.k(17);
                return;
            } else {
                this.a.j();
                return;
            }
        }
        acai acaiVar = this.a;
        try {
            Process.setThreadPriority(-2);
            acaiVar.i();
        } catch (Throwable th) {
            try {
                if (!acaiVar.b) {
                    Log.e("MicInput", "Unexpected throwable in mic main loop", th);
                    acaiVar.e = true;
                }
            } finally {
                acaiVar.c = true;
                acaiVar.a = null;
            }
        }
    }
}
