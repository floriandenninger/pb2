package com.google.android.apps.youtube.embeddedplayer.service.ui.controlsbar.remoteloaded;

import android.content.DialogInterface;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class b implements DialogInterface.OnClickListener {
    final /* synthetic */ c a;
    private final VideoQuality[] b;

    public b(c cVar, VideoQuality[] videoQualityArr) {
        this.a = cVar;
        videoQualityArr.getClass();
        this.b = videoQualityArr;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.remoteloaded.legacy.a aVar = this.a.i;
        aVar.a.a.x(this.b[i].a);
        dialogInterface.dismiss();
        c cVar = this.a;
        cVar.startAnimation(cVar.e);
    }
}
