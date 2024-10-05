package defpackage;

import android.os.Parcelable;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.AdDataParcel;
import com.google.android.gms.ads.internal.client.AdErrorParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.AdValueParcel;
import com.google.android.gms.ads.internal.client.AdapterResponseInfoParcel;
import com.google.android.gms.ads.internal.client.AppOpenAdOptionsParcel;
import com.google.android.gms.ads.internal.client.IconAdOptionsParcel;
import com.google.android.gms.ads.internal.client.SearchAdRequestParcel;
import com.google.android.gms.ads.internal.client.VideoOptionsParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.initialization.MediationConfigurationParcel;
import com.google.android.gms.ads.internal.instream.InstreamAdConfigurationParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.appdatasearch.DocumentContents;
import com.google.android.gms.appdatasearch.DocumentId;
import com.google.android.gms.appdatasearch.DocumentSection;
import com.google.android.gms.appdatasearch.Feature;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Response;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pvl implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public pvl(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new AdDataParcel[i];
            case 1:
                return new PublisherAdViewOptions[i];
            case 2:
                return new AdErrorParcel[i];
            case 3:
                return new AdSizeParcel[i];
            case 4:
                return new AdValueParcel[i];
            case 5:
                return new AdapterResponseInfoParcel[i];
            case 6:
                return new AppOpenAdOptionsParcel[i];
            case 7:
                return new IconAdOptionsParcel[i];
            case 8:
                return new SearchAdRequestParcel[i];
            case 9:
                return new VideoOptionsParcel[i];
            case 10:
                return new NativeAdOptionsParcel[i];
            case 11:
                return new MediationConfigurationParcel[i];
            case 12:
                return new InstreamAdConfigurationParcel[i];
            case 13:
                return new RewardItemParcel[i];
            case 14:
                return new VersionInfoParcel[i];
            case 15:
                return new DocumentContents[i];
            case 16:
                return new DocumentId[i];
            case 17:
                return new DocumentSection[i];
            case 18:
                return new Feature[i];
            case 19:
                return new GetRecentContextCall$Response[i];
            default:
                return new RegisterSectionInfo[i];
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 549
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r29) {
        /*
            Method dump skipped, instructions count: 1578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pvl.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
