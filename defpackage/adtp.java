package defpackage;

import android.content.SharedPreferences;
import j$.util.Optional;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adtp {
    public static final String a = zga.a("MDX.UserProfile");
    public final anhy b;
    public final int[] c;
    public final int[] d;
    public final adtk e;
    public final azrh f = azrh.e();
    public final shf g;
    public final SharedPreferences h;

    public adtp(adtk adtkVar, shf shfVar, SharedPreferences sharedPreferences) {
        Optional of;
        anhy anhyVar;
        int[] iArr = new int[28];
        this.c = iArr;
        int[] iArr2 = new int[28];
        this.d = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.e = adtkVar;
        this.g = shfVar;
        this.h = sharedPreferences;
        awvj awvjVar = (awvj) ((ywr) adtkVar.c.get()).c();
        if (awvjVar == null) {
            anhyVar = anhv.a;
        } else {
            int i = 2;
            if ((awvjVar.b & 2) == 0) {
                of = Optional.of(Long.valueOf(adtkVar.d.c()));
            } else {
                of = Optional.empty();
            }
            if ((awvjVar.b & 4) != 0) {
                adtkVar.g = awvjVar.g;
                if (awvjVar.e.size() > 0) {
                    adtk.d(awvjVar.e, adtkVar.e);
                } else {
                    zga.c(adtk.a, "No connection count stats in the preferences");
                }
                if (awvjVar.f.size() > 0) {
                    adtk.d(awvjVar.f, adtkVar.f);
                } else {
                    zga.c(adtk.a, "No cast available session count stats in the preferences");
                }
                if (adtkVar.g()) {
                    adtkVar.f(adtkVar.e, adtkVar.f, 0, of);
                    anhyVar = anhv.a;
                }
            } else if (of.isPresent()) {
                ynm.m(((ywr) adtkVar.c.get()).b(new jmv(of, i)), adha.p);
            }
            anhyVar = anhv.a;
        }
        this.b = anhyVar;
        System.arraycopy(adtkVar.e, 0, iArr, 0, 28);
        System.arraycopy(adtkVar.f, 0, iArr2, 0, 28);
        b();
    }

    public static final int d(int[] iArr, int i) {
        int i2 = i != 0 ? i != 1 ? 28 : 7 : 1;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public final anhy a(final adgc adgcVar) {
        return anfq.i(this.b, new anfz() { // from class: adto
            /* JADX WARN: Code restructure failed: missing block: B:4:0x0074, code lost:
            
                r2 = r8.intValue();
             */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0093  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x00c0  */
            @Override // defpackage.anfz
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final defpackage.anhy a(java.lang.Object r15) {
                /*
                    Method dump skipped, instructions count: 226
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.adto.a(java.lang.Object):anhy");
            }
        }, angq.a);
    }

    public final void b() {
        this.f.c(this);
    }

    public final void c() {
        ynm.i(this.b, new adtn(this, 1));
    }
}
