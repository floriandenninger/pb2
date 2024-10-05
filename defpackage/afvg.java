package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afvg extends afuu {
    private final yrw c;

    public afvg(yrw yrwVar, afrh afrhVar, afra afraVar) {
        super(afrhVar, afraVar);
        yrwVar.getClass();
        this.c = yrwVar;
    }

    private static final void d(ysq ysqVar) {
        yso ysoVar = ysqVar.d;
        if (ysoVar != null) {
            ysoVar.f();
        }
    }

    @Override // defpackage.afuu
    protected final /* bridge */ /* synthetic */ void a(Object obj, ykl yklVar) {
        ysk yskVar = (ysk) obj;
        yskVar.getClass();
        ysq ysqVar = null;
        try {
            try {
                ysqVar = this.c.a(yskVar);
                yklVar.b(yskVar, ysqVar);
                if (ysqVar != null) {
                    try {
                        d(ysqVar);
                    } catch (IOException e) {
                        zga.n("Error consuming content response", e);
                    }
                }
            } catch (Throwable th) {
                if (ysqVar != null) {
                    try {
                        d(ysqVar);
                    } catch (IOException e2) {
                        zga.n("Error consuming content response", e2);
                    }
                }
                throw th;
            }
        } catch (IllegalStateException e3) {
            yklVar.a(yskVar, e3);
            if (ysqVar != null) {
                try {
                    d(ysqVar);
                } catch (IOException e4) {
                    zga.n("Error consuming content response", e4);
                }
            }
        } catch (RuntimeException e5) {
            throw e5;
        } catch (Exception e6) {
            yklVar.a(yskVar, e6);
            if (ysqVar != null) {
                try {
                    d(ysqVar);
                } catch (IOException e7) {
                    zga.n("Error consuming content response", e7);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.afuu
    public final /* synthetic */ void b(Object obj, Object obj2, ykl yklVar, Exception exc) {
        ysk yskVar = (ysk) obj2;
        if (exc instanceof ysr) {
            yskVar.a.length();
            int i = ((ysr) exc).a;
            String message = exc.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 39);
            sb.append("Http error: status=[");
            sb.append(i);
            sb.append("] msg=[");
            sb.append(message);
            sb.append("]");
            zga.b(sb.toString());
        }
        super.b(obj, yskVar, yklVar, exc);
    }
}
