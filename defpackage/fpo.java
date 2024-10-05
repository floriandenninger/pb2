package defpackage;

import android.os.Handler;
import android.view.View;
import com.facebook.yoga.YogaFlexDirection;
import com.google.android.apps.youtube.app.common.ui.scrollselection.ScrollSelectionController;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fpo extends dha {
    public static final /* synthetic */ int w = 0;

    @dnt(a = 6)
    List a;

    @dnt(a = 13)
    axpg b;

    @dnt(a = 13)
    YogaFlexDirection c;

    @dnt(a = 13)
    awnw d;

    @dnt(a = 13)
    awnw e;

    @dnt(a = 10)
    dha f;

    @dnt(a = 13)
    axpg g;

    @dnt(a = 13)
    Handler v;

    @dnt(a = 14)
    private fpn x;

    public fpo() {
        super("InlinePlayback");
        this.x = new fpn();
    }

    @Override // defpackage.dhk, defpackage.dix
    public final Object K(diy diyVar, Object obj) {
        int i = diyVar.b;
        if (i == -1932591986) {
            dji djiVar = diyVar.a;
            View view = ((djs) obj).a;
            fpo fpoVar = (fpo) djiVar;
            axpg axpgVar = fpoVar.g;
            fpn fpnVar = fpoVar.x;
            fpt fptVar = fpnVar.c;
            fpnVar.a.b = false;
            ((ScrollSelectionController) axpgVar.get()).p(view);
            return null;
        }
        if (i == -1048037474) {
            N((dhe) diyVar.c[0], (diw) obj);
            return null;
        }
        if (i != 1803022739) {
            return null;
        }
        dji djiVar2 = diyVar.a;
        dhe dheVar = (dhe) diyVar.c[0];
        View view2 = ((dmy) obj).a;
        fpo fpoVar2 = (fpo) djiVar2;
        axpg axpgVar2 = fpoVar2.b;
        axpg axpgVar3 = fpoVar2.g;
        awnw awnwVar = fpoVar2.d;
        awnw awnwVar2 = fpoVar2.e;
        fpn fpnVar2 = fpoVar2.x;
        fpt fptVar2 = fpnVar2.c;
        fpnVar2.a.b = true;
        fptVar2.c(new WeakReference(dheVar));
        ((ScrollSelectionController) axpgVar3.get()).k(view2, fptVar2);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void M(dhe dheVar) {
        baql baqlVar = new baql();
        baql baqlVar2 = new baql();
        baql baqlVar3 = new baql();
        axpg axpgVar = this.b;
        awnw awnwVar = this.d;
        awnw awnwVar2 = this.e;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        fpy fpyVar = new fpy();
        baqlVar.a = atomicBoolean;
        baqlVar2.a = fpyVar;
        baqlVar3.a = new fpt(new WeakReference(dheVar), axpgVar, awnwVar, awnwVar2, fpyVar, atomicBoolean);
        Object obj = baqlVar.a;
        if (obj != null) {
            this.x.b = (AtomicBoolean) obj;
        }
        Object obj2 = baqlVar2.a;
        if (obj2 != null) {
            this.x.a = (fpy) obj2;
        }
        Object obj3 = baqlVar3.a;
        if (obj3 != null) {
            this.x.c = (fpt) obj3;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void X(dlq dlqVar, dlq dlqVar2) {
        fpn fpnVar = (fpn) dlqVar;
        fpn fpnVar2 = (fpn) dlqVar2;
        fpnVar2.a = fpnVar.a;
        fpnVar2.b = fpnVar.b;
        fpnVar2.c = fpnVar.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final boolean ac() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final amsj at(dhe dheVar, amsj amsjVar) {
        amsj D = amsj.D(amsjVar);
        fpn fpnVar = this.x;
        fpt fptVar = fpnVar.c;
        fpy fpyVar = fpnVar.a;
        fptVar.c(new WeakReference(dheVar));
        D.w(fpy.class, fpyVar);
        return D;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final dha b(dhe dheVar) {
        dgz dgzVar;
        Handler handler = this.v;
        dha dhaVar = this.f;
        List list = this.a;
        YogaFlexDirection yogaFlexDirection = this.c;
        fpn fpnVar = this.x;
        final fpy fpyVar = fpnVar.a;
        fpt fptVar = fpnVar.c;
        final AtomicBoolean atomicBoolean = fpnVar.b;
        fptVar.c(new WeakReference(dheVar));
        handler.post(new Runnable() { // from class: fpr
            @Override // java.lang.Runnable
            public final void run() {
                AtomicBoolean atomicBoolean2 = atomicBoolean;
                fpy fpyVar2 = fpyVar;
                if (atomicBoolean2.get()) {
                    return;
                }
                fpyVar2.a(false);
            }
        });
        YogaFlexDirection yogaFlexDirection2 = YogaFlexDirection.COLUMN;
        int ordinal = yogaFlexDirection.ordinal();
        if (ordinal == 0) {
            dgzVar = dgu.a(dheVar);
        } else if (ordinal == 1) {
            dgt a = dgu.a(dheVar);
            a.j();
            dgzVar = a;
        } else if (ordinal == 2) {
            dgzVar = dll.a(dheVar);
        } else if (ordinal == 3) {
            dlk a2 = dll.a(dheVar);
            a2.h();
            dgzVar = a2;
        } else {
            String valueOf = String.valueOf(yogaFlexDirection);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("Unknown enum value: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        dgzVar.R(H(fpo.class, dheVar, 1803022739, new Object[]{dheVar}));
        dgzVar.K(H(fpo.class, dheVar, -1932591986, new Object[]{dheVar}));
        dgzVar.g(dhaVar.j());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dgzVar.g(((dha) it.next()).j());
        }
        dgzVar.p(true != atomicBoolean.get() ? 1.0f : 0.0f);
        return dgzVar.a();
    }

    @Override // defpackage.dha
    public final /* bridge */ /* synthetic */ dha j() {
        fpo fpoVar = (fpo) super.j();
        dha dhaVar = fpoVar.f;
        fpoVar.f = dhaVar != null ? dhaVar.j() : null;
        fpoVar.x = new fpn();
        return fpoVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dha
    public final dlq m() {
        return this.x;
    }
}
