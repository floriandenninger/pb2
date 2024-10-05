package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import j$.util.function.IntConsumer;
import j$.util.function.IntPredicate;
import j$.util.stream.IntStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahuq implements ahul, aioa, ypd {
    public final ainy a;
    public final ahum b;

    public ahuq(ainy ainyVar, ahum ahumVar) {
        this.a = ainyVar;
        ahumVar.getClass();
        this.b = ahumVar;
        ((kek) ahumVar).c.a(this);
    }

    public final void a(aeqq aeqqVar) {
        ((kek) this.b).b.g(aeqqVar.i());
        if (aeqqVar.i()) {
            FormatStreamModel e = aeqqVar.e();
            final aanb[] k = aeqqVar.k();
            final String q = e != null ? e.q() : null;
            IntStream.CC.range(0, k.length).filter(new IntPredicate() { // from class: ahup
                @Override // j$.util.function.IntPredicate
                public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
                    return IntPredicate.CC.$default$and(this, intPredicate);
                }

                @Override // j$.util.function.IntPredicate
                public final /* synthetic */ IntPredicate negate() {
                    return IntPredicate.CC.$default$negate(this);
                }

                @Override // j$.util.function.IntPredicate
                public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
                    return IntPredicate.CC.$default$or(this, intPredicate);
                }

                @Override // j$.util.function.IntPredicate
                public final boolean test(int i) {
                    aanb[] aanbVarArr = k;
                    return aanbVarArr[i].a.equals(q);
                }
            }).findFirst().ifPresent(new IntConsumer() { // from class: ahuo
                @Override // j$.util.function.IntConsumer
                public final void accept(int i) {
                    ahuq ahuqVar = ahuq.this;
                    aanb[] aanbVarArr = k;
                    kek kekVar = (kek) ahuqVar.b;
                    kekVar.c.b(aanbVarArr, i);
                    String str = null;
                    if (aanbVarArr != null && i >= 0 && i < aanbVarArr.length) {
                        str = aanbVarArr[i].b;
                    }
                    kekVar.b.d(str);
                }

                @Override // j$.util.function.IntConsumer
                public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                    return IntConsumer.CC.$default$andThen(this, intConsumer);
                }
            });
        }
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        return new ayqx[]{aiocVar.G().k.h(ahbw.g(aiocVar.aC(), 4096L)).h(ahbw.e(1)).Y(new ayrs() { // from class: ahun
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                ahuq.this.a((aeqq) obj);
            }
        }, ahfo.o)};
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aeqq.class};
        }
        if (i == 0) {
            a((aeqq) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
