package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anuj {
    public final Set a;
    public final Set b;
    public final int c;
    public final anul d;
    public final Set e;
    private final int f;

    public anuj(Set set, Set set2, int i, int i2, anul anulVar, Set set3) {
        this.a = Collections.unmodifiableSet(set);
        this.b = Collections.unmodifiableSet(set2);
        this.c = i;
        this.f = i2;
        this.d = anulVar;
        this.e = Collections.unmodifiableSet(set3);
    }

    public static anui a(Class cls) {
        return new anui(cls, new Class[0]);
    }

    @SafeVarargs
    public static anuj b(Object obj, Class cls, Class... clsArr) {
        anui anuiVar = new anui(cls, clsArr);
        anuiVar.c(new anuh(obj, 0));
        return anuiVar.a();
    }

    public final boolean c() {
        return this.f == 0;
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.a.toArray()) + ">{" + this.c + ", type=" + this.f + ", deps=" + Arrays.toString(this.b.toArray()) + "}";
    }
}
