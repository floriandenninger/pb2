package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aep extends aei {
    @Override // defpackage.aei
    public final void a(aeq aeqVar, aeq aeqVar2) {
        aeqVar.next = aeqVar2;
    }

    @Override // defpackage.aei
    public final void b(aeq aeqVar, Thread thread) {
        aeqVar.thread = thread;
    }

    @Override // defpackage.aei
    public final boolean c(aer aerVar, aem aemVar, aem aemVar2) {
        synchronized (aerVar) {
            if (aerVar.listeners != aemVar) {
                return false;
            }
            aerVar.listeners = aemVar2;
            return true;
        }
    }

    @Override // defpackage.aei
    public final boolean d(aer aerVar, Object obj, Object obj2) {
        synchronized (aerVar) {
            if (aerVar.value != obj) {
                return false;
            }
            aerVar.value = obj2;
            return true;
        }
    }

    @Override // defpackage.aei
    public final boolean e(aer aerVar, aeq aeqVar, aeq aeqVar2) {
        synchronized (aerVar) {
            if (aerVar.waiters != aeqVar) {
                return false;
            }
            aerVar.waiters = aeqVar2;
            return true;
        }
    }
}
