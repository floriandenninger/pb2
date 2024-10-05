package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class khs implements ayrs {
    public final /* synthetic */ khv a;
    private final /* synthetic */ int b;

    public /* synthetic */ khs(khv khvVar, int i) {
        this.b = i;
        this.a = khvVar;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            khv khvVar = this.a;
            if (((Boolean) obj).booleanValue()) {
                khvVar.d.b();
                return;
            }
            return;
        }
        if (i == 1) {
            khv khvVar2 = this.a;
            khvVar2.k = ((Boolean) obj).booleanValue();
            khvVar2.b();
        } else {
            if (i == 2) {
                khv khvVar3 = this.a;
                Integer num = (Integer) obj;
                asvu asvuVar = khvVar3.l.b().e;
                if (asvuVar == null) {
                    asvuVar = asvu.a;
                }
                yny.z(asvuVar.bd ? khvVar3.b : khvVar3.a, yny.k(num.intValue()), ViewGroup.MarginLayoutParams.class);
                khvVar3.b.requestLayout();
                return;
            }
            khv khvVar4 = this.a;
            View view = khvVar4.a;
            jw.Y(view, jw.i(view), khvVar4.a.getPaddingTop(), ((Integer) obj).intValue(), khvVar4.a.getPaddingBottom());
        }
    }
}
