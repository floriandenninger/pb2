package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.CaptionPickerEndpointOuterClass$CaptionPickerEndpoint;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class igt extends ifp implements AdapterView.OnItemClickListener {
    public Context ae;
    public kfn af;
    private atdc ah;

    public static igt aI(atdc atdcVar, ajut ajutVar, acqz acqzVar) {
        igt igtVar = new igt();
        aM(igtVar, atdcVar, ajutVar, acqzVar, Integer.valueOf(R.attr.ytTextPrimary), false);
        return igtVar;
    }

    @Override // defpackage.ajxz, defpackage.uyt
    protected final /* bridge */ /* synthetic */ ListAdapter aH() {
        return aH();
    }

    @Override // defpackage.ajxz, defpackage.uyt, defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        Bundle bundle2 = this.m;
        if (bundle2 == null || !bundle2.containsKey("MENU_BOTTOM_SHEET_FRAGMENT_KEY")) {
            return;
        }
        try {
            this.ah = (atdc) amkq.cj(bundle2, "MENU_BOTTOM_SHEET_FRAGMENT_KEY", atdc.a, aomw.b());
        } catch (aoob e) {
            zga.d("Error decoding menu", e);
            this.ah = atdc.a;
        }
    }

    @Override // defpackage.uyt, defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.mg(layoutInflater.cloneInContext(this.ae), viewGroup, bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajxz
    /* renamed from: mz */
    public final ajxr aH() {
        ajpd ajpdVar = new ajpd();
        atdc atdcVar = this.ah;
        if (atdcVar != null) {
            for (atda atdaVar : atdcVar.c) {
                apxf dk = adyu.dk(atdaVar);
                ammv aL = aL(atdaVar);
                if (dk != null && dk.pY(CaptionPickerEndpointOuterClass$CaptionPickerEndpoint.captionPickerEndpoint)) {
                    ajpdVar.add(this.af.a());
                } else if (aL.h()) {
                    ajpdVar.add(aL.c());
                }
            }
        }
        return new ajxr(this.ae, ajpdVar);
    }

    @Override // defpackage.ajxz, android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        super.onItemClick(adapterView, view, i, j);
        uyu item = ((ajxr) this.aD).getItem(i);
        if (item instanceof kem) {
            ((kem) item).a();
        }
    }

    @Override // defpackage.ce
    public final Context qR() {
        return this.ae;
    }
}
