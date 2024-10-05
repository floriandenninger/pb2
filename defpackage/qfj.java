package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.AdBreakStatus;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLiveSeekableRange;
import com.google.android.gms.cast.MediaQueueData;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.VideoInfo;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qfj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int Q = qip.Q(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        MediaInfo mediaInfo = null;
        long[] jArr = null;
        String str = null;
        ArrayList arrayList = null;
        AdBreakStatus adBreakStatus = null;
        VideoInfo videoInfo = null;
        MediaLiveSeekableRange mediaLiveSeekableRange = null;
        MediaQueueData mediaQueueData = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            switch (qip.M(readInt)) {
                case 2:
                    mediaInfo = (MediaInfo) qip.U(parcel, readInt, MediaInfo.CREATOR);
                    break;
                case 3:
                    j = qip.R(parcel, readInt);
                    break;
                case 4:
                    i = qip.O(parcel, readInt);
                    break;
                case 5:
                    d = qip.K(parcel, readInt);
                    break;
                case 6:
                    i2 = qip.O(parcel, readInt);
                    break;
                case 7:
                    i3 = qip.O(parcel, readInt);
                    break;
                case 8:
                    j2 = qip.R(parcel, readInt);
                    break;
                case 9:
                    j3 = qip.R(parcel, readInt);
                    break;
                case 10:
                    d2 = qip.K(parcel, readInt);
                    break;
                case 11:
                    z = qip.ae(parcel, readInt);
                    break;
                case 12:
                    jArr = qip.ah(parcel, readInt);
                    break;
                case 13:
                    i4 = qip.O(parcel, readInt);
                    break;
                case 14:
                    i5 = qip.O(parcel, readInt);
                    break;
                case 15:
                    str = qip.Y(parcel, readInt);
                    break;
                case 16:
                    i6 = qip.O(parcel, readInt);
                    break;
                case 17:
                    arrayList = qip.ab(parcel, readInt, MediaQueueItem.CREATOR);
                    break;
                case 18:
                    z2 = qip.ae(parcel, readInt);
                    break;
                case 19:
                    adBreakStatus = (AdBreakStatus) qip.U(parcel, readInt, AdBreakStatus.CREATOR);
                    break;
                case 20:
                    videoInfo = (VideoInfo) qip.U(parcel, readInt, VideoInfo.CREATOR);
                    break;
                case 21:
                    mediaLiveSeekableRange = (MediaLiveSeekableRange) qip.U(parcel, readInt, MediaLiveSeekableRange.CREATOR);
                    break;
                case 22:
                    mediaQueueData = (MediaQueueData) qip.U(parcel, readInt, MediaQueueData.CREATOR);
                    break;
                default:
                    qip.ad(parcel, readInt);
                    break;
            }
        }
        qip.ac(parcel, Q);
        return new MediaStatus(mediaInfo, j, i, d, i2, i3, j2, j3, d2, z, jArr, i4, i5, str, i6, arrayList, z2, adBreakStatus, videoInfo, mediaLiveSeekableRange, mediaQueueData);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MediaStatus[i];
    }
}
