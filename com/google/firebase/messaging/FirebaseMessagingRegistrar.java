package com.google.firebase.messaging;

import defpackage.antc;
import defpackage.anui;
import defpackage.anuj;
import defpackage.anum;
import defpackage.anuu;
import defpackage.anvh;
import defpackage.anwd;
import defpackage.anwg;
import defpackage.anwx;
import defpackage.anxe;
import defpackage.aoag;
import defpackage.aocz;
import defpackage.owx;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class FirebaseMessagingRegistrar implements anum {
    @Override // defpackage.anum
    public List getComponents() {
        anui a = anuj.a(FirebaseMessaging.class);
        a.b(anuu.c(antc.class));
        a.b(anuu.a(anwx.class));
        a.b(anuu.b(aoag.class));
        a.b(anuu.b(anwg.class));
        a.b(anuu.a(owx.class));
        a.b(anuu.c(anxe.class));
        a.b(anuu.c(anwd.class));
        a.c(anvh.g);
        a.e();
        return Arrays.asList(a.a(), aocz.S("fire-fcm", "20.1.7_1p"));
    }
}
