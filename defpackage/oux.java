package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.HandlerThread;
import android.provider.Settings;
import com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service.f;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.b;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.g;
import com.google.android.apps.youtube.embeddedplayer.service.userinfo.service.a;
import com.google.android.apps.youtube.embeddedplayer.service.userinfo.service.d;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oux implements axqr {
    private final azrw a;
    private final azrw b;
    private final /* synthetic */ int c;

    public oux(azrw azrwVar, azrw azrwVar2, int i) {
        this.c = i;
        this.a = azrwVar;
        this.b = azrwVar2;
    }

    public oux(azrw azrwVar, azrw azrwVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public oux(azrw azrwVar, azrw azrwVar2, int i, char[] cArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public oux(azrw azrwVar, azrw azrwVar2, int i, float[] fArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public oux(azrw azrwVar, azrw azrwVar2, int i, int[] iArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public oux(azrw azrwVar, azrw azrwVar2, int i, short[] sArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public oux(azrw azrwVar, azrw azrwVar2, int i, boolean[] zArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public oux(azrw azrwVar, azrw azrwVar2, int i, byte[][] bArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public oux(azrw azrwVar, azrw azrwVar2, int i, char[][] cArr) {
        this.c = i;
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public static tdv a(tdq tdqVar, wne wneVar) {
        return new tdv(tdqVar, wneVar);
    }

    public static wco b(ammv ammvVar, azrw azrwVar) {
        wco wcoVar;
        if (ammvVar.h()) {
            wcoVar = (wco) ammvVar.c();
        } else {
            wcoVar = (wco) azrwVar.get();
        }
        ayaw.k(wcoVar);
        return wcoVar;
    }

    public static wki c(ammv ammvVar, azrw azrwVar) {
        wki wkiVar;
        if (ammvVar.h()) {
            wkiVar = (wki) ammvVar.c();
        } else {
            wkiVar = (wki) azrwVar.get();
        }
        ayaw.k(wkiVar);
        return wkiVar;
    }

    public static afvb d(Context context, afqb afqbVar) {
        return new afvn(context, afqbVar);
    }

    public static afxf e(xbt xbtVar, xbo xboVar) {
        afxf afxfVar = new afxf(xbtVar);
        afxfVar.e(xboVar);
        afxfVar.f(xbr.b);
        afxfVar.f(aiqp.b);
        return afxfVar;
    }

    public static wsh f(azrw azrwVar, azrw azrwVar2) {
        return new wsh(azrwVar, azrwVar2, 0);
    }

    public static oux g(azrw azrwVar, azrw azrwVar2) {
        return new oux(azrwVar, azrwVar2, 2);
    }

    public static oux h(azrw azrwVar, azrw azrwVar2) {
        return new oux(azrwVar, azrwVar2, 3);
    }

    public static oux i(azrw azrwVar, azrw azrwVar2) {
        return new oux(azrwVar, azrwVar2, 7);
    }

    public static oux j(azrw azrwVar, azrw azrwVar2) {
        return new oux(azrwVar, azrwVar2, 16, (byte[][]) null);
    }

    public static oux k(azrw azrwVar, azrw azrwVar2) {
        return new oux(azrwVar, azrwVar2, 17, (char[][]) null);
    }

    public static oux l(azrw azrwVar, azrw azrwVar2) {
        return new oux(azrwVar, azrwVar2, 18);
    }

    public static agdo m(azrw azrwVar, azrw azrwVar2) {
        return new agdo(azrwVar, azrwVar2, 1);
    }

    public static oux n(azrw azrwVar, azrw azrwVar2) {
        return new oux(azrwVar, azrwVar2, 19);
    }

    public static oux o(azrw azrwVar, azrw azrwVar2) {
        return new oux(azrwVar, azrwVar2, 20);
    }

    public static woy p(whu whuVar, woz wozVar) {
        return new woy(wozVar);
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        switch (this.c) {
            case 0:
                return new out((f) this.a.get(), true, (String) this.b.get());
            case 1:
                return new out((f) this.a.get(), false, (String) this.b.get());
            case 2:
                return new b((g) this.a.get(), (Executor) this.b.get());
            case 3:
                return new com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.f(this.a, ((zgk) this.b).get());
            case 4:
                return new a((SharedPreferences) this.b.get(), (f) this.a.get());
            case 5:
                return new d((SharedPreferences) this.b.get(), (f) this.a.get());
            case 6:
                skr skrVar = new skr((Context) ((axqs) this.b).a, ((skn) this.a).get(), null);
                HandlerThread handlerThread = new HandlerThread("CheckboxObserverThread");
                handlerThread.start();
                skq skqVar = new skq(skrVar, new amcc(handlerThread.getLooper(), (byte[]) null));
                skrVar.a.getContentResolver().registerContentObserver(Settings.Global.getUriFor("multi_cb"), false, skqVar);
                return skrVar;
            case 7:
                return a((tdq) this.a.get(), ((wnf) this.b).get());
            case 8:
                return new tsy();
            case 9:
                Context context = ((trq) this.a).get();
                ammv ammvVar = (ammv) this.b.get();
                vda a = vdb.a(context);
                a.e("mdd_pds_config");
                a.f(rwh.aX("DestFileGroups", ammvVar));
                Uri a2 = a.a();
                ayaw.k(a2);
                return a2;
            case 10:
                Context context2 = ((trq) this.a).get();
                ammv ammvVar2 = (ammv) this.b.get();
                vda a3 = vdb.a(context2);
                a3.e("mdd_pds_config");
                a3.f(rwh.aX("DiagFileGroups", ammvVar2));
                Uri a4 = a3.a();
                ayaw.k(a4);
                return a4;
            case 11:
                Context context3 = ((trq) this.a).get();
                ammv ammvVar3 = (ammv) this.b.get();
                vda a5 = vdb.a(context3);
                a5.e("mdd_pds_config");
                a5.f(rwh.aX("DestSharedFiles", ammvVar3));
                Uri a6 = a5.a();
                ayaw.k(a6);
                return a6;
            case 12:
                Context context4 = ((trq) this.a).get();
                ammv ammvVar4 = (ammv) this.b.get();
                vda a7 = vdb.a(context4);
                a7.e("mdd_pds_config");
                a7.f(rwh.aX("DiagSharedFiles", ammvVar4));
                Uri a8 = a7.a();
                ayaw.k(a8);
                return a8;
            case 13:
                return b((ammv) ((axqs) this.b).a, this.a);
            case 14:
                return c((ammv) ((axqs) this.a).a, this.b);
            case 15:
                return d((Context) ((axqs) this.b).a, (afqb) this.a.get());
            case 16:
                return e((xbt) this.b.get(), (xbo) this.a.get());
            case 17:
                return p((whu) this.b.get(), ((wpa) this.a).get());
            case 18:
                aahd aahdVar = (aahd) this.a.get();
                return new wpl(aahdVar);
            case 19:
                return m(this.a, this.b);
            default:
                return f(this.a, this.b);
        }
    }
}
