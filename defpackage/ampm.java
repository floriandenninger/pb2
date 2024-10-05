package defpackage;

import j$.util.function.BiConsumer;
import j$.util.function.Function;
import j$.util.stream.Collector;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ampm {
    public static final Collector a = Collector.CC.of(ghx.p, ampj.b, ampk.b, aidk.l, new Collector.Characteristics[0]);
    public static final Collector b = Collector.CC.of(ghx.r, ampj.c, ampk.d, aidk.o, new Collector.Characteristics[0]);

    static {
        Collector.CC.of(ghx.q, ampj.a, ampk.c, aidk.n, new Collector.Characteristics[0]);
    }

    public static Collector a(final Function function, final Function function2) {
        function.getClass();
        function2.getClass();
        return Collector.CC.of(ghx.s, new BiConsumer() { // from class: ampl
            @Override // j$.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                Function function3 = Function.this;
                Function function4 = function2;
                Collector collector = ampm.a;
                ((amrw) obj).g(function3.apply(obj2), function4.apply(obj2));
            }

            @Override // j$.util.function.BiConsumer
            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer.CC.$default$andThen(this, biConsumer);
            }
        }, ampk.a, aidk.m, new Collector.Characteristics[0]);
    }
}
