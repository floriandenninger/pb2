package defpackage;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class wal implements afwx {
    final /* synthetic */ wam a;

    public wal(wam wamVar) {
        this.a = wamVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        if (this.a.C() == null) {
            return;
        }
        this.a.dismiss();
        this.a.al.e(cnqVar);
        this.a.aj.b();
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        arku arkuVar = (arku) obj;
        if (this.a.C() == null) {
            return;
        }
        Bundle bundle = this.a.m;
        boolean z = bundle != null && bundle.getBoolean("hide_toast");
        if ((arkuVar.b & 8) != 0) {
            arkt arktVar = arkuVar.f;
            if (arktVar == null) {
                arktVar = arkt.a;
            }
            aqyg aqygVar = arktVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            String obj2 = ajcq.b(aqygVar).toString();
            arkt arktVar2 = arkuVar.f;
            if (arktVar2 == null) {
                arktVar2 = arkt.a;
            }
            int dG = amkq.dG(arktVar2.b);
            if (dG == 0 || dG != 3) {
                this.a.aJ(false);
                wam wamVar = this.a;
                wbf wbfVar = wamVar.ag;
                if (wbfVar != null) {
                    arkt arktVar3 = arkuVar.f;
                    if (arktVar3 == null) {
                        arktVar3 = arkt.a;
                    }
                    int dG2 = amkq.dG(arktVar3.b);
                    if (dG2 != 0 && dG2 == 2) {
                        EditText editText = wbfVar.f;
                        editText.setError(editText.getHint());
                        EditText editText2 = wbfVar.e;
                        editText2.setError(editText2.getHint());
                    }
                    TextView textView = wbfVar.d;
                    arkt arktVar4 = arkuVar.f;
                    if (arktVar4 == null) {
                        arktVar4 = arkt.a;
                    }
                    aqyg aqygVar2 = arktVar4.c;
                    if (aqygVar2 == null) {
                        aqygVar2 = aqyg.a;
                    }
                    textView.setText(ajcq.b(aqygVar2));
                    wbfVar.d.setVisibility(0);
                    return;
                }
                wamVar.al.d(obj2);
                if (this.a.aK()) {
                    wam wamVar2 = this.a;
                    apph aF = wamVar2.aF();
                    Boolean bool = false;
                    aone aoneVar = aF.a;
                    boolean booleanValue = bool.booleanValue();
                    aoneVar.copyOnWrite();
                    appk appkVar = (appk) aoneVar.instance;
                    appk appkVar2 = appk.a;
                    appkVar.c |= 2;
                    appkVar.e = booleanValue;
                    aaio c = ((aaih) wamVar2.ap.c()).c();
                    c.k(aF);
                    c.b().Q();
                    return;
                }
                return;
            }
            this.a.al.d(obj2);
            z = true;
        }
        aovp aovpVar = arkuVar.e;
        if (aovpVar == null) {
            aovpVar = aovp.b;
        }
        boolean z2 = aovpVar.c;
        if (z2 && !z) {
            whu.K(this.a.C(), R.string.channel_created, 1);
        }
        this.a.dismiss();
        if (z2) {
            this.a.aj.d();
        } else {
            this.a.aj.b();
        }
        if ((arkuVar.b & 2) != 0) {
            aahd aahdVar = this.a.ak;
            apxf apxfVar = arkuVar.d;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.a(apxfVar);
        }
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
