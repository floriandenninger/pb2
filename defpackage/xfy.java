package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xfy implements Comparable, Serializable {
    public final long a;
    public final apxf b;

    private xfy(apxf apxfVar, long j) {
        this.b = apxfVar;
        this.a = j;
    }

    public static xfy a(aozf aozfVar, long j) {
        aozg aozgVar;
        long round;
        if (aozfVar != null) {
            aozgVar = aozfVar.c;
            if (aozgVar == null) {
                aozgVar = aozg.a;
            }
        } else {
            aozgVar = null;
        }
        if (aozgVar == null) {
            return null;
        }
        int bT = amkq.bT(aozgVar.b);
        if (bT == 0) {
            bT = 1;
        }
        int i = bT - 1;
        if (i == 1) {
            round = Math.round(aozgVar.c * ((float) j));
        } else {
            if (i != 2) {
                return null;
            }
            round = aozgVar.d;
        }
        if (round < 0) {
            return null;
        }
        apxf apxfVar = aozfVar.d;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        return new xfy(apxfVar, round);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.valueOf(this.a).compareTo(Long.valueOf(((xfy) obj).a));
    }
}
