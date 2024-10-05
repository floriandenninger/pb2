package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* compiled from: PG */
@wyr(b = apae.SLOT_TYPE_BELOW_PLAYER, c = {xdl.class})
/* loaded from: classes3.dex */
public final class eks extends ekv implements won {
    public ViewGroup a;
    public ajok b;
    private int e;
    private final aoae f;

    public eks(aoae aoaeVar, ekk ekkVar, wsw wswVar, xgh xghVar, xev xevVar, aqrf aqrfVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(ekkVar, wswVar, xghVar, xevVar, aqrfVar, null, null);
        this.f = aoaeVar;
        this.c = new eku() { // from class: ekr
            @Override // defpackage.eku
            public final ViewGroup a() {
                return eks.this.a;
            }
        };
        this.d = new ekt() { // from class: ekq
            @Override // defpackage.ekt
            public final ajok a() {
                return eks.this.b;
            }
        };
    }

    private final void h(View view) {
        this.a = view == null ? null : (ViewGroup) whu.z(view, R.id.element_companion_card_stub, R.id.element_companion_card);
    }

    @Override // defpackage.ekv, defpackage.wsx
    public final void b() {
        this.f.r(this);
    }

    @Override // defpackage.won
    public final void f() {
        h(null);
        this.b = null;
    }

    @Override // defpackage.won
    public final void g(View view, ajok ajokVar) {
        h(view);
        this.b = ajokVar;
        if (this.e == 1) {
            this.e = 2;
            super.qu();
        }
    }

    @Override // defpackage.ekv, defpackage.wsx
    public final void qt() {
        this.f.b.remove(this);
    }

    @Override // defpackage.ekv, defpackage.wsx
    public final void qu() {
        this.e = 1;
        if (this.a != null) {
            this.e = 2;
            super.qu();
        }
    }

    @Override // defpackage.ekv, defpackage.wsx
    public final void qv(int i) {
        this.e = 0;
        super.qv(i);
    }
}
