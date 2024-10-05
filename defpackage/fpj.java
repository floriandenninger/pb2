package defpackage;

import android.app.Dialog;
import android.view.ScaleGestureDetector;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fpj extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    final /* synthetic */ fpl a;

    public fpj(fpl fplVar) {
        this.a = fplVar;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        fpl fplVar = this.a;
        float f = ((int) ((fplVar.c * scaleFactor) * 100.0f)) / 100.0f;
        fplVar.c = f;
        fplVar.c = Math.max(1.0f, Math.min(f, 10.0f));
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        fpl fplVar = this.a;
        if (!fplVar.d) {
            fplVar.l = false;
            if (fplVar.m) {
                fplVar.d = true;
                FrameLayout frameLayout = new FrameLayout(fplVar.getContext());
                if (fplVar.n) {
                    fplVar.getLocationInWindow(new int[2]);
                    ImageView a = fplVar.a();
                    a.setBackground(fplVar.getBackground());
                    a.setX(r5[0]);
                    a.setY(r5[1]);
                    frameLayout.addView(a, new FrameLayout.LayoutParams(fplVar.getWidth(), fplVar.getHeight()));
                    if (fplVar.s == 2) {
                        ImageView a2 = fplVar.a();
                        a2.setBackgroundColor(fplVar.getResources().getColor(R.color.zoom_overlay_translucent_black));
                        a2.setX(r5[0]);
                        a2.setY(r5[1]);
                        frameLayout.addView(a2, new FrameLayout.LayoutParams(fplVar.getWidth(), fplVar.getHeight()));
                    }
                }
                fplVar.g = fplVar.a();
                fplVar.g.setImageDrawable(fplVar.getDrawable());
                frameLayout.addView(fplVar.g, new FrameLayout.LayoutParams(fplVar.getWidth(), fplVar.getHeight()));
                fplVar.f = new Dialog(fplVar.getContext(), android.R.style.Theme.Translucent.NoTitleBar.Fullscreen);
                int i = fplVar.s;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                if (i2 == 1 && fplVar.f.getWindow() != null) {
                    fplVar.f.getWindow().setBackgroundDrawableResource(R.color.zoom_overlay_translucent_black);
                }
                fplVar.f.addContentView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
                fplVar.f.show();
                fpl fplVar2 = this.a;
                if (fplVar2.i != null && fplVar2.j != null) {
                    sws a3 = swu.a();
                    sxc sxcVar = fplVar2.h;
                    if (sxcVar != null) {
                        a3.f = sxcVar.r;
                    }
                    fplVar2.i.b(fplVar2.j, a3.a()).Q();
                }
            }
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }
}
