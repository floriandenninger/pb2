package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.os.ResultReceiver;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aqn extends arb {
    final /* synthetic */ ResultReceiver a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqn(Object obj, ResultReceiver resultReceiver) {
        super(obj);
        this.a = resultReceiver;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.arb
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        if ((this.h & 4) != 0 || obj == 0) {
            this.a.b(-1, null);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArray("search_results", (Parcelable[]) obj.toArray(new MediaBrowserCompat$MediaItem[0]));
        this.a.b(0, bundle);
    }
}
