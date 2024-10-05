package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.support.v7.widget.RecyclerView;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.app.extensions.reel.videoeffects.stickers.text.ColorChip;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class idf extends vw {
    private static final anep g = new anep(new int[]{R.layout.reel_add_text_basic_colors_page, R.layout.reel_add_text_advanced_colors_page, R.layout.reel_add_text_grey_colors});
    public Integer d;
    public int e;
    public View.OnClickListener f;
    private final int h;
    private RecyclerView i;

    public idf(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        this.h = point.x;
    }

    @Override // defpackage.vw
    public final int b() {
        return g.a;
    }

    @Override // defpackage.vw
    public final /* bridge */ /* synthetic */ wv f(ViewGroup viewGroup, int i) {
        this.i = (RecyclerView) viewGroup;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 16);
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(layoutParams);
        return new ide(frameLayout);
    }

    @Override // defpackage.vw
    public final /* bridge */ /* synthetic */ void o(wv wvVar, int i) {
        ide ideVar = (ide) wvVar;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(ideVar.t.getContext()).inflate(g.a(i), (ViewGroup) null, false);
        ideVar.t.addView(viewGroup);
        double d = this.h;
        double childCount = viewGroup.getChildCount();
        Double.isNaN(childCount);
        Double.isNaN(d);
        int i2 = (int) (d / (childCount + 0.5d));
        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
            View childAt = viewGroup.getChildAt(i3);
            View.OnClickListener onClickListener = this.f;
            onClickListener.getClass();
            childAt.setOnClickListener(onClickListener);
            childAt.getLayoutParams().width = i2;
            Integer num = this.d;
            if (num != null && num.equals(Integer.valueOf(((ColorChip) childAt).a))) {
                this.d = null;
                this.e = 0;
                this.i.n.Z(i);
                this.f.onClick(childAt);
            }
        }
        if (this.d != null) {
            int i4 = this.e + 1;
            this.e = i4;
            if (i4 < b()) {
                this.i.n.Z((i + 1) % b());
            }
        }
    }
}
