package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wmr implements axqr {
    private final azrw a;
    private final /* synthetic */ int b;

    public wmr(azrw azrwVar, int i) {
        this.b = i;
        this.a = azrwVar;
    }

    public static wmr a(azrw azrwVar) {
        return new wmr(azrwVar, 0);
    }

    public static amnv c(final aaqo aaqoVar) {
        aaqoVar.getClass();
        return new amnv() { // from class: aaqi
            @Override // defpackage.amnv
            public final Object get() {
                aaqo aaqoVar2 = aaqo.this;
                aone c = aaqoVar2.c();
                aarh aarhVar = (aarh) aaqoVar2.a.c;
                String string = aarhVar.i() ? aarhVar.h.a : aarhVar.d.getString("com.google.android.libraries.youtube.innertube.hot_hash_data", "");
                aarh aarhVar2 = (aarh) aaqoVar2.e.a;
                String string2 = aarhVar2.i() ? aarhVar2.i.a : aarhVar2.d.getString("com.google.android.libraries.youtube.innertube.cold_hash_data", "");
                String str = aaqoVar2.e.b().c;
                if (!TextUtils.isEmpty(string) || !TextUtils.isEmpty(string2) || !TextUtils.isEmpty(str)) {
                    arna arnaVar = ((armz) c.instance).y;
                    if (arnaVar == null) {
                        arnaVar = arna.a;
                    }
                    aone builder = arnaVar.toBuilder();
                    if (TextUtils.isEmpty(string)) {
                        builder.copyOnWrite();
                        arna arnaVar2 = (arna) builder.instance;
                        arnaVar2.b &= -9;
                        arnaVar2.e = arna.a.e;
                    } else {
                        builder.copyOnWrite();
                        arna arnaVar3 = (arna) builder.instance;
                        string.getClass();
                        arnaVar3.b |= 8;
                        arnaVar3.e = string;
                    }
                    if (TextUtils.isEmpty(string2)) {
                        builder.copyOnWrite();
                        arna arnaVar4 = (arna) builder.instance;
                        arnaVar4.b &= -5;
                        arnaVar4.d = arna.a.d;
                    } else {
                        builder.copyOnWrite();
                        arna arnaVar5 = (arna) builder.instance;
                        string2.getClass();
                        arnaVar5.b |= 4;
                        arnaVar5.d = string2;
                    }
                    if (TextUtils.isEmpty(str)) {
                        builder.copyOnWrite();
                        arna arnaVar6 = (arna) builder.instance;
                        arnaVar6.b &= -2;
                        arnaVar6.c = arna.a.c;
                    } else {
                        builder.copyOnWrite();
                        arna arnaVar7 = (arna) builder.instance;
                        str.getClass();
                        arnaVar7.b |= 1;
                        arnaVar7.c = str;
                    }
                    c.copyOnWrite();
                    armz armzVar = (armz) c.instance;
                    arna arnaVar8 = (arna) builder.build();
                    arnaVar8.getClass();
                    armzVar.y = arnaVar8;
                    armzVar.c |= 16384;
                }
                amea ameaVar = aaqoVar2.f;
                ArrayList arrayList = new ArrayList();
                try {
                    Map map = (Map) anaf.A(((abep) ameaVar.b.get()).b());
                    for (String str2 : ((amrz) ameaVar.a).keySet()) {
                        int intValue = map.containsKey(str2) ? ((Integer) map.get(str2)).intValue() : -1;
                        if (intValue != 0 && intValue != -1) {
                            arrayList.add(Integer.valueOf(intValue));
                        }
                    }
                } catch (ExecutionException e) {
                    zga.d("Failed to read the client side experiments map from the disk", e);
                }
                if (!arrayList.isEmpty()) {
                    c.copyOnWrite();
                    armz armzVar2 = (armz) c.instance;
                    armz armzVar3 = armz.a;
                    armzVar2.n = armz.emptyIntList();
                    c.copyOnWrite();
                    armz armzVar4 = (armz) c.instance;
                    aonu aonuVar = armzVar4.n;
                    if (!aonuVar.c()) {
                        armzVar4.n = aonm.mutableCopy(aonuVar);
                    }
                    aolo.addAll((Iterable) arrayList, (List) armzVar4.n);
                }
                aaqoVar2.b.b(c);
                return (armz) c.build();
            }
        };
    }

    public static amnv d(final aaqo aaqoVar) {
        aaqoVar.getClass();
        return new amnv() { // from class: aaqj
            @Override // defpackage.amnv
            public final Object get() {
                return (armz) aaqo.this.c().build();
            }
        };
    }

    public static wmr e(azrw azrwVar) {
        return new wmr(azrwVar, 1);
    }

    public static wmr f(azrw azrwVar) {
        return new wmr(azrwVar, 2);
    }

    public static wmr g(azrw azrwVar) {
        return new wmr(azrwVar, 3);
    }

    public static amnv h(final aloh alohVar) {
        final byte[] bArr = null;
        return new amnv(bArr, bArr, bArr) { // from class: wmo
            @Override // defpackage.amnv
            public final Object get() {
                try {
                    return Boolean.valueOf(aloh.this.e().b);
                } catch (Exception unused) {
                    return true;
                }
            }
        };
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        int i = this.b;
        if (i == 0) {
            return b();
        }
        if (i != 1) {
            return i != 2 ? b() : b();
        }
        return b();
    }

    public final amnv b() {
        int i = this.b;
        if (i == 0) {
            return h((aloh) this.a.get());
        }
        if (i != 1) {
            return i != 2 ? d((aaqo) this.a.get()) : c((aaqo) this.a.get());
        }
        return ((wyz) this.a.get()).a();
    }
}
