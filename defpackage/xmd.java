package defpackage;

import j$.util.OptionalLong;
import j$.util.function.LongConsumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xmd implements aijk {
    private final aaea a;
    private final ajcx b;

    public xmd(aaea aaeaVar, ajcx ajcxVar) {
        this.a = aaeaVar;
        this.b = ajcxVar;
    }

    @Override // defpackage.aijk
    public final void a(aone aoneVar) {
        apbs k = wbs.k(this.a);
        if (k == null || !k.w) {
            return;
        }
        final aone createBuilder = aqhv.a.createBuilder();
        String d = this.b.d();
        if (d != null) {
            createBuilder.copyOnWrite();
            aqhv aqhvVar = (aqhv) createBuilder.instance;
            aqhvVar.b |= 1;
            aqhvVar.c = d;
        }
        OptionalLong c = this.b.c();
        createBuilder.getClass();
        c.ifPresent(new LongConsumer() { // from class: xmc
            @Override // j$.util.function.LongConsumer
            public final void accept(long j) {
                aone aoneVar2 = aone.this;
                aoneVar2.copyOnWrite();
                aqhv aqhvVar2 = (aqhv) aoneVar2.instance;
                aqhv aqhvVar3 = aqhv.a;
                aqhvVar2.b |= 2;
                aqhvVar2.d = j;
            }

            @Override // j$.util.function.LongConsumer
            public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
                return LongConsumer.CC.$default$andThen(this, longConsumer);
            }
        });
        aoneVar.copyOnWrite();
        atws atwsVar = (atws) aoneVar.instance;
        aqhv aqhvVar2 = (aqhv) createBuilder.build();
        atws atwsVar2 = atws.a;
        aqhvVar2.getClass();
        atwsVar.s = aqhvVar2;
        atwsVar.c |= 2048;
    }
}
