package defpackage;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vkz {
    public final vkr a;
    public final RecyclerView b;
    public final LinearProgressIndicator c;
    public final vlx d;
    public int f;
    public final vlw g;
    public final awze h;
    public final View.OnClickListener j;
    public final ajoy k;
    public amru e = amru.q();
    public boolean i = true;

    public vkz(ajyw ajywVar, vlx vlxVar, ajoy ajoyVar, ajoy ajoyVar2, aps apsVar, vrp vrpVar, aok aokVar, RecyclerView recyclerView, final LinearProgressIndicator linearProgressIndicator, final vnl vnlVar, ammv ammvVar, awze awzeVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.d = vlxVar;
        this.k = ajoyVar;
        this.h = awzeVar;
        vnk vnkVar = (vnk) apsVar.a(vnk.class);
        vlw A = ajoyVar2.A(21);
        this.g = A;
        vlxVar.d(A.b());
        this.b = recyclerView;
        this.c = linearProgressIndicator;
        vnlVar.a().f(aokVar, new aox() { // from class: vku
            @Override // defpackage.aox
            public final void a(Object obj) {
                final vkz vkzVar = vkz.this;
                vnb vnbVar = (vnb) obj;
                if (!vnbVar.a.isEmpty()) {
                    amru amruVar = vnbVar.a;
                    int size = vkzVar.e.size();
                    boolean w = vkzVar.a.w();
                    int size2 = amruVar.size();
                    int size3 = vkzVar.e.size();
                    vkr vkrVar = vkzVar.a;
                    vkrVar.d = amruVar;
                    vkrVar.l(size + (w ? 1 : 0), size2 - size3);
                    vkzVar.e = amruVar;
                    vkzVar.c.setVisibility(4);
                    if (vkzVar.i) {
                        vkzVar.i = false;
                        final vlv C = vkzVar.k.C(awzd.RENDER, vkzVar.h);
                        C.a();
                        vkzVar.b.post(new Runnable() { // from class: vkw
                            @Override // java.lang.Runnable
                            public final void run() {
                                vkz vkzVar2 = vkz.this;
                                vlv vlvVar = C;
                                vlx vlxVar2 = vkzVar2.d;
                                vlw vlwVar = vkzVar2.g;
                                vlwVar.c(vlvVar.b());
                                vlxVar2.c(vlwVar.a());
                            }
                        });
                        return;
                    }
                    return;
                }
                if (vnbVar.b.h()) {
                    vkzVar.c.setVisibility(4);
                    vmd vmdVar = vmd.NON_RETRYABLE;
                    int ordinal = ((vmd) vnbVar.b.c()).ordinal();
                    if (ordinal == 0) {
                        allo m = allo.m(vkzVar.b, R.string.op3_something_went_wrong, -2);
                        m.q(R.string.op3_dismiss, new vkt(m, 0));
                        m.h();
                    } else if (ordinal == 1) {
                        allo m2 = allo.m(vkzVar.b, R.string.op3_something_went_wrong, -2);
                        m2.q(R.string.op3_retry, vkzVar.j);
                        m2.h();
                    } else {
                        if (ordinal != 2) {
                            return;
                        }
                        allo m3 = allo.m(vkzVar.b, R.string.op3_check_your_connection, -2);
                        m3.q(R.string.op3_retry, vkzVar.j);
                        m3.h();
                    }
                }
            }
        });
        recyclerView.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(recyclerView.getResources().getInteger(R.integer.photo_picker_num_columns), null);
        gridLayoutManager.g = new vkx(this, gridLayoutManager);
        recyclerView.af(gridLayoutManager);
        vkv vkvVar = new vkv(vnkVar, vrpVar);
        vkb vkbVar = (vkb) ajywVar.a.get();
        vkbVar.getClass();
        tgn tgnVar = (tgn) ajywVar.b.get();
        tgnVar.getClass();
        tgd tgdVar = (tgd) ajywVar.c.get();
        tgdVar.getClass();
        vkr vkrVar = new vkr(vkbVar, tgnVar, tgdVar, vkvVar, ammvVar);
        this.a = vkrVar;
        recyclerView.ac(vkrVar);
        if (axxp.d()) {
            recyclerView.aB(new vju((int) recyclerView.getResources().getDimension(R.dimen.photo_picker_grid_spacing), recyclerView.getResources().getInteger(R.integer.photo_picker_num_columns), vkrVar.w()));
        }
        vnlVar.b(1000);
        this.f = 1000;
        recyclerView.aD(new vky(this, gridLayoutManager, vnlVar));
        this.j = new View.OnClickListener() { // from class: vks
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LinearProgressIndicator linearProgressIndicator2 = LinearProgressIndicator.this;
                vnl vnlVar2 = vnlVar;
                linearProgressIndicator2.setVisibility(0);
                vnlVar2.c();
            }
        };
    }
}
