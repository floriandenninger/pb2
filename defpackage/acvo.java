package defpackage;

import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class acvo implements ynl {
    public final /* synthetic */ acvs a;
    private final /* synthetic */ int b;

    public /* synthetic */ acvo(acvs acvsVar, int i) {
        this.b = i;
        this.a = acvsVar;
    }

    @Override // defpackage.ynl, defpackage.zfi
    public final void a(Object obj) {
        long j;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                this.a.i.e("mdx_fallback_background_scanner", ((acvl) obj).c, true, 2, null, acvs.j, false);
                return;
            } else {
                this.a.b((List) obj);
                return;
            }
        }
        acvs acvsVar = this.a;
        acvl acvlVar = (acvl) obj;
        if (acvsVar.c.r()) {
            long millis = TimeUnit.SECONDS.toMillis(acvlVar.b);
            String.format(Locale.US, "scanning for %d ms", Long.valueOf(millis));
            if (!acvsVar.f) {
                acvsVar.a.I(acvsVar);
            } else {
                acvsVar.a.H(acvsVar);
            }
            j = millis;
        } else {
            j = 0;
        }
        acvsVar.g.postDelayed(acvsVar.h, j);
    }
}
