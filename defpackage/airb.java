package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class airb implements afqq {
    final /* synthetic */ aone a;

    public airb(aone aoneVar) {
        this.a = aoneVar;
    }

    @Override // defpackage.afqq
    public final int a() {
        return ((aqjg) this.a.instance).d;
    }

    @Override // defpackage.afqq
    public final int b() {
        return ((aqjg) this.a.instance).c;
    }

    @Override // defpackage.afqq
    public final int c() {
        return 0;
    }

    @Override // defpackage.afqq
    public final int d() {
        return (int) TimeUnit.DAYS.toMinutes(30L);
    }
}
