package defpackage;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import com.google.android.gms.droidguard.internal.DroidGuardInitReply;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.gass.internal.GassRequestParcel;
import com.google.android.gms.gass.internal.GassResponseParcel;
import com.google.android.gms.gass.internal.ProgramRequest;
import com.google.android.gms.gass.internal.ProgramResponse;
import com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.gms.googlehelp.ND4CSettings;
import com.google.android.gms.googlehelp.OfflineSuggestion;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import com.google.android.gms.herrevad.NetworkQualityReport;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qui implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public qui(int i) {
        this.a = i;
    }

    public static final ErrorReport a(Parcel parcel) {
        int Q = qip.Q(parcel);
        ApplicationErrorReport applicationErrorReport = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String[] strArr = null;
        String[] strArr2 = null;
        String[] strArr3 = null;
        String str14 = null;
        String str15 = null;
        byte[] bArr = null;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        Bundle bundle = null;
        String str19 = null;
        String str20 = null;
        String str21 = null;
        String str22 = null;
        String str23 = null;
        String str24 = null;
        String str25 = null;
        String str26 = null;
        String str27 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String str28 = null;
        FileTeleporter[] fileTeleporterArr = null;
        String[] strArr4 = null;
        String str29 = null;
        ThemeSettings themeSettings = null;
        LogOptions logOptions = null;
        String str30 = null;
        Bundle bundle2 = null;
        ArrayList arrayList = null;
        Bitmap bitmap = null;
        String str31 = null;
        ArrayList arrayList2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        int i7 = 0;
        int i8 = 0;
        boolean z2 = false;
        int i9 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i10 = 0;
        while (parcel.dataPosition() < Q) {
            int N = qip.N(parcel);
            switch (qip.M(N)) {
                case 2:
                    applicationErrorReport = (ApplicationErrorReport) qip.U(parcel, N, ApplicationErrorReport.CREATOR);
                    break;
                case 3:
                    str = qip.Y(parcel, N);
                    break;
                case 4:
                    i = qip.O(parcel, N);
                    break;
                case 5:
                    str2 = qip.Y(parcel, N);
                    break;
                case 6:
                    str3 = qip.Y(parcel, N);
                    break;
                case 7:
                    str4 = qip.Y(parcel, N);
                    break;
                case 8:
                    str5 = qip.Y(parcel, N);
                    break;
                case 9:
                    str6 = qip.Y(parcel, N);
                    break;
                case 10:
                    str7 = qip.Y(parcel, N);
                    break;
                case 11:
                    str8 = qip.Y(parcel, N);
                    break;
                case 12:
                    i2 = qip.O(parcel, N);
                    break;
                case 13:
                    str9 = qip.Y(parcel, N);
                    break;
                case 14:
                    str10 = qip.Y(parcel, N);
                    break;
                case 15:
                    str11 = qip.Y(parcel, N);
                    break;
                case 16:
                    str12 = qip.Y(parcel, N);
                    break;
                case 17:
                    str13 = qip.Y(parcel, N);
                    break;
                case 18:
                    strArr = qip.aj(parcel, N);
                    break;
                case 19:
                    strArr2 = qip.aj(parcel, N);
                    break;
                case 20:
                    strArr3 = qip.aj(parcel, N);
                    break;
                case 21:
                    str14 = qip.Y(parcel, N);
                    break;
                case 22:
                    str15 = qip.Y(parcel, N);
                    break;
                case 23:
                    bArr = qip.af(parcel, N);
                    break;
                case 24:
                    i3 = qip.O(parcel, N);
                    break;
                case 25:
                    i4 = qip.O(parcel, N);
                    break;
                case 26:
                    i5 = qip.O(parcel, N);
                    break;
                case 27:
                    i6 = qip.O(parcel, N);
                    break;
                case 28:
                    str16 = qip.Y(parcel, N);
                    break;
                case 29:
                    str17 = qip.Y(parcel, N);
                    break;
                case 30:
                    str18 = qip.Y(parcel, N);
                    break;
                case 31:
                    bundle = qip.S(parcel, N);
                    break;
                case 32:
                    z = qip.ae(parcel, N);
                    break;
                case 33:
                    i7 = qip.O(parcel, N);
                    break;
                case 34:
                    i8 = qip.O(parcel, N);
                    break;
                case 35:
                    z2 = qip.ae(parcel, N);
                    break;
                case 36:
                    str19 = qip.Y(parcel, N);
                    break;
                case 37:
                    str20 = qip.Y(parcel, N);
                    break;
                case 38:
                    i9 = qip.O(parcel, N);
                    break;
                case 39:
                    str21 = qip.Y(parcel, N);
                    break;
                case 40:
                    str22 = qip.Y(parcel, N);
                    break;
                case 41:
                    str23 = qip.Y(parcel, N);
                    break;
                case 42:
                    str24 = qip.Y(parcel, N);
                    break;
                case 43:
                    str25 = qip.Y(parcel, N);
                    break;
                case 44:
                    str26 = qip.Y(parcel, N);
                    break;
                case 45:
                    str27 = qip.Y(parcel, N);
                    break;
                case 46:
                    bitmapTeleporter = (BitmapTeleporter) qip.U(parcel, N, BitmapTeleporter.CREATOR);
                    break;
                case 47:
                    str28 = qip.Y(parcel, N);
                    break;
                case 48:
                    fileTeleporterArr = (FileTeleporter[]) qip.ai(parcel, N, FileTeleporter.CREATOR);
                    break;
                case 49:
                    strArr4 = qip.aj(parcel, N);
                    break;
                case 50:
                    z3 = qip.ae(parcel, N);
                    break;
                case 51:
                    str29 = qip.Y(parcel, N);
                    break;
                case 52:
                    themeSettings = (ThemeSettings) qip.U(parcel, N, ThemeSettings.CREATOR);
                    break;
                case 53:
                    logOptions = (LogOptions) qip.U(parcel, N, LogOptions.CREATOR);
                    break;
                case 54:
                    str30 = qip.Y(parcel, N);
                    break;
                case 55:
                    z4 = qip.ae(parcel, N);
                    break;
                case 56:
                    bundle2 = qip.S(parcel, N);
                    break;
                case 57:
                    arrayList = qip.ab(parcel, N, RectF.CREATOR);
                    break;
                case 58:
                    z5 = qip.ae(parcel, N);
                    break;
                case 59:
                    bitmap = (Bitmap) qip.U(parcel, N, Bitmap.CREATOR);
                    break;
                case 60:
                    str31 = qip.Y(parcel, N);
                    break;
                case 61:
                    arrayList2 = qip.aa(parcel, N);
                    break;
                case 62:
                    i10 = qip.O(parcel, N);
                    break;
                default:
                    qip.ad(parcel, N);
                    break;
            }
        }
        qip.ac(parcel, Q);
        return new ErrorReport(applicationErrorReport, str, i, str2, str3, str4, str5, str6, str7, str8, i2, str9, str10, str11, str12, str13, strArr, strArr2, strArr3, str14, str15, bArr, i3, i4, i5, i6, str16, str17, str18, bundle, z, i7, i8, z2, str19, str20, i9, str21, str22, str23, str24, str25, str26, str27, bitmapTeleporter, str28, fileTeleporterArr, strArr4, z3, str29, themeSettings, logOptions, str30, z4, bundle2, arrayList, z5, bitmap, str31, arrayList2, i10);
    }

    public static void b(InProductHelp inProductHelp, Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.E(parcel, 1, inProductHelp.a, i);
        qip.F(parcel, 2, inProductHelp.b);
        qip.F(parcel, 3, inProductHelp.c);
        qip.s(parcel, 4, inProductHelp.d);
        qip.F(parcel, 5, inProductHelp.e);
        qip.s(parcel, 6, inProductHelp.f);
        qip.n(parcel, m);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new DroidGuardInitReply[i];
            case 1:
                return new DroidGuardResultsRequest[i];
            case 2:
                return new ErrorReport[i];
            case 3:
                return new FileTeleporter[i];
            case 4:
                return new LogOptions[i];
            case 5:
                return new ThemeSettings[i];
            case 6:
                return new GassRequestParcel[i];
            case 7:
                return new GassResponseParcel[i];
            case 8:
                return new ProgramRequest[i];
            case 9:
                return new ProgramResponse[i];
            case 10:
                return new GmsDeviceComplianceResponse[i];
            case 11:
                return new InProductHelp[i];
            case 12:
                return new ND4CSettings[i];
            case 13:
                return new OfflineSuggestion[i];
            case 14:
                return new OverflowMenuItem[i];
            case 15:
                return new TogglingData[i];
            case 16:
                return new NetworkQualityReport[i];
            case 17:
                return new UserAddress[i];
            case 18:
                return new DeviceOrientationRequest[i];
            case 19:
                return new LocationAvailability[i];
            default:
                return new LocationRequest[i];
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 564
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r33) {
        /*
            Method dump skipped, instructions count: 1652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qui.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
