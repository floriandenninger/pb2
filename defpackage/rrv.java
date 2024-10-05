package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rrv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int Q = qip.Q(parcel);
        ArrayList ah = oba.ah();
        ArrayList ah2 = oba.ah();
        ArrayList ah3 = oba.ah();
        ArrayList arrayList = ah;
        ArrayList arrayList2 = ah2;
        ArrayList arrayList3 = ah3;
        ArrayList ah4 = oba.ah();
        ArrayList ah5 = oba.ah();
        ArrayList ah6 = oba.ah();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        TimeInterval timeInterval = null;
        String str9 = null;
        String str10 = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            switch (qip.M(readInt)) {
                case 2:
                    str = qip.Y(parcel, readInt);
                    break;
                case 3:
                    str2 = qip.Y(parcel, readInt);
                    break;
                case 4:
                    str3 = qip.Y(parcel, readInt);
                    break;
                case 5:
                    str4 = qip.Y(parcel, readInt);
                    break;
                case 6:
                    str5 = qip.Y(parcel, readInt);
                    break;
                case 7:
                    str6 = qip.Y(parcel, readInt);
                    break;
                case 8:
                    str7 = qip.Y(parcel, readInt);
                    break;
                case 9:
                    str8 = qip.Y(parcel, readInt);
                    break;
                case 10:
                    i = qip.O(parcel, readInt);
                    break;
                case 11:
                    arrayList = qip.ab(parcel, readInt, WalletObjectMessage.CREATOR);
                    break;
                case 12:
                    timeInterval = (TimeInterval) qip.U(parcel, readInt, TimeInterval.CREATOR);
                    break;
                case 13:
                    arrayList2 = qip.ab(parcel, readInt, LatLng.CREATOR);
                    break;
                case 14:
                    str9 = qip.Y(parcel, readInt);
                    break;
                case 15:
                    str10 = qip.Y(parcel, readInt);
                    break;
                case 16:
                    arrayList3 = qip.ab(parcel, readInt, LabelValueRow.CREATOR);
                    break;
                case 17:
                    z = qip.ae(parcel, readInt);
                    break;
                case 18:
                    ah4 = qip.ab(parcel, readInt, UriData.CREATOR);
                    break;
                case 19:
                    ah5 = qip.ab(parcel, readInt, TextModuleData.CREATOR);
                    break;
                case 20:
                    ah6 = qip.ab(parcel, readInt, UriData.CREATOR);
                    break;
                default:
                    qip.ad(parcel, readInt);
                    break;
            }
        }
        qip.ac(parcel, Q);
        return new CommonWalletObject(str, str2, str3, str4, str5, str6, str7, str8, i, arrayList, timeInterval, arrayList2, str9, str10, arrayList3, z, ah4, ah5, ah6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CommonWalletObject[i];
    }
}
