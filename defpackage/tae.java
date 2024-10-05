package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tae extends dha {

    @dnt(a = 13)
    szo a;

    @dnt(a = 13)
    sxc b;

    @dnt(a = 14)
    private final tad c;

    private tae() {
        super("LazilyConvertedElement");
        this.b = taf.a;
        this.c = new tad();
    }

    public static tac a(dhe dheVar) {
        tac tacVar = new tac();
        tac.d(tacVar, dheVar, new tae());
        return tacVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void M(dhe dheVar) {
        baql baqlVar = new baql();
        baql baqlVar2 = new baql();
        taf.b(baqlVar, baqlVar2);
        tad tadVar = this.c;
        tadVar.b = (AtomicReference) baqlVar.a;
        tadVar.a = (AtomicReference) baqlVar2.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void X(dlq dlqVar, dlq dlqVar2) {
        tad tadVar = (tad) dlqVar;
        tad tadVar2 = (tad) dlqVar2;
        tadVar2.a = tadVar.a;
        tadVar2.b = tadVar.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final boolean ac() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final dha b(dhe dheVar) {
        szo szoVar = this.a;
        sxc sxcVar = this.b;
        tad tadVar = this.c;
        return taf.a(dheVar, szoVar, sxcVar, tadVar.b, tadVar.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dha
    public final dlq m() {
        return this.c;
    }
}
