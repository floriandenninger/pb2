package defpackage;

import android.content.Context;
import android.service.media.MediaBrowserService;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aqw extends aqt {
    public aqw(aqx aqxVar, Context context) {
        super(aqxVar, context);
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadItem(String str, MediaBrowserService.Result result) {
        arm.c(new aqv(str, new arc(result)));
    }
}
