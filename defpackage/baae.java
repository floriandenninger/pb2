package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baae {
    public static final baac a = new baac("NO_THREAD_ELEMENTS");
    private static final azty b = azsu.e;
    private static final azty c = azsu.f;
    private static final azty d = azsu.g;

    public static final Object a(azsv azsvVar) {
        azsvVar.getClass();
        Object fold = azsvVar.fold(0, b);
        fold.getClass();
        return fold;
    }

    public static final Object b(azsv azsvVar, Object obj) {
        azsvVar.getClass();
        if (obj == null) {
            obj = a(azsvVar);
        }
        if (obj == 0) {
            return a;
        }
        if (obj instanceof Integer) {
            return azsvVar.fold(new baaf(azsvVar, ((Number) obj).intValue()), d);
        }
        return ((azwm) obj).a(azsvVar);
    }

    public static final void c(azsv azsvVar, Object obj) {
        azsvVar.getClass();
        if (obj == a) {
            return;
        }
        if (obj instanceof baaf) {
            baaf baafVar = (baaf) obj;
            int length = baafVar.d.length - 1;
            if (length < 0) {
                return;
            }
            while (true) {
                int i = length - 1;
                baafVar.d[length].getClass();
                azwm.b(baafVar.b[length]);
                if (i < 0) {
                    return;
                } else {
                    length = i;
                }
            }
        } else {
            Object fold = azsvVar.fold(null, c);
            if (fold == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            }
            azwm.b(obj);
        }
    }
}
