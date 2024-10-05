package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aqy extends arb {
    final /* synthetic */ arc a;
    final /* synthetic */ Bundle b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqy(Object obj, arc arcVar, Bundle bundle) {
        super(obj);
        this.a = arcVar;
        this.b = bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.arb
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        if (obj == 0) {
            this.a.a(null);
            return;
        }
        List<MediaBrowserCompat$MediaItem> list = obj;
        if ((this.h & 1) != 0) {
            list = arm.a(obj, this.b);
        }
        ArrayList arrayList = new ArrayList();
        for (MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem : list) {
            Parcel obtain = Parcel.obtain();
            mediaBrowserCompat$MediaItem.writeToParcel(obtain, 0);
            arrayList.add(obtain);
        }
        this.a.a(arrayList);
    }
}
