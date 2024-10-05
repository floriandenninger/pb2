package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aenw extends aeng {
    private final audr a;
    private final ajbh b = new ajbh((byte[]) null, (byte[]) null);

    public aenw(audr audrVar) {
        afki.a(audrVar);
        this.a = audrVar;
    }

    public static aenw k(aaea aaeaVar, boolean z) {
        audr audrVar;
        arfd a = aaeaVar.a();
        if (a == null) {
            return null;
        }
        atcl atclVar = a.i;
        if (atclVar == null) {
            atclVar = atcl.a;
        }
        if ((atclVar.b & 32) == 0) {
            return null;
        }
        apks apksVar = atclVar.e;
        if (apksVar == null) {
            apksVar = apks.a;
        }
        if (z) {
            audrVar = apksVar.d;
            if (audrVar == null) {
                audrVar = audr.a;
            }
        } else {
            audrVar = apksVar.c;
            if (audrVar == null) {
                audrVar = audr.a;
            }
        }
        if (audrVar == null || audrVar.b.size() == 0) {
            return null;
        }
        return new aenw(audrVar);
    }

    private final int l(int i) {
        return Math.min(this.a.b.size() - 1, i);
    }

    @Override // defpackage.aeng
    protected final float a(int i, List list) {
        List list2 = list;
        int e = e(i);
        if (list.size() != e) {
            ArrayList arrayList = new ArrayList(e);
            Float f = (Float) list2.get(0);
            for (int i2 = 0; i2 < e - list.size(); i2++) {
                arrayList.add(f);
            }
            arrayList.addAll(list2);
            list2 = arrayList;
        }
        ajbh ajbhVar = this.b;
        auds audsVar = (auds) this.a.b.get(l(i));
        afki.a(audsVar);
        afki.a(list2);
        long size = audsVar.d.size();
        int i3 = audsVar.c;
        int i4 = audsVar.b;
        long j = 0;
        for (int i5 = 0; i5 <= i4; i5++) {
            long j2 = i5;
            long j3 = (i3 + j2) - 1;
            long j4 = 1;
            if (j2 <= j3) {
                long j5 = 1;
                long j6 = 1;
                while (j5 <= j2) {
                    j6 = (j6 * j3) / j5;
                    j5++;
                    j3--;
                }
                j4 = j6;
            }
            j += j4;
        }
        afki.b(size == j);
        afki.b(audsVar.c == list2.size());
        ajbhVar.i = 0;
        float f2 = 0.0f;
        for (int i6 = 0; i6 <= audsVar.b; i6++) {
            f2 += ajbhVar.Q(audsVar, list2, i6, 0);
        }
        return f2;
    }

    @Override // defpackage.aeng
    protected final float c(float f) {
        return ((float) Math.pow(10.0d, f)) * 1000.0f;
    }

    @Override // defpackage.aeng
    protected final float d(float f) {
        if (f > 0.0f) {
            return (float) Math.log10(f / 1000.0f);
        }
        return -3.4028235E38f;
    }

    @Override // defpackage.aeng
    protected final int e(int i) {
        audr audrVar = this.a;
        return ((auds) audrVar.b.get(l(i))).c;
    }

    @Override // defpackage.aeng, defpackage.aeny
    public final int j() {
        return 4;
    }
}
