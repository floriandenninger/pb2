package defpackage;

import android.app.Activity;
import com.google.protos.youtube.api.innertube.CommerceActionCommandOuterClass$CommerceActionCommand;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yhh implements aaha {
    public final aahd a;
    public final zaw b;
    public final ycs c = new ycs();
    public final acqz d;
    private final Activity e;
    private final aahv f;
    private final Executor g;
    private final aaxn h;

    public yhh(Activity activity, aahd aahdVar, aaxn aaxnVar, aahv aahvVar, zaw zawVar, acqz acqzVar, Executor executor, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.e = activity;
        this.h = aaxnVar;
        this.a = aahdVar;
        this.f = aahvVar;
        this.b = zawVar;
        this.d = acqzVar;
        this.g = executor;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        byte[] c;
        final CommerceActionCommandOuterClass$CommerceActionCommand commerceActionCommandOuterClass$CommerceActionCommand = (CommerceActionCommandOuterClass$CommerceActionCommand) apxfVar.pX(CommerceActionCommandOuterClass$CommerceActionCommand.commerceActionCommand);
        if (!commerceActionCommandOuterClass$CommerceActionCommand.h) {
            this.c.show(this.e.getFragmentManager(), ycs.a);
        }
        aaxn aaxnVar = this.h;
        abdw abdwVar = new abdw(aaxnVar.f, aaxnVar.a.c(), null, null, null);
        abdwVar.c = commerceActionCommandOuterClass$CommerceActionCommand.d;
        abdwVar.b = commerceActionCommandOuterClass$CommerceActionCommand.c;
        abdwVar.l(apxfVar.c);
        aony<String> aonyVar = commerceActionCommandOuterClass$CommerceActionCommand.e;
        aahu c2 = this.f.c();
        for (String str : aonyVar) {
            if (c2.f(str).X() != null && (c = ((aakt) c2.f(str).X()).c()) != null) {
                abdwVar.a.add(aomf.x(c));
            }
        }
        if ((commerceActionCommandOuterClass$CommerceActionCommand.b & 4) != 0) {
            aahd aahdVar = this.a;
            apxf apxfVar2 = commerceActionCommandOuterClass$CommerceActionCommand.f;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            aahdVar.a(apxfVar2);
        }
        ynm.k(this.h.b.b(abdwVar, this.g), this.g, new ynk() { // from class: yhf
            @Override // defpackage.zfi
            /* renamed from: b */
            public final void a(Throwable th) {
                yhh yhhVar = yhh.this;
                CommerceActionCommandOuterClass$CommerceActionCommand commerceActionCommandOuterClass$CommerceActionCommand2 = commerceActionCommandOuterClass$CommerceActionCommand;
                if (yhhVar.c.isAdded()) {
                    yhhVar.c.dismiss();
                }
                if ((commerceActionCommandOuterClass$CommerceActionCommand2.b & 8) == 0) {
                    yhhVar.b.e(th);
                    return;
                }
                aahd aahdVar2 = yhhVar.a;
                apxf apxfVar3 = commerceActionCommandOuterClass$CommerceActionCommand2.g;
                if (apxfVar3 == null) {
                    apxfVar3 = apxf.a;
                }
                aahdVar2.a(apxfVar3);
            }
        }, new ynl() { // from class: yhg
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                yhh yhhVar = yhh.this;
                arml armlVar = (arml) obj;
                if (yhhVar.c.isAdded()) {
                    yhhVar.c.dismiss();
                }
                if ((armlVar.b & 2) != 0) {
                    aahd aahdVar2 = yhhVar.a;
                    apxf apxfVar3 = armlVar.d;
                    if (apxfVar3 == null) {
                        apxfVar3 = apxf.a;
                    }
                    aahdVar2.a(apxfVar3);
                }
                if ((armlVar.b & 8) != 0) {
                    yhhVar.d.mM().D(new acqx(armlVar.e));
                }
            }
        });
    }
}
