package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.google.android.youtube.R;
import com.google.vr.sdk.base.HeadsetSelector;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahoz extends ahoh implements AdapterView.OnItemClickListener {
    public static final String ae = "ahoz";
    public ywr af;
    public ahox ag;

    @Override // defpackage.uyt
    protected final /* bridge */ /* synthetic */ ListAdapter aH() {
        return new ajxn(C());
    }

    @Override // defpackage.uyt
    protected final AdapterView.OnItemClickListener aJ() {
        return this;
    }

    @Override // defpackage.uyt
    protected final String aK() {
        return O(R.string.vr_pick_different_viewer_title);
    }

    @Override // defpackage.uyt
    protected final int mA() {
        return 0;
    }

    @Override // defpackage.ajxk, defpackage.uyt, defpackage.bv, defpackage.ce
    public final void mS() {
        super.mS();
        Context qR = qR();
        List<HeadsetSelector.HeadsetInfo> b = ahot.b(qR, this.af);
        amkq.E(b.size() >= 2);
        HeadsetSelector.HeadsetInfo a = ahot.a(qR, this.af);
        ajxn ajxnVar = (ajxn) this.aD;
        ajxnVar.clear();
        for (HeadsetSelector.HeadsetInfo headsetInfo : b) {
            ahoe ahoeVar = new ahoe(qR, headsetInfo);
            ahoeVar.a(headsetInfo.equals(a));
            ajxnVar.add(ahoeVar);
        }
        ajxnVar.notifyDataSetChanged();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ahot.f(qR(), this.af, ((ahoe) ((ajxn) this.aD).getItem(i)).a);
        ahox ahoxVar = this.ag;
        if (ahoxVar != null) {
            ahoxVar.b();
        }
        dismiss();
    }
}
