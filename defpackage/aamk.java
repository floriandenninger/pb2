package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.ads.AdBreakRendererModel;
import com.google.android.libraries.youtube.innertube.model.ads.AdBreakResponseModel;
import com.google.android.libraries.youtube.innertube.model.ads.Survey;
import com.google.android.libraries.youtube.innertube.model.ads.SurveyQuestion;
import com.google.android.libraries.youtube.innertube.model.ads.VastAd;
import com.google.android.libraries.youtube.innertube.model.ads.VastInfoCard;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerThreedRendererModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.LoggingUrlModel;
import com.google.android.libraries.youtube.innertube.model.player.PlaybackLoggingPayloadModel;
import com.google.android.libraries.youtube.innertube.model.player.PlaybackTrackingModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aamk implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public aamk(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new AdBreakRendererModel[i];
            case 1:
                return new WatchNextResponseModel[i];
            case 2:
                return new AdBreakResponseModel[i];
            case 3:
                return new Survey[i];
            case 4:
                return new SurveyQuestion[i];
            case 5:
                return new VastAd[i];
            case 6:
                return new VastAd.ProgressPing[i];
            case 7:
                return new VastInfoCard[i];
            case 8:
                return new VastInfoCard.InfoCardAction[i];
            case 9:
                return new VastInfoCard.InfoCardApp[i];
            case 10:
                return new VastInfoCard.InfoCardTrackingEvent[i];
            case 11:
                return new FormatStreamModel[i];
            case 12:
                return new PlayerConfigModel[i];
            case 13:
                return new PlayerThreedRendererModel[i];
            case 14:
                return new VideoQuality[i];
            case 15:
                return new VideoStreamingData[i];
            case 16:
                return new LoggingUrlModel[i];
            case 17:
                return new PlaybackLoggingPayloadModel[i];
            case 18:
                return new PlaybackTrackingModel[i];
            case 19:
                return new PlayerResponseModel[i];
            default:
                return new PlayerResponseModel.MutableContext[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        aryv aryvVar = null;
        switch (this.a) {
            case 0:
                try {
                    return new AdBreakRendererModel((aowc) yny.H(parcel, aowc.a));
                } catch (IllegalArgumentException unused) {
                    return null;
                }
            case 1:
                try {
                    return new WatchNextResponseModel((asfc) aarr.b(parcel, asfc.a));
                } catch (aoob unused2) {
                    return null;
                }
            case 2:
                try {
                    try {
                        return new AdBreakResponseModel((aris) amkq.ch(parcel, aris.a, aomw.b()), parcel.readLong());
                    } catch (aoob e) {
                        throw new RuntimeException(e);
                    }
                } catch (RuntimeException unused3) {
                    return null;
                }
            case 3:
                return new Survey((owm) yny.H(parcel, owm.a));
            case 4:
                try {
                    return new SurveyQuestion((own) yny.H(parcel, own.a));
                } catch (IllegalArgumentException unused4) {
                    return null;
                }
            case 5:
                List e2 = VastAd.e(parcel);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                byte[] createByteArray = parcel.createByteArray();
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                aamn aamnVar = (aamn) Enum.valueOf(aamn.class, parcel.readString());
                String readString10 = parcel.readString();
                int readInt = parcel.readInt();
                PlayerResponseModel playerResponseModel = (PlayerResponseModel) parcel.readParcelable(PlayerResponseModel.class.getClassLoader());
                VideoStreamingData videoStreamingData = (VideoStreamingData) parcel.readParcelable(VideoStreamingData.class.getClassLoader());
                PlaybackTrackingModel playbackTrackingModel = (PlaybackTrackingModel) parcel.readParcelable(PlaybackTrackingModel.class.getClassLoader());
                PlayerConfigModel playerConfigModel = (PlayerConfigModel) parcel.readParcelable(PlayerConfigModel.class.getClassLoader());
                ParcelableMessageLite parcelableMessageLite = (ParcelableMessageLite) parcel.readParcelable(ParcelableMessageLite.class.getClassLoader());
                atxz atxzVar = parcelableMessageLite != null ? (atxz) parcelableMessageLite.a(atxz.a) : null;
                Uri uri = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
                List e3 = VastAd.e(parcel);
                List e4 = VastAd.e(parcel);
                List e5 = VastAd.e(parcel);
                List e6 = VastAd.e(parcel);
                ArrayList arrayList = new ArrayList();
                atxz atxzVar2 = atxzVar;
                parcel.readTypedList(arrayList, VastAd.ProgressPing.CREATOR);
                List unmodifiableList = Collections.unmodifiableList(arrayList);
                List e7 = VastAd.e(parcel);
                List e8 = VastAd.e(parcel);
                List e9 = VastAd.e(parcel);
                List e10 = VastAd.e(parcel);
                List e11 = VastAd.e(parcel);
                List e12 = VastAd.e(parcel);
                List e13 = VastAd.e(parcel);
                List e14 = VastAd.e(parcel);
                List e15 = VastAd.e(parcel);
                List e16 = VastAd.e(parcel);
                List e17 = VastAd.e(parcel);
                List e18 = VastAd.e(parcel);
                List e19 = VastAd.e(parcel);
                List e20 = VastAd.e(parcel);
                List e21 = VastAd.e(parcel);
                List e22 = VastAd.e(parcel);
                Uri uri2 = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
                Uri uri3 = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
                boolean z = parcel.readInt() == 1;
                long readLong = parcel.readLong();
                int readInt2 = parcel.readInt();
                boolean z2 = parcel.readInt() == 1;
                apfc apfcVar = (apfc) yny.H(parcel, apfc.a);
                argu arguVar = (argu) yny.H(parcel, argu.a);
                long readLong2 = parcel.readLong();
                boolean z3 = parcel.readInt() == 1;
                boolean z4 = parcel.readInt() == 1;
                Uri uri4 = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
                VastAd vastAd = (VastAd) parcel.readParcelable(VastAd.class.getClassLoader());
                VastAd vastAd2 = (VastAd) parcel.readParcelable(VastAd.class.getClassLoader());
                ArrayList arrayList2 = new ArrayList();
                parcel.readStringList(arrayList2);
                boolean z5 = z4;
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    arrayList3.add((aamo) Enum.valueOf(aamo.class, arrayList2.get(i)));
                    i++;
                    size = size;
                    arrayList2 = arrayList2;
                }
                List unmodifiableList2 = Collections.unmodifiableList(arrayList3);
                ArrayList arrayList4 = new ArrayList();
                parcel.readTypedList(arrayList4, VastInfoCard.CREATOR);
                List unmodifiableList3 = Collections.unmodifiableList(arrayList4);
                Survey survey = (Survey) parcel.readParcelable(Survey.class.getClassLoader());
                List e23 = VastAd.e(parcel);
                List e24 = VastAd.e(parcel);
                List e25 = VastAd.e(parcel);
                boolean z6 = parcel.readInt() == 1;
                String readString11 = parcel.readString();
                return new VastAd(e2, readString, readString2, readString3, readString4, readString5, createByteArray, readString6, readString7, readString8, readString9, aamnVar, readString10, readInt, playerResponseModel, videoStreamingData, playbackTrackingModel, playerConfigModel, atxzVar2, uri, e3, e4, e5, e6, unmodifiableList, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20, e21, e22, uri2, uri3, z, readLong, readInt2, z2, apfcVar, arguVar, readLong2, z3, z5, uri4, vastAd, vastAd2, unmodifiableList2, unmodifiableList3, survey, e23, e24, e25, z6, TextUtils.isEmpty(readString11) ? null : Pattern.compile(readString11), parcel.createByteArray());
            case 6:
                return new VastAd.ProgressPing(parcel.readInt(), parcel.readInt() == 1, (Uri) parcel.readParcelable(Uri.class.getClassLoader()));
            case 7:
                int readInt3 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList();
                parcel.readTypedList(arrayList5, VastInfoCard.InfoCardAction.CREATOR);
                List unmodifiableList4 = Collections.unmodifiableList(arrayList5);
                ArrayList arrayList6 = new ArrayList();
                parcel.readTypedList(arrayList6, VastInfoCard.InfoCardTrackingEvent.CREATOR);
                return new VastInfoCard(readInt3, unmodifiableList4, Collections.unmodifiableList(arrayList6), (VastInfoCard.InfoCardApp) parcel.readParcelable(VastInfoCard.InfoCardApp.class.getClassLoader()));
            case 8:
                int readInt4 = parcel.readInt();
                Uri uri5 = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
                String readString12 = parcel.readString();
                ArrayList arrayList7 = new ArrayList();
                parcel.readTypedList(arrayList7, Uri.CREATOR);
                return new VastInfoCard.InfoCardAction(readInt4, uri5, readString12, Collections.unmodifiableList(arrayList7));
            case 9:
                return new VastInfoCard.InfoCardApp(parcel.readString(), parcel.readString(), (Uri) parcel.readParcelable(Uri.class.getClassLoader()), parcel.readString(), parcel.readInt() == 1, parcel.readFloat(), (Uri) parcel.readParcelable(Uri.class.getClassLoader()), parcel.readInt());
            case 10:
                return new VastInfoCard.InfoCardTrackingEvent(parcel.readInt(), (Uri) parcel.readParcelable(Uri.class.getClassLoader()));
            case 11:
                aqxz aqxzVar = (aqxz) yny.H(parcel, aqxz.b);
                aqxzVar.getClass();
                return new FormatStreamModel(aqxzVar, parcel.readString(), parcel.readLong(), yny.J(parcel));
            case 12:
                try {
                    return new PlayerConfigModel((atyi) yny.H(parcel, atyi.a));
                } catch (IllegalArgumentException unused5) {
                    return PlayerConfigModel.b;
                }
            case 13:
                return new PlayerThreedRendererModel(parcel.readInt());
            case 14:
                return new VideoQuality(parcel.readInt(), parcel.readString(), parcel.readInt() == 1);
            case 15:
                try {
                    aryvVar = (aryv) yny.H(parcel, aryv.a);
                } catch (IllegalArgumentException e26) {
                    zga.d("Error reading streaming data", e26);
                }
                if (aryvVar == null) {
                    aryvVar = aryv.a;
                }
                aryv aryvVar2 = aryvVar;
                PlayerThreedRendererModel playerThreedRendererModel = (PlayerThreedRendererModel) PlayerThreedRendererModel.CREATOR.createFromParcel(parcel);
                String readString13 = parcel.readString();
                long readLong3 = parcel.readLong();
                long readLong4 = parcel.readLong();
                long readLong5 = parcel.readLong();
                int readInt5 = parcel.readInt();
                aszn asznVar = (aszn) parcel.readSerializable();
                String readString14 = parcel.readString();
                if (readString14 == null) {
                    readString14 = "";
                }
                String str = readString14;
                VideoStreamingData videoStreamingData2 = VideoStreamingData.a;
                int readInt6 = parcel.readInt();
                boolean J2 = yny.J(parcel);
                if (asznVar == null) {
                    asznVar = aszn.MDE_STREAM_OPTIMIZATIONS_RENDERER_LATENCY_UNKNOWN;
                }
                return new VideoStreamingData(aryvVar2, readString13, readLong3, readLong4, readLong5, readInt5, asznVar, playerThreedRendererModel, str, (aaos) null, readInt6, J2);
            case 16:
                return new LoggingUrlModel((owd) yny.H(parcel, owd.a));
            case 17:
                aomf aomfVar = (aomf) parcel.readSerializable();
                int readInt7 = parcel.readInt();
                aone createBuilder = atyz.a.createBuilder();
                createBuilder.copyOnWrite();
                atyz atyzVar = (atyz) createBuilder.instance;
                aomfVar.getClass();
                atyzVar.b = 1 | atyzVar.b;
                atyzVar.c = aomfVar;
                createBuilder.copyOnWrite();
                atyz atyzVar2 = (atyz) createBuilder.instance;
                atyzVar2.b |= 2;
                atyzVar2.d = readInt7;
                return new PlaybackLoggingPayloadModel((atyz) createBuilder.build());
            case 18:
                try {
                    byte[] bArr = new byte[parcel.readInt()];
                    parcel.readByteArray(bArr);
                    return new PlaybackTrackingModel((aryj) aonm.parseFrom(aryj.a, bArr));
                } catch (aoob unused6) {
                    return new PlaybackTrackingModel();
                }
            case 19:
                aryr aryrVar = (aryr) aarr.b(parcel, aryr.a);
                if (aryrVar == null) {
                    return null;
                }
                return new PlayerResponseModel(aryrVar, parcel.readLong(), (VideoStreamingData) parcel.readParcelable(VideoStreamingData.class.getClassLoader()), (PlayerResponseModel.MutableContext) parcel.readParcelable(PlayerResponseModel.MutableContext.class.getClassLoader()));
            default:
                PlayerResponseModel.MutableContext mutableContext = new PlayerResponseModel.MutableContext();
                HashMap readHashMap = parcel.readHashMap(Boolean.class.getClassLoader());
                if (readHashMap != null) {
                    for (Map.Entry entry : readHashMap.entrySet()) {
                        mutableContext.a((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
                    }
                }
                HashMap readHashMap2 = parcel.readHashMap(Long.class.getClassLoader());
                if (readHashMap2 != null) {
                    for (Map.Entry entry2 : readHashMap2.entrySet()) {
                        mutableContext.b((String) entry2.getKey(), ((Long) entry2.getValue()).longValue());
                    }
                }
                HashMap readHashMap3 = parcel.readHashMap(String.class.getClassLoader());
                if (readHashMap3 != null) {
                    for (Map.Entry entry3 : readHashMap3.entrySet()) {
                        mutableContext.c((String) entry3.getKey(), (String) entry3.getValue());
                    }
                }
                return mutableContext;
        }
    }
}
