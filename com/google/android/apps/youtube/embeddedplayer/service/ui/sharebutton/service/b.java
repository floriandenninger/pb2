package com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.service;

import android.content.Context;
import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.f;
import com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.d;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;
import defpackage.afsi;
import defpackage.ahdv;
import defpackage.ahef;
import defpackage.ahej;
import defpackage.apmg;
import defpackage.atzr;
import defpackage.atzs;
import defpackage.rql;
import defpackage.wbs;
import defpackage.ypd;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b implements d, ypd {
    public ahej a;
    public ahef b;
    public PlayerResponseModel c;
    public apmg d;
    public boolean e;
    public final rql f;
    private final f h;
    private final Context i;

    public b(f fVar, rql rqlVar, Context context, byte[] bArr) {
        this.h = fVar;
        this.f = rqlVar;
        this.i = context;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        atzr atzrVar;
        if (i == -1) {
            return new Class[]{ahdv.class, ahef.class, ahej.class};
        }
        if (i != 0) {
            if (i == 1) {
                ahef ahefVar = (ahef) obj;
                this.b = ahefVar;
                this.c = ahefVar.b();
                a();
                return null;
            }
            if (i == 2) {
                this.a = (ahej) obj;
                a();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        WatchNextResponseModel a = ((ahdv) obj).a();
        if (a == null || (atzrVar = a.i) == null) {
            this.d = null;
            a();
            return null;
        }
        atzs atzsVar = atzrVar.e;
        if (atzsVar == null) {
            atzsVar = atzs.a;
        }
        if ((atzsVar.b & 1) != 0) {
            atzs atzsVar2 = atzrVar.e;
            if (atzsVar2 == null) {
                atzsVar2 = atzs.a;
            }
            apmg apmgVar = atzsVar2.c;
            if (apmgVar == null) {
                apmgVar = apmg.a;
            }
            this.d = apmgVar;
        } else {
            this.d = null;
        }
        a();
        return null;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.d
    public final void t() {
        apmg apmgVar = this.d;
        PlayerResponseModel playerResponseModel = this.c;
        if (apmgVar == null || playerResponseModel == null) {
            return;
        }
        wbs.aH(this.i, playerResponseModel.x(), wbs.ah(playerResponseModel.y()));
        if ((apmgVar.b & 32768) != 0) {
            this.h.j(apmgVar.t.I());
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.d
    public final void u() {
        apmg apmgVar = this.d;
        if (apmgVar != null) {
            this.h.q(apmgVar.t.I());
        } else {
            afsi.b(2, 4, "Share button renderer not received.");
        }
    }

    public final void a() {
        if (this.e) {
            return;
        }
        ahej ahejVar = this.a;
        boolean z = false;
        if (ahejVar != null && this.b != null && (((!ahejVar.c() && !this.a.e() && !this.a.f() && this.a.a() != 7 && this.a.a() != 4) || !this.b.c().h()) && this.d != null)) {
            z = true;
        }
        if (this.f.e(R.id.player_share_button) == z) {
            return;
        }
        this.f.d(R.id.player_share_button, z);
        apmg apmgVar = this.d;
        if (apmgVar != null) {
            this.h.q(apmgVar.t.I());
        }
    }
}
