package com.google.android.apps.youtube.app.extensions.reel.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import defpackage.amkq;
import defpackage.aomf;
import defpackage.apxf;
import defpackage.gjj;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ReelToReelList implements Parcelable {
    public static final Parcelable.Creator CREATOR = new gjj(2);
    public final List a;
    public final List b;

    public ReelToReelList(apxf apxfVar) {
        amkq.N(apxfVar.pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint));
        this.a = Collections.unmodifiableList(amkq.aR(apxfVar));
        this.b = Collections.unmodifiableList(amkq.aR(Optional.empty()));
    }

    public final ReelToReelList a() {
        return new ReelToReelList(Collections.unmodifiableList(amkq.aT(this.a)), Collections.unmodifiableList(amkq.aT(this.b)));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[ReelToReelList");
        sb.append(" size=");
        sb.append(this.a.size());
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) ((apxf) it.next()).pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
            sb.append(" video[");
            sb.append(reelWatchEndpointOuterClass$ReelWatchEndpoint.e);
            sb.append("]=");
            sb.append(reelWatchEndpointOuterClass$ReelWatchEndpoint.d);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ParcelableMessageLite[] parcelableMessageLiteArr = new ParcelableMessageLite[this.a.size()];
        Iterator it = this.a.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            parcelableMessageLiteArr[i2] = new ParcelableMessageLite((apxf) it.next());
            i2++;
        }
        parcel.writeParcelableArray(parcelableMessageLiteArr, 0);
        for (Optional optional : this.b) {
            if (optional.isPresent()) {
                parcel.writeByteArray(((aomf) optional.get()).I());
            } else {
                parcel.writeByteArray(new byte[0]);
            }
        }
    }

    public ReelToReelList(List list) {
        list.getClass();
        this.a = list;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            amkq.N(((apxf) it.next()).pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint));
            arrayList.add(Optional.empty());
        }
        this.b = Collections.unmodifiableList(arrayList);
    }

    public ReelToReelList(List list, List list2) {
        list.getClass();
        this.a = list;
        list2.getClass();
        this.b = list2;
        amkq.N(list.size() == list2.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            amkq.N(((apxf) it.next()).pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint));
        }
    }
}
