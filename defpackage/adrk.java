package defpackage;

import java.io.IOException;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adrk implements adqp {
    public static final String a = zga.a("MDX.transport");
    public final adrp b;
    public int c = 0;
    public final Object d = new Object();
    private final Executor e;
    private final ypa f;
    private final acsy g;
    private final adro h;

    public adrk(adrp adrpVar, Executor executor, ypa ypaVar, acsy acsyVar) {
        adrj adrjVar = new adrj(this);
        this.h = adrjVar;
        adrpVar.getClass();
        this.b = adrpVar;
        this.e = executor;
        this.f = ypaVar;
        adrpVar.c(adrjVar);
        acsyVar.getClass();
        this.g = acsyVar;
    }

    @Override // defpackage.adqp
    public final int a() {
        int i;
        synchronized (this.d) {
            i = this.c;
        }
        return i;
    }

    @Override // defpackage.adqp
    public final void b(adqo adqoVar) {
        adre adreVar = this.b.b;
        adreVar.a = adqoVar;
        Object poll = adreVar.b.poll();
        while (true) {
            adqz adqzVar = (adqz) poll;
            if (adqzVar == null) {
                break;
            }
            try {
                String.format("Processing queued messages: %s", adqzVar);
                adreVar.a.b(adqzVar);
            } catch (JSONException unused) {
                zga.c("MDX.transport", String.format("Could not process queued message: %s", adqzVar));
            }
            poll = adreVar.b.poll();
        }
        synchronized (this.d) {
            if (this.c == 0) {
                this.c = 1;
            }
        }
    }

    @Override // defpackage.adqp
    public final void d() {
    }

    @Override // defpackage.adqp
    public final void e(final adgf adgfVar, final adgj adgjVar) {
        this.f.d(new acxu(adgfVar, "local_ws"));
        this.g.r(asmn.LATENCY_ACTION_MDX_COMMAND);
        this.g.u("mdx_cs", asmn.LATENCY_ACTION_MDX_COMMAND);
        acsy acsyVar = this.g;
        asmn asmnVar = asmn.LATENCY_ACTION_MDX_COMMAND;
        aone createBuilder = asmb.a.createBuilder();
        aone createBuilder2 = asmg.a.createBuilder();
        createBuilder2.copyOnWrite();
        asmg asmgVar = (asmg) createBuilder2.instance;
        asmgVar.e = 3;
        asmgVar.b |= 4;
        String str = adgfVar.an;
        createBuilder2.copyOnWrite();
        asmg asmgVar2 = (asmg) createBuilder2.instance;
        str.getClass();
        asmgVar2.b |= 1;
        asmgVar2.c = str;
        asmg asmgVar3 = (asmg) createBuilder2.build();
        createBuilder.copyOnWrite();
        asmb asmbVar = (asmb) createBuilder.instance;
        asmgVar3.getClass();
        asmbVar.x = asmgVar3;
        asmbVar.c |= 2097152;
        acsyVar.o(asmnVar, (asmb) createBuilder.build());
        this.e.execute(new Runnable() { // from class: adri
            @Override // java.lang.Runnable
            public final void run() {
                adrk adrkVar = adrk.this;
                JSONArray a2 = adqx.a(adgfVar, adgjVar);
                try {
                    adrp adrpVar = adrkVar.b;
                    String jSONArray = a2.toString();
                    if (adrpVar.a != null) {
                        adrpVar.a.f(new axrs(axrr.Text, jSONArray));
                        String valueOf = String.valueOf(jSONArray);
                        if (valueOf.length() != 0) {
                            "Sending WS: ".concat(valueOf);
                        }
                    }
                } catch (IOException e) {
                    String str2 = adrk.a;
                    String valueOf2 = String.valueOf(e.getMessage());
                    zga.c(str2, valueOf2.length() != 0 ? "Failed to send message: ".concat(valueOf2) : new String("Failed to send message: "));
                }
            }
        });
    }

    @Override // defpackage.adqp
    public final void g() {
    }

    @Override // defpackage.adqp
    public final void j(boolean z) {
        synchronized (this.d) {
            this.c = 0;
        }
        this.b.k();
    }

    @Override // defpackage.adqp
    public final /* synthetic */ void m(adqn adqnVar) {
    }

    @Override // defpackage.adqp
    public final void n(adqs adqsVar) {
    }
}
