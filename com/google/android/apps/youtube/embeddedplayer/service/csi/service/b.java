package com.google.android.apps.youtube.embeddedplayer.service.csi.service;

import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.c;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.SetOperationType;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.Tick;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b extends c {
    private final a a;

    public b(a aVar) {
        this.a = aVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d
    public final synchronized void a() {
        this.a.b();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d
    public final void b() {
        this.a.c();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d
    public final synchronized void c() {
        this.a.d();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d
    public final synchronized void d(d dVar) {
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d
    public final synchronized void e(Tick tick, long j) {
        this.a.e(tick, j);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d
    public final void f(Tick tick, long j) {
        this.a.g(tick, j);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d
    public final synchronized void g(Tick tick, long j) {
        this.a.i(tick, j);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d
    public final synchronized void h(long j) {
        this.a.j(j);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d
    public final void i(long j) {
        this.a.k(j);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d
    public final synchronized void j(SetOperationType setOperationType, long j) {
        this.a.l(setOperationType, j);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d
    public final synchronized void k(SetOperationType setOperationType, long j) {
        this.a.m(setOperationType, j);
    }
}
