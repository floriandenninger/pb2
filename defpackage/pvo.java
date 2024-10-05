package defpackage;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.AdDataParcel;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.SearchAdRequestParcel;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pvo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int Q = qip.Q(parcel);
        Bundle bundle = null;
        ArrayList arrayList = null;
        String str = null;
        SearchAdRequestParcel searchAdRequestParcel = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        String str4 = null;
        AdDataParcel adDataParcel = null;
        String str5 = null;
        ArrayList arrayList3 = null;
        String str6 = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i4 = 0;
        int i5 = 0;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            switch (qip.M(readInt)) {
                case 1:
                    i = qip.O(parcel, readInt);
                    break;
                case 2:
                    j = qip.R(parcel, readInt);
                    break;
                case 3:
                    bundle = qip.S(parcel, readInt);
                    break;
                case 4:
                    i2 = qip.O(parcel, readInt);
                    break;
                case 5:
                    arrayList = qip.aa(parcel, readInt);
                    break;
                case 6:
                    z = qip.ae(parcel, readInt);
                    break;
                case 7:
                    i3 = qip.O(parcel, readInt);
                    break;
                case 8:
                    z2 = qip.ae(parcel, readInt);
                    break;
                case 9:
                    str = qip.Y(parcel, readInt);
                    break;
                case 10:
                    searchAdRequestParcel = (SearchAdRequestParcel) qip.U(parcel, readInt, SearchAdRequestParcel.CREATOR);
                    break;
                case 11:
                    location = (Location) qip.U(parcel, readInt, Location.CREATOR);
                    break;
                case 12:
                    str2 = qip.Y(parcel, readInt);
                    break;
                case 13:
                    bundle2 = qip.S(parcel, readInt);
                    break;
                case 14:
                    bundle3 = qip.S(parcel, readInt);
                    break;
                case 15:
                    arrayList2 = qip.aa(parcel, readInt);
                    break;
                case 16:
                    str3 = qip.Y(parcel, readInt);
                    break;
                case 17:
                    str4 = qip.Y(parcel, readInt);
                    break;
                case 18:
                    z3 = qip.ae(parcel, readInt);
                    break;
                case 19:
                    adDataParcel = (AdDataParcel) qip.U(parcel, readInt, AdDataParcel.CREATOR);
                    break;
                case 20:
                    i4 = qip.O(parcel, readInt);
                    break;
                case 21:
                    str5 = qip.Y(parcel, readInt);
                    break;
                case 22:
                    arrayList3 = qip.aa(parcel, readInt);
                    break;
                case 23:
                    i5 = qip.O(parcel, readInt);
                    break;
                case 24:
                    str6 = qip.Y(parcel, readInt);
                    break;
                default:
                    qip.ad(parcel, readInt);
                    break;
            }
        }
        qip.ac(parcel, Q);
        return new AdRequestParcel(i, j, bundle, i2, arrayList, z, i3, z2, str, searchAdRequestParcel, location, str2, bundle2, bundle3, arrayList2, str3, str4, z3, adDataParcel, i4, str5, arrayList3, i5, str6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AdRequestParcel[i];
    }
}
