package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acgy extends vw {
    public final ArrayList d = new ArrayList();
    private final acgu e;

    public acgy(acgu acguVar) {
        this.e = acguVar;
    }

    @Override // defpackage.vw
    public final int b() {
        return this.d.size();
    }

    @Override // defpackage.vw
    public final int c(int i) {
        return R.layout.lc_game_title;
    }

    @Override // defpackage.vw
    public final wv f(ViewGroup viewGroup, int i) {
        return new acgx(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lc_game_title, viewGroup, false), this.e);
    }

    @Override // defpackage.vw
    public final void o(wv wvVar, int i) {
        acgx acgxVar = (acgx) wvVar;
        aqzu aqzuVar = (aqzu) this.d.get(i);
        acgxVar.v = aqzuVar;
        acgxVar.t.setText(aqzuVar.c);
        acgxVar.u.setText(aqzuVar.d);
    }

    public final void w() {
        this.d.clear();
    }
}
