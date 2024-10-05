package defpackage;

import android.os.Parcelable;
import com.google.android.gms.wallet.Address;
import com.google.android.gms.wallet.CardInfo;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.InstrumentInfo;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.OfferWalletObject;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentResponse;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentMethodToken;
import com.google.android.gms.wallet.ProxyCard;
import com.google.android.gms.wallet.WebPaymentData;
import com.google.android.gms.wallet.firstparty.GetBuyFlowInitializationTokenResponse;
import com.google.android.gms.wallet.firstparty.GetClientTokenRequest;
import com.google.android.gms.wallet.firstparty.GetClientTokenResponse;
import com.google.android.gms.wallet.firstparty.InitializeBuyFlowRequest;
import com.google.android.gms.wallet.firstparty.SetUpBiometricAuthenticationKeysResponse;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import com.google.android.gms.wallet.firstparty.WarmUpUiProcessResponse;
import com.google.android.gms.wallet.firstparty.saveinstrument.GetSaveInstrumentDetailsResponse;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rqx implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public rqx(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new CardInfo[i];
            case 1:
                return new Address[i];
            case 2:
                return new FullWallet[i];
            case 3:
                return new InstrumentInfo[i];
            case 4:
                return new MaskedWallet[i];
            case 5:
                return new OfferWalletObject[i];
            case 6:
                return new PaymentCardRecognitionIntentResponse[i];
            case 7:
                return new PaymentData[i];
            case 8:
                return new PaymentMethodToken[i];
            case 9:
                return new ProxyCard[i];
            case 10:
                return new WebPaymentData[i];
            case 11:
                return new GetBuyFlowInitializationTokenResponse[i];
            case 12:
                return new GetClientTokenRequest[i];
            case 13:
                return new GetClientTokenResponse[i];
            case 14:
                return new InitializeBuyFlowRequest[i];
            case 15:
                return new SetUpBiometricAuthenticationKeysResponse[i];
            case 16:
                return new WalletCustomTheme[i];
            case 17:
                return new WarmUpUiProcessResponse[i];
            case 18:
                return new GetSaveInstrumentDetailsResponse[i];
            case 19:
                return new ApplicationParameters[i];
            default:
                return new BuyFlowConfig[i];
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 569
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r26) {
        /*
            Method dump skipped, instructions count: 1760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rqx.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
