package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;
import com.google.android.libraries.elements.interfaces.DebuggerClient;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sox {
    public static final sqr a;
    public static final Handler b;

    static {
        aoaj aoajVar = new aoaj();
        aoaj aoajVar2 = new aoaj();
        int i = axoq.d;
        aoajVar2.p(1);
        aoajVar2.k(aoajVar2.c());
        aoajVar.k(aoam.L(aoajVar, aoam.R(aoajVar, 158796327, aoajVar.a(aoajVar2.f().array()), 1), 0, 0, 0));
        a = sqr.a(aoam.au(aoajVar.f()), null);
        b = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dha a(dhe dheVar, spy spyVar, ayqw ayqwVar, sow sowVar, aypy aypyVar, sxc sxcVar, syd sydVar, szh szhVar, boolean z, boolean z2) {
        dha a2;
        if (spyVar.g != aypyVar) {
            if (sowVar != null && (a2 = spyVar.a()) != null) {
                spx spxVar = spyVar.f;
                sow sowVar2 = spxVar != null ? spxVar.a : null;
                if (sowVar2 != null && !spyVar.e() && sowVar.equals(sowVar2)) {
                    return a2.j();
                }
            }
            spyVar.qc();
        }
        if (spyVar.e()) {
            e(spyVar, dheVar, sxcVar, sowVar, aypyVar, sydVar, z, z2);
            ayqwVar.d(spyVar);
        } else {
            spyVar.d(dheVar);
        }
        dha a3 = spyVar.a();
        if (a3 == null) {
            szhVar.e(true);
            return drd.a(dheVar).a;
        }
        szhVar.e(false);
        return a3.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(sxc sxcVar, sow sowVar, azrw azrwVar, azrw azrwVar2) {
        if (((sxe) azrwVar2.get()).b()) {
            awsl a2 = awsm.a();
            awsn e = svv.e(sxcVar);
            a2.copyOnWrite();
            ((awsm) a2.instance).e(e);
            String c = sot.c(sowVar.a.aJ());
            a2.copyOnWrite();
            ((awsm) a2.instance).f(c);
            awsm awsmVar = (awsm) a2.build();
            DebuggerClient debuggerClient = (DebuggerClient) azrwVar.get();
            awsv a3 = awsw.a();
            aoqa d = svv.d();
            a3.copyOnWrite();
            ((awsw) a3.instance).p(d);
            a3.copyOnWrite();
            ((awsw) a3.instance).l(awsmVar);
            debuggerClient.sendTimelineEvent(((awsw) a3.build()).toByteArray());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(dhe dheVar, baql baqlVar, sxt sxtVar, ayqw ayqwVar, sxk sxkVar, sow sowVar, aypy aypyVar, sxc sxcVar, syd sydVar, boolean z, boolean z2) {
        spy spyVar = new spy(sydVar, sxtVar, sxcVar, sxkVar, ayqwVar);
        baqlVar.a = spyVar;
        e(spyVar, dheVar, sxcVar, sowVar, aypyVar, sydVar, z, z2);
        ayqwVar.d(spyVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(baql baqlVar) {
        Integer num = (Integer) baqlVar.a;
        baqlVar.a = Integer.valueOf((num == null ? 0 : num.intValue()) + 1);
    }

    private static void e(spy spyVar, final dhe dheVar, final sxc sxcVar, sow sowVar, aypy aypyVar, final syd sydVar, final boolean z, final boolean z2) {
        spyVar.f(aypyVar, aypyVar.ac(new ayrv() { // from class: sou
            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                syd sydVar2 = syd.this;
                sxc sxcVar2 = sxcVar;
                boolean z3 = z2;
                final dhe dheVar2 = dheVar;
                boolean z4 = z;
                final Throwable th = (Throwable) obj;
                sqr sqrVar = sox.a;
                sydVar2.a(29, "Error materializing Component", sxcVar2, th);
                if (z3) {
                    sox.b.post(new Runnable() { // from class: sov
                        @Override // java.lang.Runnable
                        public final void run() {
                            dhe dheVar3 = dhe.this;
                            Throwable th2 = th;
                            sqr sqrVar2 = sox.a;
                            Context a2 = dheVar3.a();
                            String valueOf = String.valueOf(th2.getMessage());
                            Toast.makeText(a2, valueOf.length() != 0 ? "Elements Error (check settings):\n".concat(valueOf) : new String("Elements Error (check settings):\n"), 1).show();
                        }
                    });
                } else if (z4) {
                    Log.e("Elements DEBUG", "NOT A PRODUCTION CRASH BELOW. Review ElementsException message for details");
                    throw azqi.b(th);
                }
                return sox.a;
            }
        }), sxcVar, dheVar, sowVar);
        spyVar.c();
    }
}
