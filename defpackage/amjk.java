package defpackage;

import android.content.Intent;
import android.os.BadParcelableException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amjk {
    static final Map a;
    public static final /* synthetic */ int b = 0;

    static {
        Math.abs(new Random().nextInt());
        a = new HashMap();
    }

    public static amml a(amml ammlVar) {
        return new amji(amjw.c(), ammlVar);
    }

    public static anfy b(anfy anfyVar) {
        anfyVar.getClass();
        return new amjh(amjw.c(), anfyVar);
    }

    public static anfz c(anfz anfzVar) {
        return new amjj(amjw.c(), anfzVar);
    }

    public static angg d(final angg anggVar) {
        final amir c = amjw.c();
        return new angg() { // from class: amjd
            @Override // defpackage.angg
            public final angk a(angi angiVar, Object obj) {
                amir amirVar = amir.this;
                angg anggVar2 = anggVar;
                int i = amjk.b;
                amir e = amjw.e(amirVar);
                try {
                    return anggVar2.a(angiVar, obj);
                } finally {
                    amjw.e(e);
                }
            }
        };
    }

    public static anhh e(anhh anhhVar) {
        return new amjf(amjw.c(), anhhVar);
    }

    public static Runnable f(Runnable runnable) {
        return new amje(amjw.c(), runnable);
    }

    public static Callable g(Callable callable) {
        return new amjg(amjw.c(), callable);
    }

    public static amir h(Intent intent) {
        amir amirVar;
        try {
            if (!intent.hasExtra("tracing_intent_id")) {
                return null;
            }
            long longExtra = intent.getLongExtra("tracing_intent_id", -1L);
            Map map = a;
            synchronized (map) {
                amirVar = (amir) map.remove(Long.valueOf(longExtra));
            }
            return amirVar;
        } catch (BadParcelableException unused) {
            return null;
        }
    }
}
