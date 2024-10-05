package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ecr {
    private static final ClassLoader a = ecr.class.getClassLoader();

    private ecr() {
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static CharSequence b(Parcel parcel) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
    }

    public static ArrayList c(Parcel parcel) {
        return parcel.readArrayList(a);
    }

    public static HashMap d(Parcel parcel) {
        return parcel.readHashMap(a);
    }

    public static void e(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static void f(Parcel parcel, CharSequence charSequence) {
        if (charSequence != null) {
            parcel.writeInt(1);
            TextUtils.writeToParcel(charSequence, parcel, 0);
        } else {
            parcel.writeInt(0);
        }
    }

    public static void g(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static void h(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 1);
        }
    }

    public static void i(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    public static boolean j(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
