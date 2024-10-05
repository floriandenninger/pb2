package com.google.android.libraries.youtube.innertube.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import defpackage.aama;
import defpackage.aamd;
import defpackage.aamk;
import defpackage.ajcf;
import defpackage.apxf;
import defpackage.ardf;
import defpackage.arfa;
import defpackage.arfb;
import defpackage.aseu;
import defpackage.asfc;
import defpackage.askd;
import defpackage.askg;
import defpackage.atsn;
import defpackage.atzr;
import defpackage.aubs;
import defpackage.aulp;
import defpackage.auov;
import defpackage.auoy;
import defpackage.aurz;
import defpackage.ausu;
import defpackage.ausw;
import defpackage.avyw;
import defpackage.avza;
import defpackage.awdp;
import defpackage.yny;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class WatchNextResponseModel implements Parcelable, ajcf {
    public static final Parcelable.Creator CREATOR = new aamk(1);
    public final asfc a;
    public final String b;
    public final apxf c;
    public final List d;
    public aamd e;
    public aseu f;
    public aubs g;
    public aama h;
    public atzr i;
    private final Map j;
    private List k;
    private avyw l;
    private avza m;
    private aurz n;
    private Object o;

    /* JADX WARN: Removed duplicated region for block: B:108:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public WatchNextResponseModel(defpackage.asfc r6) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel.<init>(asfc):void");
    }

    private final void e(auov auovVar) {
        Iterator it = auovVar.d.iterator();
        loop0: while (it.hasNext()) {
            askd askdVar = ((auoy) it.next()).j;
            if (askdVar == null) {
                askdVar = askd.a;
            }
            for (askg askgVar : askdVar.e) {
                if (this.l == null && (askgVar.c & 256) != 0) {
                    avyw avywVar = askgVar.T;
                    if (avywVar == null) {
                        avywVar = avyw.a;
                    }
                    this.l = avywVar;
                } else if (this.m == null && (askgVar.c & 512) != 0) {
                    avza avzaVar = askgVar.U;
                    if (avzaVar == null) {
                        avzaVar = avza.a;
                    }
                    this.m = avzaVar;
                } else if (this.n == null && (askgVar.d & CellularSignalStrengthError.ERROR_NOT_SUPPORTED) != 0) {
                    aurz aurzVar = askgVar.ad;
                    if (aurzVar == null) {
                        aurzVar = aurz.a;
                    }
                    this.n = aurzVar;
                }
                if (this.l != null && this.m != null && this.n != null) {
                    break loop0;
                }
            }
        }
        Iterator it2 = auovVar.d.iterator();
        while (it2.hasNext()) {
            ausu ausuVar = ((auoy) it2.next()).v;
            if (ausuVar == null) {
                ausuVar = ausu.a;
            }
            ausw auswVar = ausuVar.r;
            if (auswVar == null) {
                auswVar = ausw.a;
            }
            arfa arfaVar = auswVar.e;
            if (arfaVar == null) {
                arfaVar = arfa.a;
            }
            for (arfb arfbVar : arfaVar.c) {
                if ((arfbVar.b & 262144) != 0) {
                    ardf ardfVar = arfbVar.w;
                    if (ardfVar == null) {
                        ardfVar = ardf.a;
                    }
                    apxf apxfVar = ardfVar.m;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    awdp awdpVar = (awdp) apxfVar.pX(WatchEndpointOuterClass.watchEndpoint);
                    if ((awdpVar.b & 16384) != 0) {
                        Map map = this.j;
                        String str = awdpVar.d;
                        atsn atsnVar = awdpVar.o;
                        if (atsnVar == null) {
                            atsnVar = atsn.a;
                        }
                        map.put(str, atsnVar);
                    }
                }
            }
        }
    }

    @Override // defpackage.ajcf
    public final aulp a() {
        aulp aulpVar = this.a.e;
        return aulpVar == null ? aulp.a : aulpVar;
    }

    @Override // defpackage.ajcf
    public final Object b() {
        return this.o;
    }

    @Override // defpackage.ajcf
    public final void c(Object obj) {
        this.o = obj;
    }

    @Override // defpackage.ajcf
    public final byte[] d() {
        return this.a.t.I();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        yny.I(this.a, parcel);
    }
}
