package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.IntentSenderRequest;
import androidx.media3.common.DrmInitData;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.SeekBarPreference;
import androidx.preference.TwoStatePreference;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.gsa.publicsearch.SystemParcelableWrapper;
import com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor;
import com.google.android.apps.youtube.app.common.ui.actionbar.AutoValue_ActionBarColor_ColorConstantActionBarColor;
import com.google.android.apps.youtube.app.common.ui.actionbar.AutoValue_ActionBarColor_ColorIntActionBarColor;
import com.google.android.apps.youtube.app.common.ui.actionbar.AutoValue_ActionBarColor_ThemedActionBarColor;
import com.google.android.apps.youtube.app.common.ui.actionbar.AutoValue_ActionBarColor_TransformAlphaActionBarColor;
import com.google.android.apps.youtube.app.common.ui.navigation.Pane;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneBackStack;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asg implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public asg(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new DrmInitData[i];
            case 1:
                return new IntentSenderRequest[i];
            case 2:
                return new DrmInitData.SchemeData[i];
            case 3:
                return new EditTextPreference.SavedState[i];
            case 4:
                return new ListPreference.SavedState[i];
            case 5:
                return new MultiSelectListPreference.SavedState[i];
            case 6:
                return new Preference.BaseSavedState[i];
            case 7:
                return new PreferenceGroup.SavedState[i];
            case 8:
                return new SeekBarPreference.SavedState[i];
            case 9:
                return new TwoStatePreference.SavedState[i];
            case 10:
                return new SwipeRefreshLayout.SavedState[i];
            case 11:
                return new LottieAnimationView.SavedState[i];
            case 12:
                return new SystemParcelableWrapper[i];
            case 13:
                return new AutoValue_ActionBarColor_ColorConstantActionBarColor[i];
            case 14:
                return new AutoValue_ActionBarColor_ColorIntActionBarColor[i];
            case 15:
                return new AutoValue_ActionBarColor_ThemedActionBarColor[i];
            case 16:
                return new AutoValue_ActionBarColor_TransformAlphaActionBarColor[i];
            case 17:
                return new Pane[i];
            case 18:
                return new PaneBackStack[i];
            case 19:
                return new PaneBackStack.BackStackEntry[i];
            default:
                return new PaneDescriptor[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new DrmInitData(parcel);
            case 1:
                return new IntentSenderRequest(parcel);
            case 2:
                return new DrmInitData.SchemeData(parcel);
            case 3:
                return new EditTextPreference.SavedState(parcel);
            case 4:
                return new ListPreference.SavedState(parcel);
            case 5:
                return new MultiSelectListPreference.SavedState(parcel);
            case 6:
                return new Preference.BaseSavedState(parcel);
            case 7:
                return new PreferenceGroup.SavedState(parcel);
            case 8:
                return new SeekBarPreference.SavedState(parcel);
            case 9:
                return new TwoStatePreference.SavedState(parcel);
            case 10:
                return new SwipeRefreshLayout.SavedState(parcel);
            case 11:
                return new LottieAnimationView.SavedState(parcel);
            case 12:
                return new SystemParcelableWrapper(parcel.readParcelable(null));
            case 13:
                return new AutoValue_ActionBarColor_ColorConstantActionBarColor(parcel.readInt());
            case 14:
                return new AutoValue_ActionBarColor_ColorIntActionBarColor(parcel.readInt());
            case 15:
                return new AutoValue_ActionBarColor_ThemedActionBarColor(parcel.readInt());
            case 16:
                return new AutoValue_ActionBarColor_TransformAlphaActionBarColor((ActionBarColor) parcel.readParcelable(ActionBarColor.TransformAlphaActionBarColor.class.getClassLoader()), parcel.readInt());
            case 17:
                return new Pane(parcel);
            case 18:
                return new PaneBackStack(parcel);
            case 19:
                return new PaneBackStack.BackStackEntry(parcel);
            default:
                return new PaneDescriptor(parcel);
        }
    }
}
