package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Toast;
import com.google.protos.youtube.api.innertube.HintRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class xxi implements TextWatcher {
    final /* synthetic */ xxp a;

    public xxi(xxp xxpVar) {
        this.a = xxpVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        xxp xxpVar = this.a;
        ammv aG = xxpVar.aG();
        if (aG.h() && xxpVar.aI().matcher(editable).find()) {
            if (xxpVar.bb.getVisibility() == 0) {
                aulq aulqVar = ((aupe) aG.c()).d;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
                if (aulqVar.pY(HintRendererOuterClass.hintRenderer)) {
                    akbv akbvVar = xxpVar.aq;
                    aulq aulqVar2 = ((aupe) aG.c()).d;
                    if (aulqVar2 == null) {
                        aulqVar2 = aulq.a;
                    }
                    akbvVar.b((arej) aulqVar2.pX(HintRendererOuterClass.hintRenderer), xxpVar.bb, aG.c(), xxpVar.ak);
                }
            } else {
                auec aH = xxpVar.aH();
                if (aH != null && (aH.b & 1) != 0) {
                    xxpVar.aN();
                    if ((((aupe) aG.c()).b & 16) != 0) {
                        ci C = xxpVar.C();
                        aqyg aqygVar = ((aupe) aG.c()).e;
                        if (aqygVar == null) {
                            aqygVar = aqyg.a;
                        }
                        Toast.makeText(C, ajcq.b(aqygVar), 1).show();
                    }
                }
            }
        }
        this.a.aM();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.aN += Math.max(0, i2 - i3);
    }
}
