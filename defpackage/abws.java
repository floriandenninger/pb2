package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class abws implements abvr {
    final /* synthetic */ abwy a;

    public abws(abwy abwyVar) {
        this.a = abwyVar;
    }

    @Override // defpackage.abvr
    public final void a(Object obj) {
        if (obj instanceof asrw) {
            asrw asrwVar = (asrw) obj;
            String str = this.a.D;
            asrwVar.copyOnWrite();
            asrx asrxVar = (asrx) asrwVar.instance;
            asrx asrxVar2 = asrx.a;
            str.getClass();
            asrxVar.b |= 4096;
            asrxVar.o = str;
            return;
        }
        if (obj instanceof assa) {
            assa assaVar = (assa) obj;
            abww abwwVar = abww.GOOD;
            int ordinal = this.a.H.ordinal();
            if (ordinal == 0) {
                assaVar.copyOnWrite();
                assb assbVar = (assb) assaVar.instance;
                assb assbVar2 = assb.a;
                assbVar.d = 1;
                assbVar.b |= 4;
                return;
            }
            if (ordinal == 1) {
                assaVar.copyOnWrite();
                assb assbVar3 = (assb) assaVar.instance;
                assb assbVar4 = assb.a;
                assbVar3.d = 2;
                assbVar3.b |= 4;
                return;
            }
            if (ordinal != 2) {
                return;
            }
            assaVar.copyOnWrite();
            assb assbVar5 = (assb) assaVar.instance;
            assb assbVar6 = assb.a;
            assbVar5.d = 3;
            assbVar5.b |= 4;
        }
    }
}
