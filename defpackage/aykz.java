package defpackage;

import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aykz extends aycq {
    final /* synthetic */ ayla a;

    public aykz(ayla aylaVar) {
        this.a = aylaVar;
    }

    @Override // defpackage.aycq
    public final String a() {
        return this.a.b;
    }

    @Override // defpackage.aycq
    public final void c() {
    }

    @Override // defpackage.aycq
    public final void d(aycm aycmVar) {
        aycn a = ayco.a();
        a.a = Collections.singletonList(new ayan(this.a.a));
        a.b = axzj.a;
        aycmVar.c(a.a());
    }
}
