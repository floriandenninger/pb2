package defpackage;

import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kbu implements Comparator {
    private final boolean a;
    private final int b;

    public kbu(int i, boolean z) {
        this.b = i;
        this.a = z;
    }

    private static Long b(aqbw aqbwVar) {
        aqbz aqbzVar;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aqbu aqbuVar = aqbwVar.l;
        if (aqbuVar == null) {
            aqbuVar = aqbu.a;
        }
        if (aqbuVar.b == 135744618) {
            aqbzVar = (aqbz) aqbuVar.c;
        } else {
            aqbzVar = aqbz.a;
        }
        return Long.valueOf(timeUnit.toMillis(aqbzVar.c));
    }

    private static String c(aqbw aqbwVar) {
        aqyg aqygVar;
        aqyg aqygVar2 = null;
        if ((aqbwVar.b & 1) != 0) {
            aqygVar = aqbwVar.g;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        if (ajcq.b(aqygVar) == null) {
            return "";
        }
        if ((aqbwVar.b & 1) != 0 && (aqygVar2 = aqbwVar.g) == null) {
            aqygVar2 = aqyg.a;
        }
        return amkq.c(ajcq.b(aqygVar2).toString());
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compare(aqbw aqbwVar, aqbw aqbwVar2) {
        if (this.b == 3) {
            return this.a ? b(aqbwVar2).compareTo(b(aqbwVar)) : b(aqbwVar).compareTo(b(aqbwVar2));
        }
        if (this.a) {
            return c(aqbwVar2).compareTo(c(aqbwVar));
        }
        return c(aqbwVar).compareTo(c(aqbwVar2));
    }
}
