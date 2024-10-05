package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qiq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int Q = qip.Q(parcel);
        ArrayList arrayList = null;
        int[] iArr = null;
        String str = null;
        IBinder iBinder = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            switch (qip.M(readInt)) {
                case 2:
                    arrayList = qip.aa(parcel, readInt);
                    break;
                case 3:
                    iArr = qip.ag(parcel, readInt);
                    break;
                case 4:
                    j = qip.R(parcel, readInt);
                    break;
                case 5:
                    str = qip.Y(parcel, readInt);
                    break;
                case 6:
                    i = qip.O(parcel, readInt);
                    break;
                case 7:
                    i2 = qip.O(parcel, readInt);
                    break;
                case 8:
                    i3 = qip.O(parcel, readInt);
                    break;
                case 9:
                    i4 = qip.O(parcel, readInt);
                    break;
                case 10:
                    i5 = qip.O(parcel, readInt);
                    break;
                case 11:
                    i6 = qip.O(parcel, readInt);
                    break;
                case 12:
                    i7 = qip.O(parcel, readInt);
                    break;
                case 13:
                    i8 = qip.O(parcel, readInt);
                    break;
                case 14:
                    i9 = qip.O(parcel, readInt);
                    break;
                case 15:
                    i10 = qip.O(parcel, readInt);
                    break;
                case 16:
                    i11 = qip.O(parcel, readInt);
                    break;
                case 17:
                    i12 = qip.O(parcel, readInt);
                    break;
                case 18:
                    i13 = qip.O(parcel, readInt);
                    break;
                case 19:
                    i14 = qip.O(parcel, readInt);
                    break;
                case 20:
                    i15 = qip.O(parcel, readInt);
                    break;
                case 21:
                    i16 = qip.O(parcel, readInt);
                    break;
                case 22:
                    i17 = qip.O(parcel, readInt);
                    break;
                case 23:
                    i18 = qip.O(parcel, readInt);
                    break;
                case 24:
                    i19 = qip.O(parcel, readInt);
                    break;
                case 25:
                    i20 = qip.O(parcel, readInt);
                    break;
                case 26:
                    i21 = qip.O(parcel, readInt);
                    break;
                case 27:
                    i22 = qip.O(parcel, readInt);
                    break;
                case 28:
                    i23 = qip.O(parcel, readInt);
                    break;
                case 29:
                    i24 = qip.O(parcel, readInt);
                    break;
                case 30:
                    i25 = qip.O(parcel, readInt);
                    break;
                case 31:
                    i26 = qip.O(parcel, readInt);
                    break;
                case 32:
                    i27 = qip.O(parcel, readInt);
                    break;
                case 33:
                    iBinder = qip.T(parcel, readInt);
                    break;
                default:
                    qip.ad(parcel, readInt);
                    break;
            }
        }
        qip.ac(parcel, Q);
        return new NotificationOptions(arrayList, iArr, j, str, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, iBinder);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new NotificationOptions[i];
    }
}
