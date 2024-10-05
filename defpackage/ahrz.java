package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ahrz extends ahrq {
    public ViewGroup j;
    public TextView k;
    private FrameLayout r;
    private ImageView s;
    private ajjz t;
    private FrameLayout u;

    public ahrz(Context context, CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter, aqte aqteVar) {
        super(context, creatorEndscreenOverlayPresenter, aqteVar);
    }

    @Override // defpackage.ahrq
    public final View c() {
        if (this.r == null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.a).inflate(R.layout.endscreen_element_layout_icon, (ViewGroup) this.c.g, false);
            this.r = frameLayout;
            frameLayout.setOnClickListener(this);
            FrameLayout frameLayout2 = (FrameLayout) this.r.findViewById(R.id.image_container);
            this.u = frameLayout2;
            ahrq.e(frameLayout2);
            this.u.addView(d());
            this.j = (ViewGroup) this.r.findViewById(R.id.icon_container);
            this.k = (TextView) this.r.findViewById(R.id.cta_text);
            j();
            f(this.r);
        }
        return this.r;
    }

    @Override // defpackage.ahrq
    public void g(ahsb ahsbVar) {
        super.g(ahsbVar);
        ahsbVar.d.setVisibility(0);
        ajjz ajjzVar = this.t;
        if (ajjzVar != null) {
            ImageView imageView = ahsbVar.d;
            avgg avggVar = this.b.d;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            ajjzVar.h(imageView, avggVar);
        }
        ahsbVar.e.setVisibility(8);
    }

    @Override // defpackage.ahrq
    public final void h(ajjz ajjzVar) {
        super.h(ajjzVar);
        this.t = ajjzVar;
        ImageView k = k();
        avgg avggVar = this.b.e;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        ajjzVar.h(k, avggVar);
    }

    @Override // defpackage.ahrq
    public final boolean i() {
        return true;
    }

    public void j() {
        this.j.addView(k());
        k().setBackgroundColor(0);
    }

    public final ImageView k() {
        if (this.s == null) {
            this.s = new ImageView(this.a);
            this.s.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.s.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        return this.s;
    }
}
