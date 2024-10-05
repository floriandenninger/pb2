package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rm extends qq implements SubMenu {
    public final qq j;
    public final qt k;

    public rm(Context context, qq qqVar, qt qtVar) {
        super(context);
        this.j = qqVar;
        this.k = qtVar;
    }

    @Override // defpackage.qq
    public final qq a() {
        return this.j.a();
    }

    @Override // defpackage.qq
    public final String d() {
        int i = this.k.a;
        if (i == 0) {
            return null;
        }
        return "android:menu:actionviewstates:" + i;
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.k;
    }

    @Override // defpackage.qq
    public final void p(qo qoVar) {
        this.j.p(qoVar);
    }

    @Override // defpackage.qq, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.j.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        super.q(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        super.q(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        super.q(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.k.setIcon(i);
        return this;
    }

    @Override // defpackage.qq, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.j.setQwertyMode(z);
    }

    @Override // defpackage.qq
    public final boolean t(qt qtVar) {
        return this.j.t(qtVar);
    }

    @Override // defpackage.qq
    public final boolean u(qq qqVar, MenuItem menuItem) {
        return super.u(qqVar, menuItem) || this.j.u(qqVar, menuItem);
    }

    @Override // defpackage.qq
    public final boolean v(qt qtVar) {
        return this.j.v(qtVar);
    }

    @Override // defpackage.qq
    public final boolean w() {
        return this.j.w();
    }

    @Override // defpackage.qq
    public final boolean x() {
        return this.j.x();
    }

    @Override // defpackage.qq
    public final boolean y() {
        return this.j.y();
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        super.q(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        super.q(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.k.setIcon(drawable);
        return this;
    }
}
