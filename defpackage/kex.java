package defpackage;

import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kex {
    public final adlt a;
    public final kem b;
    public ahwv c;
    private final ci d;
    private final ywr e;

    public kex(ci ciVar, ywr ywrVar, adlt adltVar) {
        this.d = ciVar;
        ywrVar.getClass();
        this.e = ywrVar;
        adltVar.getClass();
        this.a = adltVar;
        kem kemVar = new kem(ciVar.getResources().getString(R.string.setting_nerd_stats), new kew(this));
        this.b = kemVar;
        kemVar.e = aii.a(ciVar, R.drawable.ic_overflow_nerd_stats);
    }

    public final void a() {
        final int i = 0;
        final int i2 = 1;
        ynm.n(this.d, this.e.a(), new zfi(this) { // from class: kev
            public final /* synthetic */ kex a;

            {
                this.a = this;
            }

            @Override // defpackage.zfi
            public final void a(Object obj) {
                if (i == 0) {
                    kex kexVar = this.a;
                    zga.d("Error getting player feature settings.", (Throwable) obj);
                    kexVar.b.g(false);
                } else {
                    kex kexVar2 = this.a;
                    awwk awwkVar = (awwk) obj;
                    if (awwkVar != null) {
                        kexVar2.b.g(awwkVar.d);
                    }
                }
            }
        }, new zfi(this) { // from class: kev
            public final /* synthetic */ kex a;

            {
                this.a = this;
            }

            @Override // defpackage.zfi
            public final void a(Object obj) {
                if (i2 == 0) {
                    kex kexVar = this.a;
                    zga.d("Error getting player feature settings.", (Throwable) obj);
                    kexVar.b.g(false);
                } else {
                    kex kexVar2 = this.a;
                    awwk awwkVar = (awwk) obj;
                    if (awwkVar != null) {
                        kexVar2.b.g(awwkVar.d);
                    }
                }
            }
        });
    }
}
