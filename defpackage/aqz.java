package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.service.media.MediaBrowserService;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aqz extends aqw {
    final /* synthetic */ ara b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqz(ara araVar, Context context) {
        super(araVar, context);
        this.b = araVar;
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result, Bundle bundle) {
        hn.c(bundle);
        ara araVar = this.b;
        araVar.f.d(new aqy(str, new arc(result), bundle));
    }
}
