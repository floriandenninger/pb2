package com.google.android.apps.youtube.embeddedplayer.service.hostappverification;

import defpackage.amkq;
import defpackage.amnm;
import defpackage.aomw;
import defpackage.aone;
import defpackage.aonm;
import defpackage.aoob;
import defpackage.aorw;
import defpackage.aorx;
import defpackage.aory;
import defpackage.cnh;
import defpackage.cnm;
import defpackage.cnn;
import defpackage.cnq;
import defpackage.yvo;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class f extends yvo {
    private static final cnn a = new i();
    private final aory b;
    private final String c;
    private final String k;

    public f(String str, String str2, String str3, String str4) {
        super(2, str, null);
        this.c = str2;
        this.k = str3;
        str4.getClass();
        List h = amnm.c(".").h(str4);
        amkq.N(h.size() == 3);
        aone createBuilder = aory.a.createBuilder();
        int parseInt = Integer.parseInt((String) h.get(0));
        createBuilder.copyOnWrite();
        ((aory) createBuilder.instance).b = parseInt;
        int parseInt2 = Integer.parseInt((String) h.get(1));
        createBuilder.copyOnWrite();
        ((aory) createBuilder.instance).c = parseInt2;
        int parseInt3 = Integer.parseInt((String) h.get(2));
        createBuilder.copyOnWrite();
        ((aory) createBuilder.instance).d = parseInt3;
        this.b = (aory) createBuilder.build();
        this.h = false;
        s();
    }

    @Override // defpackage.yvo
    public final cnq d(cnq cnqVar) {
        return e.a(cnqVar.b);
    }

    @Override // defpackage.yvo
    public final boolean h() {
        return true;
    }

    @Override // defpackage.yvo
    public final cnn la() {
        return a;
    }

    @Override // defpackage.yvo
    public final String lb() {
        return "application/x-protobuf";
    }

    @Override // defpackage.yvo
    public final cnm qk(cnh cnhVar) {
        int i = cnhVar.a;
        if (i < 200 || i > 299) {
            return cnm.a(e.a(cnhVar));
        }
        try {
            aorx aorxVar = (aorx) aonm.parseFrom(aorx.a, cnhVar.b, aomw.b());
            int i2 = aorxVar.f;
            int i3 = 3;
            char c = i2 != 0 ? i2 != 1 ? (char) 0 : (char) 3 : (char) 2;
            if (c == 0) {
                c = 1;
            }
            if (c == 2) {
                return cnm.b(aorxVar, null);
            }
            amkq.N(true);
            if (c != 3) {
                i3 = 1;
            }
            return cnm.a(new e(i3));
        } catch (aoob unused) {
            return cnm.a(e.a(cnhVar));
        }
    }

    @Override // defpackage.yvo
    public final /* bridge */ /* synthetic */ void ql(Object obj) {
    }

    @Override // defpackage.yvo
    public final byte[] qm() {
        aone createBuilder = aorw.a.createBuilder();
        createBuilder.copyOnWrite();
        ((aorw) createBuilder.instance).f = 1;
        String str = this.c;
        createBuilder.copyOnWrite();
        aorw aorwVar = (aorw) createBuilder.instance;
        str.getClass();
        aorwVar.c = str;
        String str2 = this.k;
        createBuilder.copyOnWrite();
        aorw aorwVar2 = (aorw) createBuilder.instance;
        str2.getClass();
        aorwVar2.d = str2;
        aory aoryVar = this.b;
        createBuilder.copyOnWrite();
        aorw aorwVar3 = (aorw) createBuilder.instance;
        aoryVar.getClass();
        aorwVar3.b = aoryVar;
        createBuilder.copyOnWrite();
        ((aorw) createBuilder.instance).e = true;
        return ((aorw) createBuilder.build()).toByteArray();
    }
}
