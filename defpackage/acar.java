package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acar implements abvr {
    final /* synthetic */ acas a;

    public acar(acas acasVar) {
        this.a = acasVar;
    }

    @Override // defpackage.abvr
    public final void a(Object obj) {
        if (obj instanceof asrw) {
            asrw asrwVar = (asrw) obj;
            int i = this.a.m;
            asrwVar.copyOnWrite();
            asrx asrxVar = (asrx) asrwVar.instance;
            asrx asrxVar2 = asrx.a;
            asrxVar.b |= 128;
            asrxVar.j = i;
            int i2 = this.a.n;
            asrwVar.copyOnWrite();
            asrx asrxVar3 = (asrx) asrwVar.instance;
            asrxVar3.b |= 256;
            asrxVar3.k = i2;
            long j = this.a.l;
            asrwVar.copyOnWrite();
            asrx asrxVar4 = (asrx) asrwVar.instance;
            asrxVar4.b |= 2;
            asrxVar4.d = j / 1000;
            asrv asrvVar = asrxVar4.c;
            if (asrvVar == null) {
                asrvVar = asrv.a;
            }
            if (asrvVar.e > 0) {
                asrv asrvVar2 = ((asrx) asrwVar.instance).c;
                if (asrvVar2 == null) {
                    asrvVar2 = asrv.a;
                }
                if (asrvVar2.d > 0) {
                    asrv asrvVar3 = ((asrx) asrwVar.instance).c;
                    if (asrvVar3 == null) {
                        asrvVar3 = asrv.a;
                    }
                    long j2 = asrvVar3.e;
                    asrv asrvVar4 = ((asrx) asrwVar.instance).c;
                    if (asrvVar4 == null) {
                        asrvVar4 = asrv.a;
                    }
                    long j3 = j2 - asrvVar4.d;
                    if (j3 > 0) {
                        long j4 = (this.a.t * 1000) / j3;
                        asrwVar.copyOnWrite();
                        asrx asrxVar5 = (asrx) asrwVar.instance;
                        asrxVar5.b |= 8;
                        asrxVar5.f = (float) j4;
                    }
                }
            }
            this.a.t = 0L;
        }
    }
}
