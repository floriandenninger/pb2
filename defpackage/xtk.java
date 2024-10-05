package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.widget.GridLayoutManager;
import android.view.ViewGroup;
import com.google.protos.youtube.api.innertube.BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint;
import com.google.protos.youtube.api.innertube.FancyDismissibleDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.PostImagePickerRendererOuterClass;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xtk extends vw {
    public final Context d;
    public final GridLayoutManager e;
    public final ow f;
    public final BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint g;
    public auei h;
    public final List i;
    public final xst j;
    public final ou k;
    public final lo l;

    public xtk(Context context, GridLayoutManager gridLayoutManager, xst xstVar, BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint, amru amruVar) {
        context.getClass();
        this.d = context;
        gridLayoutManager.getClass();
        this.e = gridLayoutManager;
        this.j = xstVar;
        this.g = backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint;
        aulq aulqVar = backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.j;
        if ((aulqVar == null ? aulq.a : aulqVar).pY(PostImagePickerRendererOuterClass.postImagePickerRenderer)) {
            aulq aulqVar2 = backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.j;
            this.h = (auei) (aulqVar2 == null ? aulq.a : aulqVar2).pX(PostImagePickerRendererOuterClass.postImagePickerRenderer);
        }
        this.i = new ArrayList();
        int i = 0;
        for (int size = amruVar.size(); i < size; size = size) {
            xuh xuhVar = (xuh) amruVar.get(i);
            this.i.add(new xrt(xuhVar.a, null, 0L, 0, 0, xuhVar.b, true));
            i++;
        }
        ou ouVar = new ou(context.getContentResolver());
        this.k = ouVar;
        this.f = new ow(xrt.class, ouVar, new ov(this));
        this.l = new xtj(this);
    }

    @Override // defpackage.vw
    public final int b() {
        return this.f.l;
    }

    @Override // defpackage.vw
    public final /* synthetic */ wv f(ViewGroup viewGroup, int i) {
        return new wv(new xue(this.d));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    @Override // defpackage.vw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void o(defpackage.wv r9, int r10) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xtk.o(wv, int):void");
    }

    @Override // defpackage.vw
    public final /* bridge */ /* synthetic */ void p(wv wvVar) {
        xue D = wvVar.D();
        D.b.setImageBitmap(null);
        D.b.setOnClickListener(null);
    }

    public final void w() {
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        aulq aulqVar = this.g.g;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        aqvu aqvuVar = (aqvu) aulqVar.pX(FancyDismissibleDialogRendererOuterClass.fancyDismissibleDialogRenderer);
        AlertDialog.Builder builder = new AlertDialog.Builder(this.d);
        if ((aqvuVar.b & 2) != 0) {
            aqygVar = aqvuVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        AlertDialog.Builder title = builder.setTitle(ajcq.b(aqygVar));
        if ((aqvuVar.b & 1) != 0) {
            aqygVar2 = aqvuVar.c;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        AlertDialog.Builder message = title.setMessage(ajcq.b(aqygVar2));
        if ((aqvuVar.b & 4) != 0) {
            aqygVar3 = aqvuVar.e;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
        } else {
            aqygVar3 = null;
        }
        wcy.r(message.setPositiveButton(ajcq.b(aqygVar3), (DialogInterface.OnClickListener) null).create());
    }
}
