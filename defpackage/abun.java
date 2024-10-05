package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abun implements abvr {
    final /* synthetic */ abuo a;

    public abun(abuo abuoVar) {
        this.a = abuoVar;
    }

    @Override // defpackage.abvr
    public final void a(Object obj) {
        if (obj instanceof asrw) {
            asrw asrwVar = (asrw) obj;
            int i = this.a.o;
            asrwVar.copyOnWrite();
            asrx asrxVar = (asrx) asrwVar.instance;
            asrx asrxVar2 = asrx.a;
            asrxVar.b |= 8192;
            asrxVar.p = i / 1000;
            int i2 = this.a.e;
            asrwVar.copyOnWrite();
            asrx asrxVar3 = (asrx) asrwVar.instance;
            asrxVar3.b |= 64;
            asrxVar3.i = i2 / 1000;
            int i3 = this.a.l;
            asrwVar.copyOnWrite();
            asrx asrxVar4 = (asrx) asrwVar.instance;
            asrxVar4.b |= 16;
            asrxVar4.g = i3 / 1000;
            double a = this.a.g.a();
            asrwVar.copyOnWrite();
            asrx asrxVar5 = (asrx) asrwVar.instance;
            asrxVar5.b |= 32;
            asrxVar5.h = (int) (a / 1000.0d);
            asrv asrvVar = asrxVar5.c;
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
                    long j = asrvVar3.e;
                    asrv asrvVar4 = ((asrx) asrwVar.instance).c;
                    if (asrvVar4 == null) {
                        asrvVar4 = asrv.a;
                    }
                    long j2 = j - asrvVar4.d;
                    if (j2 > 0) {
                        long j3 = (this.a.x * 1000) / j2;
                        asrwVar.copyOnWrite();
                        asrx asrxVar6 = (asrx) asrwVar.instance;
                        asrxVar6.b |= 32;
                        asrxVar6.h = (int) j3;
                    }
                }
            }
            this.a.x = 0L;
        }
    }
}
