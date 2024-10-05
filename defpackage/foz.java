package defpackage;

import android.view.View;
import com.facebook.yoga.YogaFlexDirection;
import com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateScrollSelectionController;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class foz extends dha {

    @dnt(a = 6)
    List a;

    @dnt(a = 13)
    axpg b;

    @dnt(a = 13)
    sxc c;

    @dnt(a = 13)
    YogaFlexDirection d;

    @dnt(a = 13)
    awnw e;

    @dnt(a = 13)
    awnw f;

    @dnt(a = 14)
    private final fox g;

    public foz() {
        super("ActiveState");
        this.g = new fox();
    }

    @Override // defpackage.dhk, defpackage.dix
    public final Object K(diy diyVar, Object obj) {
        Object obj2;
        ActiveStateScrollSelectionController activeStateScrollSelectionController;
        Object obj3;
        ActiveStateScrollSelectionController activeStateScrollSelectionController2;
        int i = diyVar.b;
        if (i == -1932591986) {
            dji djiVar = diyVar.a;
            View view = ((djs) obj).a;
            syb sybVar = ((foz) djiVar).c.u;
            if (sybVar != null && (obj2 = sybVar.f) != null && (activeStateScrollSelectionController = ((fou) obj2).a) != null) {
                activeStateScrollSelectionController.p(view);
            }
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
        View view2 = ((dmy) obj).a;
        foz fozVar = (foz) djiVar2;
        sxc sxcVar = fozVar.c;
        fpb fpbVar = fozVar.g.a;
        syb sybVar2 = sxcVar.u;
        if (sybVar2 != null && (obj3 = sybVar2.f) != null && (activeStateScrollSelectionController2 = ((fou) obj3).a) != null) {
            activeStateScrollSelectionController2.k(view2, fpbVar);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void M(dhe dheVar) {
        baql baqlVar = new baql();
        axpg axpgVar = this.b;
        awnw awnwVar = this.f;
        awnw awnwVar2 = this.e;
        sxc sxcVar = this.c;
        new WeakReference(dheVar);
        baqlVar.a = new fpb(axpgVar, sxcVar.r, awnwVar, awnwVar2);
        Object obj = baqlVar.a;
        if (obj != null) {
            this.g.a = (fpb) obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void X(dlq dlqVar, dlq dlqVar2) {
        ((fox) dlqVar2).a = ((fox) dlqVar).a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final boolean ac() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final dha b(dhe dheVar) {
        dgz dgzVar;
        List list = this.a;
        YogaFlexDirection yogaFlexDirection = this.d;
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
        dgzVar.R(H(foz.class, dheVar, 1803022739, new Object[]{dheVar}));
        dgzVar.K(H(foz.class, dheVar, -1932591986, new Object[]{dheVar}));
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                dgzVar.g(((dha) it.next()).j());
            }
        }
        return dgzVar.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dha
    public final dlq m() {
        return this.g;
    }
}
