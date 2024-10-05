package defpackage;

import android.text.TextUtils;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adra extends axro {
    private static final String d = zga.a("MDX.transport");
    private final adqo e;
    private final adro f;
    private final ypa g;
    private final acsy h;

    public adra(axrf axrfVar, adqo adqoVar, adro adroVar, ypa ypaVar, acsy acsyVar) {
        super(axrfVar);
        this.e = adqoVar;
        this.f = adroVar;
        this.g = ypaVar;
        acsyVar.getClass();
        this.h = acsyVar;
    }

    @Override // defpackage.axro
    protected final void a(IOException iOException) {
        zga.f(d, "Unexpected error on web socket", iOException);
    }

    @Override // defpackage.axro
    protected final void b(axrs axrsVar) {
        try {
            String c = axrsVar.c();
            String valueOf = String.valueOf(c);
            if (valueOf.length() != 0) {
                "Web Socket Frame - Payload text: ".concat(valueOf);
            }
            if (TextUtils.isEmpty(c)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(c);
            try {
                adqz b = adqz.b(jSONArray);
                this.g.d(new acxt(b.a, "local_ws"));
                acsy acsyVar = this.h;
                asmn asmnVar = asmn.LATENCY_ACTION_MDX_COMMAND;
                aone createBuilder = asmb.a.createBuilder();
                aone createBuilder2 = asmg.a.createBuilder();
                createBuilder2.copyOnWrite();
                asmg asmgVar = (asmg) createBuilder2.instance;
                asmgVar.f = 3;
                asmgVar.b |= 8;
                String str = b.a.an;
                createBuilder2.copyOnWrite();
                asmg asmgVar2 = (asmg) createBuilder2.instance;
                str.getClass();
                asmgVar2.b |= 2;
                asmgVar2.d = str;
                asmg asmgVar3 = (asmg) createBuilder2.build();
                createBuilder.copyOnWrite();
                asmb asmbVar = (asmb) createBuilder.instance;
                asmgVar3.getClass();
                asmbVar.x = asmgVar3;
                asmbVar.c |= 2097152;
                acsyVar.o(asmnVar, (asmb) createBuilder.build());
                this.h.v("mdx_cr", asmn.LATENCY_ACTION_MDX_COMMAND);
                this.e.b(b);
            } catch (JSONException e) {
                zga.f(d, String.format("Invalid message format: %s", jSONArray), e);
            }
        } catch (JSONException e2) {
            String str2 = d;
            String valueOf2 = String.valueOf(e2.getMessage());
            zga.m(str2, valueOf2.length() != 0 ? "Failed to parse message: ".concat(valueOf2) : new String("Failed to parse message: "));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.axro
    public final void c() {
        this.f.a();
    }

    @Override // defpackage.axro
    protected final void d(String str, boolean z) {
        String.format("onClose: reason=%s initiatedByRemote=%s", str, Boolean.valueOf(z));
        this.f.b();
    }
}
