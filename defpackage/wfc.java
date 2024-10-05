package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class wfc extends vw {
    public int[] d;
    private final View.OnClickListener e;
    private final View.OnClickListener f;
    private final String g;
    private final String h;

    public wfc(Context context, wed wedVar) {
        this.g = context.getResources().getString(R.string.use_password);
        this.h = context.getResources().getString(R.string.use_fingerprint);
        this.e = new wel(wedVar, 3);
        this.f = new wel(wedVar, 4);
    }

    @Override // defpackage.vw
    public final int b() {
        int[] iArr = this.d;
        if (iArr == null) {
            return 0;
        }
        return iArr.length;
    }

    @Override // defpackage.vw
    public final /* bridge */ /* synthetic */ wv f(ViewGroup viewGroup, int i) {
        return new wfb((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.modal_other_methods_list_item, viewGroup, false));
    }

    @Override // defpackage.vw
    public final /* bridge */ /* synthetic */ void o(wv wvVar, int i) {
        wfb wfbVar = (wfb) wvVar;
        int i2 = this.d[i];
        if (i2 == 0) {
            wfbVar.t.setText(this.g);
            wfbVar.t.setOnClickListener(this.e);
        } else {
            if (i2 != 1) {
                return;
            }
            wfbVar.t.setText(this.h);
            wfbVar.t.setOnClickListener(this.f);
        }
    }
}
