package com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service;

import defpackage.acqq;
import defpackage.acqx;
import defpackage.acra;
import defpackage.acsc;
import defpackage.apxf;
import defpackage.asht;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class c {
    public boolean a = false;
    final /* synthetic */ d b;
    private final acra c;

    public c(d dVar, acra acraVar) {
        this.b = dVar;
        this.c = acraVar;
    }

    public final void a(b bVar, String str) {
        acqx acqxVar;
        asht a = this.b.a(str);
        if (!this.b.f.contains(bVar)) {
            this.b.f.add(bVar);
        }
        a aVar = a.ATTACH;
        int ordinal = bVar.a.ordinal();
        if (ordinal == 0) {
            byte[] bArr = bVar.b;
            if (bArr == null) {
                acsc acscVar = bVar.c;
                acscVar.getClass();
                acqxVar = new acqx(acscVar);
            } else {
                acqxVar = new acqx(bArr);
            }
            ((acqq) this.c).D(acqxVar);
            if (str != null) {
                this.c.r(str);
            }
            this.c.w(acqxVar, this.b.a(null));
            return;
        }
        if (ordinal == 1) {
            byte[] bArr2 = bVar.b;
            if (bArr2 == null) {
                acsc acscVar2 = bVar.c;
                if (acscVar2 != null) {
                    this.c.I(3, new acqx(acscVar2), a);
                    return;
                }
                return;
            }
            this.c.I(3, new acqx(bArr2), a);
            return;
        }
        if (ordinal != 2) {
            return;
        }
        byte[] bArr3 = bVar.b;
        if (bArr3 == null) {
            acsc acscVar3 = bVar.c;
            if (acscVar3 != null) {
                this.c.u(new acqx(acscVar3), a);
                return;
            }
            return;
        }
        this.c.u(new acqx(bArr3), a);
    }

    public final void b(acsc acscVar, Optional optional, asht ashtVar) {
        this.c.d(acscVar, (apxf) optional.orElse(null), ashtVar);
        this.a = true;
    }

    public final void c() {
        this.c.y();
        this.a = false;
    }

    public final void d(Optional optional) {
        Optional.ofNullable(this.c.h((apxf) optional.orElse(null)));
    }
}
