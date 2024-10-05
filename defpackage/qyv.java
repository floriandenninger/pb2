package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.ND4CSettings;
import com.google.android.gms.googlehelp.OfflineSuggestion;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qyv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int Q = qip.Q(parcel);
        String str = null;
        Account account = null;
        Bundle bundle = null;
        String str2 = null;
        String str3 = null;
        Bitmap bitmap = null;
        ArrayList arrayList = null;
        Bundle bundle2 = null;
        Bitmap bitmap2 = null;
        byte[] bArr = null;
        String str4 = null;
        Uri uri = null;
        ArrayList arrayList2 = null;
        ThemeSettings themeSettings = null;
        ArrayList arrayList3 = null;
        ErrorReport errorReport = null;
        TogglingData togglingData = null;
        PendingIntent pendingIntent = null;
        String str5 = null;
        String str6 = null;
        ND4CSettings nD4CSettings = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z3 = false;
        int i5 = 0;
        int i6 = 0;
        boolean z4 = false;
        boolean z5 = false;
        int i7 = 0;
        boolean z6 = false;
        boolean z7 = false;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            switch (qip.M(readInt)) {
                case 1:
                    i = qip.O(parcel, readInt);
                    break;
                case 2:
                    str = qip.Y(parcel, readInt);
                    break;
                case 3:
                    account = (Account) qip.U(parcel, readInt, Account.CREATOR);
                    break;
                case 4:
                    bundle = qip.S(parcel, readInt);
                    break;
                case 5:
                    z = qip.ae(parcel, readInt);
                    break;
                case 6:
                    z2 = qip.ae(parcel, readInt);
                    break;
                case 7:
                    arrayList = qip.aa(parcel, readInt);
                    break;
                case 8:
                case 9:
                case 12:
                case 13:
                case 24:
                case 26:
                case 27:
                case 29:
                case 30:
                default:
                    qip.ad(parcel, readInt);
                    break;
                case 10:
                    bundle2 = qip.S(parcel, readInt);
                    break;
                case 11:
                    bitmap2 = (Bitmap) qip.U(parcel, readInt, Bitmap.CREATOR);
                    break;
                case 14:
                    str4 = qip.Y(parcel, readInt);
                    break;
                case 15:
                    uri = (Uri) qip.U(parcel, readInt, Uri.CREATOR);
                    break;
                case 16:
                    arrayList2 = qip.ab(parcel, readInt, OverflowMenuItem.CREATOR);
                    break;
                case 17:
                    i4 = qip.O(parcel, readInt);
                    break;
                case 18:
                    arrayList3 = qip.ab(parcel, readInt, OfflineSuggestion.CREATOR);
                    break;
                case 19:
                    bArr = qip.af(parcel, readInt);
                    break;
                case 20:
                    i2 = qip.O(parcel, readInt);
                    break;
                case 21:
                    i3 = qip.O(parcel, readInt);
                    break;
                case 22:
                    z3 = qip.ae(parcel, readInt);
                    break;
                case 23:
                    errorReport = (ErrorReport) qip.U(parcel, readInt, ErrorReport.CREATOR);
                    break;
                case 25:
                    themeSettings = (ThemeSettings) qip.U(parcel, readInt, ThemeSettings.CREATOR);
                    break;
                case 28:
                    str2 = qip.Y(parcel, readInt);
                    break;
                case 31:
                    togglingData = (TogglingData) qip.U(parcel, readInt, TogglingData.CREATOR);
                    break;
                case 32:
                    i5 = qip.O(parcel, readInt);
                    break;
                case 33:
                    pendingIntent = (PendingIntent) qip.U(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 34:
                    str3 = qip.Y(parcel, readInt);
                    break;
                case 35:
                    bitmap = (Bitmap) qip.U(parcel, readInt, Bitmap.CREATOR);
                    break;
                case 36:
                    i6 = qip.O(parcel, readInt);
                    break;
                case 37:
                    z4 = qip.ae(parcel, readInt);
                    break;
                case 38:
                    z5 = qip.ae(parcel, readInt);
                    break;
                case 39:
                    i7 = qip.O(parcel, readInt);
                    break;
                case 40:
                    str5 = qip.Y(parcel, readInt);
                    break;
                case 41:
                    z6 = qip.ae(parcel, readInt);
                    break;
                case 42:
                    str6 = qip.Y(parcel, readInt);
                    break;
                case 43:
                    z7 = qip.ae(parcel, readInt);
                    break;
                case 44:
                    nD4CSettings = (ND4CSettings) qip.U(parcel, readInt, ND4CSettings.CREATOR);
                    break;
            }
        }
        qip.ac(parcel, Q);
        return new GoogleHelp(i, str, account, bundle, str2, str3, bitmap, z, z2, arrayList, bundle2, bitmap2, bArr, i2, i3, str4, uri, arrayList2, i4, themeSettings, arrayList3, z3, errorReport, togglingData, i5, pendingIntent, i6, z4, z5, i7, str5, z6, str6, z7, nD4CSettings);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleHelp[i];
    }
}
