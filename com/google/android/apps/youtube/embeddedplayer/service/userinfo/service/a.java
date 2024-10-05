package com.google.android.apps.youtube.embeddedplayer.service.userinfo.service;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.f;
import defpackage.aaru;
import defpackage.aasa;
import defpackage.afvp;
import defpackage.afxl;
import defpackage.arnd;
import defpackage.asuq;
import defpackage.whu;
import defpackage.zhq;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class a implements afxl, aasa {
    private final SharedPreferences a;
    private final String b;

    public a(SharedPreferences sharedPreferences, f fVar) {
        zhq.m(fVar.a);
        sharedPreferences.getClass();
        this.a = sharedPreferences;
        this.b = String.format("%s_%s", "visitor_id", fVar.a);
    }

    @Override // defpackage.afvb
    public final asuq a() {
        return asuq.VISITOR_ID;
    }

    @Override // defpackage.afvb
    public final void b(Map map, afvp afvpVar) {
        String string = this.a.getString(this.b, null);
        if (string != null) {
            map.put("X-Goog-Visitor-Id", string);
        }
    }

    @Override // defpackage.aasa
    public final void c(arnd arndVar) {
        if (TextUtils.isEmpty(arndVar.c)) {
            return;
        }
        if (arndVar.c.equals(this.a.getString(this.b, null))) {
            return;
        }
        this.a.edit().putString(this.b, arndVar.c).apply();
    }

    @Override // defpackage.aasa
    public final /* synthetic */ void d(aaru aaruVar, arnd arndVar) {
        whu.U(this, arndVar);
    }

    @Override // defpackage.afvb
    public final boolean e() {
        return true;
    }

    @Override // defpackage.aasa
    public final /* synthetic */ boolean f(aaru aaruVar) {
        return true;
    }
}
