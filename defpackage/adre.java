package defpackage;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adre implements adqo {
    public adqo a = null;
    public final BlockingQueue b = new LinkedBlockingQueue();

    @Override // defpackage.adqo
    public final void b(adqz adqzVar) {
        adqo adqoVar = this.a;
        if (adqoVar != null) {
            adqoVar.b(adqzVar);
            return;
        }
        try {
            this.b.put(adqzVar);
        } catch (InterruptedException unused) {
            zga.c("MDX.transport", "Could not queue local transport message.");
        }
    }
}
