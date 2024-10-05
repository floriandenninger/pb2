package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ruc extends axzu {
    final /* synthetic */ rud a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ruc(rud rudVar, axzr axzrVar) {
        super(axzrVar);
        this.a = rudVar;
    }

    @Override // defpackage.axzu
    protected final void a(ayaw ayawVar, aycd aycdVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            aycdVar.f(ayca.c("Accept-Language", aycd.a), this.a.a.getResources().getConfiguration().getLocales().toLanguageTags());
        } else {
            aycdVar.f(ayca.c("Accept-Language", aycd.a), this.a.a.getResources().getConfiguration().locale.toLanguageTag());
        }
        this.b.k(ayawVar, aycdVar);
    }
}
