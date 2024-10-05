package defpackage;

import android.text.TextUtils;
import com.google.android.youtube.R;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ssb implements sym {
    public static void d(axof axofVar, sxs sxsVar) {
        if ((sxsVar.f() || sxsVar.d() || sxsVar.e()) && aoaj.r(axofVar, 14)) {
            sxsVar.a().u(axofVar.aI());
        }
    }

    @Override // defpackage.sym
    public final int a() {
        return 168774763;
    }

    @Override // defpackage.sym
    public final /* synthetic */ aoam b(ByteBuffer byteBuffer) {
        axof axofVar = new axof();
        axof.aJ(byteBuffer, axofVar);
        return axofVar;
    }

    @Override // defpackage.syn
    public final /* bridge */ /* synthetic */ void c(dhe dheVar, sxc sxcVar, String str, Object obj, sxs sxsVar, swt swtVar) {
        axof axofVar = (axof) obj;
        dgy a = sxsVar.a();
        int b = axofVar.b(6);
        CharSequence charSequence = null;
        String e = b != 0 ? axofVar.e(b + axofVar.a) : null;
        int b2 = axofVar.b(4);
        String e2 = b2 != 0 ? axofVar.e(b2 + axofVar.a) : null;
        boolean z = !TextUtils.isEmpty(e);
        boolean z2 = !TextUtils.isEmpty(e2);
        if (z && z2) {
            StringBuilder sb = new StringBuilder(String.valueOf(e2).length() + 1 + String.valueOf(e).length());
            sb.append(e2);
            sb.append(" ");
            sb.append(e);
            charSequence = sb.toString();
        } else if (z) {
            charSequence = e;
        } else if (z2) {
            charSequence = e2;
        }
        if (!TextUtils.isEmpty(axofVar.X())) {
            a.A(axofVar.X());
        }
        if (charSequence != null) {
            a.t(charSequence);
        }
        if (aoaj.r(axofVar, 14)) {
            a.u(axofVar.aI());
        }
        String X = axofVar.X();
        if (!TextUtils.isEmpty(X) && axofVar.aI()) {
            sxsVar.q(R.id.elements_accessibility_view_tag_id, X);
        }
        int i = 0;
        int i2 = 1;
        boolean z3 = false;
        while (true) {
            int b3 = axofVar.b(12);
            if (i < (b3 != 0 ? axofVar.d(b3) : 0)) {
                int b4 = axofVar.b(12);
                int i3 = b4 != 0 ? axofVar.b.getInt(axofVar.c(b4) + (i * 4)) : 0;
                if (i3 != 2 && i3 != 4) {
                    switch (i3) {
                        case 10:
                            z3 = true;
                            break;
                        case 13:
                            a.c.C().D().a(true);
                            break;
                    }
                    i++;
                }
                if (i3 > i2) {
                    i2 = i3;
                }
                i++;
            } else {
                a.c.C().D().b(i2 != 2 ? i2 != 4 ? i2 != 14 ? i2 != 11 ? i2 != 12 ? "" : "android.widget.RadioButton" : "android.widget.Spinner" : "android.widget.CompoundButton" : "android.widget.ImageView" : "android.widget.Button");
                if (i2 == 12 || i2 == 14) {
                    sxsVar.r();
                    sxsVar.s(z3);
                }
                int b5 = axofVar.b(16);
                if (b5 != 0) {
                    int i4 = axofVar.b.getInt(b5 + axofVar.a);
                    if (i4 == 1) {
                        a.v(1);
                        return;
                    }
                    if (i4 == 2) {
                        a.v(8);
                        return;
                    } else if (i4 == 3) {
                        a.v(2);
                        return;
                    } else if (i4 == 4) {
                        a.v(4);
                        return;
                    }
                }
                a.v(0);
                return;
            }
        }
    }

    @Override // defpackage.syn
    public final /* synthetic */ void e(sxs sxsVar) {
    }
}
