package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yzn implements View.OnClickListener {
    final /* synthetic */ yzq a;
    private final /* synthetic */ int b;

    public yzn(yzq yzqVar, int i) {
        this.b = i;
        this.a = yzqVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            yzq yzqVar = this.a;
            int indexOf = yzqVar.j.indexOf(view);
            yzp yzpVar = yzqVar.l;
            if (yzpVar != null) {
                opf opfVar = (opf) yzpVar;
                opfVar.q(indexOf).flatMap(mjq.t).ifPresent(new oow(opfVar, 3));
                return;
            }
            return;
        }
        yzq yzqVar2 = this.a;
        yzqVar2.m(yzqVar2.j.indexOf(view), true);
    }
}
