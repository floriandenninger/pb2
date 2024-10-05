package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abxi extends vw {
    public final List d = new ArrayList();
    private final LayoutInflater e;

    public abxi(LayoutInflater layoutInflater) {
        this.e = layoutInflater;
    }

    @Override // defpackage.vw
    public final int b() {
        return this.d.size();
    }

    @Override // defpackage.vw
    public final /* bridge */ /* synthetic */ wv f(ViewGroup viewGroup, int i) {
        return new abxg(this.e.inflate(R.layout.multi_message_confirm_dialog_icon_message_item, viewGroup, false));
    }

    @Override // defpackage.vw
    public final /* synthetic */ void o(wv wvVar, int i) {
        abxg abxgVar = (abxg) wvVar;
        abxh abxhVar = (abxh) this.d.get(i);
        abxgVar.t.setImageResource(abxhVar.a);
        abxgVar.u.setText(abxhVar.b);
    }
}
