package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aynq extends ayno {
    @Override // defpackage.ayno
    public final boolean a(aynr aynrVar) {
        synchronized (aynrVar) {
            if (aynrVar.a != 0) {
                return false;
            }
            aynrVar.a = -1;
            return true;
        }
    }

    @Override // defpackage.ayno
    public final void b(aynr aynrVar) {
        synchronized (aynrVar) {
            aynrVar.a = 0;
        }
    }
}
