package defpackage;

import android.os.Parcelable;
import com.google.android.gms.appdatasearch.ScoringConfig;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.auth.AccountChangeEvent;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.auth.GetAccountsRequest;
import com.google.android.gms.auth.HasCapabilitiesRequest;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;
import com.google.android.gms.cast.AdBreakClipInfo;
import com.google.android.gms.cast.AdBreakInfo;
import com.google.android.gms.cast.AdBreakStatus;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CredentialsData;
import com.google.android.gms.cast.EqualizerBandSettings;
import com.google.android.gms.cast.EqualizerSettings;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaLiveSeekableRange;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qcp implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public qcp(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new UsageInfo[i];
            case 1:
                return new ScoringConfig[i];
            case 2:
                return new AccountChangeEvent[i];
            case 3:
                return new AccountChangeEventsRequest[i];
            case 4:
                return new AccountChangeEventsResponse[i];
            case 5:
                return new GetAccountsRequest[i];
            case 6:
                return new HasCapabilitiesRequest[i];
            case 7:
                return new TokenData[i];
            case 8:
                return new ProxyResponse[i];
            case 9:
                return new GoogleSignInAccount[i];
            case 10:
                return new ClearTokenRequest[i];
            case 11:
                return new AdBreakClipInfo[i];
            case 12:
                return new AdBreakInfo[i];
            case 13:
                return new AdBreakStatus[i];
            case 14:
                return new ApplicationMetadata[i];
            case 15:
                return new CredentialsData[i];
            case 16:
                return new EqualizerBandSettings[i];
            case 17:
                return new EqualizerSettings[i];
            case 18:
                return new LaunchOptions[i];
            case 19:
                return new MediaError[i];
            default:
                return new MediaLiveSeekableRange[i];
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 588
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r29) {
        /*
            Method dump skipped, instructions count: 1848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qcp.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
