package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.youtube.innertube.model.player.TrackingUrlModel;
import com.google.android.libraries.youtube.innertube.model.player.Vss3ConfigModel;
import com.google.android.libraries.youtube.livechat.innertube.CreatorSupportPickerPanelWrapper;
import com.google.android.libraries.youtube.livechat.innertube.ProductPickerPanelWrapper;
import com.google.android.libraries.youtube.livecreation.controller.StreamConfig;
import com.google.android.libraries.youtube.livecreation.innertube.StreamMetadata;
import com.google.android.libraries.youtube.livecreation.ui.view.CameraStreamViewManager$CameraModelData;
import com.google.android.libraries.youtube.livecreation.ui.view.NetworkOperationView;
import com.google.android.libraries.youtube.logging.interaction.GelVisibilityUpdate;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import com.google.android.libraries.youtube.mdx.model.AppStatus;
import com.google.android.libraries.youtube.mdx.model.ScreenId;
import com.google.android.libraries.youtube.metadataeditor.geo.EditLocation;
import com.google.android.libraries.youtube.metadataeditor.geo.Place;
import com.google.android.libraries.youtube.offline.player.OfflinePlaybackTrackingPlaybackListener$State;
import com.google.android.libraries.youtube.player.audiofocus.PlaybackAudioManager$RestorableState;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import com.google.android.libraries.youtube.player.modality.PlaybackModalityState;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aapi implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public aapi(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new Vss3ConfigModel((awbj) yny.H(parcel, awbj.a));
            case 1:
                return new TrackingUrlModel((owk) yny.H(parcel, owk.a));
            case 2:
                return new CreatorSupportPickerPanelWrapper(parcel);
            case 3:
                return new ProductPickerPanelWrapper(parcel);
            case 4:
                return new StreamConfig(parcel);
            case 5:
                return new StreamMetadata(parcel);
            case 6:
                return new CameraStreamViewManager$CameraModelData(parcel);
            case 7:
                return new NetworkOperationView.SavedState(parcel);
            case 8:
                return new GelVisibilityUpdate.HiddenVisibilityUpdate(parcel);
            case 9:
                return new GelVisibilityUpdate.ShownVisibilityUpdate(parcel);
            case 10:
                return new InteractionLoggingScreen(parcel);
            case 11:
                adfq c = AppStatus.c();
                c.e(parcel.readInt());
                c.a = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
                c.d = parcel.readString();
                c.b = (ScreenId) parcel.readSerializable();
                c.f(parcel.readByte() == 1);
                c.d(parcel.readByte() == 1);
                c.c(parcel.readByte() == 1);
                int readInt = parcel.readInt();
                HashMap hashMap = new HashMap(readInt);
                for (int i = 0; i < readInt; i++) {
                    hashMap.put(parcel.readString(), parcel.readString());
                }
                c.b(hashMap);
                return c.a();
            case 12:
                return new ScreenId(parcel.readString());
            case 13:
                return new EditLocation.SavedState(parcel);
            case 14:
                return new Place(parcel);
            case 15:
                return new OfflinePlaybackTrackingPlaybackListener$State(parcel);
            case 16:
                return new PlaybackAudioManager$RestorableState(parcel);
            case 17:
                return new ControlsOverlayStyle(parcel);
            case 18:
                return new ControlsState(ahvo.values()[parcel.readInt()], parcel.readByte() == 1);
            case 19:
                return new TimelineMarker(parcel.readLong(), parcel.readLong());
            default:
                return new PlaybackModalityState(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new Vss3ConfigModel[i];
            case 1:
                return new TrackingUrlModel[i];
            case 2:
                return new CreatorSupportPickerPanelWrapper[i];
            case 3:
                return new ProductPickerPanelWrapper[i];
            case 4:
                return new StreamConfig[i];
            case 5:
                return new StreamMetadata[i];
            case 6:
                return new CameraStreamViewManager$CameraModelData[i];
            case 7:
                return new NetworkOperationView.SavedState[i];
            case 8:
                return new GelVisibilityUpdate.HiddenVisibilityUpdate[i];
            case 9:
                return new GelVisibilityUpdate.ShownVisibilityUpdate[i];
            case 10:
                return new InteractionLoggingScreen[i];
            case 11:
                return new AppStatus[i];
            case 12:
                return new ScreenId[i];
            case 13:
                return new EditLocation.SavedState[i];
            case 14:
                return new Place[i];
            case 15:
                return new OfflinePlaybackTrackingPlaybackListener$State[i];
            case 16:
                return new PlaybackAudioManager$RestorableState[i];
            case 17:
                return new ControlsOverlayStyle[i];
            case 18:
                return new ControlsState[i];
            case 19:
                return new TimelineMarker[i];
            default:
                return new PlaybackModalityState[i];
        }
    }
}
