package defpackage;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aify extends aifx {
    public static apxf f(String str, String str2, int i) {
        aone createBuilder = atrr.a.createBuilder();
        if (!TextUtils.isEmpty(str)) {
            createBuilder.copyOnWrite();
            atrr atrrVar = (atrr) createBuilder.instance;
            str.getClass();
            atrrVar.b |= 1;
            atrrVar.c = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            createBuilder.copyOnWrite();
            atrr atrrVar2 = (atrr) createBuilder.instance;
            str2.getClass();
            atrrVar2.b |= 2;
            atrrVar2.d = str2;
        }
        createBuilder.copyOnWrite();
        atrr atrrVar3 = (atrr) createBuilder.instance;
        atrrVar3.b |= 4;
        atrrVar3.e = i;
        aong aongVar = (aong) apxf.a.createBuilder();
        aongVar.e(atrs.a, (atrr) createBuilder.build());
        return (apxf) aongVar.build();
    }

    public static apxf g(String str, String str2, int i, float f) {
        aone createBuilder = atrr.a.createBuilder();
        if (!TextUtils.isEmpty(str)) {
            createBuilder.copyOnWrite();
            atrr atrrVar = (atrr) createBuilder.instance;
            str.getClass();
            atrrVar.b |= 1;
            atrrVar.c = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            createBuilder.copyOnWrite();
            atrr atrrVar2 = (atrr) createBuilder.instance;
            atrrVar2.b |= 2;
            atrrVar2.d = str2;
        }
        createBuilder.copyOnWrite();
        atrr atrrVar3 = (atrr) createBuilder.instance;
        atrrVar3.b |= 4;
        atrrVar3.e = i;
        createBuilder.copyOnWrite();
        atrr atrrVar4 = (atrr) createBuilder.instance;
        atrrVar4.b |= 16;
        atrrVar4.g = f;
        aong aongVar = (aong) apxf.a.createBuilder();
        aongVar.e(atrs.a, (atrr) createBuilder.build());
        return (apxf) aongVar.build();
    }

    public static final String m(atrr atrrVar) {
        return (atrrVar.b & 2) != 0 ? atrrVar.d : "";
    }

    public static final String n(atrr atrrVar) {
        return (atrrVar.b & 1) != 0 ? atrrVar.c : "";
    }

    public static final int o(atrr atrrVar) {
        return ahbx.e(atrrVar.e, m(atrrVar));
    }

    @Override // defpackage.aifx
    public final /* bridge */ /* synthetic */ owi a(Object obj) {
        atrr atrrVar = (atrr) obj;
        aone createBuilder = owi.a.createBuilder();
        String n = n(atrrVar);
        createBuilder.copyOnWrite();
        owi owiVar = (owi) createBuilder.instance;
        n.getClass();
        owiVar.b |= 1;
        owiVar.c = n;
        String m = m(atrrVar);
        createBuilder.copyOnWrite();
        owi owiVar2 = (owi) createBuilder.instance;
        m.getClass();
        owiVar2.b |= 2;
        owiVar2.e = m;
        int o = o(atrrVar);
        createBuilder.copyOnWrite();
        owi owiVar3 = (owi) createBuilder.instance;
        owiVar3.b |= 4;
        owiVar3.f = o;
        String str = atrrVar.f;
        createBuilder.copyOnWrite();
        owi owiVar4 = (owi) createBuilder.instance;
        str.getClass();
        owiVar4.b |= 8;
        owiVar4.g = str;
        createBuilder.copyOnWrite();
        owi owiVar5 = (owi) createBuilder.instance;
        owiVar5.b |= 512;
        owiVar5.m = "";
        createBuilder.copyOnWrite();
        owi owiVar6 = (owi) createBuilder.instance;
        owiVar6.b |= 64;
        owiVar6.j = false;
        boolean z = atrrVar.h;
        createBuilder.copyOnWrite();
        owi owiVar7 = (owi) createBuilder.instance;
        owiVar7.b |= 128;
        owiVar7.k = z;
        createBuilder.copyOnWrite();
        owi owiVar8 = (owi) createBuilder.instance;
        owiVar8.b |= 32;
        owiVar8.i = true;
        long millis = TimeUnit.SECONDS.toMillis(atrrVar.g);
        createBuilder.copyOnWrite();
        owi owiVar9 = (owi) createBuilder.instance;
        owiVar9.b |= 256;
        owiVar9.l = millis;
        return (owi) createBuilder.build();
    }

    @Override // defpackage.aiga
    public final aomu b() {
        return atrs.a;
    }

    @Override // defpackage.aifx
    public final /* bridge */ /* synthetic */ String c(Object obj) {
        return m((atrr) obj);
    }

    @Override // defpackage.aifx
    public final /* bridge */ /* synthetic */ String d(Object obj) {
        return n((atrr) obj);
    }

    @Override // defpackage.aifx
    public final /* bridge */ /* synthetic */ boolean e(Object obj, Object obj2) {
        atrr atrrVar = (atrr) obj;
        atrr atrrVar2 = (atrr) obj2;
        if (amkq.b(atrrVar, atrrVar2)) {
            return true;
        }
        String m = m(atrrVar);
        int o = o(atrrVar);
        String m2 = m(atrrVar2);
        int o2 = o(atrrVar2);
        if (!TextUtils.equals(m, m2)) {
            return false;
        }
        if (TextUtils.equals("", m) || o == o2) {
            return TextUtils.equals(n(atrrVar), n(atrrVar2));
        }
        return false;
    }
}
