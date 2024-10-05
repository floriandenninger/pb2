package com.google.android.apps.youtube.embeddedplayer.service.csi.remoteloaded;

import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.SetOperationType;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.Tick;
import defpackage.alta;
import j$.util.Optional;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class d extends com.google.android.apps.youtube.embeddedplayer.service.csi.shared.c {
    Optional a = Optional.empty();
    Optional b = Optional.empty();
    Optional c = Optional.empty();

    @Override // com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d
    public final void a() {
        this.b = Optional.empty();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d
    public final void b() {
        this.c = Optional.empty();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d
    public final void c() {
        this.a = Optional.empty();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d
    public final void d(com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d dVar) {
        if (dVar != null) {
            try {
                if (this.a.isPresent()) {
                    dVar.k(((b) this.a.get()).b, ((b) this.a.get()).a);
                    Iterator it = ((b) this.a.get()).c.iterator();
                    while (it.hasNext()) {
                        c cVar = (c) it.next();
                        dVar.g(cVar.a, cVar.b);
                    }
                    c();
                }
                if (this.b.isPresent()) {
                    dVar.h(((b) this.b.get()).a);
                    Iterator it2 = ((b) this.b.get()).c.iterator();
                    while (it2.hasNext()) {
                        c cVar2 = (c) it2.next();
                        dVar.e(cVar2.a, cVar2.b);
                    }
                    a();
                }
                if (this.c.isPresent()) {
                    dVar.i(((b) this.c.get()).a);
                    Iterator it3 = ((b) this.c.get()).c.iterator();
                    while (it3.hasNext()) {
                        c cVar3 = (c) it3.next();
                        dVar.f(cVar3.a, cVar3.b);
                    }
                    b();
                }
            } catch (RemoteException unused) {
                alta.C("Csi controller service is disconnected.", new Object[0]);
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d
    public final void e(Tick tick, long j) {
        if (this.b.isPresent()) {
            ((b) this.b.get()).c.add(new c(tick, j));
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d
    public final void f(Tick tick, long j) {
        if (this.c.isPresent()) {
            ((b) this.c.get()).c.add(new c(tick, j));
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d
    public final void g(Tick tick, long j) {
        if (this.a.isPresent()) {
            ((b) this.a.get()).c.add(new c(tick, j));
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d
    public final void h(long j) {
        a();
        Optional of = Optional.of(new b());
        this.b = of;
        ((b) of.get()).a = j;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d
    public final void i(long j) {
        b();
        Optional of = Optional.of(new b());
        this.c = of;
        ((b) of.get()).a = j;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d
    public final void j(SetOperationType setOperationType, long j) {
        c();
        Optional of = Optional.of(new b());
        this.a = of;
        ((b) of.get()).a = j;
        ((b) this.a.get()).b = setOperationType;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.csi.shared.d
    public final void k(SetOperationType setOperationType, long j) {
    }
}
