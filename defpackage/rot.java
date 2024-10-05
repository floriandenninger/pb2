package defpackage;

import android.os.Parcelable;
import com.google.android.gms.signin.internal.AuthAccountResult;
import com.google.android.gms.signin.internal.RecordConsentByConsentResultResponse;
import com.google.android.gms.signin.internal.SignInRequest;
import com.google.android.gms.signin.internal.SignInResponse;
import com.google.android.gms.usagereporting.ConsentInformation;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.internal.client.BarcodeDetectorOptions;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rot implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public rot(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new RecordConsentByConsentResultResponse[i];
            case 1:
                return new AuthAccountResult[i];
            case 2:
                return new SignInRequest[i];
            case 3:
                return new SignInResponse[i];
            case 4:
                return new ConsentInformation.AccountConsentInformation[i];
            case 5:
                return new ConsentInformation[i];
            case 6:
                return new UsageReportingOptInOptions[i];
            case 7:
                return new Barcode.Address[i];
            case 8:
                return new Barcode.CalendarDateTime[i];
            case 9:
                return new Barcode.CalendarEvent[i];
            case 10:
                return new Barcode.ContactInfo[i];
            case 11:
                return new Barcode.DriverLicense[i];
            case 12:
                return new Barcode.Email[i];
            case 13:
                return new Barcode.GeoPoint[i];
            case 14:
                return new Barcode.PersonName[i];
            case 15:
                return new Barcode.Phone[i];
            case 16:
                return new Barcode.Sms[i];
            case 17:
                return new Barcode.UrlBookmark[i];
            case 18:
                return new Barcode.WiFi[i];
            case 19:
                return new BarcodeDetectorOptions[i];
            default:
                return new FrameMetadataParcel[i];
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 560
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r26) {
        /*
            Method dump skipped, instructions count: 1612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rot.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
