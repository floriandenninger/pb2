package defpackage;

import android.net.Uri;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.net.SocketTimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aega extends afja {
    private final ysy b;
    private final PlayerConfigModel c;
    private final afhi d;
    private Exception e;
    private boolean f;
    private boolean g;
    private Uri h;
    private int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aega(atr atrVar, ysy ysyVar, PlayerConfigModel playerConfigModel, afhi afhiVar) {
        super(atrVar);
        afki.a(atrVar);
        afki.a(ysyVar);
        this.b = ysyVar;
        afki.a(playerConfigModel);
        this.c = playerConfigModel;
        afki.a(afhiVar);
        this.d = afhiVar;
    }

    private final void c(atn atnVar) {
        if (this.b.o()) {
            if ((atnVar instanceof afhu) && ((afhu) atnVar).e == 204) {
                return;
            }
            if ((atnVar instanceof afhv) && "x-segment-lmt".equals(((afhv) atnVar).e)) {
                return;
            }
            if (this.f) {
                this.g = true;
            } else {
                this.e = atnVar;
                this.i++;
            }
        }
    }

    private final void d() {
        if (this.f) {
            return;
        }
        this.i = 0;
    }

    @Override // defpackage.afja, defpackage.atr, defpackage.atc
    public final int g(byte[] bArr, int i, int i2) {
        try {
            int g = super.g(bArr, i, i2);
            d();
            return g;
        } catch (atn e) {
            c(e);
            throw e;
        }
    }

    @Override // defpackage.afja, defpackage.atr, defpackage.ate
    public final long h(ath athVar) {
        boolean equals;
        if (this.c.aZ()) {
            equals = adyu.i(athVar.a, this.h);
        } else {
            equals = athVar.a.equals(this.h);
        }
        if (!equals) {
            Exception exc = this.e;
            if (exc == null || !(exc.getCause() instanceof SocketTimeoutException)) {
                this.e = null;
                this.f = false;
                this.g = false;
                this.i = 0;
            }
            this.h = athVar.a;
        }
        if (this.c.ai() && this.i > this.c.u() && !this.g) {
            Uri uri = athVar.a;
            String authority = uri.getAuthority();
            Uri.Builder authority2 = uri.buildUpon().authority("redirector.googlevideo.com");
            afki.a(authority);
            if (authority.endsWith("a1.googlevideo.com")) {
                uri = authority2.appendQueryParameter("cmo", "pf=1").appendQueryParameter("cmo", "td=a1.googlevideo.com").build();
            } else if (authority.endsWith("googlevideo.com")) {
                uri = authority2.appendQueryParameter("cmo", "pf=1").build();
            } else if (authority.endsWith("c.youtube.com")) {
                uri = authority2.appendQueryParameter("cmo", "td=c.youtube.com").build();
            }
            athVar = athVar.d(uri);
            this.f = true;
        } else {
            this.f = false;
        }
        try {
            long h = super.h(athVar);
            this.d.D(super.k(), super.a());
            d();
            return h;
        } catch (atn e) {
            c(e);
            throw e;
        }
    }
}
