package defpackage;

import android.os.Process;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class abzt implements Runnable {
    public final /* synthetic */ abzu a;
    private final /* synthetic */ int b;

    public /* synthetic */ abzt(abzu abzuVar, int i) {
        this.b = i;
        this.a = abzuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            this.a.i();
            return;
        }
        abzu abzuVar = this.a;
        try {
            Process.setThreadPriority(0);
            abzuVar.j();
        } catch (Throwable th) {
            try {
                if (!abzuVar.b) {
                    zga.f("ExternalAudioInput", "Unexpected throwable in audio main loop", th);
                    abzuVar.e = true;
                }
            } finally {
                abzuVar.c = true;
                abzuVar.a = null;
            }
        }
    }
}
