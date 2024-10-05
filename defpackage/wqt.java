package defpackage;

/* compiled from: PG */
@wyr(b = apae.SLOT_TYPE_FIXED_FOOTER, d = {xdw.class})
/* loaded from: classes4.dex */
public final class wqt extends wqz {
    public final wyn a;

    public wqt(wrd wrdVar, wyn wynVar) {
        super(wrdVar);
        this.a = wynVar;
    }

    @Override // defpackage.wqz
    public final void a() {
        this.d.c(new amml() { // from class: wqs
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                wqt wqtVar = wqt.this;
                xgh xghVar = (xgh) obj;
                return wqtVar.a.e(xghVar, apae.SLOT_TYPE_FIXED_FOOTER, (String) xghVar.d(xdw.class));
            }
        });
    }
}
