package defpackage;

import android.text.TextUtils;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class admc {
    final /* synthetic */ admd a;

    public admc(admd admdVar) {
        this.a = admdVar;
    }

    public final void a(adme admeVar) {
        this.a.e = Optional.of(admeVar);
        admd admdVar = this.a;
        admdVar.h(admdVar.c.toMillis());
    }

    public final void b(adgm adgmVar) {
        if (!TextUtils.equals(adgmVar.c, this.a.d.c)) {
            zga.h(admd.a, String.format("Setting new short lived lounge token to be used: %s", adgmVar));
            admd admdVar = this.a;
            admdVar.d = adgmVar;
            admdVar.f++;
            admdVar.h(adgmVar.b.toMillis());
            return;
        }
        zga.h(admd.a, String.format("Found a short lived lounge token, but it is stale: %s", adgmVar));
        this.a.e = Optional.of(adme.STALE_LOUNGE_TOKEN);
        admd admdVar2 = this.a;
        admdVar2.h(admdVar2.c.toMillis());
    }
}
