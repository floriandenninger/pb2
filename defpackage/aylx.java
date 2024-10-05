package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aylx extends aybr {
    public final aybq a;
    final /* synthetic */ ayly b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public aylx(ayly aylyVar, aybq aybqVar) {
        this.b = aylyVar;
        this.a = aybqVar;
    }

    @Override // defpackage.aybr
    public final aybm a() {
        if (this.c.compareAndSet(false, true)) {
            ((aykk) this.b.b).c.o.execute(new aylw(this));
        }
        return aybm.a;
    }
}
