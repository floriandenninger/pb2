package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rag {
    private static rag b;
    public final Context a;
    private final boolean c = true;

    public rag(Context context) {
        this.a = context;
    }

    public static synchronized rag a(Context context) {
        rag ragVar;
        synchronized (rag.class) {
            Context f = rbd.f(context);
            rag ragVar2 = b;
            if (ragVar2 == null || ragVar2.a != f) {
                b = new rag(f);
            } else {
                boolean z = ragVar2.c;
            }
            ragVar = b;
        }
        return ragVar;
    }
}
