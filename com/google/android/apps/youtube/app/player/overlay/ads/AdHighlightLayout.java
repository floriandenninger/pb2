package com.google.android.apps.youtube.app.player.overlay.ads;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.youtube.app.player.overlay.fullscreenengagement.layout.MetadataHighlightsColumnLinearLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AdHighlightLayout extends MetadataHighlightsColumnLinearLayout {
    boolean a;

    public AdHighlightLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = true;
    }

    public final void a(boolean z) {
        this.a = z;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.apps.youtube.app.player.overlay.fullscreenengagement.layout.MetadataHighlightsColumnLinearLayout, android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (true == this.a) {
            i = 0;
        }
        super.onMeasure(i, i2);
    }
}
