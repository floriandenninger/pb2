package defpackage;

import com.google.android.libraries.youtube.mdx.model.AppStatus;
import j$.util.Optional;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adni implements acyp {
    final /* synthetic */ adnm a;
    private final Set b;

    public adni(adnm adnmVar, Set set) {
        this.a = adnmVar;
        this.b = set;
    }

    @Override // defpackage.acyp
    public final void a(adfy adfyVar) {
        adlm g = ((adlt) this.a.d.get()).g();
        if (g == null || g.a() == 0 || !adfyVar.equals(g.k()) || adfyVar.a.a() != 2) {
            this.a.e.put(adfyVar.n, 0);
            adfy p = this.a.p(adfyVar.n);
            if (p == null) {
                this.a.j(adfyVar);
            } else {
                AppStatus appStatus = adfyVar.a;
                AppStatus appStatus2 = p.a;
                if (appStatus != appStatus2 && ((appStatus2 == null || !amkq.b(appStatus.f(), appStatus2.f()) || appStatus.k() != appStatus2.k() || !appStatus.i().equals(appStatus2.i())) && ((g == null || !(g.k() instanceof adfy) || !adfyVar.n.equals(((adfy) g.k()).n)) && !adfyVar.o() && p.o()))) {
                    this.a.j(adfyVar);
                }
            }
            this.b.remove(adfyVar);
            return;
        }
        String.valueOf(String.valueOf(adfyVar)).length();
        ynm.i(g.q(atbi.MDX_SESSION_DISCONNECT_REASON_SCREEN_APP_STOPPED, Optional.empty()), llr.p);
        this.a.l(adfyVar);
        this.b.remove(adfyVar);
    }

    @Override // defpackage.acyp
    public final /* synthetic */ void b() {
    }
}
