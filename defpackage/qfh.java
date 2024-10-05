package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.EqualizerSettings;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaQueueContainerMetadata;
import com.google.android.gms.cast.MediaQueueData;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.cast.SessionState;
import com.google.android.gms.cast.TextTrackStyle;
import com.google.android.gms.cast.VastAdsRequest;
import com.google.android.gms.cast.VideoInfo;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.ImageHints;
import com.google.android.gms.cast.framework.media.NotificationAction;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.cast.internal.ApplicationStatus;
import com.google.android.gms.cast.internal.DeviceStatus;
import com.google.android.gms.clearcut.BatchedLogErrorParcelable;
import com.google.android.gms.clearcut.LogErrorParcelable;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qfh implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public qfh(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new MediaMetadata[i];
            case 1:
                return new MediaLoadRequestData[i];
            case 2:
                return new MediaQueueContainerMetadata[i];
            case 3:
                return new MediaQueueData[i];
            case 4:
                return new MediaQueueItem[i];
            case 5:
                return new MediaTrack[i];
            case 6:
                return new SessionState[i];
            case 7:
                return new TextTrackStyle[i];
            case 8:
                return new VastAdsRequest[i];
            case 9:
                return new VideoInfo[i];
            case 10:
                return new CastOptions[i];
            case 11:
                return new CastMediaOptions[i];
            case 12:
                return new ImageHints[i];
            case 13:
                return new NotificationAction[i];
            case 14:
                return new ApplicationStatus[i];
            case 15:
                return new DeviceStatus[i];
            case 16:
                return new BatchedLogErrorParcelable[i];
            case 17:
                return new LogErrorParcelable[i];
            case 18:
                return new LogEventParcelable[i];
            case 19:
                return new PlayLoggerContext[i];
            default:
                return new CloudMessage[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        ArrayList arrayList = null;
        Intent intent = null;
        String str = null;
        ArrayList arrayList2 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        MediaLoadRequestData mediaLoadRequestData = null;
        String str5 = null;
        String str6 = null;
        switch (this.a) {
            case 0:
                int Q = qip.Q(parcel);
                Bundle bundle = null;
                while (parcel.dataPosition() < Q) {
                    int readInt = parcel.readInt();
                    int M = qip.M(readInt);
                    if (M == 2) {
                        arrayList = qip.ab(parcel, readInt, WebImage.CREATOR);
                    } else if (M == 3) {
                        bundle = qip.S(parcel, readInt);
                    } else if (M == 4) {
                        i = qip.O(parcel, readInt);
                    } else {
                        qip.ad(parcel, readInt);
                    }
                }
                qip.ac(parcel, Q);
                return new MediaMetadata(arrayList, bundle, i);
            case 1:
                int Q2 = qip.Q(parcel);
                long j = 0;
                long j2 = 0;
                double d = 0.0d;
                MediaInfo mediaInfo = null;
                MediaQueueData mediaQueueData = null;
                Boolean bool = null;
                long[] jArr = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                while (parcel.dataPosition() < Q2) {
                    int readInt2 = parcel.readInt();
                    switch (qip.M(readInt2)) {
                        case 2:
                            mediaInfo = (MediaInfo) qip.U(parcel, readInt2, MediaInfo.CREATOR);
                            break;
                        case 3:
                            mediaQueueData = (MediaQueueData) qip.U(parcel, readInt2, MediaQueueData.CREATOR);
                            break;
                        case 4:
                            bool = qip.V(parcel, readInt2);
                            break;
                        case 5:
                            j = qip.R(parcel, readInt2);
                            break;
                        case 6:
                            d = qip.K(parcel, readInt2);
                            break;
                        case 7:
                            jArr = qip.ah(parcel, readInt2);
                            break;
                        case 8:
                            str6 = qip.Y(parcel, readInt2);
                            break;
                        case 9:
                            str7 = qip.Y(parcel, readInt2);
                            break;
                        case 10:
                            str8 = qip.Y(parcel, readInt2);
                            break;
                        case 11:
                            str9 = qip.Y(parcel, readInt2);
                            break;
                        case 12:
                            str10 = qip.Y(parcel, readInt2);
                            break;
                        case 13:
                            j2 = qip.R(parcel, readInt2);
                            break;
                        default:
                            qip.ad(parcel, readInt2);
                            break;
                    }
                }
                qip.ac(parcel, Q2);
                return new MediaLoadRequestData(mediaInfo, mediaQueueData, bool, j, d, jArr, qko.g(str6), str7, str8, str9, str10, j2);
            case 2:
                int Q3 = qip.Q(parcel);
                double d2 = 0.0d;
                String str11 = null;
                ArrayList arrayList3 = null;
                ArrayList arrayList4 = null;
                int i2 = 0;
                while (parcel.dataPosition() < Q3) {
                    int readInt3 = parcel.readInt();
                    int M2 = qip.M(readInt3);
                    if (M2 == 2) {
                        i2 = qip.O(parcel, readInt3);
                    } else if (M2 == 3) {
                        str11 = qip.Y(parcel, readInt3);
                    } else if (M2 == 4) {
                        arrayList3 = qip.ab(parcel, readInt3, MediaMetadata.CREATOR);
                    } else if (M2 == 5) {
                        arrayList4 = qip.ab(parcel, readInt3, WebImage.CREATOR);
                    } else if (M2 == 6) {
                        d2 = qip.K(parcel, readInt3);
                    } else {
                        qip.ad(parcel, readInt3);
                    }
                }
                qip.ac(parcel, Q3);
                return new MediaQueueContainerMetadata(i2, str11, arrayList3, arrayList4, d2);
            case 3:
                int Q4 = qip.Q(parcel);
                long j3 = 0;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                MediaQueueContainerMetadata mediaQueueContainerMetadata = null;
                ArrayList arrayList5 = null;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                while (parcel.dataPosition() < Q4) {
                    int readInt4 = parcel.readInt();
                    switch (qip.M(readInt4)) {
                        case 2:
                            str12 = qip.Y(parcel, readInt4);
                            break;
                        case 3:
                            str13 = qip.Y(parcel, readInt4);
                            break;
                        case 4:
                            i3 = qip.O(parcel, readInt4);
                            break;
                        case 5:
                            str14 = qip.Y(parcel, readInt4);
                            break;
                        case 6:
                            mediaQueueContainerMetadata = (MediaQueueContainerMetadata) qip.U(parcel, readInt4, MediaQueueContainerMetadata.CREATOR);
                            break;
                        case 7:
                            i4 = qip.O(parcel, readInt4);
                            break;
                        case 8:
                            arrayList5 = qip.ab(parcel, readInt4, MediaQueueItem.CREATOR);
                            break;
                        case 9:
                            i5 = qip.O(parcel, readInt4);
                            break;
                        case 10:
                            j3 = qip.R(parcel, readInt4);
                            break;
                        default:
                            qip.ad(parcel, readInt4);
                            break;
                    }
                }
                qip.ac(parcel, Q4);
                return new MediaQueueData(str12, str13, i3, str14, mediaQueueContainerMetadata, i4, arrayList5, i5, j3);
            case 4:
                int Q5 = qip.Q(parcel);
                double d3 = 0.0d;
                double d4 = 0.0d;
                double d5 = 0.0d;
                MediaInfo mediaInfo2 = null;
                long[] jArr2 = null;
                String str15 = null;
                int i6 = 0;
                boolean z = false;
                while (parcel.dataPosition() < Q5) {
                    int readInt5 = parcel.readInt();
                    switch (qip.M(readInt5)) {
                        case 2:
                            mediaInfo2 = (MediaInfo) qip.U(parcel, readInt5, MediaInfo.CREATOR);
                            break;
                        case 3:
                            i6 = qip.O(parcel, readInt5);
                            break;
                        case 4:
                            z = qip.ae(parcel, readInt5);
                            break;
                        case 5:
                            d3 = qip.K(parcel, readInt5);
                            break;
                        case 6:
                            d4 = qip.K(parcel, readInt5);
                            break;
                        case 7:
                            d5 = qip.K(parcel, readInt5);
                            break;
                        case 8:
                            jArr2 = qip.ah(parcel, readInt5);
                            break;
                        case 9:
                            str15 = qip.Y(parcel, readInt5);
                            break;
                        default:
                            qip.ad(parcel, readInt5);
                            break;
                    }
                }
                qip.ac(parcel, Q5);
                return new MediaQueueItem(mediaInfo2, i6, z, d3, d4, d5, jArr2, str15);
            case 5:
                int Q6 = qip.Q(parcel);
                long j4 = 0;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                ArrayList arrayList6 = null;
                int i7 = 0;
                int i8 = 0;
                while (parcel.dataPosition() < Q6) {
                    int readInt6 = parcel.readInt();
                    switch (qip.M(readInt6)) {
                        case 2:
                            j4 = qip.R(parcel, readInt6);
                            break;
                        case 3:
                            i7 = qip.O(parcel, readInt6);
                            break;
                        case 4:
                            str16 = qip.Y(parcel, readInt6);
                            break;
                        case 5:
                            str17 = qip.Y(parcel, readInt6);
                            break;
                        case 6:
                            str18 = qip.Y(parcel, readInt6);
                            break;
                        case 7:
                            str19 = qip.Y(parcel, readInt6);
                            break;
                        case 8:
                            i8 = qip.O(parcel, readInt6);
                            break;
                        case 9:
                            arrayList6 = qip.aa(parcel, readInt6);
                            break;
                        case 10:
                            str5 = qip.Y(parcel, readInt6);
                            break;
                        default:
                            qip.ad(parcel, readInt6);
                            break;
                    }
                }
                qip.ac(parcel, Q6);
                return new MediaTrack(j4, i7, str16, str17, str18, str19, i8, arrayList6, qko.g(str5));
            case 6:
                int Q7 = qip.Q(parcel);
                String str20 = null;
                while (parcel.dataPosition() < Q7) {
                    int readInt7 = parcel.readInt();
                    int M3 = qip.M(readInt7);
                    if (M3 == 2) {
                        mediaLoadRequestData = (MediaLoadRequestData) qip.U(parcel, readInt7, MediaLoadRequestData.CREATOR);
                    } else if (M3 == 3) {
                        str20 = qip.Y(parcel, readInt7);
                    } else {
                        qip.ad(parcel, readInt7);
                    }
                }
                qip.ac(parcel, Q7);
                return new SessionState(mediaLoadRequestData, qko.g(str20));
            case 7:
                int Q8 = qip.Q(parcel);
                String str21 = null;
                String str22 = null;
                float f = 0.0f;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                while (parcel.dataPosition() < Q8) {
                    int readInt8 = parcel.readInt();
                    switch (qip.M(readInt8)) {
                        case 2:
                            f = qip.L(parcel, readInt8);
                            break;
                        case 3:
                            i9 = qip.O(parcel, readInt8);
                            break;
                        case 4:
                            i10 = qip.O(parcel, readInt8);
                            break;
                        case 5:
                            i11 = qip.O(parcel, readInt8);
                            break;
                        case 6:
                            i12 = qip.O(parcel, readInt8);
                            break;
                        case 7:
                            i13 = qip.O(parcel, readInt8);
                            break;
                        case 8:
                            i14 = qip.O(parcel, readInt8);
                            break;
                        case 9:
                            i15 = qip.O(parcel, readInt8);
                            break;
                        case 10:
                            str21 = qip.Y(parcel, readInt8);
                            break;
                        case 11:
                            i16 = qip.O(parcel, readInt8);
                            break;
                        case 12:
                            i17 = qip.O(parcel, readInt8);
                            break;
                        case 13:
                            str22 = qip.Y(parcel, readInt8);
                            break;
                        default:
                            qip.ad(parcel, readInt8);
                            break;
                    }
                }
                qip.ac(parcel, Q8);
                return new TextTrackStyle(f, i9, i10, i11, i12, i13, i14, i15, str21, i16, i17, str22);
            case 8:
                int Q9 = qip.Q(parcel);
                String str23 = null;
                while (parcel.dataPosition() < Q9) {
                    int readInt9 = parcel.readInt();
                    int M4 = qip.M(readInt9);
                    if (M4 == 2) {
                        str4 = qip.Y(parcel, readInt9);
                    } else if (M4 == 3) {
                        str23 = qip.Y(parcel, readInt9);
                    } else {
                        qip.ad(parcel, readInt9);
                    }
                }
                qip.ac(parcel, Q9);
                return new VastAdsRequest(str4, str23);
            case 9:
                int Q10 = qip.Q(parcel);
                int i18 = 0;
                int i19 = 0;
                while (parcel.dataPosition() < Q10) {
                    int readInt10 = parcel.readInt();
                    int M5 = qip.M(readInt10);
                    if (M5 == 2) {
                        i = qip.O(parcel, readInt10);
                    } else if (M5 == 3) {
                        i18 = qip.O(parcel, readInt10);
                    } else if (M5 == 4) {
                        i19 = qip.O(parcel, readInt10);
                    } else {
                        qip.ad(parcel, readInt10);
                    }
                }
                qip.ac(parcel, Q10);
                return new VideoInfo(i, i18, i19);
            case 10:
                int Q11 = qip.Q(parcel);
                double d6 = 0.0d;
                String str24 = null;
                ArrayList arrayList7 = null;
                LaunchOptions launchOptions = null;
                CastMediaOptions castMediaOptions = null;
                boolean z2 = false;
                boolean z3 = false;
                boolean z4 = false;
                boolean z5 = false;
                boolean z6 = false;
                boolean z7 = false;
                while (parcel.dataPosition() < Q11) {
                    int readInt11 = parcel.readInt();
                    switch (qip.M(readInt11)) {
                        case 2:
                            str24 = qip.Y(parcel, readInt11);
                            break;
                        case 3:
                            arrayList7 = qip.aa(parcel, readInt11);
                            break;
                        case 4:
                            z2 = qip.ae(parcel, readInt11);
                            break;
                        case 5:
                            launchOptions = (LaunchOptions) qip.U(parcel, readInt11, LaunchOptions.CREATOR);
                            break;
                        case 6:
                            z3 = qip.ae(parcel, readInt11);
                            break;
                        case 7:
                            castMediaOptions = (CastMediaOptions) qip.U(parcel, readInt11, CastMediaOptions.CREATOR);
                            break;
                        case 8:
                            z4 = qip.ae(parcel, readInt11);
                            break;
                        case 9:
                            d6 = qip.K(parcel, readInt11);
                            break;
                        case 10:
                            z5 = qip.ae(parcel, readInt11);
                            break;
                        case 11:
                            z6 = qip.ae(parcel, readInt11);
                            break;
                        case 12:
                            z7 = qip.ae(parcel, readInt11);
                            break;
                        default:
                            qip.ad(parcel, readInt11);
                            break;
                    }
                }
                qip.ac(parcel, Q11);
                return new CastOptions(str24, arrayList7, z2, launchOptions, z3, castMediaOptions, z4, d6, z5, z6, z7);
            case 11:
                int Q12 = qip.Q(parcel);
                String str25 = null;
                String str26 = null;
                IBinder iBinder = null;
                NotificationOptions notificationOptions = null;
                boolean z8 = false;
                boolean z9 = false;
                while (parcel.dataPosition() < Q12) {
                    int readInt12 = parcel.readInt();
                    switch (qip.M(readInt12)) {
                        case 2:
                            str25 = qip.Y(parcel, readInt12);
                            break;
                        case 3:
                            str26 = qip.Y(parcel, readInt12);
                            break;
                        case 4:
                            iBinder = qip.T(parcel, readInt12);
                            break;
                        case 5:
                            notificationOptions = (NotificationOptions) qip.U(parcel, readInt12, NotificationOptions.CREATOR);
                            break;
                        case 6:
                            z8 = qip.ae(parcel, readInt12);
                            break;
                        case 7:
                            z9 = qip.ae(parcel, readInt12);
                            break;
                        default:
                            qip.ad(parcel, readInt12);
                            break;
                    }
                }
                qip.ac(parcel, Q12);
                return new CastMediaOptions(str25, str26, iBinder, notificationOptions, z8, z9);
            case 12:
                int Q13 = qip.Q(parcel);
                int i20 = 0;
                int i21 = 0;
                while (parcel.dataPosition() < Q13) {
                    int readInt13 = parcel.readInt();
                    int M6 = qip.M(readInt13);
                    if (M6 == 2) {
                        i = qip.O(parcel, readInt13);
                    } else if (M6 == 3) {
                        i20 = qip.O(parcel, readInt13);
                    } else if (M6 == 4) {
                        i21 = qip.O(parcel, readInt13);
                    } else {
                        qip.ad(parcel, readInt13);
                    }
                }
                qip.ac(parcel, Q13);
                return new ImageHints(i, i20, i21);
            case 13:
                int Q14 = qip.Q(parcel);
                String str27 = null;
                while (parcel.dataPosition() < Q14) {
                    int readInt14 = parcel.readInt();
                    int M7 = qip.M(readInt14);
                    if (M7 == 2) {
                        str3 = qip.Y(parcel, readInt14);
                    } else if (M7 == 3) {
                        i = qip.O(parcel, readInt14);
                    } else if (M7 == 4) {
                        str27 = qip.Y(parcel, readInt14);
                    } else {
                        qip.ad(parcel, readInt14);
                    }
                }
                qip.ac(parcel, Q14);
                return new NotificationAction(str3, i, str27);
            case 14:
                int Q15 = qip.Q(parcel);
                while (parcel.dataPosition() < Q15) {
                    int readInt15 = parcel.readInt();
                    if (qip.M(readInt15) == 2) {
                        str2 = qip.Y(parcel, readInt15);
                    } else {
                        qip.ad(parcel, readInt15);
                    }
                }
                qip.ac(parcel, Q15);
                return new ApplicationStatus(str2);
            case 15:
                int Q16 = qip.Q(parcel);
                double d7 = 0.0d;
                double d8 = 0.0d;
                ApplicationMetadata applicationMetadata = null;
                EqualizerSettings equalizerSettings = null;
                boolean z10 = false;
                int i22 = 0;
                int i23 = 0;
                while (parcel.dataPosition() < Q16) {
                    int readInt16 = parcel.readInt();
                    switch (qip.M(readInt16)) {
                        case 2:
                            d7 = qip.K(parcel, readInt16);
                            break;
                        case 3:
                            z10 = qip.ae(parcel, readInt16);
                            break;
                        case 4:
                            i22 = qip.O(parcel, readInt16);
                            break;
                        case 5:
                            applicationMetadata = (ApplicationMetadata) qip.U(parcel, readInt16, ApplicationMetadata.CREATOR);
                            break;
                        case 6:
                            i23 = qip.O(parcel, readInt16);
                            break;
                        case 7:
                            equalizerSettings = (EqualizerSettings) qip.U(parcel, readInt16, EqualizerSettings.CREATOR);
                            break;
                        case 8:
                            d8 = qip.K(parcel, readInt16);
                            break;
                        default:
                            qip.ad(parcel, readInt16);
                            break;
                    }
                }
                qip.ac(parcel, Q16);
                return new DeviceStatus(d7, z10, i22, applicationMetadata, i23, equalizerSettings, d8);
            case 16:
                int Q17 = qip.Q(parcel);
                while (parcel.dataPosition() < Q17) {
                    int readInt17 = parcel.readInt();
                    if (qip.M(readInt17) == 1) {
                        arrayList2 = qip.ab(parcel, readInt17, LogErrorParcelable.CREATOR);
                    } else {
                        qip.ad(parcel, readInt17);
                    }
                }
                qip.ac(parcel, Q17);
                return new BatchedLogErrorParcelable(arrayList2);
            case 17:
                int Q18 = qip.Q(parcel);
                int i24 = 0;
                while (parcel.dataPosition() < Q18) {
                    int readInt18 = parcel.readInt();
                    int M8 = qip.M(readInt18);
                    if (M8 == 1) {
                        str = qip.Y(parcel, readInt18);
                    } else if (M8 == 2) {
                        i = qip.O(parcel, readInt18);
                    } else if (M8 == 3) {
                        i24 = qip.O(parcel, readInt18);
                    } else {
                        qip.ad(parcel, readInt18);
                    }
                }
                qip.ac(parcel, Q18);
                return new LogErrorParcelable(str, i, i24);
            case 18:
                int Q19 = qip.Q(parcel);
                PlayLoggerContext playLoggerContext = null;
                byte[] bArr = null;
                int[] iArr = null;
                String[] strArr = null;
                int[] iArr2 = null;
                byte[][] bArr2 = null;
                ExperimentTokens[] experimentTokensArr = null;
                boolean z11 = true;
                while (parcel.dataPosition() < Q19) {
                    int readInt19 = parcel.readInt();
                    switch (qip.M(readInt19)) {
                        case 2:
                            playLoggerContext = (PlayLoggerContext) qip.U(parcel, readInt19, PlayLoggerContext.CREATOR);
                            break;
                        case 3:
                            bArr = qip.af(parcel, readInt19);
                            break;
                        case 4:
                            iArr = qip.ag(parcel, readInt19);
                            break;
                        case 5:
                            strArr = qip.aj(parcel, readInt19);
                            break;
                        case 6:
                            iArr2 = qip.ag(parcel, readInt19);
                            break;
                        case 7:
                            bArr2 = qip.ak(parcel, readInt19);
                            break;
                        case 8:
                            z11 = qip.ae(parcel, readInt19);
                            break;
                        case 9:
                            experimentTokensArr = (ExperimentTokens[]) qip.ai(parcel, readInt19, ExperimentTokens.CREATOR);
                            break;
                        default:
                            qip.ad(parcel, readInt19);
                            break;
                    }
                }
                qip.ac(parcel, Q19);
                return new LogEventParcelable(playLoggerContext, bArr, iArr, strArr, iArr2, bArr2, z11, experimentTokensArr);
            case 19:
                int Q20 = qip.Q(parcel);
                String str28 = null;
                String str29 = null;
                String str30 = null;
                String str31 = null;
                Integer num = null;
                int i25 = 0;
                int i26 = 0;
                boolean z12 = true;
                boolean z13 = false;
                int i27 = 0;
                boolean z14 = false;
                int i28 = 0;
                while (parcel.dataPosition() < Q20) {
                    int readInt20 = parcel.readInt();
                    switch (qip.M(readInt20)) {
                        case 2:
                            str28 = qip.Y(parcel, readInt20);
                            break;
                        case 3:
                            i25 = qip.O(parcel, readInt20);
                            break;
                        case 4:
                            i26 = qip.O(parcel, readInt20);
                            break;
                        case 5:
                            str29 = qip.Y(parcel, readInt20);
                            break;
                        case 6:
                            str30 = qip.Y(parcel, readInt20);
                            break;
                        case 7:
                            z12 = qip.ae(parcel, readInt20);
                            break;
                        case 8:
                            str31 = qip.Y(parcel, readInt20);
                            break;
                        case 9:
                            z13 = qip.ae(parcel, readInt20);
                            break;
                        case 10:
                            i27 = qip.O(parcel, readInt20);
                            break;
                        case 11:
                            num = qip.W(parcel, readInt20);
                            break;
                        case 12:
                            z14 = qip.ae(parcel, readInt20);
                            break;
                        case 13:
                            i28 = qip.O(parcel, readInt20);
                            break;
                        default:
                            qip.ad(parcel, readInt20);
                            break;
                    }
                }
                qip.ac(parcel, Q20);
                return new PlayLoggerContext(str28, i25, i26, str29, str30, z12, str31, z13, i27, num, z14, i28);
            default:
                int Q21 = qip.Q(parcel);
                while (parcel.dataPosition() < Q21) {
                    int readInt21 = parcel.readInt();
                    if (qip.M(readInt21) == 1) {
                        intent = (Intent) qip.U(parcel, readInt21, Intent.CREATOR);
                    } else {
                        qip.ad(parcel, readInt21);
                    }
                }
                qip.ac(parcel, Q21);
                return new CloudMessage(intent);
        }
    }
}
