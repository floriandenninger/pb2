package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajsd {
    public final HashMap a = new HashMap();
    public final Executor b;
    private final ajjz c;

    public ajsd(ajjz ajjzVar, Executor executor) {
        this.c = ajjzVar;
        this.b = executor;
    }

    public final void a(ajrx ajrxVar, avgg avggVar, int i, ajsf ajsfVar) {
        Uri D = ahbw.D(avggVar, i);
        WeakReference weakReference = (WeakReference) this.a.get(D);
        if (weakReference == null || weakReference.get() == null) {
            ajsc ajscVar = new ajsc(this, ajsfVar, ajrxVar);
            if (D == null) {
                zga.b("Tried to load a null bitmap.");
                return;
            } else {
                this.c.l(D, ajscVar);
                return;
            }
        }
        ajsfVar.d(ajrxVar, (Bitmap) weakReference.get());
    }
}
