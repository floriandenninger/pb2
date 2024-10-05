package defpackage;

import android.os.Parcel;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aqs extends arb {
    final /* synthetic */ arc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqs(Object obj, arc arcVar) {
        super(obj);
        this.a = arcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.arb
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ArrayList arrayList;
        if (obj != 0) {
            arrayList = new ArrayList();
            Iterator it = obj.iterator();
            while (it.hasNext()) {
                MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) it.next();
                Parcel obtain = Parcel.obtain();
                mediaBrowserCompat$MediaItem.writeToParcel(obtain, 0);
                arrayList.add(obtain);
            }
        } else {
            arrayList = null;
        }
        this.a.a(arrayList);
    }
}
