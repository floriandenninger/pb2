package defpackage;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceHolder;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class afko extends afkr {
    public Surface a;
    public pkd b;
    public bgv c;

    public afko(Context context) {
        super(context);
    }

    @Override // defpackage.afky
    public Surface A() {
        return this.a;
    }

    @Override // defpackage.afkr, defpackage.afky
    public SurfaceHolder B() {
        return null;
    }

    @Override // defpackage.afkl
    public final boolean E() {
        return (this.a == null && this.b == null && this.c == null) ? false : true;
    }

    public void F(int i) {
    }

    @Override // defpackage.afkr, defpackage.afky
    public final bgv i() {
        return this.c;
    }

    @Override // defpackage.afkr, defpackage.afky
    public final pkd j() {
        return this.b;
    }

    @Override // defpackage.afky
    public void o() {
    }
}
