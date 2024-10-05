package com.google.android.apps.youtube.app.extensions.reel.watch.activity;

import defpackage.any;
import defpackage.aoae;
import defpackage.aok;
import defpackage.ekm;
import defpackage.ifn;
import defpackage.igj;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ExternalApiLifecycleObserver implements any {
    private final ekm a;
    private final ifn b;
    private final igj c;
    private final aoae d;

    public ExternalApiLifecycleObserver(ekm ekmVar, aoae aoaeVar, ifn ifnVar, igj igjVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = ekmVar;
        this.d = aoaeVar;
        this.b = ifnVar;
        this.c = igjVar;
    }

    @Override // defpackage.aoa
    public final void lc(aok aokVar) {
        this.d.N();
        this.a.b(null);
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lh(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void nu(aok aokVar) {
        this.d.O(this.c);
        this.a.b(this.b);
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void nv(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void ot(aok aokVar) {
    }
}
