package com.google.android.libraries.youtube.innertube.model.ads;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aamk;
import defpackage.aamx;
import defpackage.aamy;
import defpackage.aamz;
import defpackage.aana;
import defpackage.afrd;
import defpackage.afre;
import defpackage.amkq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class VastInfoCard implements Parcelable, afre {
    public final int b;
    public final List c;
    public final List d;
    public final InfoCardApp e;
    public static final aamx a = new aamx();
    public static final Parcelable.Creator CREATOR = new aamk(7);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class InfoCardAction implements Parcelable, afre {
        public final int b;
        public final Uri c;
        public final String d;
        public final List e;
        public static final aamy a = new aamy();
        public static final Parcelable.Creator CREATOR = new aamk(8);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (obj == null || !getClass().equals(obj.getClass())) {
                return false;
            }
            InfoCardAction infoCardAction = (InfoCardAction) obj;
            return amkq.b(Integer.valueOf(this.b), Integer.valueOf(infoCardAction.b)) && amkq.b(this.c, infoCardAction.c) && amkq.b(this.d, infoCardAction.d) && amkq.b(this.e, infoCardAction.e);
        }

        @Override // defpackage.afre
        public final /* bridge */ /* synthetic */ afrd h() {
            return new aamy(this);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeParcelable(this.c, 0);
            parcel.writeString(this.d);
            parcel.writeTypedList(this.e);
        }

        public InfoCardAction(int i, Uri uri, String str, List list) {
            this.b = i;
            this.c = uri;
            this.d = str;
            this.e = Collections.unmodifiableList(list == null ? new ArrayList() : list);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class InfoCardApp implements Parcelable, afre {
        public final String b;
        public final Uri c;
        public final String d;
        public final boolean e;
        public final float f;
        public final int g;
        public final Uri h;
        public final String i;
        public static final aamz a = new aamz();
        public static final Parcelable.Creator CREATOR = new aamk(9);

        public InfoCardApp(String str, String str2, Uri uri, String str3, boolean z, float f, Uri uri2, int i) {
            this.b = str;
            this.i = str2;
            this.c = uri;
            this.d = str3;
            this.e = z;
            this.f = f;
            this.h = uri2;
            this.g = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (obj == null || !getClass().equals(obj.getClass())) {
                return false;
            }
            InfoCardApp infoCardApp = (InfoCardApp) obj;
            return amkq.b(this.b, infoCardApp.b) && amkq.b(this.i, infoCardApp.i) && amkq.b(this.c, infoCardApp.c) && amkq.b(this.d, infoCardApp.d) && amkq.b(Float.valueOf(this.f), Float.valueOf(infoCardApp.f)) && amkq.b(this.h, infoCardApp.h) && amkq.b(Integer.valueOf(this.g), Integer.valueOf(infoCardApp.g));
        }

        @Override // defpackage.afre
        public final /* bridge */ /* synthetic */ afrd h() {
            return new aamz(this);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeString(this.i);
            parcel.writeParcelable(this.c, 0);
            parcel.writeString(this.d);
            parcel.writeInt(this.e ? 1 : 0);
            parcel.writeFloat(this.f);
            parcel.writeParcelable(this.h, 0);
            parcel.writeInt(this.g);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class InfoCardTrackingEvent implements Parcelable, afre {
        public static final Parcelable.Creator CREATOR = new aamk(10);
        public static final aana a = new aana();
        private final int b;
        private final Uri c;

        public InfoCardTrackingEvent(int i, Uri uri) {
            this.b = i;
            this.c = uri;
        }

        public int a() {
            return this.b;
        }

        public Uri b() {
            return this.c;
        }

        @Override // defpackage.afre
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public aana h() {
            return new aana(this);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (obj == null || !getClass().equals(obj.getClass())) {
                return false;
            }
            InfoCardTrackingEvent infoCardTrackingEvent = (InfoCardTrackingEvent) obj;
            return amkq.b(Integer.valueOf(a()), Integer.valueOf(infoCardTrackingEvent.a())) && amkq.b(b(), infoCardTrackingEvent.b());
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(a());
            parcel.writeParcelable(b(), 0);
        }
    }

    public VastInfoCard(int i, List list, List list2, InfoCardApp infoCardApp) {
        this.b = i;
        list.getClass();
        this.c = Collections.unmodifiableList(list);
        list2.getClass();
        this.d = Collections.unmodifiableList(list2);
        this.e = infoCardApp;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        VastInfoCard vastInfoCard = (VastInfoCard) obj;
        return amkq.b(Integer.valueOf(this.b), Integer.valueOf(vastInfoCard.b)) && amkq.b(this.d, vastInfoCard.d) && amkq.b(this.c, vastInfoCard.c) && amkq.b(this.e, vastInfoCard.e);
    }

    @Override // defpackage.afre
    public final /* bridge */ /* synthetic */ afrd h() {
        return new aamx(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeTypedList(this.c);
        parcel.writeTypedList(this.d);
        parcel.writeParcelable(this.e, 0);
    }
}
