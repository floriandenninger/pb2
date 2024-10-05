package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public class zwp extends FrameLayout {
    public final ImageView a;
    public final ImageView b;
    public final int c;
    public zwm d;
    private final ImageView e;
    private final YouTubeTextView f;
    private final int g;
    private boolean h;

    public zwp(Context context) {
        super(context, null);
        b(context);
        this.a = (ImageView) findViewById(R.id.thumb_image_view);
        this.b = (ImageView) findViewById(R.id.thumb_image_view_placeholder);
        this.e = (ImageView) findViewById(R.id.thumb_image_view_scrim);
        this.f = (YouTubeTextView) findViewById(R.id.duration_text_view);
        this.g = aih.d(context, R.color.gallery_thumb_background);
        this.c = aih.d(context, R.color.gallery_thumb_background_no_thumb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.a.setBackgroundColor(this.g);
        this.b.setVisibility(8);
    }

    protected void b(Context context) {
        LayoutInflater.from(context).inflate(R.layout.media_grid_thumb_view, (ViewGroup) this, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(long j) {
        if (j >= zws.a) {
            this.f.setText(zws.a(j));
            this.f.setContentDescription(vlu.f(getContext(), j));
            this.f.setVisibility(0);
            this.e.setVisibility(0);
            return;
        }
        if (!this.h || j <= 0) {
            this.f.setVisibility(8);
            this.f.setText("");
            this.f.setContentDescription("");
            this.e.setVisibility(4);
            return;
        }
        this.f.setText("0:00");
        this.f.setContentDescription(vlu.f(getContext(), j));
        this.f.setVisibility(0);
        this.e.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(Bitmap bitmap) {
        this.a.setImageBitmap(bitmap);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (!this.h) {
            super.onMeasure(i, i);
            setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth());
        } else {
            int size = View.MeasureSpec.getSize(i);
            int i3 = (int) (size * 1.7777778f);
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
            setMeasuredDimension(size, i3);
        }
    }

    public zwp(Context context, boolean z) {
        this(context);
        this.h = z;
    }
}
