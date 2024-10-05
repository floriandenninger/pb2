package defpackage;

import j$.util.function.Consumer;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zik {
    public final zij a;
    private final aoae b;

    private zik(zij zijVar, Collection collection) {
        collection.getClass();
        amkq.E(!collection.contains(null));
        this.b = new aoae(collection);
        zijVar.getClass();
        this.a = zijVar;
    }

    public static zik a(zij zijVar) {
        return new zik(zijVar, amvs.a);
    }

    public final void b(final Object obj) {
        obj.getClass();
        this.b.i(new Consumer() { // from class: zii
            @Override // j$.util.function.Consumer
            public final void accept(Object obj2) {
                zik zikVar = zik.this;
                zikVar.a.a(obj2, obj);
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void c(Object obj) {
        obj.getClass();
        this.b.j(obj);
    }

    public final void d(Object obj) {
        obj.getClass();
        this.b.k(obj);
    }
}
