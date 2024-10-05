package defpackage;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dmh {
    public static final dmf g;
    public static final dmf h;

    static {
        dmd dmdVar = new dmd(dos.a);
        g = dmdVar;
        new dmd(dos.b);
        h = dmdVar;
        new AccelerateDecelerateInterpolator();
    }

    public static float c(dmg dmgVar, djx djxVar, dng dngVar) {
        dmi dmiVar = djxVar.l;
        szq szqVar = dmgVar.c;
        new dno(dmiVar, dngVar);
        return szqVar.a;
    }

    public static dmf d(int i, Interpolator interpolator) {
        return new dme(i, interpolator);
    }

    public static dmb e(String str) {
        return new dmb(str);
    }
}
