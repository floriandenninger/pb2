package defpackage;

import android.os.Parcel;
import android.support.v4.media.MediaBrowserCompat$MediaItem;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aqv extends arb {
    final /* synthetic */ arc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqv(Object obj, arc arcVar) {
        super(obj);
        this.a = arcVar;
    }

    @Override // defpackage.arb
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) obj;
        if (mediaBrowserCompat$MediaItem == null) {
            this.a.a(null);
            return;
        }
        Parcel obtain = Parcel.obtain();
        mediaBrowserCompat$MediaItem.writeToParcel(obtain, 0);
        this.a.a(obtain);
    }
}
