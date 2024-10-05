package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.phenotype.ExperimentTokens;
import defpackage.axkm;
import defpackage.qar;
import defpackage.qfh;
import defpackage.qip;
import defpackage.qlh;
import defpackage.qlk;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class LogEventParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qfh(18);
    public final qlh a;
    public final qlk b;
    public PlayLoggerContext c;
    public byte[] d;
    public int[] e;
    public String[] f;
    public int[] g;
    public byte[][] h;
    public ExperimentTokens[] i;
    public boolean j;
    public axkm k;

    public LogEventParcelable(PlayLoggerContext playLoggerContext, axkm axkmVar, qlh qlhVar, int[] iArr, String[] strArr, int[] iArr2, boolean z) {
        this.c = playLoggerContext;
        this.k = axkmVar;
        this.a = qlhVar;
        this.b = null;
        this.e = iArr;
        this.f = strArr;
        this.g = iArr2;
        this.h = null;
        this.i = null;
        this.j = true;
    }

    public LogEventParcelable(PlayLoggerContext playLoggerContext, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z, ExperimentTokens[] experimentTokensArr) {
        this.c = playLoggerContext;
        this.d = bArr;
        this.e = iArr;
        this.f = strArr;
        this.k = null;
        this.a = null;
        this.b = null;
        this.g = iArr2;
        this.h = bArr2;
        this.i = experimentTokensArr;
        this.j = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LogEventParcelable) {
            LogEventParcelable logEventParcelable = (LogEventParcelable) obj;
            if (qar.j(this.c, logEventParcelable.c) && Arrays.equals(this.d, logEventParcelable.d) && Arrays.equals(this.e, logEventParcelable.e) && Arrays.equals(this.f, logEventParcelable.f) && qar.j(this.k, logEventParcelable.k) && qar.j(this.a, logEventParcelable.a)) {
                qlk qlkVar = logEventParcelable.b;
                if (qar.j(null, null) && Arrays.equals(this.g, logEventParcelable.g) && Arrays.deepEquals(this.h, logEventParcelable.h) && Arrays.equals(this.i, logEventParcelable.i) && this.j == logEventParcelable.j) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.d, this.e, this.f, this.k, this.a, null, this.g, this.h, this.i, Boolean.valueOf(this.j)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogEventParcelable[");
        sb.append(this.c);
        sb.append(", LogEventBytes: ");
        byte[] bArr = this.d;
        sb.append(bArr == null ? null : new String(bArr));
        sb.append(", TestCodes: ");
        sb.append(Arrays.toString(this.e));
        sb.append(", MendelPackages: ");
        sb.append(Arrays.toString(this.f));
        sb.append(", LogEvent: ");
        sb.append(this.k);
        sb.append(", SourceExtensionByteStringProvider: ");
        sb.append(this.a);
        sb.append(", VeProducer: ");
        sb.append((Object) null);
        sb.append(", ExperimentIDs: ");
        sb.append(Arrays.toString(this.g));
        sb.append(", ExperimentTokens: ");
        sb.append(Arrays.deepToString(this.h));
        sb.append(", ExperimentTokensParcelables: ");
        sb.append(Arrays.toString(this.i));
        sb.append(", AddPhenotypeExperimentTokens: ");
        sb.append(this.j);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.E(parcel, 2, this.c, i);
        qip.w(parcel, 3, this.d);
        qip.z(parcel, 4, this.e);
        qip.G(parcel, 5, this.f);
        qip.z(parcel, 6, this.g);
        qip.x(parcel, 7, this.h);
        qip.o(parcel, 8, this.j);
        qip.I(parcel, 9, this.i, i);
        qip.n(parcel, m);
    }
}
