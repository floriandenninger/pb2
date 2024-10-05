package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.oba;
import defpackage.qwm;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FeedbackOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qwm();
    public String a;
    public Bundle b;
    public String c;
    public ApplicationErrorReport d;
    public String e;
    public BitmapTeleporter f;
    public String g;
    public List h;
    public boolean i;
    public ThemeSettings j;
    public LogOptions k;
    public boolean l;
    public Bitmap m;
    public String n;
    public boolean o;
    public long p;
    public oba q;

    public FeedbackOptions(ApplicationErrorReport applicationErrorReport) {
        this(null, null, null, applicationErrorReport, null, null, null, null, true, null, null, false, null, null, false, 0L);
    }

    public static FeedbackOptions a() {
        return new FeedbackOptions(new ApplicationErrorReport());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        qwm.a(this, parcel, i);
    }

    public FeedbackOptions(String str, Bundle bundle, String str2, ApplicationErrorReport applicationErrorReport, String str3, BitmapTeleporter bitmapTeleporter, String str4, List list, boolean z, ThemeSettings themeSettings, LogOptions logOptions, boolean z2, Bitmap bitmap, String str5, boolean z3, long j) {
        this.a = str;
        this.b = bundle != null ? bundle : new Bundle();
        this.c = str2;
        this.d = applicationErrorReport != null ? applicationErrorReport : new ApplicationErrorReport();
        this.e = str3;
        this.f = bitmapTeleporter;
        this.g = str4;
        this.h = list != null ? list : new ArrayList();
        this.i = z;
        this.j = themeSettings;
        this.k = logOptions;
        this.l = z2;
        this.m = bitmap;
        this.n = str5;
        this.o = z3;
        this.p = j;
    }
}
