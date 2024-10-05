package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import android.view.View;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.feedback.FeedbackOptions;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class qob implements qog {
    public final qox A;
    public final Looper B;
    public final int C;
    public final qof D;
    protected final qpy E;
    private final qqy a;
    public final Context w;
    public final String x;
    public final qnw y;
    public final qnu z;

    public qob(Context context, Activity activity, qnw qnwVar, qnu qnuVar, qoa qoaVar) {
        qip.az(context, "Null context is not permitted.");
        qip.az(qnwVar, "Api must not be null.");
        qip.az(qoaVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.w = context.getApplicationContext();
        String str = null;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.x = str;
        this.y = qnwVar;
        this.z = qnuVar;
        this.B = qoaVar.c;
        qox qoxVar = new qox(qnwVar, qnuVar, str);
        this.A = qoxVar;
        this.D = new qpz(this);
        qpy c = qpy.c(this.w);
        this.E = c;
        this.C = c.j.getAndIncrement();
        this.a = qoaVar.b;
        if (activity != null && Looper.myLooper() == Looper.getMainLooper()) {
            qqf m = qpn.m(activity);
            qpn qpnVar = (qpn) m.b("ConnectionlessLifecycleHelper", qpn.class);
            qpnVar = qpnVar == null ? new qpn(m, c) : qpnVar;
            qpnVar.d.add(qoxVar);
            c.g(qpnVar);
        }
        Handler handler = c.o;
        handler.sendMessage(handler.obtainMessage(7, this));
    }

    private final rpt a(int i, qre qreVar) {
        rpv rpvVar = new rpv();
        qpy qpyVar = this.E;
        qqy qqyVar = this.a;
        qpyVar.d(rpvVar, qreVar.d, this);
        qou qouVar = new qou(i, qreVar, rpvVar, qqyVar);
        Handler handler = qpyVar.o;
        handler.sendMessage(handler.obtainMessage(4, new qqq(qouVar, qpyVar.k.get(), this)));
        return rpvVar.a;
    }

    public static Bitmap y(View view) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            view.draw(new Canvas(createBitmap));
            return createBitmap;
        } catch (Error | Exception e) {
            Log.w("gF_FeedbackClient", "Get screenshot failed!", e);
            return null;
        }
    }

    public final void A(FeedbackOptions feedbackOptions) {
        qar.i(qwj.d(this.D, feedbackOptions));
    }

    public final rpt B() {
        qrd b = qre.b();
        b.a = new qqu() { // from class: rao
            @Override // defpackage.qqu
            public final void a(Object obj, Object obj2) {
                Location location;
                rbq rbqVar = (rbq) obj;
                String str = qob.this.x;
                Feature[] y = rbqVar.y();
                if (y != null && oba.aj(y, ram.c)) {
                    rbp rbpVar = rbqVar.b;
                    rbpVar.e.a();
                    rbm b2 = rbpVar.e.b();
                    Parcel pn = b2.pn();
                    pn.writeString(str);
                    Parcel po = b2.po(80, pn);
                    location = (Location) ecr.a(po, Location.CREATOR);
                    po.recycle();
                } else {
                    rbp rbpVar2 = rbqVar.b;
                    rbpVar2.e.a();
                    rbm b3 = rbpVar2.e.b();
                    Parcel po2 = b3.po(7, b3.pn());
                    location = (Location) ecr.a(po2, Location.CREATOR);
                    po2.recycle();
                }
                ((rpv) obj2).b(location);
            }
        };
        b.c = 2414;
        return t(b.a());
    }

    public final void C(rbd rbdVar) {
        v(qar.q(rbdVar, rbd.class.getSimpleName()), 0).a(new qrf());
    }

    public final rpt D(String str) {
        qrd b = qre.b();
        b.a = new rnv(str, 2);
        return t(b.a());
    }

    public final rpt E(String str, String str2) {
        qrd b = qre.b();
        b.a = new rnw(str, str2, 1);
        return t(b.a());
    }

    @Override // defpackage.qog
    public final qox p() {
        return this.A;
    }

    public final qql q(Object obj, String str) {
        return qar.r(obj, this.B, str);
    }

    public final qry r() {
        Set emptySet;
        GoogleSignInAccount a;
        qry qryVar = new qry();
        qnu qnuVar = this.z;
        Account account = null;
        if (!(qnuVar instanceof qns) || (a = ((qns) qnuVar).a()) == null) {
            qnu qnuVar2 = this.z;
            if (qnuVar2 instanceof qnr) {
                account = ((qnr) qnuVar2).a();
            }
        } else {
            String str = a.d;
            if (str != null) {
                account = new Account(str, "com.google");
            }
        }
        qryVar.a = account;
        qnu qnuVar3 = this.z;
        if (qnuVar3 instanceof qns) {
            GoogleSignInAccount a2 = ((qns) qnuVar3).a();
            if (a2 == null) {
                emptySet = Collections.emptySet();
            } else {
                emptySet = a2.a();
            }
        } else {
            emptySet = Collections.emptySet();
        }
        if (qryVar.b == null) {
            qryVar.b = new aeb();
        }
        qryVar.b.addAll(emptySet);
        qryVar.d = this.w.getClass().getName();
        qryVar.c = this.w.getPackageName();
        return qryVar;
    }

    public final rpt s(qre qreVar) {
        return a(2, qreVar);
    }

    public final rpt t(qre qreVar) {
        return a(0, qreVar);
    }

    public final rpt u(qqt qqtVar) {
        qip.az(qqtVar.a.a(), "Listener has already been released.");
        qpy qpyVar = this.E;
        qqr qqrVar = qqtVar.a;
        qrh qrhVar = qqtVar.b;
        Runnable runnable = qqtVar.c;
        rpv rpvVar = new rpv();
        qpyVar.d(rpvVar, qqrVar.c, this);
        qot qotVar = new qot(new qqt(qqrVar, qrhVar, runnable, null), rpvVar, null);
        Handler handler = qpyVar.o;
        handler.sendMessage(handler.obtainMessage(8, new qqq(qotVar, qpyVar.k.get(), this)));
        return rpvVar.a;
    }

    public final rpt v(qqj qqjVar, int i) {
        qpy qpyVar = this.E;
        rpv rpvVar = new rpv();
        qpyVar.d(rpvVar, i, this);
        qov qovVar = new qov(qqjVar, rpvVar);
        Handler handler = qpyVar.o;
        handler.sendMessage(handler.obtainMessage(13, new qqq(qovVar, qpyVar.k.get(), this)));
        return rpvVar.a;
    }

    public final rpt w(qre qreVar) {
        return a(1, qreVar);
    }

    public final void x(int i, qpb qpbVar) {
        boolean z = true;
        if (!qpbVar.i && !((Boolean) BasePendingResult.e.get()).booleanValue()) {
            z = false;
        }
        qpbVar.i = z;
        qpy qpyVar = this.E;
        qos qosVar = new qos(i, qpbVar);
        Handler handler = qpyVar.o;
        handler.sendMessage(handler.obtainMessage(4, new qqq(qosVar, qpyVar.k.get(), this)));
    }

    public final void z(FeedbackOptions feedbackOptions) {
        qar.i(qwj.c(this.D, feedbackOptions));
    }

    public qob(Context context, qnw qnwVar, qnu qnuVar, qoa qoaVar) {
        this(context, null, qnwVar, qnuVar, qoaVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public qob(android.content.Context r2, defpackage.qnw r3, defpackage.qnu r4, defpackage.qqy r5) {
        /*
            r1 = this;
            qnz r0 = new qnz
            r0.<init>()
            r0.b(r5)
            qoa r5 = r0.a()
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qob.<init>(android.content.Context, qnw, qnu, qqy):void");
    }

    public qob(Context context) {
        this(context, qwj.b, qnu.f, qoa.a);
        rse.b(context.getApplicationContext());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public qob(android.content.Context r6, byte[] r7) {
        /*
            r5 = this;
            qnw r7 = defpackage.anty.a
            qnt r0 = defpackage.qnu.f
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            ante r2 = new ante
            r3 = 0
            r2.<init>(r3)
            qnz r3 = new qnz
            r3.<init>()
            java.lang.String r4 = "Looper must not be null."
            defpackage.qip.az(r1, r4)
            r3.a = r1
            r3.b(r2)
            qoa r1 = r3.a()
            r5.<init>(r6, r7, r0, r1)
            defpackage.uvr.e(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qob.<init>(android.content.Context, byte[]):void");
    }
}
