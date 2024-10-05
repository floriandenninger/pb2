package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.CircularImageView;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ahrs extends ahrq {
    private FrameLayout j;
    private CircularImageView k;
    private ajjz r;
    private FrameLayout s;

    public ahrs(Context context, CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter, aqte aqteVar) {
        super(context, creatorEndscreenOverlayPresenter, aqteVar);
    }

    @Override // defpackage.ahrq
    public final View c() {
        if (this.j == null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.a).inflate(R.layout.endscreen_element_layout_circle, (ViewGroup) this.c.g, false);
            this.j = frameLayout;
            frameLayout.setOnClickListener(this);
            FrameLayout frameLayout2 = (FrameLayout) this.j.findViewById(R.id.image_container);
            this.s = frameLayout2;
            frameLayout2.addView(d(), 0);
            FrameLayout frameLayout3 = this.s;
            ahrq.e(frameLayout3);
            frameLayout3.setOutlineProvider(new ahrr());
            frameLayout3.setClipToOutline(true);
            f(this.j);
        }
        return this.j;
    }

    @Override // defpackage.ahrq
    public final ImageView d() {
        if (this.k == null) {
            CircularImageView circularImageView = new CircularImageView(this.a, null);
            this.k = circularImageView;
            circularImageView.setBackgroundDrawable(new ColorDrawable(aih.d(this.a, R.color.endscreen_element_border_color)));
        }
        return this.k;
    }

    @Override // defpackage.ahrq
    public void g(ahsb ahsbVar) {
        super.g(ahsbVar);
        ahsbVar.e.setVisibility(0);
        ajjz ajjzVar = this.r;
        if (ajjzVar != null) {
            ImageView imageView = ahsbVar.e;
            avgg avggVar = this.b.d;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            ajjzVar.h(imageView, avggVar);
        }
        ahsbVar.d.setVisibility(8);
    }

    @Override // defpackage.ahrq
    public final void h(ajjz ajjzVar) {
        super.h(ajjzVar);
        this.r = ajjzVar;
    }

    @Override // defpackage.ahrq
    public final boolean i() {
        return true;
    }
}
