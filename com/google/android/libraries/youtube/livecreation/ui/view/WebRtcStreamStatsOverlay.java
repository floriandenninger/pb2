package com.google.android.libraries.youtube.livecreation.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class WebRtcStreamStatsOverlay extends RelativeLayout {
    public WebRtcStreamStatsOverlay(Context context) {
        super(context);
        a(context);
    }

    private final void a(Context context) {
        inflate(context, R.layout.lc_webrtc_stream_stats_overlay, this);
        setSaveEnabled(true);
    }

    public WebRtcStreamStatsOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public WebRtcStreamStatsOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }
}
