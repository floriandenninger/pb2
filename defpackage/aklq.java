package defpackage;

import android.widget.CompoundButton;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aklq implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ aklt a;

    public aklq(aklt akltVar) {
        this.a = akltVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        apll apllVar;
        apxf apxfVar;
        akij akijVar = this.a.b;
        avml avmlVar = akijVar.b;
        aplk aplkVar = avmlVar.d;
        if (aplkVar == null) {
            aplkVar = aplk.a;
        }
        if ((aplkVar.b & 2) != 0) {
            aplk aplkVar2 = avmlVar.d;
            if (aplkVar2 == null) {
                aplkVar2 = aplk.a;
            }
            apllVar = aplkVar2.c;
            if (apllVar == null) {
                apllVar = apll.a;
            }
        } else {
            apllVar = null;
        }
        if (apllVar == null) {
            return;
        }
        if (z) {
            apxfVar = apllVar.e;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = apllVar.f;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        }
        akijVar.a.c(apxfVar, null);
    }
}
