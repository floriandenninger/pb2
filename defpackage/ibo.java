package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import android.widget.ImageView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.VideoSelectedActionOuterClass$VideoSelectedAction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ibo implements ykl {
    final /* synthetic */ View a;
    final /* synthetic */ VideoSelectedActionOuterClass$VideoSelectedAction b;
    final /* synthetic */ ibq c;

    public ibo(ibq ibqVar, View view, VideoSelectedActionOuterClass$VideoSelectedAction videoSelectedActionOuterClass$VideoSelectedAction) {
        this.c = ibqVar;
        this.a = view;
        this.b = videoSelectedActionOuterClass$VideoSelectedAction;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        whu.K(this.c.a, R.string.reel_generic_error_message, 0);
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Bitmap bitmap = (Bitmap) obj2;
        View view = this.a;
        if (view != null) {
            ImageView imageView = (ImageView) view.findViewById(R.id.thumbnail);
            ga a = gl.a(view.getResources(), bitmap);
            a.d();
            imageView.setImageDrawable(a);
        }
        final ibq ibqVar = this.c;
        View view2 = this.a;
        VideoSelectedActionOuterClass$VideoSelectedAction videoSelectedActionOuterClass$VideoSelectedAction = this.b;
        if (ibqVar.i != null) {
            ibqVar.e.post(new Runnable() { // from class: ibn
                @Override // java.lang.Runnable
                public final void run() {
                    ibq.this.i.a();
                }
            });
        }
        if (view2 == null) {
            return;
        }
        aone createBuilder = axdi.a.createBuilder();
        boolean z = ibqVar.h;
        createBuilder.copyOnWrite();
        axdi axdiVar = (axdi) createBuilder.instance;
        axdiVar.b |= 4096;
        axdiVar.e = z;
        aone createBuilder2 = axeh.a.createBuilder();
        boolean z2 = videoSelectedActionOuterClass$VideoSelectedAction.c;
        createBuilder2.copyOnWrite();
        axeh axehVar = (axeh) createBuilder2.instance;
        axehVar.b |= 2;
        axehVar.d = z2;
        axeh axehVar2 = (axeh) createBuilder2.build();
        createBuilder.copyOnWrite();
        axdi axdiVar2 = (axdi) createBuilder.instance;
        axehVar2.getClass();
        axdiVar2.d = axehVar2;
        axdiVar2.c = 10;
        axdi axdiVar3 = (axdi) createBuilder.build();
        axdj j = axdk.j();
        j.copyOnWrite();
        ((axdk) j.instance).F(axdiVar3);
        Matrix matrix = new Matrix();
        matrix.preScale(0.5f, 0.5f, 0.5f, 0.5f);
        aorq G = wcy.G(matrix);
        j.copyOnWrite();
        ((axdk) j.instance).E(G);
        aone createBuilder3 = axcv.a.createBuilder();
        createBuilder3.copyOnWrite();
        axcv axcvVar = (axcv) createBuilder3.instance;
        axcvVar.e = 2;
        axcvVar.b |= 1;
        aone createBuilder4 = axcu.a.createBuilder();
        String str = videoSelectedActionOuterClass$VideoSelectedAction.b;
        createBuilder4.copyOnWrite();
        axcu axcuVar = (axcu) createBuilder4.instance;
        str.getClass();
        axcuVar.b |= 1;
        axcuVar.c = str;
        createBuilder3.copyOnWrite();
        axcv axcvVar2 = (axcv) createBuilder3.instance;
        axcu axcuVar2 = (axcu) createBuilder4.build();
        axcuVar2.getClass();
        axcvVar2.d = axcuVar2;
        axcvVar2.c = 4;
        aone createBuilder5 = axct.a.createBuilder();
        aorq H = wcy.H();
        createBuilder5.copyOnWrite();
        axct axctVar = (axct) createBuilder5.instance;
        H.getClass();
        axctVar.c = H;
        axctVar.b = 1;
        createBuilder3.bD(createBuilder5);
        j.a((axcv) createBuilder3.build());
        etx.aq(ibqVar.a, ibqVar.k, view2, j, new icb(ibqVar.b, 1));
    }
}
