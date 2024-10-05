package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SignInEndpointOuterClass;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class waa extends vzx implements AdapterView.OnItemClickListener {
    public afte ae;
    public ypa af;
    public afsp ag;
    public apxf ah;

    @Override // defpackage.uyt
    protected final /* bridge */ /* synthetic */ ListAdapter aH() {
        uys uysVar = new uys(C());
        vzz vzzVar = new vzz(C().getString(R.string.turn_off_incognito));
        vzzVar.e = aii.a(C(), R.drawable.quantum_ic_incognito_circle_grey600_36);
        vzzVar.f(wbs.W(C(), R.attr.ytTextPrimary).orElse(-16777216));
        uysVar.add(vzzVar);
        return uysVar;
    }

    @Override // defpackage.uyt
    protected final AdapterView.OnItemClickListener aJ() {
        return this;
    }

    @Override // defpackage.uyt
    protected final String aK() {
        return null;
    }

    @Override // defpackage.uyt
    protected final int mA() {
        return 0;
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        apxf apxfVar = this.ah;
        if (apxfVar != null) {
            bundle.putByteArray("endpoint", apxfVar.toByteArray());
        }
    }

    @Override // defpackage.uyt, defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        if (bundle == null) {
            bundle = this.m;
        }
        if (bundle == null || !bundle.containsKey("endpoint")) {
            return;
        }
        try {
            this.ah = (apxf) aonm.parseFrom(apxf.a, bundle.getByteArray("endpoint"), aomw.b());
        } catch (aoob unused) {
        }
    }

    @Override // defpackage.uyt, defpackage.bv, defpackage.ce
    public final void mS() {
        View view = this.O;
        if (view != null) {
            view.setPadding(0, 0, 0, 0);
        }
        super.mS();
    }

    @Override // defpackage.bv, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.af.d(new wjc(wjb.CANCELLED, false, null));
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        apxf apxfVar = this.ah;
        apxf apxfVar2 = null;
        auuo auuoVar = apxfVar == null ? null : (auuo) apxfVar.pX(SignInEndpointOuterClass.signInEndpoint);
        if (auuoVar != null && (auuoVar.b & 2) != 0 && (apxfVar2 = auuoVar.c) == null) {
            apxfVar2 = apxf.a;
        }
        this.ae.f(this.ag, apxfVar2);
        dismiss();
    }
}
