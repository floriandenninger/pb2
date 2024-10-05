package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nnj extends nnr implements AdapterView.OnItemClickListener, kej {
    private aanb[] ae;
    private int af;
    private ahul ag;

    @Override // defpackage.kej
    public final void a(ahul ahulVar) {
        this.ag = ahulVar;
    }

    @Override // defpackage.uyt
    protected final /* bridge */ /* synthetic */ ListAdapter aH() {
        ci C = C();
        C.getClass();
        ajxn ajxnVar = new ajxn(C);
        aanb[] aanbVarArr = this.ae;
        if (aanbVarArr != null) {
            int i = 0;
            while (i < aanbVarArr.length) {
                nnm nnmVar = new nnm(C, aanbVarArr[i]);
                nnmVar.a(i == this.af);
                ajxnVar.add(nnmVar);
                i++;
            }
        }
        return ajxnVar;
    }

    @Override // defpackage.uyt
    protected final AdapterView.OnItemClickListener aJ() {
        return this;
    }

    @Override // defpackage.uyt
    protected final String aK() {
        return qX().getString(R.string.audio_tracks_title);
    }

    @Override // defpackage.kej
    public final void b(aanb[] aanbVarArr, int i) {
        if (this.ae == aanbVarArr && this.af == i) {
            return;
        }
        this.ae = aanbVarArr;
        this.af = i;
        ListAdapter listAdapter = this.aD;
        if (listAdapter != null) {
            ((ajxn) listAdapter).notifyDataSetChanged();
        }
    }

    @Override // defpackage.kej
    public final void c(ci ciVar) {
        if (ar() || av()) {
            return;
        }
        qh(ciVar.getSupportFragmentManager(), "AUDIO_TRACKS_MENU_BOTTOM_SHEET_FRAGMENT");
    }

    @Override // defpackage.uyt
    protected final int mA() {
        return 0;
    }

    @Override // defpackage.uyt, defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View mg = super.mg(layoutInflater, viewGroup, bundle);
        if (mg != null) {
            View findViewById = mg.findViewById(R.id.bottom_sheet_title);
            if (findViewById instanceof TextView) {
                ((TextView) findViewById).setTextColor(wbs.Q(layoutInflater.getContext(), R.attr.ytTextPrimary));
            }
        }
        return mg;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        nnm nnmVar = (nnm) ((ajxn) this.aD).getItem(i);
        ahul ahulVar = this.ag;
        if (ahulVar != null && nnmVar != null) {
            String str = nnmVar.a.a;
            aiwk aiwkVar = ((ahuq) ahulVar).a.p.a;
            if (aiwkVar != null) {
                aiwkVar.M(str);
            }
        }
        dismiss();
    }
}
