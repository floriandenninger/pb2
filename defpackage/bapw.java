package defpackage;

import org.webrtc.Logging;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class bapw implements Runnable {
    public final /* synthetic */ baqb a;
    private final /* synthetic */ int b;

    public /* synthetic */ bapw(baqb baqbVar, int i) {
        this.b = i;
        this.a = baqbVar;
    }

    public bapw(baqb baqbVar, int i, byte[] bArr) {
        this.b = i;
        this.a = baqbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            baqb baqbVar = this.a;
            baqbVar.e = false;
            if (baqbVar.f) {
                baqbVar.a();
                return;
            } else {
                baqbVar.b();
                return;
            }
        }
        if (i == 1) {
            baqb baqbVar2 = this.a;
            baqbVar2.f = true;
            if (baqbVar2.e) {
                return;
            }
            baqbVar2.a();
            return;
        }
        if (i == 2) {
            baqb baqbVar3 = this.a;
            baqbVar3.c = null;
            baqbVar3.j = null;
            return;
        }
        String valueOf = String.valueOf(this.a.j);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("Setting listener to ");
        sb.append(valueOf);
        Logging.a("SurfaceTextureHelper", sb.toString());
        baqb baqbVar4 = this.a;
        baqbVar4.c = baqbVar4.j;
        baqbVar4.j = null;
        if (baqbVar4.d) {
            baqbVar4.c();
            this.a.d = false;
        }
    }
}
