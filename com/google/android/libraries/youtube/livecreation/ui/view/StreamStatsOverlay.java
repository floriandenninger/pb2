package com.google.android.libraries.youtube.livecreation.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class StreamStatsOverlay extends RelativeLayout {
    private TextView a;

    public StreamStatsOverlay(Context context) {
        super(context);
        a(context);
    }

    private final void a(Context context) {
        inflate(context, R.layout.lc_stream_stats_overlay, this);
        setSaveEnabled(true);
        TextView textView = (TextView) findViewById(R.id.stats_bandwidth_test);
        this.a = textView;
        textView.setText("");
    }

    public StreamStatsOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public StreamStatsOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }
}
