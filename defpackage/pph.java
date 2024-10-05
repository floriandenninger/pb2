package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.ChapterFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterTocFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.id3.UrlLinkFrame;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry;
import com.google.android.exoplayer2.metadata.scte35.PrivateCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand;
import com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pph implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public pph(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new ChapterTocFrame(parcel);
            case 1:
                return new ChapterFrame(parcel);
            case 2:
                return new CommentFrame(parcel);
            case 3:
                return new GeobFrame(parcel);
            case 4:
                return new InternalFrame(parcel);
            case 5:
                return new MlltFrame(parcel);
            case 6:
                return new PrivFrame(parcel);
            case 7:
                return new TextInformationFrame(parcel);
            case 8:
                return new UrlLinkFrame(parcel);
            case 9:
                return new MdtaMetadataEntry(parcel);
            case 10:
                return new MotionPhotoMetadata(parcel);
            case 11:
                return new SmtaMetadataEntry(parcel);
            case 12:
                return new PrivateCommand(parcel);
            case 13:
                return new SpliceInsertCommand(parcel);
            case 14:
                return new SpliceNullCommand();
            case 15:
                return new SpliceScheduleCommand(parcel);
            case 16:
                return new TimeSignalCommand(parcel.readLong(), parcel.readLong());
            case 17:
                return new FlexboxLayout.LayoutParams(parcel);
            case 18:
                return new FlexboxLayoutManager.LayoutParams(parcel);
            case 19:
                return new FlexboxLayoutManager.SavedState(parcel);
            default:
                int Q = qip.Q(parcel);
                boolean z = false;
                IBinder iBinder = null;
                while (parcel.dataPosition() < Q) {
                    int readInt = parcel.readInt();
                    int M = qip.M(readInt);
                    if (M == 1) {
                        z = qip.ae(parcel, readInt);
                    } else if (M == 2) {
                        iBinder = qip.T(parcel, readInt);
                    } else {
                        qip.ad(parcel, readInt);
                    }
                }
                qip.ac(parcel, Q);
                return new AdManagerAdViewOptions(z, iBinder);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ChapterTocFrame[i];
            case 1:
                return new ChapterFrame[i];
            case 2:
                return new CommentFrame[i];
            case 3:
                return new GeobFrame[i];
            case 4:
                return new InternalFrame[i];
            case 5:
                return new MlltFrame[i];
            case 6:
                return new PrivFrame[i];
            case 7:
                return new TextInformationFrame[i];
            case 8:
                return new UrlLinkFrame[i];
            case 9:
                return new MdtaMetadataEntry[i];
            case 10:
                return new MotionPhotoMetadata[i];
            case 11:
                return new SmtaMetadataEntry[i];
            case 12:
                return new PrivateCommand[i];
            case 13:
                return new SpliceInsertCommand[i];
            case 14:
                return new SpliceNullCommand[i];
            case 15:
                return new SpliceScheduleCommand[i];
            case 16:
                return new TimeSignalCommand[i];
            case 17:
                return new FlexboxLayout.LayoutParams[i];
            case 18:
                return new FlexboxLayoutManager.LayoutParams[i];
            case 19:
                return new FlexboxLayoutManager.SavedState[i];
            default:
                return new AdManagerAdViewOptions[i];
        }
    }
}
