package defpackage;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ThemeSettings;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qwm implements Parcelable.Creator {
    public static void a(FeedbackOptions feedbackOptions, Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.F(parcel, 2, feedbackOptions.a);
        qip.v(parcel, 3, feedbackOptions.b);
        qip.F(parcel, 5, feedbackOptions.c);
        qip.E(parcel, 6, feedbackOptions.d, i);
        qip.F(parcel, 7, feedbackOptions.e);
        qip.E(parcel, 8, feedbackOptions.f, i);
        qip.F(parcel, 9, feedbackOptions.g);
        qip.J(parcel, 10, feedbackOptions.h);
        qip.o(parcel, 11, feedbackOptions.i);
        qip.E(parcel, 12, feedbackOptions.j, i);
        qip.E(parcel, 13, feedbackOptions.k, i);
        qip.o(parcel, 14, feedbackOptions.l);
        qip.E(parcel, 15, feedbackOptions.m, i);
        qip.F(parcel, 16, feedbackOptions.n);
        qip.o(parcel, 17, feedbackOptions.o);
        qip.t(parcel, 18, feedbackOptions.p);
        qip.n(parcel, m);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int Q = qip.Q(parcel);
        String str = null;
        Bundle bundle = null;
        String str2 = null;
        ApplicationErrorReport applicationErrorReport = null;
        String str3 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String str4 = null;
        ArrayList arrayList = null;
        ThemeSettings themeSettings = null;
        LogOptions logOptions = null;
        Bitmap bitmap = null;
        String str5 = null;
        long j = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < Q) {
            int readInt = parcel.readInt();
            switch (qip.M(readInt)) {
                case 2:
                    str = qip.Y(parcel, readInt);
                    break;
                case 3:
                    bundle = qip.S(parcel, readInt);
                    break;
                case 4:
                default:
                    qip.ad(parcel, readInt);
                    break;
                case 5:
                    str2 = qip.Y(parcel, readInt);
                    break;
                case 6:
                    applicationErrorReport = (ApplicationErrorReport) qip.U(parcel, readInt, ApplicationErrorReport.CREATOR);
                    break;
                case 7:
                    str3 = qip.Y(parcel, readInt);
                    break;
                case 8:
                    bitmapTeleporter = (BitmapTeleporter) qip.U(parcel, readInt, BitmapTeleporter.CREATOR);
                    break;
                case 9:
                    str4 = qip.Y(parcel, readInt);
                    break;
                case 10:
                    arrayList = qip.ab(parcel, readInt, FileTeleporter.CREATOR);
                    break;
                case 11:
                    z = qip.ae(parcel, readInt);
                    break;
                case 12:
                    themeSettings = (ThemeSettings) qip.U(parcel, readInt, ThemeSettings.CREATOR);
                    break;
                case 13:
                    logOptions = (LogOptions) qip.U(parcel, readInt, LogOptions.CREATOR);
                    break;
                case 14:
                    z2 = qip.ae(parcel, readInt);
                    break;
                case 15:
                    bitmap = (Bitmap) qip.U(parcel, readInt, Bitmap.CREATOR);
                    break;
                case 16:
                    str5 = qip.Y(parcel, readInt);
                    break;
                case 17:
                    z3 = qip.ae(parcel, readInt);
                    break;
                case 18:
                    j = qip.R(parcel, readInt);
                    break;
            }
        }
        qip.ac(parcel, Q);
        return new FeedbackOptions(str, bundle, str2, applicationErrorReport, str3, bitmapTeleporter, str4, arrayList, z, themeSettings, logOptions, z2, bitmap, str5, z3, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FeedbackOptions[i];
    }
}
