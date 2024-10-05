package defpackage;

import android.text.TextUtils;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aekf {
    private String a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private boolean h;
    private boolean i;

    public final void a(String str, int i, int i2, long j, aeke aekeVar, afjf afjfVar) {
        char c;
        if (j <= 0) {
            return;
        }
        if (!TextUtils.equals(str, this.a)) {
            b();
            this.a = str;
        }
        Set b = aaoq.b();
        Integer valueOf = Integer.valueOf(i);
        if (b.contains(valueOf)) {
            c = 2;
        } else {
            c = aaoq.c().contains(valueOf) ? (char) 3 : (char) 1;
        }
        aeke aekeVar2 = aeke.RECEIVED;
        int ordinal = aekeVar.ordinal();
        if (ordinal == 0) {
            if (c == 3) {
                float f = this.b;
                if (f < 2.0f) {
                    float f2 = f + (i2 / ((float) j));
                    this.b = f2;
                    if (f2 >= 2.0f) {
                        afjfVar.am();
                        return;
                    }
                    return;
                }
                return;
            }
            if (c == 2) {
                float f3 = this.c;
                if (f3 < 2.0f) {
                    float f4 = f3 + (i2 / ((float) j));
                    this.c = f4;
                    if (f4 >= 2.0f) {
                        afjfVar.M();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (ordinal == 1) {
            if (c == 3) {
                float f5 = this.d;
                if (f5 < 2.0f) {
                    float f6 = f5 + (i2 / ((float) j));
                    this.d = f6;
                    if (f6 >= 2.0f) {
                        afjfVar.ak();
                        return;
                    }
                    return;
                }
                return;
            }
            if (c == 2) {
                float f7 = this.e;
                if (f7 < 2.0f) {
                    float f8 = f7 + (i2 / ((float) j));
                    this.e = f8;
                    if (f8 >= 2.0f) {
                        afjfVar.K();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (ordinal != 2) {
            return;
        }
        if (!this.h && c == 3) {
            afjfVar.T();
            this.h = true;
        } else if (!this.i && c == 2) {
            afjfVar.P();
            this.i = true;
        }
        if (c == 3) {
            float f9 = this.f;
            if (f9 < 2.0f) {
                float f10 = f9 + (i2 / ((float) j));
                this.f = f10;
                if (f10 >= 2.0f) {
                    afjfVar.al();
                    return;
                }
                return;
            }
        }
        if (c == 2) {
            float f11 = this.g;
            if (f11 < 2.0f) {
                float f12 = f11 + (i2 / ((float) j));
                this.g = f12;
                if (f12 >= 2.0f) {
                    afjfVar.L();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.a = "";
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = false;
        this.i = false;
    }
}
