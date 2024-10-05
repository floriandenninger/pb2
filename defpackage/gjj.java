package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.AutoValue_PaneFragmentPanelDescriptor;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PaneFragmentPanelDescriptor;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelDescriptor;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelsConfiguration;
import com.google.android.apps.youtube.app.extensions.reel.common.ReelToReelList;
import com.google.android.apps.youtube.app.extensions.reel.common.ReelWatchBackstack$BackstackEntry;
import com.google.android.apps.youtube.app.extensions.reel.common.ReelWatchBackstack$BackstackEntryStack;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.media.AutoValue_ShortsVideoMetadata;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.media.ShortsVideoMetadata;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ShortsCreationSelectedTrack;
import com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ReelEditModel;
import com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ReelItemEditModel;
import com.google.android.apps.youtube.app.extensions.reel.watch.fragment.ReelSequenceController$PendingContinuation;
import com.google.android.apps.youtube.app.extensions.reel.watch.player.ReelSequenceNavigator$ReelSequenceNavigatorState;
import com.google.android.apps.youtube.app.extensions.upload.UploadFrontendIdMapHelper;
import com.google.android.apps.youtube.app.fragments.PlaylistEditorFragment$EditorState;
import com.google.android.apps.youtube.app.fragments.panels.AutoValue_PanePanelsController_PanePanelsState;
import com.google.android.apps.youtube.app.fragments.panels.AutoValue_PanelFragmentDescriptor;
import com.google.android.apps.youtube.app.fragments.panels.AutoValue_PanelsBackStack;
import com.google.android.apps.youtube.app.fragments.panels.PanePanelsController$PanePanelsState;
import com.google.android.apps.youtube.app.fragments.panels.PanelFragmentDescriptor;
import com.google.android.apps.youtube.app.fragments.panels.PanelsBackStack;
import com.google.android.apps.youtube.app.mdx.watch.MdxWatchDrawerLayout;
import com.google.android.apps.youtube.app.ui.swipetocontainer.SwipeToContainerFrameLayout;
import com.google.android.apps.youtube.app.watch.navigation.WatchHistoryListIterator;
import com.google.android.libraries.video.editablevideo.EditableVideoEdits;
import com.google.android.libraries.video.media.VideoMetaData;
import com.google.android.libraries.youtube.edit.common.RecordingInfo;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import com.google.apps.tiktok.account.AccountId;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gjj implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public gjj(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        avgg avggVar;
        switch (this.a) {
            case 0:
                ClassLoader classLoader = getClass().getClassLoader();
                return new PanelsConfiguration((PanelDescriptor) parcel.readParcelable(classLoader), Optional.ofNullable((PanelDescriptor) parcel.readParcelable(classLoader)));
            case 1:
                return new AutoValue_PaneFragmentPanelDescriptor((PaneDescriptor) parcel.readParcelable(PaneFragmentPanelDescriptor.class.getClassLoader()));
            case 2:
                Parcelable[] readParcelableArray = parcel.readParcelableArray(ParcelableMessageLite.class.getClassLoader());
                int length = readParcelableArray.length;
                ArrayList arrayList = new ArrayList(length);
                ArrayList arrayList2 = new ArrayList(length);
                for (Parcelable parcelable : readParcelableArray) {
                    arrayList.add((apxf) ((ParcelableMessageLite) parcelable).a(apxf.a));
                    byte[] createByteArray = parcel.createByteArray();
                    if (createByteArray.length == 0) {
                        arrayList2.add(Optional.empty());
                    } else {
                        arrayList2.add(Optional.of(aomf.x(createByteArray)));
                    }
                }
                return new ReelToReelList(Collections.unmodifiableList(arrayList), Collections.unmodifiableList(arrayList2));
            case 3:
                return new ReelWatchBackstack$BackstackEntry(parcel);
            case 4:
                return new ReelWatchBackstack$BackstackEntryStack(parcel);
            case 5:
                return new AutoValue_ShortsVideoMetadata((Uri) parcel.readParcelable(ShortsVideoMetadata.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readLong());
            case 6:
                hmx m = ShortsCreationSelectedTrack.m();
                m.d(parcel.readString());
                m.c(parcel.readLong());
                m.b(parcel.readInt() == 1);
                m.a = parcel.readString();
                try {
                    avggVar = (avgg) aonm.parseFrom(avgg.a, parcel.createByteArray(), aomw.b());
                } catch (aoob e) {
                    zga.d("Error parsing ShortsCreationSelectedTrack", e);
                    avggVar = null;
                }
                m.c = avggVar;
                m.e = parcel.readString();
                m.f = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
                long readLong = parcel.readLong();
                if (readLong != -1) {
                    m.g = ammv.j(Long.valueOf(readLong));
                }
                int readInt = parcel.readInt();
                if (readInt != -1) {
                    byte[] bArr = new byte[readInt];
                    parcel.readByteArray(bArr);
                    m.h = ammv.j(bArr);
                }
                if (parcel.readInt() == 1) {
                    try {
                        m.b = (apxf) aonm.parseFrom(apxf.a, parcel.createByteArray(), aomw.b());
                    } catch (aoob e2) {
                        zga.d("Error parsing ShortsCreationSelectedTrack", e2);
                    }
                }
                return m.a();
            case 7:
                hvf e3 = ReelEditModel.e();
                e3.c(parcel.createTypedArrayList(ReelItemEditModel.CREATOR));
                e3.b(parcel.readInt());
                e3.a = (ReelEditModel.DeletedItem) parcel.readParcelable(ReelEditModel.DeletedItem.class.getClassLoader());
                return e3.a();
            case 8:
                return ReelEditModel.DeletedItem.c(parcel.readInt(), (ReelItemEditModel) parcel.readParcelable(ReelItemEditModel.class.getClassLoader()));
            case 9:
                hvv g = ReelItemEditModel.g();
                g.d((RecordingInfo) parcel.readParcelable(RecordingInfo.class.getClassLoader()));
                g.f((VideoMetaData) parcel.readParcelable(VideoMetaData.class.getClassLoader()));
                g.b((EditableVideoEdits) parcel.readParcelable(EditableVideoEdits.class.getClassLoader()));
                g.e(parcel.readString());
                g.c(parcel.readByte() != 0);
                return g.a();
            case 10:
                return new ReelSequenceController$PendingContinuation(parcel);
            case 11:
                return new ReelSequenceNavigator$ReelSequenceNavigatorState(parcel);
            case 12:
                return new UploadFrontendIdMapHelper(parcel);
            case 13:
                return new PlaylistEditorFragment$EditorState(parcel);
            case 14:
                return new AutoValue_PanePanelsController_PanePanelsState((PaneFragmentPanelDescriptor) parcel.readParcelable(PanePanelsController$PanePanelsState.class.getClassLoader()), (PaneFragmentPanelDescriptor) parcel.readParcelable(PanePanelsController$PanePanelsState.class.getClassLoader()));
            case 15:
                return new AutoValue_PanelFragmentDescriptor((Class) parcel.readSerializable(), (AccountId) parcel.readParcelable(PanelFragmentDescriptor.class.getClassLoader()));
            case 16:
                return new AutoValue_PanelsBackStack(parcel.readArrayList(PanelsBackStack.class.getClassLoader()));
            case 17:
                return new PanelsBackStack.PanelsBackStackEntry(parcel);
            case 18:
                return new MdxWatchDrawerLayout.SavedState(parcel);
            case 19:
                return new SwipeToContainerFrameLayout.SavedState(parcel);
            default:
                return new WatchHistoryListIterator(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new PanelsConfiguration[i];
            case 1:
                return new AutoValue_PaneFragmentPanelDescriptor[i];
            case 2:
                return new ReelToReelList[i];
            case 3:
                return new ReelWatchBackstack$BackstackEntry[i];
            case 4:
                return new ReelWatchBackstack$BackstackEntryStack[i];
            case 5:
                return new AutoValue_ShortsVideoMetadata[i];
            case 6:
                return new ShortsCreationSelectedTrack[i];
            case 7:
                return new ReelEditModel[i];
            case 8:
                return new ReelEditModel.DeletedItem[i];
            case 9:
                return new ReelItemEditModel[i];
            case 10:
                return new ReelSequenceController$PendingContinuation[i];
            case 11:
                return new ReelSequenceNavigator$ReelSequenceNavigatorState[i];
            case 12:
                return new UploadFrontendIdMapHelper[i];
            case 13:
                return new PlaylistEditorFragment$EditorState[i];
            case 14:
                return new AutoValue_PanePanelsController_PanePanelsState[i];
            case 15:
                return new AutoValue_PanelFragmentDescriptor[i];
            case 16:
                return new AutoValue_PanelsBackStack[i];
            case 17:
                return new PanelsBackStack.PanelsBackStackEntry[i];
            case 18:
                return new MdxWatchDrawerLayout.SavedState[i];
            case 19:
                return new SwipeToContainerFrameLayout.SavedState[i];
            default:
                return new WatchHistoryListIterator[i];
        }
    }
}
