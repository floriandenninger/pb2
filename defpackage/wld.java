package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.account.verification.ui.PhoneVerificationActivity;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wld implements aab {
    final /* synthetic */ wle a;

    public wld(wle wleVar) {
        this.a = wleVar;
    }

    @Override // defpackage.aab
    public final void a(Context context) {
        wle wleVar = this.a;
        if (wleVar.a) {
            return;
        }
        wleVar.a = true;
        Object lM = wleVar.lM();
        PhoneVerificationActivity phoneVerificationActivity = (PhoneVerificationActivity) wleVar;
        eed eedVar = (eed) lM;
        phoneVerificationActivity.b = (aahd) eedVar.I.get();
        phoneVerificationActivity.c = eedVar.lw;
    }
}
