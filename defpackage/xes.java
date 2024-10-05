package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.youtube.ads.model.ForecastingAd;
import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.ads.model.InstreamAdImpl;
import com.google.android.libraries.youtube.ads.model.LocalVideoAd;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import com.google.android.libraries.youtube.ads.model.RemoteVideoAd;
import com.google.android.libraries.youtube.ads.model.SurveyAd;
import com.google.android.libraries.youtube.ads.model.SurveyQuestionRendererModel;
import com.google.android.libraries.youtube.ads.model.ThrottledAd;
import com.google.android.libraries.youtube.ads.model.VideoAdTrackingModel;
import com.google.android.libraries.youtube.ads.model.VideoTrackingAd;
import com.google.android.libraries.youtube.edit.audioswap.model.CategorySelection;
import com.google.android.libraries.youtube.edit.audioswap.model.FeaturedTrackSelection;
import com.google.android.libraries.youtube.edit.audioswap.model.OnDeviceTrackSelection;
import com.google.android.libraries.youtube.edit.audioswap.model.Track;
import com.google.android.libraries.youtube.edit.camera.CameraView;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
import com.google.android.libraries.youtube.edit.common.RecordingInfo;
import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
import com.google.android.libraries.youtube.infocards.factories.InfoCardCollection;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import com.google.android.libraries.youtube.innertube.model.SearchResponseModel;
import com.google.android.libraries.youtube.innertube.model.ads.AdBreakRendererModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xes implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public xes(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new InstreamAdBreak[i];
            case 1:
                return new ForecastingAd[0];
            case 2:
                return new InstreamAdImpl[i];
            case 3:
                return new LocalVideoAd[0];
            case 4:
                return new RemoteVideoAd[i];
            case 5:
                return new SurveyAd[0];
            case 6:
                return new SurveyQuestionRendererModel[i];
            case 7:
                return new ThrottledAd[0];
            case 8:
                return new VideoAdTrackingModel[i];
            case 9:
                return new VideoTrackingAd[0];
            case 10:
                return new CategorySelection[i];
            case 11:
                return new FeaturedTrackSelection[i];
            case 12:
                return new OnDeviceTrackSelection[i];
            case 13:
                return new Track[i];
            case 14:
                return new CameraView.SavedState[i];
            case 15:
                return new DeviceLocalFile[i];
            case 16:
                return new RecordingInfo[i];
            case 17:
                return new FilterMapTable$FilterDescriptor[i];
            case 18:
                return new InfoCardCollection[i];
            case 19:
                return new BrowseResponseModel[i];
            default:
                return new SearchResponseModel[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        apxf apxfVar;
        asgk asgkVar;
        switch (this.a) {
            case 0:
                AdBreakRendererModel adBreakRendererModel = (AdBreakRendererModel) parcel.readParcelable(AdBreakRendererModel.class.getClassLoader());
                int readInt = parcel.readInt();
                boolean z = parcel.readInt() == 1;
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                byte[] bArr = new byte[parcel.readInt()];
                parcel.readByteArray(bArr);
                return new InstreamAdBreak(adBreakRendererModel, readInt, z, readString, readString2, readString3, bArr);
            case 1:
                try {
                    return new ForecastingAd(parcel.readString(), parcel.createByteArray(), parcel.readString(), parcel.readString(), parcel.readByte() != 0, (PlayerConfigModel) parcel.readParcelable(PlayerConfigModel.class.getClassLoader()), parcel.readString(), parcel.readLong(), (aqxo) yny.H(parcel, aqxo.a));
                } catch (IllegalArgumentException unused) {
                    zga.b("Failed to read forecastingAdRenderer proto from parcel.");
                    return null;
                }
            case 2:
                return new InstreamAdImpl((PlayerAd) parcel.readParcelable(PlayerAd.class.getClassLoader()));
            case 3:
                String readString4 = parcel.readString();
                byte[] createByteArray = parcel.createByteArray();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                boolean z2 = parcel.readByte() != 0;
                parcel.readParcelable(PlayerConfigModel.class.getClassLoader());
                try {
                    return new LocalVideoAd(readString4, createByteArray, readString5, readString6, z2, parcel.readString(), parcel.readLong(), (avvy) yny.H(parcel, avvy.a), (PlayerResponseModel) parcel.readParcelable(PlayerResponseModel.class.getClassLoader()), parcel.readInt());
                } catch (IllegalArgumentException unused2) {
                    zga.b("Failed to read videoAdRenderer proto from parcel.");
                    return null;
                }
            case 4:
                String readString7 = parcel.readString();
                byte[] createByteArray2 = parcel.createByteArray();
                parcel.readString();
                parcel.readString();
                parcel.readByte();
                parcel.readParcelable(PlayerConfigModel.class.getClassLoader());
                String readString8 = parcel.readString();
                long readLong = parcel.readLong();
                boolean z3 = parcel.readInt() != 0;
                int readInt2 = parcel.readInt();
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                aamn a = aamn.a(parcel.readString());
                Uri uri = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
                PlayerResponseModel playerResponseModel = (PlayerResponseModel) parcel.readParcelable(PlayerResponseModel.class.getClassLoader());
                try {
                    apxfVar = (apxf) yny.H(parcel, apxf.a);
                } catch (IllegalArgumentException unused3) {
                    zga.b("Failed to read closeCommand from parcel.");
                    apxfVar = null;
                }
                try {
                    asgkVar = (asgk) yny.H(parcel, asgk.a);
                } catch (IllegalArgumentException unused4) {
                    zga.b("Failed to read instreamAdPlayerOverlayRenderer from parcel.");
                    asgkVar = null;
                }
                return new RemoteVideoAd(z3, readInt2, readLong, readString8, readString9, readString7, readString10, createByteArray2, a, uri, playerResponseModel, apxfVar, asgkVar);
            case 5:
                String readString11 = parcel.readString();
                byte[] createByteArray3 = parcel.createByteArray();
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                boolean z4 = parcel.readByte() != 0;
                PlayerConfigModel playerConfigModel = (PlayerConfigModel) parcel.readParcelable(PlayerConfigModel.class.getClassLoader());
                String readString14 = parcel.readString();
                parcel.readLong();
                try {
                    return new SurveyAd(readString11, createByteArray3, readString12, readString13, z4, playerConfigModel, readString14, (avbm) yny.H(parcel, avbm.a), parcel.readInt());
                } catch (IllegalArgumentException unused5) {
                    zga.b("Failed to read surveyAdRenderer proto from parcel.");
                    return null;
                }
            case 6:
                return new SurveyQuestionRendererModel((avbl) yny.H(parcel, avbl.a));
            case 7:
                return new ThrottledAd(parcel.readString(), parcel.createByteArray(), parcel.readString(), parcel.readString(), parcel.readByte() != 0, (PlayerConfigModel) parcel.readParcelable(PlayerConfigModel.class.getClassLoader()), parcel.readString(), parcel.readLong());
            case 8:
                try {
                    return new VideoAdTrackingModel((aoyi) yny.H(parcel, aoyi.a));
                } catch (IllegalArgumentException unused6) {
                    return null;
                }
            case 9:
                try {
                    return new VideoTrackingAd(parcel.readString(), parcel.createByteArray(), parcel.readString(), parcel.readByte() != 0, (PlayerConfigModel) parcel.readParcelable(PlayerConfigModel.class.getClassLoader()), parcel.readInt(), (avwa) yny.H(parcel, avwa.a));
                } catch (IllegalArgumentException unused7) {
                    zga.b("Failed to read videoAdTrackingRenderer proto from parcel.");
                    return null;
                }
            case 10:
                return new CategorySelection(parcel);
            case 11:
                return new FeaturedTrackSelection(parcel);
            case 12:
                return new OnDeviceTrackSelection(parcel);
            case 13:
                return new Track(parcel);
            case 14:
                return new CameraView.SavedState(parcel);
            case 15:
                zoi i = DeviceLocalFile.i();
                i.e(parcel.readLong());
                i.h((Uri) parcel.readParcelable(Uri.class.getClassLoader()));
                i.b(parcel.readString());
                i.a = parcel.readString();
                i.g(parcel.readLong());
                i.c(parcel.readLong());
                i.f(parcel.readLong());
                i.d(parcel.readInt());
                return i.a();
            case 16:
                return new RecordingInfo(parcel);
            case 17:
                return new FilterMapTable$FilterDescriptor(parcel);
            case 18:
                try {
                    return new InfoCardCollection((argu) amkq.ch(parcel, argu.a, aomw.b()));
                } catch (aoob unused8) {
                    return null;
                }
            case 19:
                arjv arjvVar = (arjv) aarr.b(parcel, arjv.a);
                if (arjvVar == null) {
                    return null;
                }
                return new BrowseResponseModel(arjvVar);
            default:
                try {
                    return new SearchResponseModel((asah) aarr.b(parcel, asah.a));
                } catch (IllegalArgumentException unused9) {
                    return null;
                }
        }
    }
}
