package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xzf extends FrameLayout {
    public final ImageView a;
    public final View b;
    public final View c;
    public final ProgressBar d;
    public final View e;
    public apmg f;
    public apmg g;
    private final argd h;

    public xzf(Context context, int i, argd argdVar) {
        super(context, null);
        LayoutInflater.from(context).inflate(R.layout.post_image_carousel_cell, (ViewGroup) this, true);
        this.h = argdVar;
        ImageView imageView = (ImageView) findViewById(R.id.carousel_image);
        this.a = imageView;
        View findViewById = findViewById(R.id.carousel_image_delete_button);
        this.b = findViewById;
        View findViewById2 = findViewById(R.id.carousel_image_edit_button);
        this.c = findViewById2;
        this.d = (ProgressBar) findViewById(R.id.upload_progress_bar);
        this.e = findViewById(R.id.image_upload_error);
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        imageView.getLayoutParams().width = i;
        imageView.getLayoutParams().height = i;
        whu.E(imageView, imageView.getBackground());
        aulq aulqVar = argdVar.c;
        if ((aulqVar == null ? aulq.a : aulqVar).pY(ButtonRendererOuterClass.buttonRenderer)) {
            aulq aulqVar2 = argdVar.c;
            apmg apmgVar = (apmg) (aulqVar2 == null ? aulq.a : aulqVar2).pX(ButtonRendererOuterClass.buttonRenderer);
            this.f = apmgVar;
            aott aottVar = apmgVar.s;
            aots aotsVar = (aottVar == null ? aott.a : aottVar).c;
            findViewById.setContentDescription((aotsVar == null ? aots.a : aotsVar).c);
        }
        aulq aulqVar3 = argdVar.d;
        if ((aulqVar3 == null ? aulq.a : aulqVar3).pY(ButtonRendererOuterClass.buttonRenderer)) {
            aulq aulqVar4 = argdVar.d;
            apmg apmgVar2 = (apmg) (aulqVar4 == null ? aulq.a : aulqVar4).pX(ButtonRendererOuterClass.buttonRenderer);
            this.g = apmgVar2;
            aott aottVar2 = apmgVar2.s;
            aots aotsVar2 = (aottVar2 == null ? aott.a : aottVar2).c;
            String str = (aotsVar2 == null ? aots.a : aotsVar2).c;
            findViewById2.setContentDescription(str);
            imageView.setContentDescription(str);
        }
    }
}
