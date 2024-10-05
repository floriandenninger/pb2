package com.google.android.libraries.youtube.player.subtitles.model;

import android.graphics.Color;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.accessibility.CaptioningManager;
import defpackage.aadw;
import defpackage.aifk;
import defpackage.aigo;
import defpackage.atyg;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SubtitlesStyle implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aigo(15);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public SubtitlesStyle(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    public SubtitlesStyle(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
    }

    public static final String a(int i) {
        return String.format(Locale.US, "#%06X", Integer.valueOf(i & 16777215));
    }

    public static final String b(int i) {
        double alpha = Color.alpha(i);
        Double.isNaN(alpha);
        double d = alpha / 255.0d;
        return d < 0.0d ? "0.0" : String.format(Locale.US, "%.2f", Double.valueOf(d));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
    }

    public SubtitlesStyle(CaptioningManager.CaptionStyle captionStyle, aadw aadwVar) {
        atyg F;
        this.a = captionStyle.backgroundColor;
        this.c = captionStyle.edgeColor;
        if (Build.VERSION.SDK_INT < 26 || ((F = aifk.F(aadwVar)) != null && F.l)) {
            this.d = captionStyle.edgeType;
        } else {
            this.d = 0;
        }
        this.e = captionStyle.foregroundColor;
        this.b = captionStyle.windowColor;
        this.f = 7;
    }
}
