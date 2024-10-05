package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cev extends ceo {
    @Override // defpackage.ceo
    public final void a(cew cewVar, cew cewVar2) {
        cewVar.c = cewVar2;
    }

    @Override // defpackage.ceo
    public final void b(cew cewVar, Thread thread) {
        cewVar.b = thread;
    }

    @Override // defpackage.ceo
    public final boolean c(cex cexVar, ces cesVar, ces cesVar2) {
        synchronized (cexVar) {
            if (cexVar.e != cesVar) {
                return false;
            }
            cexVar.e = cesVar2;
            return true;
        }
    }

    @Override // defpackage.ceo
    public final boolean d(cex cexVar, Object obj, Object obj2) {
        synchronized (cexVar) {
            if (cexVar.d != obj) {
                return false;
            }
            cexVar.d = obj2;
            return true;
        }
    }

    @Override // defpackage.ceo
    public final boolean e(cex cexVar, cew cewVar, cew cewVar2) {
        synchronized (cexVar) {
            if (cexVar.f != cewVar) {
                return false;
            }
            cexVar.f = cewVar2;
            return true;
        }
    }
}
