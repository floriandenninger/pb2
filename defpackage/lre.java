package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class lre implements ykr {
    public final /* synthetic */ avzr a;
    private final /* synthetic */ int b;

    public /* synthetic */ lre(avzr avzrVar, int i) {
        this.b = i;
        this.a = avzrVar;
    }

    @Override // defpackage.ykr
    public final Object a(Object obj, Object obj2) {
        if (this.b == 0) {
            avzr avzrVar = this.a;
            awvr awvrVar = (awvr) obj;
            if (!((Boolean) obj2).booleanValue()) {
                return awvrVar;
            }
            aone builder = awvrVar.toBuilder();
            builder.copyOnWrite();
            awvr awvrVar2 = (awvr) builder.instance;
            awvrVar2.n = avzrVar.e;
            awvrVar2.b |= 32;
            return (awvr) builder.build();
        }
        avzr avzrVar2 = this.a;
        awvr awvrVar3 = (awvr) obj;
        if (!((Boolean) obj2).booleanValue()) {
            return awvrVar3;
        }
        aone builder2 = awvrVar3.toBuilder();
        builder2.copyOnWrite();
        awvr awvrVar4 = (awvr) builder2.instance;
        awvrVar4.m = avzrVar2.e;
        awvrVar4.b |= 16;
        return (awvr) builder2.build();
    }
}
