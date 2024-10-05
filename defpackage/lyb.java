package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lyb implements View.OnClickListener {
    final /* synthetic */ Object a;
    final /* synthetic */ lyd b;

    public lyb(lyd lydVar, Object obj) {
        this.b = lydVar;
        this.a = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int checkedRadioButtonId = this.b.f.getCheckedRadioButtonId();
        if (checkedRadioButtonId != -1) {
            Object tag = this.b.f.findViewById(checkedRadioButtonId).getTag();
            if (tag instanceof avch) {
                aahd aahdVar = this.b.b;
                apxf apxfVar = ((avch) tag).e;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar.c(apxfVar, null);
            } else if (tag instanceof avcc) {
                aahd aahdVar2 = this.b.b;
                apxf apxfVar2 = ((avcc) tag).d;
                if (apxfVar2 == null) {
                    apxfVar2 = apxf.a;
                }
                aahdVar2.c(apxfVar2, null);
            }
            this.b.g.dismiss();
            Object obj = this.a;
            if (obj != null) {
                this.b.c.d(aacl.b(obj));
            }
        }
    }
}
