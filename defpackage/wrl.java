package defpackage;

/* compiled from: PG */
@wyr(b = apae.SLOT_TYPE_IN_PLAYER, d = {xdw.class, xeb.class})
/* loaded from: classes4.dex */
public final class wrl extends wqz {
    public final wyn a;

    public wrl(wrd wrdVar, wyn wynVar) {
        super(wrdVar);
        this.a = wynVar;
    }

    @Override // defpackage.wqz
    public final void a() {
        this.d.c(new amml() { // from class: wrk
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                wrl wrlVar = wrl.this;
                xgh xghVar = (xgh) obj;
                return wrlVar.a.e(xghVar, apae.SLOT_TYPE_IN_PLAYER, (String) xghVar.d(xdw.class));
            }
        });
    }
}
