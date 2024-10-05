package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adpg implements adqq {
    private final adqp a;
    private final adrp b;
    private final Executor c;
    private final ypa d;
    private final acpl e;
    private final acsy f;

    public adpg(acwa acwaVar, adrp adrpVar, Executor executor, ypa ypaVar, acsy acsyVar, acpl acplVar, acun acunVar) {
        this.a = acwaVar;
        this.b = adrpVar;
        this.c = executor;
        this.d = ypaVar;
        this.f = acunVar.z ? acsyVar : new acta();
        this.e = acplVar;
    }

    @Override // defpackage.adqq
    public final adqp a() {
        return new adrd(this.a, new adrk(this.b, this.c, this.d, this.f), this.b, this.e);
    }
}
