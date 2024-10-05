package defpackage;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vkg extends vw {
    public amru d = amru.q();
    public final tgd e;
    public final vkj f;
    private final vkb g;
    private final tgn h;

    public vkg(vkb vkbVar, tgn tgnVar, tgd tgdVar, vkj vkjVar) {
        this.g = vkbVar;
        this.h = tgnVar;
        this.e = tgdVar;
        this.f = vkjVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final boolean w(int i) {
        return i == 0;
    }

    @Override // defpackage.vw
    public final int b() {
        return this.d.size() + 1;
    }

    @Override // defpackage.vw
    public final int c(int i) {
        return w(i) ? 0 : 1;
    }

    @Override // defpackage.vw
    public final wv f(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new wv(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.photo_picker_clusters_header_view, viewGroup, false));
        }
        return new vkf(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.photo_picker_cluster_image, viewGroup, false));
    }

    @Override // defpackage.vw
    public final void o(wv wvVar, int i) {
        if (c(i) == 1) {
            final vkf vkfVar = (vkf) wvVar;
            int i2 = i - 1;
            final aocu aocuVar = (aocu) this.d.get(i2);
            vkb vkbVar = this.g;
            aodg aodgVar = aocuVar.d;
            if (aodgVar == null) {
                aodgVar = aodg.a;
            }
            Uri c = vls.c(aodgVar);
            aoae aoaeVar = new aoae((byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
            aoaeVar.u();
            int i3 = vkf.w;
            vkbVar.c(c, aoaeVar, vkfVar.t);
            boolean z = ((aocuVar.b & 4) == 0 && aocuVar.e.isEmpty()) ? false : true;
            vkfVar.u.setText(z ? aocuVar.e : "");
            jw.V(vkfVar.t, true != z ? 1 : 2);
            vkfVar.v.setVisibility(true == z ? 0 : 4);
            tfy a = this.h.a.a(89735);
            a.e(sgf.H(aocuVar.c.hashCode()));
            a.e(sgf.R(i2));
            a.b(vkfVar.t);
            vkfVar.t.setOnClickListener(new View.OnClickListener() { // from class: vke
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    vkg vkgVar = vkg.this;
                    vkf vkfVar2 = vkfVar;
                    aocu aocuVar2 = aocuVar;
                    tgd tgdVar = vkgVar.e;
                    tgc a2 = tgc.a();
                    int i4 = vkf.w;
                    tgdVar.a(a2, vkfVar2.t);
                    vkgVar.f.a.a(aocuVar2);
                }
            });
        }
    }

    @Override // defpackage.vw
    public final void p(wv wvVar) {
        if (wvVar instanceof vkf) {
            int i = vkf.w;
            tgk.d(((vkf) wvVar).t);
        }
    }
}
