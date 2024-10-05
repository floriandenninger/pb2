package com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service;

import android.util.SparseArray;
import defpackage.afqc;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class i implements afqc {
    static final SparseArray a;
    private static final byte[] b;
    private static final byte[] c;
    private final boolean d;
    private final f e;

    static {
        byte[] bArr = {-54, 124, 80, 116, -38, 56, -87, -51, -4, 50, -50, 22, -96, 112, -46, 104, 114, -73, 62, -10, -80, -20, 38, 42, 37, -106, 98, -107, 17, -45, -21, -104};
        b = bArr;
        byte[] bArr2 = {-54, 124, 80, 116, -38, 56, -87, -51, -4, 50, -50, 22, -96, 112, -46, 104, 114, -73, 62, -10, -80, -20, 38, 42, 37, -106, 98, -107, 17, -45, -21, -104};
        c = bArr2;
        SparseArray sparseArray = new SparseArray();
        a = sparseArray;
        sparseArray.put(0, bArr);
        sparseArray.put(1, bArr2);
    }

    public i(boolean z, f fVar) {
        this.e = fVar;
        this.d = z;
    }

    @Override // defpackage.afqc
    public final String a() {
        return true != this.d ? "AIzaSyCjc_pVEDi4qsv5MtC2dMXzpIaDoRFLsxw" : "AIzaSyA8eiZmM1FaDVjRy-df2KTyQ_vz_yYM39w";
    }

    @Override // defpackage.afqc
    public final SparseArray b() {
        return this.d ? h.a : a;
    }

    @Override // defpackage.afqc
    public final String c() {
        if (this.d) {
            return "YouTubeApplication";
        }
        f fVar = this.e;
        return String.format("%s_%s_%s", fVar.a, fVar.b, fVar.c);
    }
}
