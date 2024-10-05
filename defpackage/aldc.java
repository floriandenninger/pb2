package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aldc extends akwj {
    final /* synthetic */ avuh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aldc(akyb akybVar, avuh avuhVar) {
        super(akybVar);
        this.a = avuhVar;
    }

    @Override // defpackage.akwj
    public final void c(aone aoneVar) {
        akzr a = akzr.a(((akzs) aoneVar.instance).Z);
        if (a == null) {
            a = akzr.UNKNOWN;
        }
        if (a != akzr.UNKNOWN) {
            return;
        }
        int ae = awxr.ae(this.a.c);
        if (ae == 0) {
            ae = 1;
        }
        int i = ae - 1;
        if (i == 1) {
            akzr akzrVar = akzr.SUCCESS;
            aoneVar.copyOnWrite();
            akzs akzsVar = (akzs) aoneVar.instance;
            akzsVar.Z = akzrVar.g;
            akzsVar.c |= 1048576;
            return;
        }
        if (i == 2) {
            akzr akzrVar2 = akzr.FAILED;
            aoneVar.copyOnWrite();
            akzs akzsVar2 = (akzs) aoneVar.instance;
            akzsVar2.Z = akzrVar2.g;
            akzsVar2.c |= 1048576;
            return;
        }
        if (i == 3) {
            akzr akzrVar3 = akzr.REJECTED;
            aoneVar.copyOnWrite();
            akzs akzsVar3 = (akzs) aoneVar.instance;
            akzsVar3.Z = akzrVar3.g;
            akzsVar3.c |= 1048576;
            return;
        }
        if (i != 4) {
            return;
        }
        akzr akzrVar4 = akzr.DELETED;
        aoneVar.copyOnWrite();
        akzs akzsVar4 = (akzs) aoneVar.instance;
        akzsVar4.Z = akzrVar4.g;
        akzsVar4.c |= 1048576;
    }
}
