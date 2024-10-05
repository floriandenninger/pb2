package defpackage;

import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class yml implements amml {
    private final /* synthetic */ int u;
    public static final /* synthetic */ yml t = new yml(20);
    public static final /* synthetic */ yml s = new yml(19);
    public static final /* synthetic */ yml r = new yml(18);
    public static final /* synthetic */ yml q = new yml(17);
    public static final /* synthetic */ yml p = new yml(16);
    public static final /* synthetic */ yml o = new yml(15);
    public static final /* synthetic */ yml n = new yml(14);
    public static final /* synthetic */ yml m = new yml(13);
    public static final /* synthetic */ yml l = new yml(11);
    public static final /* synthetic */ yml k = new yml(10);
    public static final /* synthetic */ yml j = new yml(9);
    public static final /* synthetic */ yml i = new yml(8);
    public static final /* synthetic */ yml h = new yml(7);
    public static final /* synthetic */ yml g = new yml(6);
    public static final /* synthetic */ yml f = new yml(5);
    public static final /* synthetic */ yml e = new yml(4);
    public static final /* synthetic */ yml d = new yml(3);
    public static final /* synthetic */ yml c = new yml(2);
    public static final /* synthetic */ yml b = new yml(1);
    public static final /* synthetic */ yml a = new yml(0);

    public /* synthetic */ yml(int i2) {
        this.u = i2;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        switch (this.u) {
            case 0:
                return new ymm((File) obj);
            case 1:
                return Boolean.valueOf(((lae) obj).c);
            case 2:
                return new Exception((Throwable) obj);
            case 3:
                return new Exception((Throwable) obj);
            case 4:
                return (Integer) obj;
            case 5:
                return Integer.valueOf(((zoh) obj).b);
            case 6:
                awuq awuqVar = (awuq) obj;
                if (awuqVar != null) {
                    return Collections.unmodifiableMap(awuqVar.d);
                }
                return null;
            case 7:
                return Boolean.valueOf(dsm.d(new dsm(((Integer) obj).intValue())));
            case 8:
                return Boolean.valueOf(dsm.e(new dsm(((Integer) obj).intValue())));
            case 9:
                Map map = zua.a;
                aone createBuilder = avxe.a.createBuilder();
                String str = ((axdx) obj).c;
                createBuilder.copyOnWrite();
                avxe avxeVar = (avxe) createBuilder.instance;
                str.getClass();
                avxeVar.b = 1 | avxeVar.b;
                avxeVar.c = str;
                return (avxe) createBuilder.build();
            case 10:
                aone aoneVar = (aone) obj;
                aoneVar.copyOnWrite();
                awuq awuqVar2 = (awuq) aoneVar.instance;
                awuq awuqVar3 = awuq.a;
                awuqVar2.b |= 1;
                awuqVar2.c = 1;
                return aoneVar;
            case 11:
                return Boolean.valueOf(((awuq) obj).c > 0);
            case 12:
                List<aadj> list = (List) obj;
                ArrayList arrayList = new ArrayList(list.size());
                for (aadj aadjVar : list) {
                    if (aadjVar != null) {
                        arrayList.add(aadjVar);
                    }
                }
                if (arrayList.isEmpty()) {
                    arrayList.add(aadj.AVAILABLE);
                }
                return (aadj) Collections.max(arrayList, aadi.a);
            case 13:
                aosf aosfVar = (aosf) obj;
                aone builder = aosfVar.toBuilder();
                int i2 = aosfVar.c;
                builder.copyOnWrite();
                aosf aosfVar2 = (aosf) builder.instance;
                aosfVar2.b |= 1;
                aosfVar2.c = i2 + 1;
                return (aosf) builder.build();
            case 14:
                aone builder2 = ((aosf) obj).toBuilder();
                builder2.copyOnWrite();
                aosf aosfVar3 = (aosf) builder2.instance;
                aosfVar3.b &= -2;
                aosfVar3.c = 0;
                return (aosf) builder2.build();
            case 15:
                zga.d("Failed to read vix snapshot.", (Exception) obj);
                return false;
            case 16:
                String str2 = (String) obj;
                if (!TextUtils.isEmpty(str2) && !str2.startsWith(".") && str2.split("\\.").length >= 2) {
                    r1 = true;
                }
                return Boolean.valueOf(r1);
            case 17:
                return (aahd) ((azrw) obj).get();
            case 18:
                return (aahd) ((azrw) obj).get();
            case 19:
                return ((aaln) obj).b;
            default:
                return ((aaln) obj).c;
        }
    }
}
