package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wpf extends aixi {
    final /* synthetic */ woe a;
    final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wpf(long j, long j2, int i, woe woeVar, String str) {
        super(j, j2, 2, i, null);
        this.a = woeVar;
        this.b = str;
    }

    @Override // defpackage.aixi
    public final void b(boolean z, boolean z2, boolean z3) {
        wxv wxvVar = (wxv) this.a;
        xgv u = wxvVar.e.u(this.b);
        if (u == null) {
            return;
        }
        if (u.c.c() == apae.SLOT_TYPE_PLAYER_BYTES && u.a == 8) {
            if (z || z3) {
                return;
            }
            if ((u.b instanceof xer) && !wxvVar.d.contains(u.c.a)) {
                return;
            } else {
                ((ypa) wxvVar.b.get()).f(new aigw());
            }
        }
        ((wyh) wxvVar.a.get()).r(Arrays.asList(u));
    }
}
