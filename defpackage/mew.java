package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mew implements wmy, wnb {
    private final axpg a;
    private final ajdw b;
    private final aabq c;
    private ashd d;
    private ViewGroup e;
    private awos f;
    private boolean g;
    private ajds h;

    public mew(ajdw ajdwVar, axpg axpgVar, aabq aabqVar) {
        this.a = axpgVar;
        this.b = ajdwVar;
        this.c = aabqVar;
    }

    private final void b(View view) {
        if (view != null) {
            ViewGroup viewGroup = (ViewGroup) whu.z(view, R.id.element_companion_card_stub, R.id.element_companion_card);
            viewGroup.setVisibility(8);
            viewGroup.removeAllViews();
        }
        ViewGroup viewGroup2 = this.e;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
            this.e.setVisibility(8);
            this.b.b(null);
            this.b.a().setVisibility(8);
        }
    }

    private final void c() {
        ViewGroup viewGroup = this.e;
        if (viewGroup != null) {
            viewGroup.setVisibility(true != this.g ? 8 : 0);
            this.b.a().setVisibility(true == this.g ? 0 : 8);
        }
    }

    private final boolean j(aqrf aqrfVar) {
        if (aqrfVar == null) {
            return false;
        }
        ajds a = ajds.a(aqrfVar);
        byte[] bArr = a.b;
        if (bArr != null) {
            try {
                this.f = (awos) aonm.parseFrom(awos.a, bArr, aomw.b());
                this.h = a;
                return true;
            } catch (aoob unused) {
            }
        }
        return false;
    }

    @Override // defpackage.wmz
    public final void a() {
        c();
    }

    @Override // defpackage.wmz
    public final void d(View view, ajok ajokVar) {
        ViewGroup viewGroup = this.e;
        if (viewGroup == null || viewGroup.getParent() != view) {
            b(view);
            ViewGroup viewGroup2 = (ViewGroup) whu.z(view, R.id.element_companion_card_stub, R.id.element_companion_card);
            this.e = viewGroup2;
            viewGroup2.addView(this.b.a());
        }
        c();
        if (this.d != null) {
            aone createBuilder = asht.a.createBuilder();
            ashd ashdVar = this.d;
            createBuilder.copyOnWrite();
            asht ashtVar = (asht) createBuilder.instance;
            ashdVar.getClass();
            ashtVar.t = ashdVar;
            ashtVar.c |= 1024;
            ajokVar.c = (asht) createBuilder.build();
        }
        this.b.oB(ajokVar, this.h);
    }

    @Override // defpackage.wmz
    public final void e(View view) {
        b(view);
        this.d = null;
        this.e = null;
        this.h = null;
        this.g = false;
    }

    @Override // defpackage.wmz
    public final void f() {
        this.g = true;
        c();
    }

    @Override // defpackage.wmy
    public final boolean g(String str, PlayerResponseModel playerResponseModel, ashd ashdVar) {
        this.d = ashdVar;
        aqrf aqrfVar = null;
        aryr aryrVar = playerResponseModel != null ? playerResponseModel.a : null;
        if (aryrVar != null) {
            atyh atyhVar = aryrVar.A;
            if (atyhVar == null) {
                atyhVar = atyh.a;
            }
            if (atyhVar.b == 153515154) {
                atyh atyhVar2 = aryrVar.A;
                if (atyhVar2 == null) {
                    atyhVar2 = atyh.a;
                }
                if (atyhVar2.b == 153515154) {
                    aqrfVar = (aqrf) atyhVar2.c;
                } else {
                    aqrfVar = aqrf.a;
                }
            }
        }
        return j(aqrfVar);
    }

    @Override // defpackage.wmz
    public final void h(xad xadVar) {
        awos awosVar;
        aabq aabqVar;
        if (xadVar.a() != xce.USER_SKIPPED || (awosVar = this.f) == null) {
            return;
        }
        awqd awqdVar = awosVar.c;
        if (awqdVar == null) {
            awqdVar = awqd.a;
        }
        awog awogVar = ((awob) awqdVar.pX(awob.b)).e;
        if (awogVar == null) {
            awogVar = awog.a;
        }
        if (!awogVar.pY(awqw.b) || (aabqVar = this.c) == null) {
            return;
        }
        aabqVar.b();
    }

    @Override // defpackage.wnb
    public final boolean i(String str, aqde aqdeVar, ashd ashdVar) {
        aqrf aqrfVar;
        this.d = ashdVar;
        if ((aqdeVar.b & 32) != 0) {
            aqrfVar = aqdeVar.h;
            if (aqrfVar == null) {
                aqrfVar = aqrf.a;
            }
        } else {
            aqrfVar = null;
        }
        return j(aqrfVar);
    }
}
