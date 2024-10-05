package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dis extends dha {
    final Drawable a;
    int b;
    int c;

    public dis(Drawable drawable) {
        super("DrawableComponent");
        this.a = drawable;
    }

    @Override // defpackage.dhk
    protected final Object L(Context context) {
        return new dks();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void P(dhe dheVar, Object obj) {
        ((dks) obj).a(this.b, this.c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void Q(dhe dheVar, dhi dhiVar) {
        this.b = dhiVar.H();
        this.c = dhiVar.C();
    }

    @Override // defpackage.dhk
    protected final void S(dhe dheVar, Object obj) {
        dks dksVar = (dks) obj;
        Drawable drawable = this.a;
        Drawable drawable2 = dksVar.a;
        if (drawable2 == drawable) {
            return;
        }
        if (drawable2 != null) {
            dksVar.b(false, false);
            dksVar.a.setCallback(null);
        }
        dksVar.a = drawable;
        if (dksVar.a != null) {
            dksVar.b(dksVar.isVisible(), false);
            dksVar.a.setCallback(dksVar);
        }
        dksVar.b = dksVar.a instanceof InsetDrawable;
        dksVar.invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void W(dhe dheVar, Object obj) {
        dks dksVar = (dks) obj;
        if (dksVar.a != null) {
            dksVar.b(false, false);
            dksVar.a.setCallback(null);
        }
        dksVar.a = null;
        dksVar.b = false;
        dksVar.d = 0;
        dksVar.c = 0;
    }

    @Override // defpackage.dhk
    protected final boolean ag() {
        return true;
    }

    @Override // defpackage.dhk
    protected final boolean ai(dha dhaVar, dha dhaVar2) {
        return !did.o(((dis) dhaVar).a, ((dis) dhaVar2).a);
    }

    @Override // defpackage.dhk
    public final int aj() {
        return 2;
    }

    @Override // defpackage.dha
    /* renamed from: e */
    public final boolean f(dha dhaVar) {
        if (this == dhaVar) {
            return true;
        }
        if (dhaVar == null || getClass() != dhaVar.getClass()) {
            return false;
        }
        return did.o(this.a, ((dis) dhaVar).a);
    }

    @Override // defpackage.dha, defpackage.div
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((dha) obj);
    }
}
