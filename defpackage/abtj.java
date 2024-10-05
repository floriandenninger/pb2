package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abtj implements abvr {
    final /* synthetic */ abtk a;

    public abtj(abtk abtkVar) {
        this.a = abtkVar;
    }

    @Override // defpackage.abvr
    public final void a(Object obj) {
        if (obj instanceof asrw) {
            asrw asrwVar = (asrw) obj;
            acac acacVar = this.a.k;
            if (acacVar != null) {
                int i = ((abzp) acacVar).c;
                asrwVar.copyOnWrite();
                asrx asrxVar = (asrx) asrwVar.instance;
                asrx asrxVar2 = asrx.a;
                asrxVar.b |= 2048;
                asrxVar.n = i / 1000;
                int i2 = ((abzp) this.a.k).c;
                asrwVar.copyOnWrite();
                asrx asrxVar3 = (asrx) asrwVar.instance;
                asrxVar3.b |= 512;
                asrxVar3.l = i2 / 1000;
                int i3 = ((abzp) this.a.k).c;
                asrwVar.copyOnWrite();
                asrx asrxVar4 = (asrx) asrwVar.instance;
                asrxVar4.b |= 1024;
                asrxVar4.m = i3 / 1000;
            }
        }
    }
}
