package defpackage;

import android.view.View;
import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class lin implements zfi {
    public final /* synthetic */ lio a;
    private final /* synthetic */ int b;

    public /* synthetic */ lin(lio lioVar, int i) {
        this.b = i;
        this.a = lioVar;
    }

    @Override // defpackage.zfi
    public final void a(Object obj) {
        int i;
        String displayName;
        auqc auqcVar;
        int i2 = this.b;
        if (i2 == 0) {
            lio lioVar = this.a;
            if (((Boolean) obj).booleanValue()) {
                return;
            }
            lioVar.h.g(lioVar.e.getRootView());
            akci a = akcj.a();
            a.b = lioVar.e.getResources().getString(R.string.select_voice_language_promo);
            a.a = lioVar.f;
            a.h(0.6f);
            lioVar.h.c(a.a());
            ynm.n(lioVar.a, lioVar.g.x.l(), jnh.o, jnh.p);
            return;
        }
        if (i2 != 1) {
            lio lioVar2 = this.a;
            String valueOf = String.valueOf(((Throwable) obj).getLocalizedMessage());
            if (valueOf.length() != 0) {
                "Error when creating the voice button: ".concat(valueOf);
            }
            lioVar2.e.setVisibility(8);
            return;
        }
        final lio lioVar3 = this.a;
        liw liwVar = (liw) obj;
        lioVar3.i = liwVar.b;
        auqe auqeVar = lioVar3.i;
        String str = liwVar.a;
        Iterator it = auqeVar.e.iterator();
        loop0: while (true) {
            i = 0;
            if (it.hasNext()) {
                for (auqd auqdVar : ((auqk) it.next()).c) {
                    if (auqdVar.b == 64166933) {
                        auqcVar = (auqc) auqdVar.c;
                    } else {
                        auqcVar = auqc.a;
                    }
                    if (amkq.e(auqcVar.e, str)) {
                        displayName = auqcVar.c;
                        break loop0;
                    }
                }
            } else {
                List h = amnm.b('-').h(str);
                displayName = new Locale((String) h.get(0), amkq.d((String) h.get(1))).getDisplayName();
                break;
            }
        }
        lioVar3.d.setText(displayName);
        lioVar3.e.setVisibility(0);
        lioVar3.e.setOnClickListener(new View.OnClickListener() { // from class: lim
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lio lioVar4 = lio.this;
                ljn ljnVar = lioVar4.g;
                ljnVar.l();
                ljnVar.c.h();
                liv aH = liv.aH(lioVar4.i, lioVar4.b);
                lioVar4.b.I(3, new acqx(acsb.c(95983)), null);
                dn k = lioVar4.c.k();
                k.r(aH, "VOICE_LANGUAGE_SELECTOR_FRAGMENT");
                k.a();
            }
        });
        lioVar3.b.n(new acqx(acsb.c(95983)));
        ynm.n(lioVar3.a, lioVar3.g.x.j(), jnh.e, new lin(lioVar3, i));
    }
}
