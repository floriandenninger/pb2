package defpackage;

import android.media.MediaDescription;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.BackStackRecordState;
import android.support.v4.app.BackStackState;
import android.support.v4.app.FragmentManager$LaunchedFragmentInfo;
import android.support.v4.app.FragmentManagerState;
import android.support.v4.app.FragmentState;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.os.ResultReceiver;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.AppCompatSpinner;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bg implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public bg(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new BackStackState[i];
            case 1:
                return new BackStackRecordState[i];
            case 2:
                return new FragmentManager$LaunchedFragmentInfo[i];
            case 3:
                return new FragmentManagerState[i];
            case 4:
                return new FragmentState[i];
            case 5:
                return new MediaBrowserCompat$MediaItem[i];
            case 6:
                return new MediaDescriptionCompat[i];
            case 7:
                return new MediaMetadataCompat[i];
            case 8:
                return new RatingCompat[i];
            case 9:
                return new MediaSessionCompat$QueueItem[i];
            case 10:
                return new MediaSessionCompat$ResultReceiverWrapper[i];
            case 11:
                return new MediaSessionCompat$Token[i];
            case 12:
                return new ParcelableVolumeInfo[i];
            case 13:
                return new PlaybackStateCompat[i];
            case 14:
                return new PlaybackStateCompat.CustomAction[i];
            case 15:
                return new ResultReceiver[i];
            case 16:
                return new NestedScrollView.SavedState[i];
            case 17:
                return new AppCompatSpinner.SavedState[i];
            case 18:
                return new LinearLayoutManager.SavedState[i];
            case 19:
                return new StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem[i];
            default:
                return new StaggeredGridLayoutManager.SavedState[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new BackStackState(parcel);
            case 1:
                return new BackStackRecordState(parcel);
            case 2:
                return new FragmentManager$LaunchedFragmentInfo(parcel);
            case 3:
                return new FragmentManagerState(parcel);
            case 4:
                return new FragmentState(parcel);
            case 5:
                return new MediaBrowserCompat$MediaItem(parcel);
            case 6:
                return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
            case 7:
                return new MediaMetadataCompat(parcel);
            case 8:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 9:
                return new MediaSessionCompat$QueueItem(parcel);
            case 10:
                return new MediaSessionCompat$ResultReceiverWrapper(parcel);
            case 11:
                return new MediaSessionCompat$Token(parcel.readParcelable(null), null);
            case 12:
                return new ParcelableVolumeInfo(parcel);
            case 13:
                return new PlaybackStateCompat(parcel);
            case 14:
                return new PlaybackStateCompat.CustomAction(parcel);
            case 15:
                return new ResultReceiver(parcel);
            case 16:
                return new NestedScrollView.SavedState(parcel);
            case 17:
                return new AppCompatSpinner.SavedState(parcel);
            case 18:
                return new LinearLayoutManager.SavedState(parcel);
            case 19:
                return new StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem(parcel);
            default:
                return new StaggeredGridLayoutManager.SavedState(parcel);
        }
    }
}
