package com.google.android.apps.youtube.embeddedplayer.service.ui.overflowmenu;

import android.content.Context;
import android.content.DialogInterface;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import defpackage.ahyt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class d {
    public final DialogInterface.OnShowListener a;
    public final DialogInterface.OnDismissListener b;
    public Context c;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.bottomsheet.e d;
    public ahyt e;
    public VideoQuality[] f;
    public int g;
    public int h;
    public boolean i;

    public d(Context context, DialogInterface.OnShowListener onShowListener, DialogInterface.OnDismissListener onDismissListener) {
        this.c = context;
        this.a = onShowListener;
        this.b = onDismissListener;
    }
}
