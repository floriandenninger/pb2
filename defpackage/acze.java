package defpackage;

import java.io.IOException;
import java.net.MulticastSocket;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acze implements Runnable {
    final /* synthetic */ aczf a;

    public acze(aczf aczfVar) {
        this.a = aczfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ysu a = this.a.c.a();
        if (a == null) {
            afsi.b(2, 21, "failed to obtain a wifi network interface, not sending wol packet to device");
            return;
        }
        MulticastSocket a2 = ((aczc) this.a.d).a(a, null);
        if (a2 == null) {
            afsi.b(2, 21, "failed to create a multicast socket, not sending wol packet to device");
            return;
        }
        try {
            a2.send(this.a.g);
        } catch (IOException e) {
            zga.f(aczf.a, "Error sending Magic packet", e);
        } catch (NumberFormatException e2) {
            zga.f(aczf.a, String.format(Locale.US, "Error parsing mac address [%s]", this.a.e), e2);
        }
        if (this.a.h) {
            aczf aczfVar = this.a;
            aczfVar.f.postDelayed(this, aczfVar.b);
        }
    }
}
