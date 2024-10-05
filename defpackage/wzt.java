package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.apps.youtube.embeddedplayer.service.bootstrap.service.b;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wzt implements axqr {
    private final azrw a;
    private final /* synthetic */ int b;

    public wzt(azrw azrwVar, int i) {
        this.b = i;
        this.a = azrwVar;
    }

    public static wzt A(azrw azrwVar) {
        return new wzt(azrwVar, 19);
    }

    public static wzt B(azrw azrwVar) {
        return new wzt(azrwVar, 20);
    }

    public static wzn a(azrw azrwVar) {
        wzm wzmVar = (wzm) azrwVar.get();
        wzmVar.a.getClass();
        return new wzn(wzmVar);
    }

    public static wzt b(azrw azrwVar) {
        return new wzt(azrwVar, 0);
    }

    public static ynx c(ynx ynxVar) {
        return ynxVar != null ? ynxVar : ynx.a;
    }

    public static ayqi d(Executor executor) {
        return new azos(executor);
    }

    public static ayqi e(Executor executor) {
        return new azos(executor);
    }

    public static Handler f(Context context) {
        return new Handler(context.getMainLooper());
    }

    public static yss g(ysw yswVar) {
        return new yss(yswVar);
    }

    public static ysx h(shf shfVar) {
        return new ysx(shfVar);
    }

    public static wzt i(azrw azrwVar) {
        return new wzt(azrwVar, 1);
    }

    public static wzt j(azrw azrwVar) {
        return new wzt(azrwVar, 2);
    }

    public static wzt k(azrw azrwVar) {
        return new wzt(azrwVar, 3);
    }

    public static wzt l(azrw azrwVar) {
        return new wzt(azrwVar, 4);
    }

    public static wzt m(azrw azrwVar) {
        return new wzt(azrwVar, 5);
    }

    public static wzt n(azrw azrwVar) {
        return new wzt(azrwVar, 6);
    }

    public static wzt o(azrw azrwVar) {
        return new wzt(azrwVar, 7);
    }

    public static wzt p(azrw azrwVar) {
        return new wzt(azrwVar, 8);
    }

    public static wzt q(azrw azrwVar) {
        return new wzt(azrwVar, 9);
    }

    public static wzt r(azrw azrwVar) {
        return new wzt(azrwVar, 10);
    }

    public static wzt s(azrw azrwVar) {
        return new wzt(azrwVar, 11);
    }

    public static wzt t(azrw azrwVar) {
        return new wzt(azrwVar, 12);
    }

    public static wzt u(azrw azrwVar) {
        return new wzt(azrwVar, 13);
    }

    public static wzt v(azrw azrwVar) {
        return new wzt(azrwVar, 14);
    }

    public static wzt w(azrw azrwVar) {
        return new wzt(azrwVar, 15);
    }

    public static wzt x(azrw azrwVar) {
        return new wzt(azrwVar, 16);
    }

    public static wzt y(azrw azrwVar) {
        return new wzt(azrwVar, 17);
    }

    public static wzt z(azrw azrwVar) {
        return new wzt(azrwVar, 18);
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        switch (this.b) {
            case 0:
                return a(this.a);
            case 1:
                return new wzq((wng) this.a.get());
            case 2:
                return new xbo((xlj) this.a.get());
            case 3:
                return new xhb(this.a);
            case 4:
                return new xhd(this.a);
            case 5:
                return new xhp((aloh) this.a.get(), null, null, null);
            case 6:
                return new xli(this.a);
            case 7:
                return new xlt((xcl) this.a.get());
            case 8:
                return c(((b) this.a).get());
            case 9:
                Context context = (Context) ((axqs) this.a).a;
                qmy qmyVar = qmy.a;
                return Integer.valueOf(qnm.a(context));
            case 10:
                return new ajoy(this.a, (char[]) null, (short[]) null);
            case 11:
                return new yla(((axqo) this.a).a);
            case 12:
                return caj.h((Context) ((axqs) this.a).a);
            case 13:
                return Integer.valueOf(yjk.j((yxx) this.a.get()));
            case 14:
                return false;
            case 15:
                return d((Executor) this.a.get());
            case 16:
                return e((Executor) this.a.get());
            case 17:
                return f((Context) ((axqs) this.a).a);
            case 18:
                return new ymt((Executor) this.a.get());
            case 19:
                return g(((yto) this.a).get());
            default:
                return h((shf) this.a.get());
        }
    }
}
