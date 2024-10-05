package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mnu extends mpd implements mnw {
    public mnx ae;
    private atnz af;

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        this.ae.c = this;
        try {
            this.af = (atnz) aonm.parseFrom(atnz.a, this.m.getByteArray("notification_text_renderer"), aomw.b());
        } catch (aoob e) {
            zga.d("Unable to create dialog due to missing proto or invalid proto format", e);
            dismiss();
        }
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ajok ajokVar = new ajok();
        ajokVar.f("dismissal_follow_up_dialog", true);
        this.ae.oB(ajokVar, (arpw) this.af.pX(atny.b));
        return this.ae.a();
    }

    @Override // defpackage.bv
    public final Dialog oq(Bundle bundle) {
        Dialog oq = super.oq(bundle);
        oq.setCanceledOnTouchOutside(false);
        return oq;
    }
}
