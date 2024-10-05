package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qxu {
    public final File a;
    public final SharedPreferences b;
    private final File c;
    private final int d;

    public qxu(Context context, int i) {
        this.b = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        rbd.l(dir, false);
        this.c = dir;
        File dir2 = context.getDir("tmppccache", 0);
        rbd.l(dir2, true);
        this.a = dir2;
        this.d = i;
    }

    public static String b(eco ecoVar) {
        return qtm.a(ecoVar.toByteString().I());
    }

    public final File a() {
        File file = new File(this.c, Integer.toString(this.d - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public final String c() {
        int i = this.d;
        StringBuilder sb = new StringBuilder(17);
        sb.append("FBAMTD");
        sb.append(i - 1);
        return sb.toString();
    }

    public final String d() {
        int i = this.d;
        StringBuilder sb = new StringBuilder(17);
        sb.append("LATMTD");
        sb.append(i - 1);
        return sb.toString();
    }

    public final eco e(int i) {
        String string;
        if (i == 1) {
            string = this.b.getString(d(), null);
        } else {
            string = this.b.getString(c(), null);
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            eco ecoVar = (eco) aonm.parseFrom(eco.a, aomf.x(qtm.b(string)));
            String str = ecoVar.c;
            File h = rbd.h(str, "pcam.jar", a());
            if (!h.exists()) {
                h = rbd.h(str, "pcam", a());
            }
            File h2 = rbd.h(str, "pcbc", a());
            if (h.exists()) {
                if (h2.exists()) {
                    return ecoVar;
                }
            }
        } catch (aoob unused) {
        }
        return null;
    }
}
