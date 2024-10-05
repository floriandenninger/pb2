package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anfg extends anez {
    @Override // defpackage.anez
    public final void a(anfl anflVar, anfl anflVar2) {
        anflVar.next = anflVar2;
    }

    @Override // defpackage.anez
    public final void b(anfl anflVar, Thread thread) {
        anflVar.thread = thread;
    }

    @Override // defpackage.anez
    public final boolean c(anfm anfmVar, anfd anfdVar, anfd anfdVar2) {
        synchronized (anfmVar) {
            if (anfmVar.listeners != anfdVar) {
                return false;
            }
            anfmVar.listeners = anfdVar2;
            return true;
        }
    }

    @Override // defpackage.anez
    public final boolean d(anfm anfmVar, Object obj, Object obj2) {
        synchronized (anfmVar) {
            if (anfmVar.value != obj) {
                return false;
            }
            anfmVar.value = obj2;
            return true;
        }
    }

    @Override // defpackage.anez
    public final boolean e(anfm anfmVar, anfl anflVar, anfl anflVar2) {
        synchronized (anfmVar) {
            if (anfmVar.waiters != anflVar) {
                return false;
            }
            anfmVar.waiters = anflVar2;
            return true;
        }
    }
}
