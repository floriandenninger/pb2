package defpackage;

import android.app.Activity;
import android.net.Uri;
import java.util.Calendar;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class icg implements icp {
    public static final amrz c;
    public final Activity d;
    public final ica e;
    public final icq f;
    public final acqz g;
    public final iax h;
    public axcb i = axcb.DAY_OF_WEEK_NORMAL;
    public final wcy j;
    private final Executor l;
    public static final axcb a = axcb.DAY_OF_WEEK_NORMAL;
    public static final amsx b = amsx.s(axcb.DAY_OF_WEEK_NORMAL, axcb.DAY_OF_WEEK_LIGHT);
    private static final amrz k = amrz.l(axcb.DAY_OF_WEEK_NORMAL, "", axcb.DAY_OF_WEEK_LIGHT, "_secondary");

    static {
        amrw h = amrz.h();
        h.g(1, "sunday");
        h.g(2, "monday");
        h.g(3, "tuesday");
        h.g(4, "wednesday");
        h.g(5, "thursday");
        h.g(6, "friday");
        h.g(7, "saturday");
        c = h.c();
    }

    public icg(Activity activity, ica icaVar, wcy wcyVar, Executor executor, icq icqVar, acqz acqzVar, iax iaxVar, byte[] bArr, byte[] bArr2) {
        this.d = activity;
        this.e = icaVar;
        this.j = wcyVar;
        this.l = executor;
        this.f = icqVar;
        this.g = acqzVar;
        this.h = iaxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.icp
    public final void a(final axcg axcgVar) {
        axbz axbzVar;
        final ammv ammvVar;
        axdi i = axcgVar.c().i();
        if (i.c == 12) {
            axbzVar = (axbz) i.d;
        } else {
            axbzVar = axbz.a;
        }
        if ((axbzVar.b & 2) != 0) {
            axca axcaVar = axbzVar.d;
            if (axcaVar == null) {
                axcaVar = axca.b;
            }
            aonw aonwVar = new aonw(axcaVar.e, axca.a);
            axcb b2 = axcb.b(axcaVar.d);
            if (b2 == null) {
                b2 = axcb.DAY_OF_WEEK_STYLE_UNSPECIFIED;
            }
            this.i = (axcb) aonwVar.get((aonwVar.indexOf(b2) + 1) % aonwVar.size());
            String str = (String) c.get(Integer.valueOf(Calendar.getInstance().get(7)));
            String str2 = (String) k.get(this.i);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 77 + String.valueOf(str2).length());
            sb.append("https://www.gstatic.com/youtube/kazoo/server/assets/stickers/day_of_week_");
            sb.append(str);
            sb.append(str2);
            sb.append(".png");
            ammvVar = ammv.j(Uri.parse(sb.toString()));
        } else {
            ammvVar = amlr.a;
        }
        if (!ammvVar.h()) {
            afsi.b(2, 24, "VideoFX: Day of week sticker added without valid uri");
            this.f.aT(axcgVar.toBuilder());
        } else {
            this.g.mM().I(3, new acqx(acsb.c(65452)), null);
            this.l.execute(new Runnable() { // from class: ice
                @Override // java.lang.Runnable
                public final void run() {
                    icg icgVar = icg.this;
                    icgVar.e.a((Uri) ammvVar.c(), new icf(icgVar, axcgVar));
                }
            });
        }
    }

    @Override // defpackage.icp
    public final void my(axdk axdkVar) {
    }
}
