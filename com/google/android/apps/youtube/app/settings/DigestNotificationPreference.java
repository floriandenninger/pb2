package com.google.android.apps.youtube.app.settings;

import android.content.Context;
import android.view.ViewGroup;
import androidx.preference.Preference;
import com.google.android.youtube.R;
import defpackage.acqx;
import defpackage.acqz;
import defpackage.ajok;
import defpackage.aupu;
import defpackage.bsx;
import defpackage.lpt;
import defpackage.lpu;
import defpackage.lqd;
import defpackage.lqg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DigestNotificationPreference extends Preference {
    private final lpu a;
    private final aupu b;
    private final acqz c;
    private lpt d;

    public DigestNotificationPreference(Context context, lpu lpuVar, acqz acqzVar, aupu aupuVar) {
        super(context);
        this.a = lpuVar;
        this.c = acqzVar;
        this.b = aupuVar;
        I("daily_digest_notification_preference");
        this.B = R.layout.setting_compat_custom_preference;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final void C() {
        super.P();
        lpt lptVar = this.d;
        if (lptVar != null) {
            lptVar.b(null);
            this.d = null;
        }
    }

    @Override // androidx.preference.Preference
    public final void qn(bsx bsxVar) {
        super.qn(bsxVar);
        if (this.d == null) {
            this.d = this.a.b((ViewGroup) bsxVar.a);
            ((ViewGroup) bsxVar.a).addView(this.d.a());
        }
        this.d.oB(new ajok(), (lqd) lqg.a(this.b));
        this.c.mM().n(new acqx(this.b.p));
    }
}
