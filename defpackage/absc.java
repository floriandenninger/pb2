package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class absc implements abvr {
    final /* synthetic */ abse a;

    public absc(abse abseVar) {
        this.a = abseVar;
    }

    @Override // defpackage.abvr
    public final void a(Object obj) {
        if (obj instanceof asrw) {
            asrw asrwVar = (asrw) obj;
            asrv asrvVar = ((asrx) asrwVar.instance).c;
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
                        int i = this.a.g;
                        asrwVar.copyOnWrite();
                        asrx asrxVar = (asrx) asrwVar.instance;
                        asrxVar.b |= 4;
                        asrxVar.e = (i * 1000) / ((float) j2);
                    }
                }
            }
            this.a.g = 0;
        }
    }
}
