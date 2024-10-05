package com.google.android.libraries.youtube.innertube.model.player;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aamk;
import defpackage.aaph;
import defpackage.amkq;
import defpackage.anaf;
import defpackage.aonm;
import defpackage.aoob;
import defpackage.aryj;
import defpackage.asus;
import defpackage.asuu;
import defpackage.atyz;
import defpackage.awbj;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PlaybackTrackingModel implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private static final Set l;
    private static final Set m;
    public final TrackingUrlModel a;
    public final TrackingUrlModel b;
    public final TrackingUrlModel c;
    public final TrackingUrlModel d;
    public final TrackingUrlModel e;
    public final List f;
    public final List g;
    public final int h;
    public final int[] i;
    public final Vss3ConfigModel j;
    public final aryj k;
    private final LoggingUrlModel n;

    static {
        HashSet hashSet = new HashSet();
        l = hashSet;
        hashSet.add(aaph.CPN);
        HashSet hashSet2 = new HashSet();
        m = hashSet2;
        hashSet2.add(aaph.MS);
        CREATOR = new aamk(18);
    }

    public PlaybackTrackingModel() {
        this(null);
    }

    public static PlaybackTrackingModel a(byte[] bArr) {
        if (bArr != null) {
            try {
                return new PlaybackTrackingModel((aryj) aonm.parseFrom(aryj.a, bArr));
            } catch (aoob unused) {
            }
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PlaybackTrackingModel)) {
            return false;
        }
        PlaybackTrackingModel playbackTrackingModel = (PlaybackTrackingModel) obj;
        return amkq.b(this.b, playbackTrackingModel.b) && amkq.b(this.c, playbackTrackingModel.c) && amkq.b(this.d, playbackTrackingModel.d) && amkq.b(this.n, playbackTrackingModel.n) && amkq.b(this.e, playbackTrackingModel.e) && amkq.b(this.f, playbackTrackingModel.f) && amkq.b(this.g, playbackTrackingModel.g) && amkq.b(this.a, playbackTrackingModel.a) && this.h == playbackTrackingModel.h && Arrays.equals(this.i, playbackTrackingModel.i);
    }

    public final int hashCode() {
        TrackingUrlModel trackingUrlModel = this.b;
        int hashCode = ((trackingUrlModel != null ? trackingUrlModel.hashCode() : 0) + 31) * 31;
        TrackingUrlModel trackingUrlModel2 = this.c;
        int hashCode2 = (hashCode + (trackingUrlModel2 != null ? trackingUrlModel2.hashCode() : 0)) * 31;
        TrackingUrlModel trackingUrlModel3 = this.d;
        int hashCode3 = (hashCode2 + (trackingUrlModel3 != null ? trackingUrlModel3.hashCode() : 0)) * 31;
        LoggingUrlModel loggingUrlModel = this.n;
        int hashCode4 = (hashCode3 + (loggingUrlModel != null ? loggingUrlModel.hashCode() : 0)) * 31;
        TrackingUrlModel trackingUrlModel4 = this.e;
        int hashCode5 = (hashCode4 + (trackingUrlModel4 != null ? trackingUrlModel4.hashCode() : 0)) * 31;
        TrackingUrlModel trackingUrlModel5 = this.a;
        return (((((hashCode5 + (trackingUrlModel5 != null ? trackingUrlModel5.hashCode() : 0)) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] byteArray = this.k.toByteArray();
        parcel.writeInt(byteArray.length);
        parcel.writeByteArray(byteArray);
    }

    public PlaybackTrackingModel(aryj aryjVar) {
        TrackingUrlModel trackingUrlModel;
        TrackingUrlModel trackingUrlModel2;
        TrackingUrlModel trackingUrlModel3;
        LoggingUrlModel loggingUrlModel;
        TrackingUrlModel trackingUrlModel4;
        TrackingUrlModel trackingUrlModel5;
        int i;
        aryjVar = aryjVar == null ? aryj.a : aryjVar;
        this.k = aryjVar;
        Vss3ConfigModel vss3ConfigModel = null;
        if (aryjVar == null || (aryjVar.b & 1) == 0) {
            trackingUrlModel = null;
        } else {
            asuu asuuVar = aryjVar.c;
            trackingUrlModel = new TrackingUrlModel(asuuVar == null ? asuu.a : asuuVar);
        }
        this.b = trackingUrlModel;
        if (aryjVar == null || (aryjVar.b & 2) == 0) {
            trackingUrlModel2 = null;
        } else {
            asuu asuuVar2 = aryjVar.d;
            trackingUrlModel2 = new TrackingUrlModel(asuuVar2 == null ? asuu.a : asuuVar2);
        }
        this.c = trackingUrlModel2;
        if (aryjVar == null || (aryjVar.b & 4) == 0) {
            trackingUrlModel3 = null;
        } else {
            asuu asuuVar3 = aryjVar.e;
            trackingUrlModel3 = new TrackingUrlModel(asuuVar3 == null ? asuu.a : asuuVar3);
        }
        this.d = trackingUrlModel3;
        if (aryjVar == null || (aryjVar.b & 32768) == 0) {
            loggingUrlModel = null;
        } else {
            asus asusVar = aryjVar.o;
            loggingUrlModel = new LoggingUrlModel(asusVar == null ? asus.a : asusVar);
        }
        this.n = loggingUrlModel;
        if (aryjVar == null || (aryjVar.b & 32) == 0) {
            trackingUrlModel4 = null;
        } else {
            asuu asuuVar4 = aryjVar.i;
            trackingUrlModel4 = new TrackingUrlModel(asuuVar4 == null ? asuu.a : asuuVar4);
        }
        this.e = trackingUrlModel4;
        if (aryjVar == null || (aryjVar.b & 16384) == 0) {
            trackingUrlModel5 = null;
        } else {
            asuu asuuVar5 = aryjVar.n;
            trackingUrlModel5 = new TrackingUrlModel(asuuVar5 == null ? asuu.a : asuuVar5);
        }
        this.a = trackingUrlModel5;
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        if (aryjVar != null && (aryjVar.b & 16) != 0) {
            asuu asuuVar6 = aryjVar.h;
            arrayList.add(new TrackingUrlModel(asuuVar6 == null ? asuu.a : asuuVar6, l));
        }
        if (aryjVar != null && (aryjVar.b & 64) != 0) {
            asuu asuuVar7 = aryjVar.j;
            arrayList.add(new TrackingUrlModel(asuuVar7 == null ? asuu.a : asuuVar7, m));
        }
        if (aryjVar != null && (aryjVar.b & 128) != 0) {
            asuu asuuVar8 = aryjVar.k;
            arrayList.add(new TrackingUrlModel(asuuVar8 == null ? asuu.a : asuuVar8, m));
        }
        if (aryjVar != null && (aryjVar.b & 256) != 0) {
            asuu asuuVar9 = aryjVar.l;
            arrayList.add(new TrackingUrlModel(asuuVar9 == null ? asuu.a : asuuVar9));
        }
        if (aryjVar != null && (aryjVar.b & 512) != 0) {
            asuu asuuVar10 = aryjVar.m;
            arrayList.add(new TrackingUrlModel(asuuVar10 == null ? asuu.a : asuuVar10));
        }
        if (aryjVar != null && aryjVar.f.size() != 0) {
            this.i = anaf.aj(aryjVar.f);
        } else {
            this.i = null;
        }
        if (aryjVar == null || (i = aryjVar.g) <= 0) {
            this.h = 0;
        } else {
            this.h = i;
        }
        this.g = new ArrayList();
        if (aryjVar != null && !aryjVar.p.isEmpty()) {
            Iterator it = aryjVar.p.iterator();
            while (it.hasNext()) {
                this.g.add(new PlaybackLoggingPayloadModel((atyz) it.next()));
            }
        }
        if (aryjVar != null && (aryjVar.b & 262144) != 0) {
            awbj awbjVar = aryjVar.q;
            vss3ConfigModel = new Vss3ConfigModel(awbjVar == null ? awbj.a : awbjVar);
        }
        this.j = vss3ConfigModel;
    }
}
