package com.google.android.apps.youtube.embeddedplayer.service.ui.overflowmenu;

import android.content.Context;
import android.content.DialogInterface;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import defpackage.ahxs;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class f {
    public final DialogInterface.OnShowListener a;
    public final DialogInterface.OnDismissListener b;
    public Context c;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.e d;
    public SubtitleTrack e;
    public List f;
    public ahxs g;

    public f(Context context, DialogInterface.OnShowListener onShowListener, DialogInterface.OnDismissListener onDismissListener) {
        this.c = context;
        this.a = onShowListener;
        this.b = onDismissListener;
    }
}
