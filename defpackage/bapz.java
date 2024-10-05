package defpackage;

import android.os.Handler;
import java.util.concurrent.Callable;
import org.webrtc.Logging;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bapz implements Callable {
    final /* synthetic */ baog a;
    final /* synthetic */ Handler b;
    final /* synthetic */ bara c;
    final /* synthetic */ String d = "decoder-texture-thread";

    public bapz(baog baogVar, Handler handler, bara baraVar) {
        this.a = baogVar;
        this.b = handler;
        this.c = baraVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        try {
            return new baqb(this.a, this.b, this.c);
        } catch (RuntimeException e) {
            Logging.c("SurfaceTextureHelper", this.d.concat(" create failure"), e);
            return null;
        }
    }
}
