package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
class on extends ok {
    private om d;
    private boolean e;

    public on() {
        this(null, null);
    }

    @Override // defpackage.ok, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // defpackage.ok
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public om c() {
        return new om(this.d, this, null);
    }

    @Override // defpackage.ok
    public void e(oj ojVar) {
        super.e(ojVar);
        if (ojVar instanceof om) {
            this.d = (om) ojVar;
        }
    }

    @Override // defpackage.ok, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // defpackage.ok, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.e) {
            super.mutate();
            this.d.d();
            this.e = true;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ok, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int m = this.d.m(iArr);
        if (m < 0) {
            m = this.d.m(StateSet.WILD_CARD);
        }
        return h(m) || onStateChange;
    }

    public on(byte[] bArr) {
    }

    public on(om omVar, Resources resources) {
        e(new om(omVar, this, resources));
        onStateChange(getState());
    }
}
