package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import com.google.android.libraries.user.profile.photopicker.edit.EditActivity;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vnz implements aab {
    final /* synthetic */ voa a;

    public vnz(voa voaVar) {
        this.a = voaVar;
    }

    @Override // defpackage.aab
    public final void a(Context context) {
        voa voaVar = this.a;
        ComponentCallbacks2 m = axfq.m(voaVar.getApplicationContext());
        if (m instanceof axqk) {
            if ((!(m instanceof axqh) || ((axqh) m).h()) && !voaVar.r) {
                voaVar.r = true;
                Object lM = voaVar.lM();
                EditActivity editActivity = (EditActivity) voaVar;
                eed eedVar = (eed) lM;
                editActivity.a = eedVar.r();
                editActivity.b = (vrn) eedVar.kY.get();
                editActivity.c = (String) eedVar.li.get();
                editActivity.d = (vkb) eedVar.lo.get();
                editActivity.e = (tgn) eedVar.a.a.aX.get();
                editActivity.f = eedVar.a.a.q();
                editActivity.p = eedVar.mc();
                editActivity.g = (vnr) eedVar.lp.get();
                editActivity.q = eed.mw();
            }
        }
    }
}
