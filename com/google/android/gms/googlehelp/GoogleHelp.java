package com.google.android.gms.googlehelp;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import defpackage.oba;
import defpackage.qip;
import defpackage.qyv;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GoogleHelp extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new qyv();
    boolean A;
    public boolean B;
    int C;
    String D;
    boolean E;
    String F;
    boolean G;
    ND4CSettings H;
    public oba I;
    final int a;
    String b;
    public Account c;
    Bundle d;
    String e;
    String f;
    Bitmap g;
    boolean h;
    boolean i;
    List j;

    @Deprecated
    Bundle k;

    @Deprecated
    Bitmap l;

    @Deprecated
    byte[] m;

    @Deprecated
    int n;

    @Deprecated
    int o;
    String p;
    public Uri q;
    List r;
    public ThemeSettings s;
    List t;
    public boolean u;
    ErrorReport v;
    public TogglingData w;
    int x;
    PendingIntent y;
    public int z;

    @Deprecated
    public GoogleHelp(int i, String str, Account account, Bundle bundle, String str2, String str3, Bitmap bitmap, boolean z, boolean z2, List list, Bundle bundle2, Bitmap bitmap2, byte[] bArr, int i2, int i3, String str4, Uri uri, List list2, int i4, ThemeSettings themeSettings, List list3, boolean z3, ErrorReport errorReport, TogglingData togglingData, int i5, PendingIntent pendingIntent, int i6, boolean z4, boolean z5, int i7, String str5, boolean z6) {
        this.v = new ErrorReport();
        if (!TextUtils.isEmpty(str)) {
            this.a = i;
            this.z = i6;
            this.A = z4;
            this.B = z5;
            this.C = i7;
            this.D = str5;
            this.b = str;
            this.c = account;
            this.d = bundle;
            this.e = str2;
            this.f = str3;
            this.g = bitmap;
            this.h = z;
            this.i = z2;
            this.E = z6;
            this.j = list;
            this.y = pendingIntent;
            this.k = bundle2;
            this.l = bitmap2;
            this.m = bArr;
            this.n = i2;
            this.o = i3;
            this.p = str4;
            this.q = uri;
            this.r = list2;
            if (i < 4) {
                ThemeSettings themeSettings2 = new ThemeSettings();
                themeSettings2.a = i4;
                this.s = themeSettings2;
            } else {
                this.s = themeSettings == null ? new ThemeSettings() : themeSettings;
            }
            this.t = list3;
            this.u = z3;
            this.v = errorReport;
            if (errorReport != null) {
                errorReport.X = "GoogleHelp";
            }
            this.w = togglingData;
            this.x = i5;
            return;
        }
        throw new IllegalStateException("Help requires a non-empty appContext");
    }

    public static GoogleHelp b(String str) {
        return new GoogleHelp(16, str, null, null, null, null, null, true, true, new ArrayList(), null, null, null, 0, 0, null, null, new ArrayList(), 3, null, new ArrayList(), false, new ErrorReport(), null, 0, null, -1, false, false, 200, null, false);
    }

    public final Intent a() {
        return new Intent("com.google.android.gms.googlehelp.HELP").setPackage("com.google.android.gms").putExtra("EXTRA_GOOGLE_HELP", this);
    }

    public final void c(FeedbackOptions feedbackOptions, File file) {
        this.I = feedbackOptions.q;
        ErrorReport errorReport = new ErrorReport(feedbackOptions, file);
        this.v = errorReport;
        errorReport.X = "GoogleHelp";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.s(parcel, 1, this.a);
        qip.F(parcel, 2, this.b);
        qip.E(parcel, 3, this.c, i);
        qip.v(parcel, 4, this.d);
        qip.o(parcel, 5, this.h);
        qip.o(parcel, 6, this.i);
        qip.H(parcel, 7, this.j);
        qip.v(parcel, 10, this.k);
        qip.E(parcel, 11, this.l, i);
        qip.F(parcel, 14, this.p);
        qip.E(parcel, 15, this.q, i);
        qip.J(parcel, 16, this.r);
        qip.s(parcel, 17, 0);
        qip.J(parcel, 18, this.t);
        qip.w(parcel, 19, this.m);
        qip.s(parcel, 20, this.n);
        qip.s(parcel, 21, this.o);
        qip.o(parcel, 22, this.u);
        qip.E(parcel, 23, this.v, i);
        qip.E(parcel, 25, this.s, i);
        qip.F(parcel, 28, this.e);
        qip.E(parcel, 31, this.w, i);
        qip.s(parcel, 32, this.x);
        qip.E(parcel, 33, this.y, i);
        qip.F(parcel, 34, this.f);
        qip.E(parcel, 35, this.g, i);
        qip.s(parcel, 36, this.z);
        qip.o(parcel, 37, this.A);
        qip.o(parcel, 38, this.B);
        qip.s(parcel, 39, this.C);
        qip.F(parcel, 40, this.D);
        qip.o(parcel, 41, this.E);
        qip.F(parcel, 42, this.F);
        qip.o(parcel, 43, this.G);
        qip.E(parcel, 44, this.H, i);
        qip.n(parcel, m);
    }

    public GoogleHelp(int i, String str, Account account, Bundle bundle, String str2, String str3, Bitmap bitmap, boolean z, boolean z2, List list, Bundle bundle2, Bitmap bitmap2, byte[] bArr, int i2, int i3, String str4, Uri uri, List list2, int i4, ThemeSettings themeSettings, List list3, boolean z3, ErrorReport errorReport, TogglingData togglingData, int i5, PendingIntent pendingIntent, int i6, boolean z4, boolean z5, int i7, String str5, boolean z6, String str6, boolean z7, ND4CSettings nD4CSettings) {
        this(i, str, account, bundle, str2, str3, bitmap, z, z2, list, bundle2, bitmap2, bArr, i2, i3, str4, uri, list2, i4, themeSettings, list3, z3, errorReport, togglingData, i5, pendingIntent, i6, z4, z5, i7, str5, z6);
        this.F = str6;
        this.G = z7;
        this.H = nD4CSettings;
    }
}
