package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hsl extends FrameLayout {
    public final ImageView a;
    public final View b;
    public final ProgressBar c;
    public final YouTubeTextView d;
    public final ammv e;
    public final ammv f;
    public ammv g;
    private final View h;

    public hsl(Context context, ammv ammvVar, ammv ammvVar2) {
        super(context, null);
        LayoutInflater.from(context).inflate(R.layout.carousel_thumbnail_view, (ViewGroup) this, true);
        View findViewById = findViewById(R.id.carousel_thumbnail_view_parent);
        this.h = findViewById;
        this.a = (ImageView) findViewById(R.id.carousel_thumbnail_image_view);
        this.b = findViewById(R.id.carousel_thumbnail_image_border);
        this.c = (ProgressBar) findViewById(R.id.carousel_thumbnail_image_loading_bar);
        this.d = (YouTubeTextView) findViewById(R.id.carousel_thumbnail_duration_text_view);
        this.e = ammvVar;
        this.f = ammvVar2;
        if (ammvVar.h() && ammvVar2.h()) {
            ((zdf) ammvVar.c()).a((zdg) ammvVar2.c());
            ((zdf) ammvVar.c()).c(findViewById);
        }
        this.g = amlr.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(ammv ammvVar) {
        this.c.setVisibility(8);
        if (ammvVar.h()) {
            this.a.setBackground(null);
            this.a.setImageBitmap((Bitmap) ammvVar.c());
            return;
        }
        this.a.setBackground(getContext().getDrawable(R.drawable.reel_edit_carousel_thumbnail_failed_background));
        Drawable drawable = getContext().getDrawable(R.drawable.yt_outline_alert_circle_white_20);
        if (drawable != null) {
            drawable.setTint(wbs.W(getContext(), R.attr.ytErrorIndicator).orElse(-65536));
            this.a.setImageDrawable(drawable);
        }
    }
}
