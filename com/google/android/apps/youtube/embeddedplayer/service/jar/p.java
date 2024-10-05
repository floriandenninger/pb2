package com.google.android.apps.youtube.embeddedplayer.service.jar;

import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum p {
    VALID(0),
    STACK_UNCLEAN(0),
    OVERLAPPING(R.string.player_hidden_warning),
    OBSCURED(R.string.touch_when_view_obscured);

    public final int e;

    p(int i) {
        this.e = i;
    }

    public final boolean a() {
        return equals(VALID);
    }
}
