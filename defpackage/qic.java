package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.cast.framework.media.NotificationAction;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qic extends ecp implements qid {
    public qic(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.INotificationActionsProvider");
    }

    @Override // defpackage.qid
    public final List a() {
        Parcel po = po(3, pn());
        ArrayList createTypedArrayList = po.createTypedArrayList(NotificationAction.CREATOR);
        po.recycle();
        return createTypedArrayList;
    }

    @Override // defpackage.qid
    public final int[] f() {
        Parcel po = po(4, pn());
        int[] createIntArray = po.createIntArray();
        po.recycle();
        return createIntArray;
    }
}
