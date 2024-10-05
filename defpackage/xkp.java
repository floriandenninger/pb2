package defpackage;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xkp extends xkr {
    public CharSequence a;
    public aoyq b;
    private final aeg f;
    private final float g;
    private int h;

    public xkp(TextView textView, CharSequence charSequence, int i, float f, Drawable drawable, float f2) {
        super(textView, drawable, f2);
        this.a = charSequence;
        this.h = i;
        this.g = f;
        this.b = null;
        this.f = new aeg();
    }

    private final void e(CharSequence charSequence) {
        charSequence.getClass();
        if (amkq.b(charSequence, ((TextView) this.c).getText())) {
            return;
        }
        ((TextView) this.c).setText(charSequence);
    }

    private final void f(aowj aowjVar) {
        int i;
        if (aowjVar == null) {
            i = this.h;
        } else {
            i = aowjVar.b;
        }
        if (i != ((TextView) this.c).getCurrentTextColor()) {
            ((TextView) this.c).setTextColor(i);
        }
    }

    @Override // defpackage.xkr
    public final void a() {
        aoys aoysVar;
        aoyr aoyrVar;
        int i;
        int bV;
        super.a();
        aoyq aoyqVar = this.b;
        aowj aowjVar = null;
        String str = aoyqVar == null ? null : aoyqVar.c;
        int i2 = 1;
        boolean z = aoyqVar == null || aoyqVar.e;
        if (str == null || TextUtils.isEmpty(str)) {
            e(this.a);
        } else {
            if (z) {
                int i3 = this.f.j;
                Object[] objArr = new Object[i3 + i3];
                int i4 = 0;
                while (true) {
                    aeg aegVar = this.f;
                    if (i4 >= aegVar.j) {
                        break;
                    }
                    int i5 = i4 + i4;
                    objArr[i5] = aegVar.f(i4);
                    objArr[i5 + 1] = this.f.i(i4);
                    i4++;
                }
                str = ace.e(Locale.getDefault(), str, objArr);
            }
            e(str);
        }
        aoyq aoyqVar2 = this.b;
        if (aoyqVar2 == null || (aoyqVar2.b & 2) == 0) {
            aoysVar = null;
        } else {
            aoysVar = aoyqVar2.d;
            if (aoysVar == null) {
                aoysVar = aoys.a;
            }
        }
        if (aoysVar == null) {
            aoyrVar = null;
        } else {
            aoyrVar = aoysVar.c;
            if (aoyrVar == null) {
                aoyrVar = aoyr.a;
            }
        }
        if (aoyrVar != null && (aowjVar = aoyrVar.d) == null) {
            aowjVar = aowj.a;
        }
        f(aowjVar);
        if (aoyrVar != null && (bV = amkq.bV(aoyrVar.c)) != 0) {
            i2 = bV;
        }
        switch (i2 - 1) {
            case 1:
                i = R.dimen.condor_ad_font_size_extra_extra_small;
                break;
            case 2:
                return;
            case 3:
                i = R.dimen.condor_ad_font_size_small;
                break;
            case 4:
                i = R.dimen.condor_ad_font_size_medium;
                break;
            case 5:
                i = R.dimen.condor_ad_font_size_large;
                break;
            case 6:
                i = R.dimen.condor_ad_font_size_extra_large;
                break;
            case 7:
                i = R.dimen.condor_ad_font_size_extra_extra_large;
                break;
            default:
                ((TextView) this.c).setTextSize(0, this.g);
                return;
        }
        ((TextView) this.c).setTextSize(0, r1.getContext().getResources().getDimensionPixelSize(i));
    }

    public final void b(aoyq aoyqVar) {
        this.b = aoyqVar;
        aowk aowkVar = null;
        if (aoyqVar != null && (aoyqVar.b & 2) != 0) {
            aoys aoysVar = aoyqVar.d;
            if (aoysVar == null) {
                aoysVar = aoys.a;
            }
            aowkVar = aoysVar.d;
            if (aowkVar == null) {
                aowkVar = aowk.a;
            }
        }
        this.d = aowkVar;
    }

    public final void c(int i) {
        this.h = i;
        f(null);
    }

    public final void d(Object obj) {
        this.f.put("TIME_REMAINING", obj);
    }
}
