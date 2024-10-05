package defpackage;

import android.text.TextUtils;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aawa extends aaru {
    public auec A;
    private String B;
    private String C;
    public List a;
    public String b;
    public String c;
    public String d;
    public String s;
    public String t;
    public argf u;
    public arll v;
    public String w;
    public Long x;
    public amru y;
    public Long z;

    public aawa(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("comment/create_comment", ajoyVar, afsxVar, null, null, null);
        this.B = "";
        this.C = "";
        this.a = null;
        this.b = "";
        this.c = "";
        this.d = "";
        this.s = "";
        this.t = "";
        this.u = null;
        this.v = null;
        this.w = "";
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        k();
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arma.a.createBuilder();
        String str = this.B;
        createBuilder.copyOnWrite();
        arma armaVar = (arma) createBuilder.instance;
        str.getClass();
        armaVar.b |= 2;
        armaVar.f = str;
        String str2 = this.C;
        createBuilder.copyOnWrite();
        arma armaVar2 = (arma) createBuilder.instance;
        str2.getClass();
        armaVar2.b |= 4;
        armaVar2.g = str2;
        Long l = this.z;
        if (l != null) {
            long longValue = l.longValue();
            createBuilder.copyOnWrite();
            arma armaVar3 = (arma) createBuilder.instance;
            armaVar3.b |= 65536;
            armaVar3.j = longValue;
        }
        List list = this.a;
        if (list != null && list.size() > 0) {
            aone createBuilder2 = arlp.a.createBuilder();
            List list2 = this.a;
            createBuilder2.copyOnWrite();
            arlp arlpVar = (arlp) createBuilder2.instance;
            aony aonyVar = arlpVar.b;
            if (!aonyVar.c()) {
                arlpVar.b = aonm.mutableCopy(aonyVar);
            }
            aolo.addAll((Iterable) list2, (List) arlpVar.b);
            arlp arlpVar2 = (arlp) createBuilder2.build();
            createBuilder.copyOnWrite();
            arma armaVar4 = (arma) createBuilder.instance;
            arlpVar2.getClass();
            armaVar4.d = arlpVar2;
            armaVar4.c = 8;
        }
        if (!TextUtils.isEmpty(this.b)) {
            aone createBuilder3 = arlm.a.createBuilder();
            String str3 = this.b;
            createBuilder3.copyOnWrite();
            arlm arlmVar = (arlm) createBuilder3.instance;
            str3.getClass();
            arlmVar.b |= 1;
            arlmVar.c = str3;
            if (!TextUtils.isEmpty(this.t)) {
                String str4 = this.t;
                createBuilder3.copyOnWrite();
                arlm arlmVar2 = (arlm) createBuilder3.instance;
                str4.getClass();
                arlmVar2.b |= 2;
                arlmVar2.d = str4;
            }
            argf argfVar = this.u;
            if (argfVar != null) {
                createBuilder3.copyOnWrite();
                arlm arlmVar3 = (arlm) createBuilder3.instance;
                arlmVar3.e = argfVar;
                arlmVar3.b |= 4;
            }
            createBuilder.copyOnWrite();
            arma armaVar5 = (arma) createBuilder.instance;
            arlm arlmVar4 = (arlm) createBuilder3.build();
            arlmVar4.getClass();
            armaVar5.d = arlmVar4;
            armaVar5.c = 9;
        }
        if (!TextUtils.isEmpty(this.c)) {
            aone createBuilder4 = arlr.a.createBuilder();
            String str5 = this.c;
            createBuilder4.copyOnWrite();
            arlr arlrVar = (arlr) createBuilder4.instance;
            str5.getClass();
            arlrVar.b |= 1;
            arlrVar.c = str5;
            createBuilder.copyOnWrite();
            arma armaVar6 = (arma) createBuilder.instance;
            arlr arlrVar2 = (arlr) createBuilder4.build();
            arlrVar2.getClass();
            armaVar6.d = arlrVar2;
            armaVar6.c = 7;
        }
        if (!TextUtils.isEmpty(this.d)) {
            aone createBuilder5 = arln.a.createBuilder();
            String str6 = this.d;
            createBuilder5.copyOnWrite();
            arln arlnVar = (arln) createBuilder5.instance;
            str6.getClass();
            arlnVar.b |= 1;
            arlnVar.c = str6;
            createBuilder.copyOnWrite();
            arma armaVar7 = (arma) createBuilder.instance;
            arln arlnVar2 = (arln) createBuilder5.build();
            arlnVar2.getClass();
            armaVar7.d = arlnVar2;
            armaVar7.c = 10;
        }
        if (!TextUtils.isEmpty(this.w)) {
            aone createBuilder6 = arlq.a.createBuilder();
            String str7 = this.w;
            createBuilder6.copyOnWrite();
            arlq arlqVar = (arlq) createBuilder6.instance;
            str7.getClass();
            arlqVar.b |= 1;
            arlqVar.c = str7;
            createBuilder.copyOnWrite();
            arma armaVar8 = (arma) createBuilder.instance;
            arlq arlqVar2 = (arlq) createBuilder6.build();
            arlqVar2.getClass();
            armaVar8.d = arlqVar2;
            armaVar8.c = 15;
        }
        if (!TextUtils.isEmpty(this.s)) {
            String str8 = this.s;
            createBuilder.copyOnWrite();
            arma armaVar9 = (arma) createBuilder.instance;
            str8.getClass();
            armaVar9.b |= 32;
            armaVar9.h = str8;
        }
        arll arllVar = this.v;
        if (arllVar != null) {
            createBuilder.copyOnWrite();
            arma armaVar10 = (arma) createBuilder.instance;
            armaVar10.d = arllVar;
            armaVar10.c = 14;
        }
        Long l2 = this.x;
        if (l2 != null) {
            long longValue2 = l2.longValue();
            createBuilder.copyOnWrite();
            arma armaVar11 = (arma) createBuilder.instance;
            armaVar11.b |= 32768;
            armaVar11.i = longValue2;
        }
        amru amruVar = this.y;
        if (amruVar != null && !amruVar.isEmpty()) {
            aone createBuilder7 = aueh.a.createBuilder();
            amru amruVar2 = this.y;
            createBuilder7.copyOnWrite();
            aueh auehVar = (aueh) createBuilder7.instance;
            aony aonyVar2 = auehVar.b;
            if (!aonyVar2.c()) {
                auehVar.b = aonm.mutableCopy(aonyVar2);
            }
            aolo.addAll((Iterable) amruVar2, (List) auehVar.b);
            createBuilder.copyOnWrite();
            arma armaVar12 = (arma) createBuilder.instance;
            aueh auehVar2 = (aueh) createBuilder7.build();
            auehVar2.getClass();
            armaVar12.d = auehVar2;
            armaVar12.c = 18;
        }
        auec auecVar = this.A;
        if (auecVar != null) {
            createBuilder.copyOnWrite();
            arma armaVar13 = (arma) createBuilder.instance;
            armaVar13.k = auecVar;
            armaVar13.b |= 131072;
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        amru amruVar;
        zhq.m(this.B);
        boolean z = false;
        if (!TextUtils.isEmpty(this.C) || !TextUtils.isEmpty(this.b) || ((amruVar = this.y) != null && adyu.dD(amruVar))) {
            z = true;
        }
        amkq.E(z);
    }

    public final void d(String str) {
        this.C = i(str);
    }

    public final void e(String str) {
        this.B = i(str);
    }
}
