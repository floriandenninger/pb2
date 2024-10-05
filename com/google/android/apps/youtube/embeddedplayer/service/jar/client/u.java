package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import android.os.Build;
import android.os.RemoteException;
import android.view.View;
import com.google.android.apps.youtube.embeddedplayer.service.model.SimplePlaybackDescriptor;
import defpackage.ayrs;
import defpackage.ivj;
import defpackage.oba;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class u implements ayrs {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ u(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            int i2 = this.a;
            av avVar = (av) obj;
            SimplePlaybackDescriptor simplePlaybackDescriptor = avVar.q;
            if ((simplePlaybackDescriptor == null || simplePlaybackDescriptor.e != 2) && !avVar.n()) {
                bn bnVar = avVar.g.a;
                if (!bnVar.f()) {
                    oba.C();
                    return;
                }
                try {
                    bnVar.c.E(i2);
                    return;
                } catch (RemoteException e) {
                    oba.B(e);
                    return;
                }
            }
            return;
        }
        if (i == 1) {
            int i3 = this.a;
            int i4 = ivj.cs;
            ((View) obj).setPadding(i3, 0, i3, 0);
            return;
        }
        if (i == 2) {
            int i5 = this.a;
            av avVar2 = (av) obj;
            SimplePlaybackDescriptor simplePlaybackDescriptor2 = avVar2.q;
            if ((simplePlaybackDescriptor2 == null || simplePlaybackDescriptor2.e != 2) && !avVar2.n()) {
                bn bnVar2 = avVar2.g.a;
                if (!bnVar2.f()) {
                    oba.C();
                    return;
                }
                try {
                    bnVar2.c.F(i5);
                    return;
                } catch (RemoteException e2) {
                    oba.B(e2);
                    return;
                }
            }
            return;
        }
        av avVar3 = (av) obj;
        avVar3.p = this.a;
        if (Build.VERSION.SDK_INT < 24) {
            if (avVar3.n()) {
                return;
            }
            int i6 = avVar3.p;
            if (i6 == 8) {
                avVar3.g.u(avVar3);
                avVar3.g.k();
                avVar3.e();
                return;
            } else if (i6 == 9) {
                avVar3.g.v(avVar3, avVar3.f.e());
                return;
            } else {
                if (i6 != 13) {
                    return;
                }
                avVar3.f();
                return;
            }
        }
        if (avVar3.n()) {
            return;
        }
        int i7 = avVar3.p;
        if (i7 == 8) {
            avVar3.g.u(avVar3);
            avVar3.g.k();
            avVar3.e();
        } else if (i7 == 11) {
            avVar3.g.v(avVar3, avVar3.f.e());
        } else {
            if (i7 != 13) {
                return;
            }
            avVar3.f();
        }
    }
}
