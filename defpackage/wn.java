package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.Fragment$SavedState;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import androidx.viewpager.widget.ViewPager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wn implements Parcelable.ClassLoaderCreator {
    private final /* synthetic */ int a;

    public wn(int i) {
        this.a = i;
    }

    public static final AbsSavedState a(Parcel parcel, ClassLoader classLoader) {
        if (parcel.readParcelable(classLoader) == null) {
            return AbsSavedState.c;
        }
        throw new IllegalStateException("superState must be null");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = this.a;
        if (i == 0) {
            return new RecyclerView.SavedState(parcel, null);
        }
        if (i == 1) {
            return new Fragment$SavedState(parcel, null);
        }
        if (i == 2) {
            return new SearchView.SavedState(parcel, null);
        }
        if (i == 3) {
            return new Toolbar.SavedState(parcel, null);
        }
        if (i != 4) {
            return i != 5 ? new ViewPager.SavedState(parcel, null) : a(parcel, null);
        }
        return new CoordinatorLayout.SavedState(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        int i2 = this.a;
        if (i2 == 0) {
            return new RecyclerView.SavedState[i];
        }
        if (i2 == 1) {
            return new Fragment$SavedState[i];
        }
        if (i2 == 2) {
            return new SearchView.SavedState[i];
        }
        if (i2 == 3) {
            return new Toolbar.SavedState[i];
        }
        if (i2 != 4) {
            return i2 != 5 ? new ViewPager.SavedState[i] : new AbsSavedState[i];
        }
        return new CoordinatorLayout.SavedState[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        int i = this.a;
        if (i == 0) {
            return new RecyclerView.SavedState(parcel, classLoader);
        }
        if (i == 1) {
            return new Fragment$SavedState(parcel, classLoader);
        }
        if (i == 2) {
            return new SearchView.SavedState(parcel, classLoader);
        }
        if (i == 3) {
            return new Toolbar.SavedState(parcel, classLoader);
        }
        if (i != 4) {
            return i != 5 ? new ViewPager.SavedState(parcel, classLoader) : a(parcel, classLoader);
        }
        return new CoordinatorLayout.SavedState(parcel, classLoader);
    }
}
