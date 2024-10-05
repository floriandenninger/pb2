package defpackage;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kzu extends vw {
    public final ArrayList d = new ArrayList();
    private final View.OnClickListener e;
    private final ColorStateList f;
    private final ColorStateList g;

    public kzu(View.OnClickListener onClickListener, ColorStateList colorStateList, ColorStateList colorStateList2) {
        this.e = onClickListener;
        colorStateList.getClass();
        this.f = colorStateList;
        colorStateList2.getClass();
        this.g = colorStateList2;
    }

    @Override // defpackage.vw
    public final int b() {
        return this.d.size();
    }

    @Override // defpackage.vw
    public final /* bridge */ /* synthetic */ wv f(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.navigation_dropdown_item_layout, viewGroup, false);
        wfb wfbVar = new wfb(inflate);
        inflate.setTag(wfbVar);
        inflate.setOnClickListener(this.e);
        return wfbVar;
    }

    @Override // defpackage.vw
    public final /* bridge */ /* synthetic */ void o(wv wvVar, int i) {
        aqyg aqygVar;
        wfb wfbVar = (wfb) wvVar;
        aqpj aqpjVar = (aqpj) this.d.get(i);
        int i2 = wfb.u;
        TextView textView = wfbVar.t;
        if ((aqpjVar.b & 1) != 0) {
            aqygVar = aqpjVar.e;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        wfbVar.t.setTextColor(aqpjVar.f ? this.f : this.g);
    }
}
