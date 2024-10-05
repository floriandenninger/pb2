package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.livecreation.ui.view.CropView;
import com.google.android.youtube.R;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acgi extends achc {
    public acgh a;
    public CropView b;
    private boolean c;

    @Override // defpackage.ce
    public final void Z() {
        acgh acghVar;
        super.Z();
        if (!this.c || (acghVar = this.a) == null) {
            return;
        }
        acgm acgmVar = (acgm) acghVar;
        acgmVar.aF();
        whu.K(acgmVar.C(), R.string.lc_image_load_error, 1);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = C().getLayoutInflater().inflate(R.layout.lc_crop_thumbnail_fragment, viewGroup, false);
        CropView cropView = (CropView) inflate.findViewById(R.id.lc_crop_view);
        this.b = cropView;
        Uri uri = (Uri) this.m.getParcelable("ARG_INPUT_IMAGE");
        cropView.a = uri;
        try {
            cropView.f = ahbw.P(cropView.getContext().getContentResolver(), uri);
            if (((Integer) cropView.f.first).intValue() >= cropView.d && ((Integer) cropView.f.second).intValue() >= cropView.e) {
                Bitmap Q = ahbw.Q(cropView.getContext().getContentResolver(), uri);
                cropView.g = Q.getWidth();
                cropView.h = Q.getHeight();
                cropView.j.setImageBitmap(Q);
                cropView.i = new Matrix();
                cropView.requestLayout();
                z = true;
            }
        } catch (FileNotFoundException unused) {
        }
        this.c = !z;
        return inflate;
    }
}
