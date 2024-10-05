package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.model.WatchDescriptor;
import com.google.android.libraries.youtube.player.sequencer.navigation.AutoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState;
import com.google.android.libraries.youtube.player.sequencer.navigation.VideoIdsSequenceNavigator$VideoIdsSequenceNavigatorState;
import com.google.android.libraries.youtube.player.sequencer.state.OmegaSequencerState;
import com.google.android.libraries.youtube.player.state.PlaybackServiceState;
import com.google.android.libraries.youtube.player.stats.HeartbeatClient$HeartbeatClientState;
import com.google.android.libraries.youtube.player.stats.PlaybackClientManager$State;
import com.google.android.libraries.youtube.player.stats.PlaybackTrackingUrlPingClient$PlaybackTrackingUrlPingClientState;
import com.google.android.libraries.youtube.player.stats.VideoStats2Client$VideoStats2ClientState;
import com.google.android.libraries.youtube.player.stats.VideoStats3Client$VideoStats3ClientState;
import com.google.android.libraries.youtube.player.stats.attestation.AttestationClient$AttestationClientState;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSettings;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSnapshot;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitlesStyle;
import com.google.android.libraries.youtube.player.video.state.DirectorSavedState;
import com.google.android.libraries.youtube.player.video.state.PlaybackListenerStateRestorerState;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;
import com.google.android.libraries.youtube.upload.util.UploadThumbnailExtractor$ThumbnailFileInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aigo implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public aigo(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new WatchDescriptor[i];
            case 1:
                return new PlaybackStartDescriptor[i];
            case 2:
                return new AutoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState[i];
            case 3:
                return new VideoIdsSequenceNavigator$VideoIdsSequenceNavigatorState[i];
            case 4:
                return new OmegaSequencerState[i];
            case 5:
                return new PlaybackServiceState[i];
            case 6:
                return new HeartbeatClient$HeartbeatClientState[i];
            case 7:
                return new PlaybackClientManager$State[i];
            case 8:
                return new PlaybackTrackingUrlPingClient$PlaybackTrackingUrlPingClientState[i];
            case 9:
                return new VideoStats2Client$VideoStats2ClientState[i];
            case 10:
                return new VideoStats3Client$VideoStats3ClientState[i];
            case 11:
                return new AttestationClient$AttestationClientState[i];
            case 12:
                return new SubtitleTrack[i];
            case 13:
                return new SubtitleWindowSettings[i];
            case 14:
                return new SubtitleWindowSnapshot[i];
            case 15:
                return new SubtitlesStyle[i];
            case 16:
                return new DirectorSavedState[i];
            case 17:
                return new PlaybackListenerStateRestorerState[i];
            case 18:
                return new ParcelableMessageLite[i];
            case 19:
                return new PermissionDescriptor[i];
            default:
                return new UploadThumbnailExtractor$ThumbnailFileInfo[0];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                byte[] createByteArray = parcel.createByteArray();
                if (createByteArray == null) {
                    return new WatchDescriptor(owl.a.createBuilder());
                }
                try {
                    return new WatchDescriptor(((owl) aonm.parseFrom(owl.a, createByteArray, aomw.b())).toBuilder());
                } catch (aoob unused) {
                    return new WatchDescriptor(owl.a.createBuilder());
                }
            case 1:
                byte[] createByteArray2 = parcel.createByteArray();
                String readString = parcel.readString();
                if (createByteArray2 == null) {
                    PlaybackStartDescriptor a = PlaybackStartDescriptor.d().a();
                    a.c = readString;
                    return a;
                }
                try {
                    owi owiVar = (owi) aonm.parseFrom(owi.a, createByteArray2, aomw.b());
                    aifz d = PlaybackStartDescriptor.d();
                    d.m = owiVar;
                    PlaybackStartDescriptor a2 = d.a();
                    a2.c = readString;
                    return a2;
                } catch (aoob unused2) {
                    return PlaybackStartDescriptor.d().a();
                }
            case 2:
                return new AutoplaySetSequenceNavigator$AutoplaySetSequenceNavigatorState(parcel);
            case 3:
                return new VideoIdsSequenceNavigator$VideoIdsSequenceNavigatorState(parcel);
            case 4:
                return new OmegaSequencerState(parcel);
            case 5:
                return new PlaybackServiceState(parcel);
            case 6:
                return new HeartbeatClient$HeartbeatClientState(parcel);
            case 7:
                return new PlaybackClientManager$State(parcel);
            case 8:
                return new PlaybackTrackingUrlPingClient$PlaybackTrackingUrlPingClientState(parcel);
            case 9:
                return new VideoStats2Client$VideoStats2ClientState(parcel);
            case 10:
                return new VideoStats3Client$VideoStats3ClientState(parcel);
            case 11:
                return new AttestationClient$AttestationClientState(parcel);
            case 12:
                aiuh m = SubtitleTrack.m();
                String readString2 = parcel.readString();
                if (readString2 != null) {
                    m.e(readString2);
                }
                String readString3 = parcel.readString();
                if (readString3 != null) {
                    m.f(readString3);
                }
                String readString4 = parcel.readString();
                if (readString4 != null) {
                    m.h(readString4);
                }
                String readString5 = parcel.readString();
                if (readString5 != null) {
                    m.j(readString5);
                }
                m.b(parcel.readInt());
                String readString6 = parcel.readString();
                if (readString6 != null) {
                    m.g(readString6);
                }
                String readString7 = parcel.readString();
                if (readString7 != null) {
                    m.a = readString7;
                }
                String readString8 = parcel.readString();
                if (readString8 != null) {
                    m.k(readString8);
                }
                String readString9 = parcel.readString();
                if (readString9 != null) {
                    m.i(readString9);
                }
                String readString10 = parcel.readString();
                if (readString10 != null) {
                    m.b = readString10;
                }
                return m.a();
            case 13:
                return new SubtitleWindowSettings(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() == 1, parcel.readInt() == 1);
            case 14:
                return new SubtitleWindowSnapshot(parcel.readInt(), parcel.readLong(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), (SubtitleWindowSettings) parcel.readParcelable(SubtitleWindowSettings.class.getClassLoader()));
            case 15:
                return new SubtitlesStyle(parcel);
            case 16:
                return new DirectorSavedState(parcel);
            case 17:
                return new PlaybackListenerStateRestorerState(parcel);
            case 18:
                return new ParcelableMessageLite(parcel);
            case 19:
                return new PermissionDescriptor(parcel);
            default:
                return new UploadThumbnailExtractor$ThumbnailFileInfo(parcel);
        }
    }
}
