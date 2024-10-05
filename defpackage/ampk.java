package defpackage;

import j$.util.function.BiFunction;
import j$.util.function.BinaryOperator;
import j$.util.function.Function;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ampk implements BinaryOperator {
    private final /* synthetic */ int e;
    public static final /* synthetic */ ampk d = new ampk(3);
    public static final /* synthetic */ ampk c = new ampk(2);
    public static final /* synthetic */ ampk b = new ampk(1);
    public static final /* synthetic */ ampk a = new ampk(0);

    private /* synthetic */ ampk(int i) {
        this.e = i;
    }

    @Override // j$.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        int i = this.e;
        if (i == 0) {
            amrw amrwVar = (amrw) obj;
            amrwVar.f((amrw) obj2);
            return amrwVar;
        }
        if (i == 1) {
            amrp amrpVar = (amrp) obj;
            amrp amrpVar2 = (amrp) obj2;
            amrpVar.a(amrpVar2.a, amrpVar2.b);
            return amrpVar;
        }
        if (i == 2) {
            vak vakVar = (vak) obj;
            Iterator it = ((vak) obj2).a.iterator();
            while (it.hasNext()) {
                vakVar.v((amvf) it.next());
            }
            return vakVar;
        }
        amsv amsvVar = (amsv) obj;
        amsvVar.l((amsv) obj2);
        return amsvVar;
    }

    @Override // j$.util.function.BiFunction
    public final /* synthetic */ BiFunction andThen(Function function) {
        int i = this.e;
        if (i == 0) {
            return BiFunction.CC.$default$andThen(this, function);
        }
        if (i != 1) {
            return i != 2 ? BiFunction.CC.$default$andThen(this, function) : BiFunction.CC.$default$andThen(this, function);
        }
        return BiFunction.CC.$default$andThen(this, function);
    }
}
