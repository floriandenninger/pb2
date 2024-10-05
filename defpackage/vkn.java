package defpackage;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vkn {
    public final vkg a;
    public final RecyclerView b;
    public final LinearProgressIndicator c;
    public final vlx d;
    public int f;
    public final vlw g;
    public final View.OnClickListener i;
    public final ajoy j;
    public amru e = amru.q();
    public boolean h = true;

    public vkn(ajyw ajywVar, vrp vrpVar, vlx vlxVar, ajoy ajoyVar, ajoy ajoyVar2, aok aokVar, RecyclerView recyclerView, final LinearProgressIndicator linearProgressIndicator, final vnj vnjVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.d = vlxVar;
        this.j = ajoyVar;
        vlw A = ajoyVar2.A(20);
        this.g = A;
        vlxVar.d(A.b());
        this.b = recyclerView;
        this.c = linearProgressIndicator;
        ((vot) vnjVar).a.f(aokVar, new aox() { // from class: vki
            @Override // defpackage.aox
            public final void a(Object obj) {
                final vkn vknVar = vkn.this;
                vmr vmrVar = (vmr) obj;
                if (!vmrVar.a.isEmpty()) {
                    amru amruVar = vmrVar.a;
                    int size = vknVar.e.size();
                    int size2 = amruVar.size();
                    int size3 = vknVar.e.size();
                    vkg vkgVar = vknVar.a;
                    vkgVar.d = amruVar;
                    vkgVar.l(size + 1, size2 - size3);
                    vknVar.e = vmrVar.a;
                    vknVar.c.setVisibility(4);
                    if (vknVar.h) {
                        vknVar.h = false;
                        final vlv C = vknVar.j.C(awzd.RENDER, awze.OBAKE_MORE_CLUSTERS_SCREEN);
                        C.a();
                        vknVar.b.post(new Runnable() { // from class: vkk
                            @Override // java.lang.Runnable
                            public final void run() {
                                vkn vknVar2 = vkn.this;
                                vlv vlvVar = C;
                                vlx vlxVar2 = vknVar2.d;
                                vlw vlwVar = vknVar2.g;
                                vlwVar.c(vlvVar.b());
                                vlxVar2.c(vlwVar.a());
                            }
                        });
                        return;
                    }
                    return;
                }
                if (vmrVar.b.h()) {
                    vknVar.c.setVisibility(4);
                    vmd vmdVar = vmd.NON_RETRYABLE;
                    int ordinal = ((vmd) vmrVar.b.c()).ordinal();
                    if (ordinal == 0) {
                        allo m = allo.m(vknVar.b, R.string.op3_something_went_wrong, -2);
                        m.q(R.string.op3_dismiss, new vkt(m, 1));
                        m.h();
                    } else if (ordinal == 1) {
                        allo m2 = allo.m(vknVar.b, R.string.op3_something_went_wrong, -2);
                        m2.q(R.string.op3_retry, vknVar.i);
                        m2.h();
                    } else {
                        if (ordinal != 2) {
                            return;
                        }
                        allo m3 = allo.m(vknVar.b, R.string.op3_check_your_connection, -2);
                        m3.q(R.string.op3_retry, vknVar.i);
                        m3.h();
                    }
                }
            }
        });
        recyclerView.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(recyclerView.getResources().getInteger(R.integer.photo_picker_num_columns), null);
        gridLayoutManager.g = new vkl(gridLayoutManager);
        recyclerView.af(gridLayoutManager);
        vkj vkjVar = new vkj(vrpVar);
        vkb vkbVar = (vkb) ajywVar.a.get();
        vkbVar.getClass();
        tgn tgnVar = (tgn) ajywVar.b.get();
        tgnVar.getClass();
        tgd tgdVar = (tgd) ajywVar.c.get();
        tgdVar.getClass();
        vkg vkgVar = new vkg(vkbVar, tgnVar, tgdVar, vkjVar);
        this.a = vkgVar;
        recyclerView.ac(vkgVar);
        vnjVar.a(1000);
        this.f = 1000;
        recyclerView.aD(new vkm(this, vnjVar));
        this.i = new View.OnClickListener() { // from class: vkh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LinearProgressIndicator linearProgressIndicator2 = LinearProgressIndicator.this;
                vnj vnjVar2 = vnjVar;
                linearProgressIndicator2.setVisibility(0);
                vmq vmqVar = ((vot) vnjVar2).b;
                vmqVar.f = false;
                vmqVar.b();
            }
        };
    }
}
