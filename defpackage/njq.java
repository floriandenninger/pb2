package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class njq implements ajom, ohu {
    public ajok j;
    public Object k;
    public ohw l;

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.l.e.remove(this);
        e();
        this.j = null;
        this.k = null;
        this.l = null;
    }

    protected abstract void d();

    protected abstract void e();

    @Override // defpackage.ajom
    public final void oB(ajok ajokVar, Object obj) {
        this.j = ajokVar;
        this.k = obj;
        this.l = (ohw) ajokVar.c("sectionController");
        d();
        this.l.e.add(this);
    }

    public void oK() {
    }

    public void oL() {
    }
}
