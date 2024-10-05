package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class antu {
    private static WeakReference b;
    public qob a;

    public antu() {
    }

    public antu(Context context) {
        this.a = new qob(context, qcm.a, qnu.f, new ante(0));
    }

    public static synchronized antu a(Context context) {
        synchronized (antu.class) {
            WeakReference weakReference = b;
            antu antuVar = weakReference == null ? null : (antu) weakReference.get();
            if (antuVar != null) {
                return antuVar;
            }
            antu antuVar2 = new antu(context.getApplicationContext());
            b = new WeakReference(antuVar2);
            return antuVar2;
        }
    }
}
