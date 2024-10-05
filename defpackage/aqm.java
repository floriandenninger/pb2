package defpackage;

import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.os.ResultReceiver;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aqm extends arb {
    final /* synthetic */ ResultReceiver a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqm(Object obj, ResultReceiver resultReceiver) {
        super(obj);
        this.a = resultReceiver;
    }

    @Override // defpackage.arb
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) obj;
        if ((this.h & 2) != 0) {
            this.a.b(-1, null);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("media_item", mediaBrowserCompat$MediaItem);
        this.a.b(0, bundle);
    }
}
