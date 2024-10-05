package com.google.android.apps.youtube.app.mdx;

import android.app.Activity;
import android.view.MenuItem;
import com.google.android.apps.youtube.app.mdx.WatchOnTvMenuItem;
import com.google.android.youtube.R;
import defpackage.acue;
import defpackage.adyu;
import defpackage.any;
import defpackage.aok;
import defpackage.ayqr;
import defpackage.ayqx;
import defpackage.ayrs;
import defpackage.ayrz;
import defpackage.fzd;
import defpackage.fzk;
import defpackage.gng;
import defpackage.gni;
import j$.util.Optional;
import j$.util.function.Consumer;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class WatchOnTvMenuItem implements fzk, any {
    public boolean a;
    private final Activity c;
    private final gni d;
    private final acue e;
    public Optional b = Optional.empty();
    private ayqx f = p();

    public WatchOnTvMenuItem(Activity activity, gni gniVar, acue acueVar) {
        this.c = activity;
        this.d = gniVar;
        this.e = acueVar;
    }

    private final ayqx p() {
        return this.e.j().ab(ayqr.a()).ax(new ayrs() { // from class: jcu
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                WatchOnTvMenuItem watchOnTvMenuItem = WatchOnTvMenuItem.this;
                final Boolean bool = (Boolean) obj;
                watchOnTvMenuItem.a = bool.booleanValue();
                watchOnTvMenuItem.b.ifPresent(new Consumer() { // from class: jcv
                    @Override // j$.util.function.Consumer
                    public final void accept(Object obj2) {
                        ((MenuItem) obj2).setVisible(bool.booleanValue());
                    }

                    @Override // j$.util.function.Consumer
                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer.CC.$default$andThen(this, consumer);
                    }
                });
            }
        });
    }

    @Override // defpackage.fze
    public final int g() {
        return R.id.menu_watch_on_tv;
    }

    @Override // defpackage.fze
    public final int h() {
        return R.menu.menu_watch_on_tv;
    }

    @Override // defpackage.fze
    public final fzd i() {
        return null;
    }

    @Override // defpackage.fze
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.fze
    public final boolean k() {
        return true;
    }

    @Override // defpackage.fze
    public final void l(MenuItem menuItem) {
        if (this.b.isPresent() && this.b.get() == menuItem) {
            return;
        }
        this.b = Optional.of(menuItem);
        menuItem.setVisible(this.a);
        menuItem.setShowAsAction(0);
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lh(aok aokVar) {
    }

    @Override // defpackage.fze
    public final boolean m() {
        Activity activity = this.c;
        activity.startActivity(adyu.bZ(activity, this.d.a() == gng.DARK));
        return true;
    }

    @Override // defpackage.fzk
    public final int n() {
        return 103;
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        ayrz.c((AtomicReference) this.f);
    }

    @Override // defpackage.fzk
    public final CharSequence o() {
        return "";
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        if (this.f.e()) {
            this.f = p();
        }
    }
}
