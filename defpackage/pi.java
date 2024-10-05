package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pi {
    private pj a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized pj a() {
        pj pjVar = this.a;
        if (pjVar == null) {
            return null;
        }
        this.a = pjVar.a;
        return pjVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(int i) {
        pj pjVar;
        while (true) {
            pjVar = this.a;
            if (pjVar == null || pjVar.b != i) {
                break;
            }
            this.a = pjVar.a;
            pjVar.d();
        }
        if (pjVar != null) {
            pj pjVar2 = pjVar.a;
            while (pjVar2 != null) {
                pj pjVar3 = pjVar2.a;
                if (pjVar2.b == i) {
                    pjVar.a = pjVar3;
                    pjVar2.d();
                } else {
                    pjVar = pjVar2;
                }
                pjVar2 = pjVar3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c(pj pjVar) {
        pj pjVar2 = this.a;
        if (pjVar2 == null) {
            this.a = pjVar;
            return;
        }
        while (true) {
            pj pjVar3 = pjVar2.a;
            if (pjVar3 == null) {
                pjVar2.a = pjVar;
                return;
            }
            pjVar2 = pjVar3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d(pj pjVar) {
        pjVar.a = this.a;
        this.a = pjVar;
    }
}
