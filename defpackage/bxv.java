package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.ActivityResult;
import androidx.versionedparcelable.ParcelImpl;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bxv implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public bxv(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return this.a != 0 ? new ActivityResult(parcel) : new ParcelImpl(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return this.a != 0 ? new ActivityResult[i] : new ParcelImpl[i];
    }
}
