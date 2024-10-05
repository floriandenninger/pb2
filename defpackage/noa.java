package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class noa extends nnt implements AdapterView.OnItemClickListener, kfb {
    private avve[] ae;
    private int af;
    private ahwz ag;

    private static void aL(Context context, ajxn ajxnVar, avve[] avveVarArr, int i) {
        if (avveVarArr != null) {
            int i2 = 0;
            while (i2 < avveVarArr.length) {
                nnn nnnVar = new nnn(context, avveVarArr[i2]);
                nnnVar.a(i2 == i);
                ajxnVar.add(nnnVar);
                i2++;
            }
        }
    }

    @Override // defpackage.ce
    public final void X() {
        super.X();
        dismiss();
    }

    @Override // defpackage.kfb
    public final void a(ahwz ahwzVar) {
        this.ag = ahwzVar;
    }

    @Override // defpackage.uyt
    protected final /* bridge */ /* synthetic */ ListAdapter aH() {
        ci C = C();
        C.getClass();
        ajxn ajxnVar = new ajxn(C);
        aL(C(), ajxnVar, this.ae, this.af);
        return ajxnVar;
    }

    @Override // defpackage.uyt
    protected final AdapterView.OnItemClickListener aJ() {
        return this;
    }

    @Override // defpackage.uyt
    protected final String aK() {
        return null;
    }

    @Override // defpackage.kfb
    public final void b(avve[] avveVarArr, int i) {
        if (this.ae == avveVarArr && this.af == i) {
            return;
        }
        this.ae = avveVarArr;
        this.af = i;
        ajxn ajxnVar = (ajxn) this.aD;
        ci C = C();
        if (C == null || ajxnVar == null || !av()) {
            return;
        }
        ajxnVar.clear();
        aL(C, ajxnVar, avveVarArr, i);
        ajxnVar.notifyDataSetChanged();
    }

    @Override // defpackage.kfb
    public final void c(ci ciVar) {
        if (ar() || av()) {
            return;
        }
        qh(ciVar.getSupportFragmentManager(), "PLAYBACK_RATE_MENU_BOTTOM_SHEET_FRAGMENT");
    }

    @Override // defpackage.uyt
    protected final int mA() {
        return 0;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        nnn nnnVar = (nnn) ((ajxn) this.aD).getItem(i);
        ahwz ahwzVar = this.ag;
        if (ahwzVar != null && nnnVar != null) {
            ahxb ahxbVar = (ahxb) ahwzVar;
            ahxbVar.a.F(nnnVar.a);
            ahxbVar.c(ahcr.d(ahxbVar.b));
        }
        dismiss();
    }
}
