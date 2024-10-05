package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class muw extends mkp {
    public muw(ajut ajutVar, akbu akbuVar, Context context, akpq akpqVar, ViewGroup viewGroup, byte[] bArr) {
        super(ajutVar, akbuVar, context, akpqVar, viewGroup, R.layout.slim_metadata_button, R.attr.ytTextPrimary, null);
    }

    @Override // defpackage.mkp
    public final void c(auvo auvoVar, acra acraVar, ajok ajokVar) {
        super.c(auvoVar, acraVar, ajokVar);
        apmh apmhVar = auvoVar.f;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        apmg apmgVar = apmhVar.c;
        if (apmgVar == null) {
            apmgVar = apmg.a;
        }
        this.a.setAlpha(true != apmgVar.h ? 1.0f : 0.5f);
    }
}
