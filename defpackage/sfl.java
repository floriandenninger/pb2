package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sfl {
    public static final amxj a = amxj.l("com/google/android/libraries/assistant/appintegration/AssistantConfig");
    public final List b;
    public final ammv c;
    public final ammv d;

    public sfl(sgi sgiVar) {
        ammv ammvVar;
        this.b = sgiVar.c;
        aony aonyVar = sgiVar.d;
        aonu aonuVar = sgiVar.h;
        if ((sgiVar.b & 1) != 0) {
            ammv.j(sgiVar.e);
        }
        if ((sgiVar.b & 2) != 0) {
            ammvVar = ammv.j(sgiVar.f);
        } else {
            ammvVar = amlr.a;
        }
        this.c = ammvVar;
        if ((sgiVar.b & 4) != 0) {
            ammv.j(Boolean.valueOf(sgiVar.g));
        }
        this.d = (sgiVar.b & 8) != 0 ? ammv.j(Boolean.valueOf(sgiVar.i)) : amlr.a;
    }

    public static anhy a(Context context) {
        return amkq.l(new sfk(context, 0), anaf.C(Executors.newSingleThreadExecutor()));
    }
}
