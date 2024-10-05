package com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service;

import com.google.android.apps.youtube.embeddedplayer.service.model.SimplePlaybackDescriptor;
import defpackage.acsb;
import defpackage.opn;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class g extends com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.c {
    private final f a;

    public g(f fVar) {
        this.a = fVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d
    public final int a(int i) {
        return this.a.a(i);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d
    public final void b(int i) {
        this.a.i(acsb.c(i));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d
    public final void c(byte[] bArr) {
        this.a.j(bArr);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d
    public final void d(int i, int i2) {
        this.a.k(i, acsb.c(i2));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d
    public final void e(int i, byte[] bArr) {
        this.a.l(i, bArr);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d
    public final void f(int i, SimplePlaybackDescriptor simplePlaybackDescriptor, boolean z) {
        this.a.m(i, opn.f(simplePlaybackDescriptor), z);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d
    public final void g(int i) {
        this.a.n(i);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d
    public final void h(int i) {
        this.a.p(acsb.c(i));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d
    public final void i(byte[] bArr) {
        this.a.q(bArr);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d
    public final void j(int i, int i2) {
        this.a.r(i, acsb.c(i2));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d
    public final void k(int i, byte[] bArr) {
        this.a.s(i, bArr);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.shared.d
    public final void l(int i) {
        this.a.t(i);
    }
}
