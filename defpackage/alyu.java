package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class alyu implements Callable {
    public final /* synthetic */ anhy a;
    public final /* synthetic */ anhy b;
    private final /* synthetic */ int c;

    public /* synthetic */ alyu(anhy anhyVar, anhy anhyVar2, int i) {
        this.c = i;
        this.a = anhyVar;
        this.b = anhyVar2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (this.c == 0) {
            anhy anhyVar = this.a;
            anhy anhyVar2 = this.b;
            alzi alziVar = (alzi) anaf.W(anhyVar);
            return (1 & alziVar.b) != 0 ? amdf.a((List) anaf.W(anhyVar2), alziVar.c) : amdf.a;
        }
        anhy anhyVar3 = this.a;
        anhy anhyVar4 = this.b;
        awev awevVar = (awev) anaf.W(anhyVar3);
        if (((Boolean) anaf.W(anhyVar4)).booleanValue()) {
            return awevVar;
        }
        aone builder = awevVar.toBuilder();
        aweh awehVar = awevVar.c;
        if (awehVar == null) {
            awehVar = aweh.a;
        }
        aone builder2 = awehVar.toBuilder();
        aweh awehVar2 = awevVar.c;
        if (awehVar2 == null) {
            awehVar2 = aweh.a;
        }
        aweu aweuVar = awehVar2.d;
        if (aweuVar == null) {
            aweuVar = aweu.a;
        }
        aone builder3 = aweuVar.toBuilder();
        builder3.copyOnWrite();
        aweu aweuVar2 = (aweu) builder3.instance;
        aweuVar2.b |= 2;
        aweuVar2.d = true;
        builder2.copyOnWrite();
        aweh awehVar3 = (aweh) builder2.instance;
        aweu aweuVar3 = (aweu) builder3.build();
        aweuVar3.getClass();
        awehVar3.d = aweuVar3;
        awehVar3.b |= 4;
        builder.copyOnWrite();
        awev awevVar2 = (awev) builder.instance;
        aweh awehVar4 = (aweh) builder2.build();
        awehVar4.getClass();
        awevVar2.c = awehVar4;
        awevVar2.b = 1 | awevVar2.b;
        return (awev) builder.build();
    }
}
