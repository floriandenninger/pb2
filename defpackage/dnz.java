package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dnz implements dnx {
    public static final dnx a = new dnz();
    public final Handler b;
    public Choreographer c;

    public dnz() {
        if (did.t()) {
            this.c = Choreographer.getInstance();
            this.b = null;
        } else {
            Handler handler = new Handler(Looper.getMainLooper());
            this.b = handler;
            handler.post(new dny(this));
        }
    }

    @Override // defpackage.dnx
    public final void a(dnw dnwVar) {
        AtomicReference atomicReference = dnwVar.a;
        dmz dmzVar = did.m;
        atomicReference.set(null);
        if (this.c == null) {
            this.b.postDelayed(dnwVar.b(), 0L);
        } else {
            this.c.postFrameCallback(dnwVar.a());
        }
    }
}
