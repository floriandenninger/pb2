package com.google.android.apps.youtube.app.mdx.watch;

import android.content.SharedPreferences;
import defpackage.adlm;
import defpackage.adlr;
import defpackage.adlt;
import defpackage.aneu;
import defpackage.any;
import defpackage.aok;
import defpackage.axpg;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MdxSuccessfulCastRecorder implements adlr, any {
    private final SharedPreferences a;
    private final axpg b;

    public MdxSuccessfulCastRecorder(SharedPreferences sharedPreferences, axpg axpgVar) {
        this.a = sharedPreferences;
        this.b = axpgVar;
    }

    @Override // defpackage.adlr
    public final void j(adlm adlmVar) {
        SharedPreferences.Editor edit = this.a.edit();
        aneu aneuVar = aneu.a;
        edit.putLong("on_device_mdx_successful_cast_time", Instant.now().toEpochMilli()).apply();
    }

    @Override // defpackage.adlr
    public final void k(adlm adlmVar) {
    }

    @Override // defpackage.adlr
    public final void l(adlm adlmVar) {
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lg(aok aokVar) {
        ((adlt) this.b.get()).i(this);
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lh(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void nv(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void ot(aok aokVar) {
    }
}
