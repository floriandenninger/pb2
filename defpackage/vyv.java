package defpackage;

import android.os.Handler;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vyv {
    public vtf a;
    public vsr b;
    public final hfu c;
    public final hfu d;
    private final Handler e;

    public vyv(hfu hfuVar, hfu hfuVar2, Handler handler, byte[] bArr) {
        this.c = hfuVar;
        this.d = hfuVar2;
        this.e = handler;
    }

    public final void a() {
        final vsr vsrVar = this.b;
        if (vsrVar != null) {
            this.e.post(new Runnable() { // from class: vyu
                @Override // java.lang.Runnable
                public final void run() {
                    vsu vsuVar = ((vsw) vsr.this).d;
                    if (vsuVar != null) {
                        vsuVar.aq(new CancellationException("Decoder cancel requested"));
                    }
                }
            });
        }
    }

    public final void b(Exception exc) {
        String valueOf = String.valueOf(exc);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
        sb.append("onEncodeError: ");
        sb.append(valueOf);
        vtv.e(sb.toString());
        if (this.b == null) {
            this.d.a(new IllegalStateException("Encode error with uninitialized Listener", exc));
        } else {
            a();
            this.d.a(exc);
        }
    }
}
