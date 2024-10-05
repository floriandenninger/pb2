package defpackage;

import android.opengl.GLES20;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class baoq implements Runnable {
    final /* synthetic */ baov a;
    private Object b;

    public baoq(baov baovVar) {
        this.a = baovVar;
    }

    public final synchronized void a(Object obj) {
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        baom baomVar;
        if (this.b == null || (baomVar = this.a.g) == null || baomVar.k()) {
            return;
        }
        Object obj = this.b;
        if (obj instanceof Surface) {
            this.a.g.d((Surface) obj);
            this.a.g.f();
            GLES20.glPixelStorei(3317, 1);
        } else {
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
            sb.append("Invalid surface: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }
}
