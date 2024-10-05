package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajuk implements ajuo {
    public final Activity a;
    public final ayqi b;
    public final ausu c;
    public final ajti d;
    private final Set e = Collections.newSetFromMap(new WeakHashMap());
    private int f;

    public ajuk(Activity activity, ayqi ayqiVar, yqw yqwVar, ausu ausuVar, ajti ajtiVar) {
        this.a = activity;
        this.b = ayqiVar;
        this.c = ausuVar;
        this.d = ajtiVar;
        if (ausuVar.d == 45 && ((Integer) ausuVar.e).intValue() > 0) {
            this.f = ausuVar.d == 45 ? ((Integer) ausuVar.e).intValue() : 0;
        } else if (ausuVar.d != 48) {
            this.f = ajtiVar.a();
            yqwVar.f(new Callable(this) { // from class: ajuj
                public final /* synthetic */ ajuk a;

                {
                    this.a = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    if (r2 == 0) {
                        final ajuk ajukVar = this.a;
                        final int i = 0;
                        return ajukVar.d.b.n().X(new ayrs() { // from class: ajui
                            @Override // defpackage.ayrs
                            public final void a(Object obj) {
                                ausy ausyVar;
                                if (i != 0) {
                                    ajuk ajukVar2 = ajukVar;
                                    int width = ((Rect) obj).width();
                                    DisplayMetrics displayMetrics = ajukVar2.a.getResources().getDisplayMetrics();
                                    ausu ausuVar2 = ajukVar2.c;
                                    if (ausuVar2.d == 48) {
                                        ausyVar = (ausy) ausuVar2.e;
                                    } else {
                                        ausyVar = ausy.a;
                                    }
                                    int i2 = ausyVar.b;
                                    if (width >= yjk.K(displayMetrics, 840)) {
                                        i2 = ausyVar.d;
                                    } else if (width >= yjk.K(displayMetrics, 525)) {
                                        i2 = ausyVar.c;
                                    }
                                    if (i2 <= 0) {
                                        i2 = 1;
                                    }
                                    ajukVar2.c(i2);
                                    return;
                                }
                                ajuk ajukVar3 = ajukVar;
                                int intValue = ((Integer) obj).intValue();
                                int i3 = ajukVar3.c.d;
                                if (i3 == 45 || i3 == 48) {
                                    return;
                                }
                                ajukVar3.c(intValue);
                            }
                        });
                    }
                    final ajuk ajukVar2 = this.a;
                    final int i2 = 1;
                    return whu.A(ajukVar2.a.getWindow().getDecorView(), ajukVar2.b).B().ax(new ayrs() { // from class: ajui
                        @Override // defpackage.ayrs
                        public final void a(Object obj) {
                            ausy ausyVar;
                            if (i2 != 0) {
                                ajuk ajukVar22 = ajukVar2;
                                int width = ((Rect) obj).width();
                                DisplayMetrics displayMetrics = ajukVar22.a.getResources().getDisplayMetrics();
                                ausu ausuVar2 = ajukVar22.c;
                                if (ausuVar2.d == 48) {
                                    ausyVar = (ausy) ausuVar2.e;
                                } else {
                                    ausyVar = ausy.a;
                                }
                                int i22 = ausyVar.b;
                                if (width >= yjk.K(displayMetrics, 840)) {
                                    i22 = ausyVar.d;
                                } else if (width >= yjk.K(displayMetrics, 525)) {
                                    i22 = ausyVar.c;
                                }
                                if (i22 <= 0) {
                                    i22 = 1;
                                }
                                ajukVar22.c(i22);
                                return;
                            }
                            ajuk ajukVar3 = ajukVar2;
                            int intValue = ((Integer) obj).intValue();
                            int i3 = ajukVar3.c.d;
                            if (i3 == 45 || i3 == 48) {
                                return;
                            }
                            ajukVar3.c(intValue);
                        }
                    });
                }
            });
        } else {
            final int i = 1;
            yqwVar.f(new Callable(this) { // from class: ajuj
                public final /* synthetic */ ajuk a;

                {
                    this.a = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    if (i == 0) {
                        final ajuk ajukVar = this.a;
                        final int i2 = 0;
                        return ajukVar.d.b.n().X(new ayrs() { // from class: ajui
                            @Override // defpackage.ayrs
                            public final void a(Object obj) {
                                ausy ausyVar;
                                if (i2 != 0) {
                                    ajuk ajukVar22 = ajukVar;
                                    int width = ((Rect) obj).width();
                                    DisplayMetrics displayMetrics = ajukVar22.a.getResources().getDisplayMetrics();
                                    ausu ausuVar2 = ajukVar22.c;
                                    if (ausuVar2.d == 48) {
                                        ausyVar = (ausy) ausuVar2.e;
                                    } else {
                                        ausyVar = ausy.a;
                                    }
                                    int i22 = ausyVar.b;
                                    if (width >= yjk.K(displayMetrics, 840)) {
                                        i22 = ausyVar.d;
                                    } else if (width >= yjk.K(displayMetrics, 525)) {
                                        i22 = ausyVar.c;
                                    }
                                    if (i22 <= 0) {
                                        i22 = 1;
                                    }
                                    ajukVar22.c(i22);
                                    return;
                                }
                                ajuk ajukVar3 = ajukVar;
                                int intValue = ((Integer) obj).intValue();
                                int i3 = ajukVar3.c.d;
                                if (i3 == 45 || i3 == 48) {
                                    return;
                                }
                                ajukVar3.c(intValue);
                            }
                        });
                    }
                    final ajuk ajukVar2 = this.a;
                    final int i22 = 1;
                    return whu.A(ajukVar2.a.getWindow().getDecorView(), ajukVar2.b).B().ax(new ayrs() { // from class: ajui
                        @Override // defpackage.ayrs
                        public final void a(Object obj) {
                            ausy ausyVar;
                            if (i22 != 0) {
                                ajuk ajukVar22 = ajukVar2;
                                int width = ((Rect) obj).width();
                                DisplayMetrics displayMetrics = ajukVar22.a.getResources().getDisplayMetrics();
                                ausu ausuVar2 = ajukVar22.c;
                                if (ausuVar2.d == 48) {
                                    ausyVar = (ausy) ausuVar2.e;
                                } else {
                                    ausyVar = ausy.a;
                                }
                                int i222 = ausyVar.b;
                                if (width >= yjk.K(displayMetrics, 840)) {
                                    i222 = ausyVar.d;
                                } else if (width >= yjk.K(displayMetrics, 525)) {
                                    i222 = ausyVar.c;
                                }
                                if (i222 <= 0) {
                                    i222 = 1;
                                }
                                ajukVar22.c(i222);
                                return;
                            }
                            ajuk ajukVar3 = ajukVar2;
                            int intValue = ((Integer) obj).intValue();
                            int i3 = ajukVar3.c.d;
                            if (i3 == 45 || i3 == 48) {
                                return;
                            }
                            ajukVar3.c(intValue);
                        }
                    });
                }
            });
        }
    }

    @Override // defpackage.ajuo
    public final int a() {
        return this.f;
    }

    @Override // defpackage.ajuo
    public final ajti b() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(int i) {
        amkq.E(i > 0);
        if (this.f == i) {
            return;
        }
        this.f = i;
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((ajsy) it.next()).a(i);
        }
    }

    @Override // defpackage.ajuo
    public final void e(ajsy ajsyVar) {
        this.e.add(ajsyVar);
    }

    @Override // defpackage.ajuo
    public final void f(ajsy ajsyVar) {
        this.e.remove(ajsyVar);
    }
}
