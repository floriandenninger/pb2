package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.AppMetadata;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class red implements Parcelable.Creator {
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
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList arrayList = null;
        String str8 = null;
        String str9 = "";
        long j6 = -2147483648L;
        boolean z = true;
        boolean z2 = false;
        int i = 0;
        boolean z3 = true;
        boolean z4 = false;
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
                    j = qip.R(parcel, readInt);
                    break;
                case 7:
                    j2 = qip.R(parcel, readInt);
                    break;
                case 8:
                    str5 = qip.Y(parcel, readInt);
                    break;
                case 9:
                    z = qip.ae(parcel, readInt);
                    break;
                case 10:
                    z2 = qip.ae(parcel, readInt);
                    break;
                case 11:
                    j6 = qip.R(parcel, readInt);
                    break;
                case 12:
                    str6 = qip.Y(parcel, readInt);
                    break;
                case 13:
                    j3 = qip.R(parcel, readInt);
                    break;
                case 14:
                    j4 = qip.R(parcel, readInt);
                    break;
                case 15:
                    i = qip.O(parcel, readInt);
                    break;
                case 16:
                    z3 = qip.ae(parcel, readInt);
                    break;
                case 17:
                case 20:
                default:
                    qip.ad(parcel, readInt);
                    break;
                case 18:
                    z4 = qip.ae(parcel, readInt);
                    break;
                case 19:
                    str7 = qip.Y(parcel, readInt);
                    break;
                case 21:
                    bool = qip.V(parcel, readInt);
                    break;
                case 22:
                    j5 = qip.R(parcel, readInt);
                    break;
                case 23:
                    arrayList = qip.aa(parcel, readInt);
                    break;
                case 24:
                    str8 = qip.Y(parcel, readInt);
                    break;
                case 25:
                    str9 = qip.Y(parcel, readInt);
                    break;
            }
        }
        qip.ac(parcel, Q);
        return new AppMetadata(str, str2, str3, str4, j, j2, str5, z, z2, j6, str6, j3, j4, i, z3, z4, str7, bool, j5, arrayList, str8, str9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AppMetadata[i];
    }
}
