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
import defpackage.lpz;
import defpackage.lqa;
import defpackage.lqe;
import defpackage.lqg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class QuietHoursNotificationPreference extends Preference {
    private final lqa a;
    private final aupu b;
    private final acqz c;
    private lpz d;

    public QuietHoursNotificationPreference(Context context, lqa lqaVar, acqz acqzVar, aupu aupuVar) {
        super(context);
        this.a = lqaVar;
        this.c = acqzVar;
        this.b = aupuVar;
        I("quiet_hours_notification_preference");
        this.B = R.layout.setting_compat_custom_preference;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final void C() {
        super.P();
        lpz lpzVar = this.d;
        if (lpzVar != null) {
            lpzVar.b(null);
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
        this.d.oB(new ajok(), (lqe) lqg.a(this.b));
        this.c.mM().n(new acqx(this.b.p));
    }
}
