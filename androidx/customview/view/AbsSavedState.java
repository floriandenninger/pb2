package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.wn;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class AbsSavedState implements Parcelable {
    public final Parcelable d;
    public static final AbsSavedState c = new AbsSavedState() { // from class: androidx.customview.view.AbsSavedState.1
    };
    public static final Parcelable.Creator CREATOR = new wn(5);

    public AbsSavedState() {
        this.d = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.d = readParcelable == null ? c : readParcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.d, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbsSavedState(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.d = parcelable == c ? null : parcelable;
    }
}
