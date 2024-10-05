package com.google.android.apps.youtube.app.extensions.reel.watch.player;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Size;
import android.view.View;
import com.google.android.libraries.youtube.player.ui.PlayerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ReelPlayerView extends PlayerView {
    public boolean a;
    public boolean b;
    public boolean c;

    public ReelPlayerView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aivi, android.view.View
    public final void onMeasure(int i, int i2) {
        Size size;
        super.onMeasure(i, i2);
        View view = this.p;
        if (view == null) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (this.c) {
            if (measuredWidth > 0 && measuredWidth2 > 0) {
                double d = measuredHeight;
                double d2 = measuredWidth;
                Double.isNaN(d);
                Double.isNaN(d2);
                double d3 = d / d2;
                double d4 = measuredHeight2;
                double d5 = measuredWidth2;
                Double.isNaN(d4);
                Double.isNaN(d5);
                double d6 = d4 / d5;
                if (d3 < d6 && d6 != 0.0d) {
                    Double.isNaN(d);
                    measuredWidth = (int) (d / d6);
                } else if (d3 > d6) {
                    Double.isNaN(d2);
                    measuredHeight = (int) (d2 * d6);
                }
            }
            size = new Size(measuredWidth, measuredHeight);
        } else if (this.a) {
            if (measuredWidth2 > 0) {
                double d7 = measuredHeight2;
                double d8 = measuredWidth2;
                Double.isNaN(d7);
                Double.isNaN(d8);
                double d9 = d7 / d8;
                if (!this.b || d9 <= 1.5d) {
                    double d10 = measuredWidth;
                    Double.isNaN(d10);
                    measuredHeight = (int) (d10 * d9);
                } else {
                    double d11 = measuredHeight;
                    Double.isNaN(d11);
                    int i3 = (int) (d11 / d9);
                    if (i3 < measuredWidth) {
                        double d12 = i3;
                        double d13 = measuredWidth;
                        Double.isNaN(d13);
                        Double.isNaN(d12);
                        double d14 = d13 / d12;
                        Double.isNaN(d12);
                        measuredWidth = (int) (d12 * d14);
                        Double.isNaN(d11);
                        measuredHeight = (int) (d11 * d14);
                    } else {
                        measuredWidth = i3;
                    }
                }
            }
            size = new Size(measuredWidth, measuredHeight);
        } else {
            if (measuredWidth > 0 && measuredWidth2 > 0) {
                double d15 = measuredHeight;
                double d16 = measuredWidth;
                Double.isNaN(d15);
                Double.isNaN(d16);
                double d17 = d15 / d16;
                double d18 = measuredHeight2;
                double d19 = measuredWidth2;
                Double.isNaN(d18);
                Double.isNaN(d19);
                double d20 = d18 / d19;
                if (d17 > d20 && d20 != 0.0d) {
                    Double.isNaN(d15);
                    measuredWidth = (int) (d15 / d20);
                } else if (d17 < d20) {
                    Double.isNaN(d16);
                    measuredHeight = (int) (d16 * d20);
                }
            }
            size = new Size(measuredWidth, measuredHeight);
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(size.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size.getHeight(), 1073741824));
    }

    public ReelPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
