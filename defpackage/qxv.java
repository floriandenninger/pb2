package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qxv {
    public static final Object a = new Object();
    public final Context b;
    public final SharedPreferences c;
    public final String d;
    private final qxp e;
    private boolean f;

    public qxv(Context context, int i, qxp qxpVar, boolean z) {
        this.f = false;
        this.b = context;
        this.d = Integer.toString(i - 1);
        this.c = context.getSharedPreferences("pcvmspf", 0);
        this.e = qxpVar;
        this.f = z;
    }

    public static String b(ecn ecnVar) {
        aone createBuilder = eco.a.createBuilder();
        eco ecoVar = ecnVar.b;
        if (ecoVar == null) {
            ecoVar = eco.a;
        }
        String str = ecoVar.c;
        createBuilder.copyOnWrite();
        eco ecoVar2 = (eco) createBuilder.instance;
        str.getClass();
        ecoVar2.b |= 1;
        ecoVar2.c = str;
        eco ecoVar3 = ecnVar.b;
        if (ecoVar3 == null) {
            ecoVar3 = eco.a;
        }
        String str2 = ecoVar3.d;
        createBuilder.copyOnWrite();
        eco ecoVar4 = (eco) createBuilder.instance;
        str2.getClass();
        ecoVar4.b |= 2;
        ecoVar4.d = str2;
        eco ecoVar5 = ecnVar.b;
        if (ecoVar5 == null) {
            ecoVar5 = eco.a;
        }
        long j = ecoVar5.f;
        createBuilder.copyOnWrite();
        eco ecoVar6 = (eco) createBuilder.instance;
        ecoVar6.b |= 8;
        ecoVar6.f = j;
        eco ecoVar7 = ecnVar.b;
        if (ecoVar7 == null) {
            ecoVar7 = eco.a;
        }
        long j2 = ecoVar7.g;
        createBuilder.copyOnWrite();
        eco ecoVar8 = (eco) createBuilder.instance;
        ecoVar8.b |= 16;
        ecoVar8.g = j2;
        eco ecoVar9 = ecnVar.b;
        if (ecoVar9 == null) {
            ecoVar9 = eco.a;
        }
        long j3 = ecoVar9.e;
        createBuilder.copyOnWrite();
        eco ecoVar10 = (eco) createBuilder.instance;
        ecoVar10.b |= 4;
        ecoVar10.e = j3;
        return qtm.a(((eco) createBuilder.build()).toByteString().I());
    }

    public final File a(String str) {
        return new File(new File(this.b.getDir("pccache", 0), this.d), str);
    }

    public final String c() {
        String valueOf = String.valueOf(this.d);
        return valueOf.length() != 0 ? "FBAMTD".concat(valueOf) : new String("FBAMTD");
    }

    public final String d() {
        String valueOf = String.valueOf(this.d);
        return valueOf.length() != 0 ? "LATMTD".concat(valueOf) : new String("LATMTD");
    }

    public final void e(int i, long j) {
        qxp qxpVar = this.e;
        if (qxpVar != null) {
            qxpVar.a(i, j);
        }
    }

    public final void f(int i, long j, String str) {
        qxp qxpVar = this.e;
        if (qxpVar != null) {
            qxpVar.b(i, j, str);
        }
    }

    public final eco g(int i) {
        String string;
        aomw b;
        if (i == 1) {
            string = this.c.getString(d(), null);
        } else {
            string = this.c.getString(c(), null);
        }
        if (string == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            aomf x = aomf.x(qtm.b(string));
            if (this.f) {
                b = aomw.a();
            } else {
                b = aomw.b();
            }
            return (eco) aonm.parseFrom(eco.a, x, b);
        } catch (aoob unused) {
            return null;
        } catch (NullPointerException unused2) {
            e(2029, currentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            e(2032, currentTimeMillis);
            return null;
        }
    }
}
