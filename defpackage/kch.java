package defpackage;

import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kch implements azrw {
    private final dd a;
    private kcz b;

    public kch(dd ddVar) {
        this.a = ddVar;
    }

    @Override // defpackage.azrw
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final flj get() {
        kcz kczVar = this.b;
        if (kczVar != null) {
            return kczVar;
        }
        kcz kczVar2 = (kcz) this.a.f("PlayerFragment");
        if (kczVar2 == null) {
            this.b = new kcz();
            dn k = this.a.k();
            k.q(R.id.player_fragment_container, this.b, "PlayerFragment");
            k.a();
        } else {
            this.b = kczVar2;
        }
        return this.b;
    }
}
