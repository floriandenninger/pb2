package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azre {
    public static final ayqi a;
    static final ayqi b;
    static final ayqi c;
    public static final ayqi d;

    static {
        ayqi h;
        ayqi h2;
        azac azacVar = new azac(5);
        ayrv ayrvVar = aynu.d;
        a = ayrvVar == null ? aynu.i(azacVar) : aynu.h(ayrvVar, azacVar);
        azac azacVar2 = new azac(2);
        ayrv ayrvVar2 = aynu.c;
        if (ayrvVar2 == null) {
            h = aynu.i(azacVar2);
        } else {
            h = aynu.h(ayrvVar2, azacVar2);
        }
        b = h;
        azac azacVar3 = new azac(3);
        ayrv ayrvVar3 = aynu.e;
        if (ayrvVar3 == null) {
            h2 = aynu.i(azacVar3);
        } else {
            h2 = aynu.h(ayrvVar3, azacVar3);
        }
        c = h2;
        d = azpo.b;
        azac azacVar4 = new azac(4);
        ayrv ayrvVar4 = aynu.f;
        aynu.i(azacVar4);
    }

    public static ayqi a() {
        ayqi ayqiVar = b;
        ayrv ayrvVar = aynu.g;
        return ayqiVar;
    }

    public static ayqi b(Executor executor) {
        return new azos(executor);
    }

    public static ayqi c() {
        ayqi ayqiVar = c;
        ayrv ayrvVar = aynu.i;
        return ayqiVar;
    }
}
