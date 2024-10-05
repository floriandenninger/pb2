package com.google.android.libraries.youtube.logging.interaction;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aapi;
import defpackage.acre;
import defpackage.acsa;
import defpackage.affp;
import defpackage.afsi;
import defpackage.amkq;
import defpackage.amrp;
import defpackage.amru;
import defpackage.aomw;
import defpackage.aonw;
import defpackage.aoob;
import defpackage.asht;
import defpackage.asuh;
import defpackage.asum;
import defpackage.awav;
import defpackage.yny;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class GelVisibilityUpdate implements Parcelable {
    public static final amru a = amru.q();
    public final amru b;
    public final awav c;
    public final asht d;
    public final int e;
    public final affp f;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class HiddenVisibilityUpdate extends GelVisibilityUpdate {
        public static final Parcelable.Creator CREATOR = new aapi(8);

        public HiddenVisibilityUpdate(Parcel parcel) {
            super(parcel);
        }

        @Override // com.google.android.libraries.youtube.logging.interaction.GelVisibilityUpdate, android.os.Parcelable
        public final /* bridge */ /* synthetic */ int describeContents() {
            return 0;
        }

        public HiddenVisibilityUpdate(affp affpVar, amru amruVar, awav awavVar, byte[] bArr) {
            super(affpVar, affpVar.b(), amruVar, awavVar, null, null);
        }

        public HiddenVisibilityUpdate(acsa acsaVar, asht ashtVar) {
            super(new affp(acsaVar.b), new affp(acsaVar.b).b(), amru.o(new aonw(acsaVar.b.g, asuh.a)), acsaVar.a, ashtVar, null);
        }

        public HiddenVisibilityUpdate(awav awavVar, asht ashtVar) {
            super(9, awavVar, GelVisibilityUpdate.a, ashtVar);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class ShownVisibilityUpdate extends GelVisibilityUpdate {
        public static final Parcelable.Creator CREATOR = new aapi(9);

        public ShownVisibilityUpdate(Parcel parcel) {
            super(parcel);
        }

        @Override // com.google.android.libraries.youtube.logging.interaction.GelVisibilityUpdate, android.os.Parcelable
        public final /* bridge */ /* synthetic */ int describeContents() {
            return 0;
        }

        public ShownVisibilityUpdate(affp affpVar, amru amruVar, awav awavVar, byte[] bArr) {
            super(affpVar, affpVar.c(), amruVar, awavVar, null, null);
        }

        public ShownVisibilityUpdate(acsa acsaVar, asht ashtVar) {
            super(new affp(acsaVar.b), new affp(acsaVar.b).c(), amru.o(new aonw(acsaVar.b.g, asuh.a)), acsaVar.a, ashtVar, null);
        }

        public ShownVisibilityUpdate(awav awavVar, amru amruVar, asht ashtVar) {
            super(2, awavVar, amruVar, ashtVar);
        }
    }

    public GelVisibilityUpdate(affp affpVar, int i, amru amruVar, awav awavVar, asht ashtVar, byte[] bArr) {
        this.f = affpVar;
        this.e = i;
        this.b = amruVar;
        this.c = awavVar;
        this.d = ashtVar;
    }

    public GelVisibilityUpdate(Parcel parcel) {
        asht ashtVar = null;
        this.f = new affp(parcel.readLong(), (char[]) null);
        int dl = amkq.dl(parcel.readInt());
        this.e = dl == 0 ? 1 : dl;
        this.c = (awav) yny.H(parcel, awav.a);
        Bundle readBundle = parcel.readBundle(asht.class.getClassLoader());
        if (readBundle != null && readBundle.containsKey("INTERACTION_LOGGING_CLIENT_DATA_KEY")) {
            try {
                ashtVar = (asht) amkq.cj(readBundle, "INTERACTION_LOGGING_CLIENT_DATA_KEY", asht.a, aomw.b());
            } catch (aoob e) {
                afsi.c(2, 12, "Exception reading the InteractionLoggingClientData from Parcel.", e);
            }
        }
        this.d = ashtVar;
        int[] createIntArray = parcel.createIntArray();
        amrp amrpVar = new amrp();
        for (int i : createIntArray) {
            amrpVar.h(asum.b(i));
        }
        this.b = amrpVar.g();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f.a);
        parcel.writeInt(this.e - 1);
        yny.I(this.c, parcel);
        Bundle bundle = new Bundle();
        asht ashtVar = this.d;
        if (ashtVar != null) {
            amkq.cn(bundle, "INTERACTION_LOGGING_CLIENT_DATA_KEY", ashtVar);
        }
        parcel.writeBundle(bundle);
        int[] iArr = new int[this.b.size()];
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            iArr[i2] = ((asum) this.b.get(i2)).d;
        }
        parcel.writeIntArray(iArr);
    }

    public GelVisibilityUpdate(int i, awav awavVar, amru amruVar, asht ashtVar) {
        this.f = new affp(i - 1, (char[]) null);
        this.e = i;
        this.c = acre.a(awavVar);
        this.b = amruVar;
        this.d = ashtVar;
    }
}
