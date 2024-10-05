package com.google.firebase.iid;

import defpackage.antc;
import defpackage.anui;
import defpackage.anuj;
import defpackage.anum;
import defpackage.anuu;
import defpackage.anvh;
import defpackage.anwg;
import defpackage.anwx;
import defpackage.anxe;
import defpackage.aoag;
import defpackage.aocz;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class Registrar implements anum {
    @Override // defpackage.anum
    public List getComponents() {
        anui a = anuj.a(FirebaseInstanceId.class);
        a.b(anuu.c(antc.class));
        a.b(anuu.b(aoag.class));
        a.b(anuu.b(anwg.class));
        a.b(anuu.c(anxe.class));
        a.c(anvh.d);
        a.e();
        anuj a2 = a.a();
        anui a3 = anuj.a(anwx.class);
        a3.b(anuu.c(FirebaseInstanceId.class));
        a3.c(anvh.e);
        return Arrays.asList(a2, a3.a(), aocz.S("fire-iid", "21.1.1"));
    }
}
