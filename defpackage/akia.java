package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akia {
    public final int[] a;
    public aahd b;
    public final akhz c;
    public final akhz d;
    private final SharedPreferences e;
    private final Set f;
    private final Handler g;
    private final Rect h;
    private akce i;

    public akia(SharedPreferences sharedPreferences, Handler handler, Context context) {
        sharedPreferences.getClass();
        this.e = sharedPreferences;
        handler.getClass();
        this.g = handler;
        this.f = new HashSet();
        this.h = new Rect();
        this.a = new int[2];
        this.c = new akhz(wbs.W(context, R.attr.ytThemedBlue).orElse(R.color.yt_dark_blue), R.drawable.tooltip_button_background);
        this.d = new akhz(wbs.W(context, R.attr.ytTextPrimaryInverse).orElse(R.color.yt_white1), 0);
    }

    private final View.OnClickListener c(final ared aredVar) {
        return new View.OnClickListener() { // from class: akhu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                akia akiaVar = akia.this;
                ared aredVar2 = aredVar;
                if ((aredVar2.b & 16) != 0) {
                    Map g = acrc.g(aredVar2);
                    aahd aahdVar = akiaVar.b;
                    apxf apxfVar = aredVar2.g;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    aahdVar.c(apxfVar, g);
                }
                if ((aredVar2.b & 32) != 0) {
                    Map i = acrc.i(aredVar2, false);
                    aahd aahdVar2 = akiaVar.b;
                    apxf apxfVar2 = aredVar2.h;
                    if (apxfVar2 == null) {
                        apxfVar2 = apxf.a;
                    }
                    aahdVar2.c(apxfVar2, i);
                }
            }
        };
    }

    private final void d(arej arejVar, Object obj) {
        this.f.add(new Pair(arejVar, obj));
        String f = f(arejVar);
        this.e.edit().putLong(f, this.e.getLong(f, 0L) + 1).apply();
        if (this.b == null || arejVar.j.size() == 0) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", arejVar);
        Iterator it = arejVar.j.iterator();
        while (it.hasNext()) {
            this.b.c((apxf) it.next(), hashMap);
        }
    }

    private final akhz e(aree areeVar) {
        if (areeVar == null) {
            return null;
        }
        int dV = amkq.dV(areeVar.b);
        if (dV == 0) {
            dV = 1;
        }
        int i = dV - 1;
        if (i == 1) {
            return this.c;
        }
        if (i != 2) {
            return null;
        }
        return this.d;
    }

    private static final String f(arej arejVar) {
        String valueOf = String.valueOf(arejVar.c);
        return valueOf.length() != 0 ? fav.HINT_ID_PREFIX.concat(valueOf) : new String(fav.HINT_ID_PREFIX);
    }

    public final boolean a(View view) {
        return view.getGlobalVisibleRect(this.h);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.arej r13, android.view.View r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akia.b(arej, android.view.View, java.lang.Object):void");
    }
}
