package com.google.android.apps.youtube.app.player.overlay.storyboard;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.youtube.R;
import defpackage.aidx;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class YoutubeScrubbedPreviewView extends aidx {
    public YoutubeScrubbedPreviewView(Context context) {
        super(context);
    }

    @Override // defpackage.aidx
    protected final int a() {
        return R.layout.scrubbed_preview_extended_timestamp;
    }

    public YoutubeScrubbedPreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
