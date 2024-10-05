package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.SecureRandom;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aktm implements akto {
    private final ywr a;
    private final axpg b;
    private final Map c = new ConcurrentHashMap();

    public aktm(ywr ywrVar, axpg axpgVar) {
        this.a = ywrVar;
        this.b = axpgVar;
    }

    public static /* synthetic */ void a(Throwable th) {
        zga.d("Error while writing settings", th);
    }

    @Override // defpackage.akto
    public final boolean b(float f, final aksi aksiVar) {
        Boolean bool = (Boolean) this.c.get(aksiVar.h);
        if (bool != null) {
            return bool.booleanValue();
        }
        float floatValue = ((Float) aksiVar.i.a((awwt) this.a.c())).floatValue();
        if (floatValue < 0.0f) {
            floatValue = ((SecureRandom) this.b.get()).nextFloat();
        }
        float f2 = floatValue + f;
        boolean z = f2 >= 1.0f;
        final float f3 = f2 - ((int) f2);
        ynm.m(this.a.b(new amml() { // from class: aktl
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                return (awwt) ((aone) aksi.this.j.a(((awwt) obj).toBuilder(), Float.valueOf(f3))).build();
            }
        }), ailg.j);
        this.c.put(aksiVar.h, Boolean.valueOf(z));
        return z;
    }
}
