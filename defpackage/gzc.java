package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class gzc extends wv {
    public static final /* synthetic */ int v = 0;
    public final ImageView t;
    public final gyu u;

    public gzc(View view) {
        super(view);
        FrameLayout frameLayout = (FrameLayout) view;
        ImageView imageView = new ImageView(frameLayout.getContext());
        this.t = imageView;
        gyu gyuVar = new gyu(frameLayout.getContext());
        this.u = gyuVar;
        Context context = frameLayout.getContext();
        if (gyuVar.a == null) {
            gyuVar.a = new Paint();
        }
        gyuVar.a.setColor(wbs.Q(context, R.attr.ytTextDisabled));
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        gyuVar.b = yjk.K(displayMetrics, 1);
        gyuVar.c = yjk.K(displayMetrics, 12);
        gyuVar.d = yjk.K(displayMetrics, 20);
        gyuVar.e = yjk.K(displayMetrics, 32);
        gyuVar.setBackgroundColor(wbs.Q(frameLayout.getContext(), R.attr.ytGeneralBackgroundA));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        imageView.setLayoutParams(layoutParams);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setVisibility(4);
        frameLayout.addView(imageView);
        gyuVar.setLayoutParams(layoutParams);
        frameLayout.addView(gyuVar);
    }
}
