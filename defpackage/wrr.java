package defpackage;

/* compiled from: PG */
@wyr(b = apae.SLOT_TYPE_LOCKSCREEN, d = {xdw.class})
/* loaded from: classes4.dex */
public final class wrr extends wqz {
    public final wyn a;

    public wrr(wrd wrdVar, wyn wynVar) {
        super(wrdVar);
        this.a = wynVar;
    }

    @Override // defpackage.wqz
    public final void a() {
        this.d.c(new amml() { // from class: wrq
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                wrr wrrVar = wrr.this;
                xgh xghVar = (xgh) obj;
                return wrrVar.a.e(xghVar, apae.SLOT_TYPE_LOCKSCREEN, (String) xghVar.d(xdw.class));
            }
        });
    }
}
