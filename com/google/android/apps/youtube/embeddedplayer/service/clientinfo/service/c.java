package com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Base64;
import defpackage.aarz;
import defpackage.aone;
import defpackage.arnb;
import defpackage.arnf;
import defpackage.wbs;
import defpackage.zgw;
import defpackage.zgx;
import defpackage.zhq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class c implements aarz {
    private final String a;
    private final String b;
    private final String c;

    public c(Context context, String str, String str2) {
        zhq.m(str);
        this.a = str;
        zhq.m(str2);
        this.b = str2;
        try {
            PackageInfo b = zgx.b(context, 64);
            if (b.signatures.length != 1) {
                int length = b.signatures.length;
                throw new zgw();
            }
            this.c = Base64.encodeToString(wbs.af(b.signatures[0].toByteArray()), 10);
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Couldn't get package information.", e);
        }
    }

    @Override // defpackage.aarz
    public final void a(aone aoneVar) {
        arnf b = b();
        aoneVar.copyOnWrite();
        arnb arnbVar = (arnb) aoneVar.instance;
        arnb arnbVar2 = arnb.a;
        b.getClass();
        arnbVar.i = b;
        arnbVar.b |= 128;
    }

    public final arnf b() {
        aone createBuilder = arnf.a.createBuilder();
        String str = this.b;
        createBuilder.copyOnWrite();
        arnf arnfVar = (arnf) createBuilder.instance;
        str.getClass();
        arnfVar.b |= 2;
        arnfVar.d = str;
        String str2 = this.c;
        createBuilder.copyOnWrite();
        arnf arnfVar2 = (arnf) createBuilder.instance;
        str2.getClass();
        arnfVar2.b |= 4;
        arnfVar2.e = str2;
        String str3 = this.a;
        createBuilder.copyOnWrite();
        arnf arnfVar3 = (arnf) createBuilder.instance;
        str3.getClass();
        arnfVar3.b |= 1;
        arnfVar3.c = str3;
        return (arnf) createBuilder.build();
    }
}
