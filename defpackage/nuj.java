package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nuj extends nsp {
    public final azrh n;
    public final aahv o;
    public ammv p;
    public final ayqw q;
    public boolean r;

    public nuj(Context context, aahv aahvVar, acra acraVar) {
        super(context, acraVar);
        this.o = aahvVar;
        this.p = amlr.a;
        this.l = amlr.a;
        this.q = new ayqw();
        this.n = azrh.aN(true);
    }

    @Override // defpackage.lo
    public final void c(RecyclerView recyclerView, int i, int i2) {
        if (this.b && ((Boolean) this.n.aO()).booleanValue() && !this.r) {
            r(false);
            n(this.a.getString(R.string.sync_to_video));
        }
    }

    @Override // defpackage.nsp
    protected final void k() {
        if (this.d != null) {
            return;
        }
        this.d = (FrameLayout) LayoutInflater.from(this.a).inflate(R.layout.sync_button, (ViewGroup) this.e, false).findViewById(R.id.sync_button);
        q();
        this.f = (TextView) this.d.findViewById(R.id.sync_text);
        this.f.setOnClickListener(new View.OnClickListener() { // from class: nuh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nuj nujVar = nuj.this;
                nujVar.r(true);
                nujVar.f.startAnimation(nujVar.g);
                if (nujVar.l.h()) {
                    nujVar.k.I(3, (acsa) nujVar.l.c(), null);
                }
            }
        });
    }

    @Override // defpackage.nsp
    public final void p() {
        super.p();
        r(true);
        this.q.c();
        this.r = false;
    }

    public final void r(boolean z) {
        this.n.c(Boolean.valueOf(z));
        if (this.p.h()) {
            aone createBuilder = aqua.a.createBuilder();
            alwe b = alwf.b();
            b.d(7);
            alwi b2 = b.b();
            createBuilder.copyOnWrite();
            aqua aquaVar = (aqua) createBuilder.instance;
            b2.getClass();
            aquaVar.d = b2;
            aquaVar.b |= 2;
            aone createBuilder2 = aqtz.a.createBuilder();
            createBuilder2.copyOnWrite();
            aqtz aqtzVar = (aqtz) createBuilder2.instance;
            aqtzVar.c = 1;
            aqtzVar.b |= 1;
            aqtz aqtzVar2 = (aqtz) createBuilder2.build();
            createBuilder.copyOnWrite();
            aqua aquaVar2 = (aqua) createBuilder.instance;
            aqtzVar2.getClass();
            aquaVar2.c = aqtzVar2;
            aquaVar2.b |= 1;
            aqua aquaVar3 = (aqua) createBuilder.build();
            aaio c = ((aaih) this.o.c()).c();
            String str = (String) this.p.c();
            asyp d = asyq.d((String) this.p.c());
            d.b(z ? asyu.SYNC_MODE_SYNCED_WITH_VIDEO : asyu.SYNC_MODE_USER_BROWSING);
            c.i(str, aquaVar3, d.c().c());
            c.b().S(ggc.j, nua.c);
        }
    }
}
