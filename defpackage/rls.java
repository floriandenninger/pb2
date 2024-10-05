package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatus;
import com.google.android.gms.mobiledataplan.MdpFlexTimeWindow;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rls implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int Q = qip.Q(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        MdpFlexTimeWindow[] mdpFlexTimeWindowArr = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        ArrayList arrayList = null;
        String str8 = null;
        String str9 = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            int M = qip.M(readInt);
            switch (M) {
                case 1:
                    str = qip.Y(parcel, readInt);
                    break;
                case 2:
                    str2 = qip.Y(parcel, readInt);
                    break;
                case 3:
                    str3 = qip.Y(parcel, readInt);
                    break;
                case 4:
                    j = qip.R(parcel, readInt);
                    break;
                case 5:
                    j2 = qip.R(parcel, readInt);
                    break;
                case 6:
                    mdpFlexTimeWindowArr = (MdpFlexTimeWindow[]) qip.ai(parcel, readInt, MdpFlexTimeWindow.CREATOR);
                    break;
                case 7:
                    i = qip.O(parcel, readInt);
                    break;
                case 8:
                    str4 = qip.Y(parcel, readInt);
                    break;
                case 9:
                    str5 = qip.Y(parcel, readInt);
                    break;
                case 10:
                    str6 = qip.Y(parcel, readInt);
                    break;
                case 11:
                    str7 = qip.Y(parcel, readInt);
                    break;
                case 12:
                    i2 = qip.O(parcel, readInt);
                    break;
                case 13:
                    arrayList = qip.Z(parcel, readInt);
                    break;
                default:
                    switch (M) {
                        case 20:
                            j3 = qip.R(parcel, readInt);
                            break;
                        case 21:
                            j4 = qip.R(parcel, readInt);
                            break;
                        case 22:
                            j5 = qip.R(parcel, readInt);
                            break;
                        case 23:
                            str8 = qip.Y(parcel, readInt);
                            break;
                        case 24:
                            str9 = qip.Y(parcel, readInt);
                            break;
                        case 25:
                            z = qip.ae(parcel, readInt);
                            break;
                        default:
                            qip.ad(parcel, readInt);
                            break;
                    }
            }
        }
        qip.ac(parcel, Q);
        return new MdpDataPlanStatus(str, str2, str3, j, j2, mdpFlexTimeWindowArr, i, str4, str5, str6, str7, i2, arrayList, j3, j4, j5, str8, str9, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MdpDataPlanStatus[i];
    }
}
