package com.google.android.apps.youtube.app.common.notification;

import android.content.Context;
import defpackage.aahu;
import defpackage.aahv;
import defpackage.aaih;
import defpackage.aaio;
import defpackage.aalt;
import defpackage.aear;
import defpackage.afyt;
import defpackage.amkq;
import defpackage.any;
import defpackage.aok;
import defpackage.aone;
import defpackage.atnj;
import defpackage.atnl;
import defpackage.atnm;
import defpackage.atno;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class NotificationOsSettingEntityController implements any {
    private final aahv a;
    private final Context b;
    private final afyt c;
    private final String d = aalt.f(atnm.b.a(), "notification_os_setting_entity");

    public NotificationOsSettingEntityController(aahv aahvVar, Context context, afyt afytVar) {
        this.a = aahvVar;
        this.b = context;
        this.c = afytVar;
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lh(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void nu(aok aokVar) {
        atno atnoVar;
        aahu c = this.a.c();
        int F = aear.F(this.b, this.c) - 1;
        if (F != 1) {
            if (F == 2) {
                atnoVar = atno.NOTIFICATION_OS_SETTING_STATE_DISABLED;
            } else if (F != 3) {
                atnoVar = atno.NOTIFICATION_OS_SETTING_STATE_ONLY_CHANNEL_DISABLED;
            }
            String str = this.d;
            str.getClass();
            amkq.O(!str.isEmpty(), "key cannot be empty");
            aone createBuilder = atnm.a.createBuilder();
            createBuilder.copyOnWrite();
            atnm atnmVar = (atnm) createBuilder.instance;
            atnmVar.c = 1 | atnmVar.c;
            atnmVar.d = str;
            atnj atnjVar = new atnj(createBuilder);
            aone aoneVar = atnjVar.a;
            aoneVar.copyOnWrite();
            atnm atnmVar2 = (atnm) aoneVar.instance;
            atnmVar2.e = atnoVar.e;
            atnmVar2.c |= 2;
            atnl b = atnjVar.b();
            aaio c2 = ((aaih) c).c();
            c2.d(b);
            c2.b().Q();
        }
        atnoVar = atno.NOTIFICATION_OS_SETTING_STATE_ENABLED;
        String str2 = this.d;
        str2.getClass();
        amkq.O(!str2.isEmpty(), "key cannot be empty");
        aone createBuilder2 = atnm.a.createBuilder();
        createBuilder2.copyOnWrite();
        atnm atnmVar3 = (atnm) createBuilder2.instance;
        atnmVar3.c = 1 | atnmVar3.c;
        atnmVar3.d = str2;
        atnj atnjVar2 = new atnj(createBuilder2);
        aone aoneVar2 = atnjVar2.a;
        aoneVar2.copyOnWrite();
        atnm atnmVar22 = (atnm) aoneVar2.instance;
        atnmVar22.e = atnoVar.e;
        atnmVar22.c |= 2;
        atnl b2 = atnjVar2.b();
        aaio c22 = ((aaih) c).c();
        c22.d(b2);
        c22.b().Q();
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void nv(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void ot(aok aokVar) {
    }
}
