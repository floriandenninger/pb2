package defpackage;

import com.google.android.apps.youtube.app.extensions.accountlinking.AccountLinkingController;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class gvs implements ayrs {
    public final /* synthetic */ AccountLinkingController a;
    private final /* synthetic */ int b;

    public /* synthetic */ gvs(AccountLinkingController accountLinkingController, int i) {
        this.b = i;
        this.a = accountLinkingController;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            AccountLinkingController accountLinkingController = this.a;
            aakt aaktVar = ((aakz) obj).c;
            if (aaktVar instanceof aoug) {
                accountLinkingController.i(((aoug) aaktVar).getLinked().booleanValue());
                return;
            } else {
                zga.b("Entity update does not have account link status.");
                return;
            }
        }
        int i2 = 1;
        if (i == 1) {
            this.a.i(((aoug) ((aakt) obj)).getLinked().booleanValue());
            return;
        }
        if (i == 2) {
            final AccountLinkingController accountLinkingController2 = this.a;
            ajbl a = ((ahel) obj).a();
            PlayerResponseModel c = a.c();
            if (c == null) {
                zga.b("Video changed event does not have a PlayerResponse.");
                return;
            }
            final aoui k = c.k();
            if (k == null) {
                return;
            }
            if ((k.b & 1) == 0) {
                zga.b("Account linking config does not have an entity key.");
                return;
            }
            accountLinkingController2.c = new WeakReference(a.k());
            aahu c2 = accountLinkingController2.a.c();
            String str = k.c;
            accountLinkingController2.b = c2.h(str, false).ab(ayqr.a()).ay(new gvs(accountLinkingController2, 0), ggk.l);
            c2.f(str).z(ayqr.a()).o(new gvs(accountLinkingController2, i2)).l(new ayrm() { // from class: gvr
                @Override // defpackage.ayrm
                public final void a() {
                    AccountLinkingController.this.i(k.d);
                }
            }).T();
            return;
        }
        this.a.h();
    }
}
