package defpackage;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.UUID;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adrp extends axrt {
    private static final String n = zga.a("MDX.transport");
    public volatile axro a;
    public final adre b;
    final adrg c;
    final adrn d;
    private final Object o;
    private final acpl p;
    private String q;
    private final adrh r;

    public adrp(adrh adrhVar, adtv adtvVar, acpl acplVar) {
        super(adtvVar.c());
        this.o = new Object();
        this.q = "";
        this.p = acplVar;
        this.r = adrhVar;
        this.d = new adrn();
        adre adreVar = new adre();
        this.b = adreVar;
        this.c = new adrg(adreVar);
    }

    private final String o() {
        String str;
        synchronized (this.o) {
            str = this.q;
        }
        return str;
    }

    private final synchronized void p() {
        if (this.a == null || this.a.c != 3) {
            return;
        }
        try {
            this.a.g(1000, "Local transport closing web socket", false);
        } catch (IOException e) {
            zga.f(n, "Could not close web socket.", e);
        }
        this.a = null;
    }

    private static final axrj q() {
        return n(axri.NOT_FOUND, "Error 404, file not found.");
    }

    private final void r(int i) {
        s(i, null);
    }

    private final void s(int i, String str) {
        aone createBuilder = atav.a.createBuilder();
        createBuilder.copyOnWrite();
        atav atavVar = (atav) createBuilder.instance;
        atavVar.c = i - 1;
        atavVar.b |= 1;
        if (str != null) {
            createBuilder.copyOnWrite();
            atav atavVar2 = (atav) createBuilder.instance;
            atavVar2.b |= 2;
            atavVar2.d = str;
        }
        arpn a = arpp.a();
        a.copyOnWrite();
        ((arpp) a.instance).dj((atav) createBuilder.build());
        this.p.c((arpp) a.build());
    }

    @Override // defpackage.axrt, defpackage.axrm
    public final axrj a(axrf axrfVar) {
        try {
            URI uri = new URI(((axre) axrfVar).d);
            if (!o().equals(uri.getPath())) {
                s(6, uri.getPath());
                return q();
            }
            axrj a = super.a(axrfVar);
            axrh axrhVar = a.a;
            axri axriVar = axri.SWITCH_PROTOCOL;
            int ordinal = ((axri) axrhVar).ordinal();
            if (ordinal != 1) {
                if (ordinal == 11) {
                    r(3);
                } else if (ordinal == 21) {
                    r(2);
                } else if (ordinal == 13) {
                    r(6);
                } else if (ordinal != 14) {
                    r(1);
                } else {
                    r(5);
                }
            }
            return a;
        } catch (URISyntaxException e) {
            zga.f(n, String.format("Unexpected requested uri: %s", ((axre) axrfVar).d), e);
            return q();
        }
    }

    @Override // defpackage.axrt
    protected final axro b(axrf axrfVar) {
        adrh adrhVar = this.r;
        this.a = new adra(axrfVar, this.c, this.d, adrhVar.a, adrhVar.b);
        return this.a;
    }

    public final void c(adro adroVar) {
        adrn adrnVar = this.d;
        adrnVar.b.add(adroVar);
        if (adrnVar.a == 2) {
            adroVar.a();
        } else if (adrnVar.a == 0 && adrnVar.c) {
            adroVar.b();
        }
    }

    public final void d(adrf adrfVar) {
        this.c.a(adrfVar);
    }

    public final void e(final acsx acsxVar) {
        if (m()) {
            return;
        }
        c(new adrm(this, acsxVar));
        d(new adrf() { // from class: adrl
            @Override // defpackage.adrf
            public final void a(adqz adqzVar) {
                adrp adrpVar = adrp.this;
                acsx acsxVar2 = acsxVar;
                adrpVar.h(5);
                acsxVar2.c("ws_ssr");
            }
        });
        if (!m()) {
            synchronized (this.o) {
                this.q = String.format("/%s", UUID.randomUUID());
            }
            this.j = new ServerSocket();
            this.j.setReuseAddress(true);
            axrl axrlVar = new axrl(this);
            this.k = new Thread(axrlVar);
            this.k.setDaemon(true);
            this.k.setName("NanoHttpd Main Listener");
            this.k.start();
            while (!axrlVar.b && axrlVar.a == null) {
                try {
                    Thread.sleep(10L);
                } catch (Throwable unused) {
                }
            }
            IOException iOException = axrlVar.a;
            if (iOException != null) {
                throw iOException;
            }
            String.format("Started web socket server: %s", g());
        }
        if (m()) {
            h(2);
            acsxVar.c("ws_ss");
        } else {
            h(4);
        }
    }

    @Override // defpackage.axrm
    public final void f() {
        if (m()) {
            synchronized (this.o) {
                this.q = "";
            }
            p();
            adrn adrnVar = this.d;
            adrnVar.b.clear();
            adrnVar.a = 0;
            adrnVar.c = false;
            adre adreVar = this.b;
            adreVar.a = null;
            adreVar.b.clear();
            this.c.c();
            try {
                axrm.l(this.j);
                ArrayList arrayList = new ArrayList(this.l.b);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    axqy axqyVar = (axqy) arrayList.get(i);
                    axrm.l(axqyVar.a);
                    axrm.l(axqyVar.b);
                }
                Thread thread = this.k;
                if (thread != null) {
                    thread.join();
                }
            } catch (Exception e) {
                axrm.h.log(Level.SEVERE, "Could not stop all connections", (Throwable) e);
            }
        }
    }

    public final String g() {
        if (!m()) {
            return "";
        }
        try {
            return new URI("ws", null, this.i, this.j == null ? -1 : this.j.getLocalPort(), o(), null, null).toString();
        } catch (URISyntaxException e) {
            zga.f(n, "Could not create web socket server URI.", e);
            throw new IllegalArgumentException(e);
        }
    }

    public final void h(int i) {
        aone createBuilder = atau.a.createBuilder();
        createBuilder.copyOnWrite();
        atau atauVar = (atau) createBuilder.instance;
        atauVar.c = i - 1;
        atauVar.b |= 1;
        atau atauVar2 = (atau) createBuilder.build();
        arpn a = arpp.a();
        a.copyOnWrite();
        ((arpp) a.instance).di(atauVar2);
        this.p.c((arpp) a.build());
    }
}
