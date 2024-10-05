package com.google.android.apps.youtube.app.bedtime;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.preference.DialogPreference;
import com.google.android.youtube.R;
import defpackage.ajok;
import defpackage.ajom;
import defpackage.ajoq;
import defpackage.axfq;
import defpackage.bsx;
import defpackage.eoj;
import defpackage.epn;
import defpackage.lqb;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class BedtimeReminderPreference extends DialogPreference {
    public ajoq g;
    ajom h;

    public BedtimeReminderPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.B = R.layout.setting_compat_custom_preference;
        ((eoj) axfq.n(context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : context, eoj.class)).kV(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public final void C() {
        super.P();
        ajom ajomVar = this.h;
        if (ajomVar != null) {
            ajomVar.b(null);
        }
    }

    @Override // androidx.preference.Preference
    public final void qn(bsx bsxVar) {
        super.qn(bsxVar);
        if (this.h == null) {
            this.h = ((epn) this.g).b((ViewGroup) bsxVar.a);
            ((ViewGroup) bsxVar.a).addView(this.h.a());
        }
        this.h.oB(new ajok(), new lqb(null));
    }
}
