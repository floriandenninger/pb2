package defpackage;

import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ajpc implements ajom {
    public aaea w;

    protected abstract void d(ajok ajokVar, Object obj);

    protected abstract byte[] e(Object obj);

    protected boolean kC() {
        aaea aaeaVar = this.w;
        if (aaeaVar == null) {
            return false;
        }
        asuj asujVar = aaeaVar.a().m;
        if (asujVar == null) {
            asujVar = asuj.a;
        }
        asiu asiuVar = asujVar.c;
        if (asiuVar == null) {
            asiuVar = asiu.a;
        }
        return asiuVar.i;
    }

    protected boolean l() {
        return false;
    }

    @Override // defpackage.ajom
    public final void oB(ajok ajokVar, Object obj) {
        byte[] e = e(obj);
        if (e != null && e.length > 0) {
            acqx acqxVar = new acqx(e);
            if (!kC()) {
                ajokVar.a.u(acqxVar, null);
            } else {
                a().setTag(R.id.visual_element_container_tag, new acqw(acqxVar, l()));
            }
        }
        d(ajokVar, obj);
    }
}
