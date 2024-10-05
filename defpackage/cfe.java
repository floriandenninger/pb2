package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cfe implements cgb {
    @Override // defpackage.cgb
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Throwable th = (Throwable) obj;
        if (cls.l(th)) {
            cll.b("Unable to load composition.", th);
            return;
        }
        throw new IllegalStateException("Unable to parse composition", th);
    }
}
