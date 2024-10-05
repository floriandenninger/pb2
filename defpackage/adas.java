package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adas extends vw {
    public List d;
    private final LayoutInflater e;
    private final View.OnClickListener f;
    private final acra g;

    public adas(Context context, View.OnClickListener onClickListener, acra acraVar) {
        this.e = LayoutInflater.from(context);
        this.f = onClickListener;
        this.g = acraVar;
    }

    @Override // defpackage.vw
    public final int b() {
        List list = this.d;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return this.d.size() + 1;
    }

    @Override // defpackage.vw
    public final int c(int i) {
        return i == 0 ? 0 : 1;
    }

    @Override // defpackage.vw
    public final wv f(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new adar(this.e.inflate(R.layout.mdx_delete_tv_codes_row, viewGroup, false), this.f);
        }
        return new wv(this.e.inflate(R.layout.mdx_delete_tv_codes_header, viewGroup, false));
    }

    @Override // defpackage.vw
    public final void o(wv wvVar, int i) {
        if (wvVar instanceof adar) {
            adar adarVar = (adar) wvVar;
            adga adgaVar = (adga) this.d.get(i - 1);
            acra acraVar = this.g;
            adarVar.t.setText(adgaVar.c());
            acraVar.n(new acqx(acsb.c(27858)));
            adarVar.u.setTag(adgaVar);
        }
    }
}
