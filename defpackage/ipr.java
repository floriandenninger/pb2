package defpackage;

import android.app.Activity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.google.android.youtube.R;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ipr {
    public final aaea a;
    public final akwc b;
    public final ayqi c;
    public Toolbar d;
    private final yqw e;

    public ipr(aaea aaeaVar, akwc akwcVar, ayqi ayqiVar, yqw yqwVar) {
        this.a = aaeaVar;
        this.b = akwcVar;
        this.c = ayqiVar;
        this.e = yqwVar;
    }

    public final void a(final Activity activity) {
        this.d = (Toolbar) activity.findViewById(R.id.toolbar);
        final int i = 1;
        this.e.f(new Callable(this) { // from class: ipq
            public final /* synthetic */ ipr a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                if (i == 0) {
                    ipr iprVar = this.a;
                    final Activity activity2 = activity;
                    final int i2 = 1;
                    return iprVar.b.a.a.a.Y(axzd.j).B().ab(iprVar.c).ax(new ayrs() { // from class: ipo
                        @Override // defpackage.ayrs
                        public final void a(Object obj) {
                            if (i2 == 0) {
                                Float f = (Float) obj;
                                View findViewById = activity2.findViewById(R.id.app_bar_layout);
                                if (findViewById != null) {
                                    findViewById.setElevation(f.floatValue());
                                    return;
                                }
                                return;
                            }
                            Activity activity3 = activity2;
                            Toolbar toolbar = (Toolbar) activity3.findViewById(R.id.toolbar);
                            if (!((Boolean) obj).booleanValue() || toolbar == null) {
                                return;
                            }
                            toolbar.y(activity3, wbs.R(activity3, R.attr.ytTextAppearanceDisplay1));
                        }
                    });
                }
                ipr iprVar2 = this.a;
                final Activity activity3 = activity;
                final int i3 = 0;
                return iprVar2.a.a.Y(gpd.l).Y(new ipp(activity3, 0)).ab(iprVar2.c).ax(new ayrs() { // from class: ipo
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        if (i3 == 0) {
                            Float f = (Float) obj;
                            View findViewById = activity3.findViewById(R.id.app_bar_layout);
                            if (findViewById != null) {
                                findViewById.setElevation(f.floatValue());
                                return;
                            }
                            return;
                        }
                        Activity activity32 = activity3;
                        Toolbar toolbar = (Toolbar) activity32.findViewById(R.id.toolbar);
                        if (!((Boolean) obj).booleanValue() || toolbar == null) {
                            return;
                        }
                        toolbar.y(activity32, wbs.R(activity32, R.attr.ytTextAppearanceDisplay1));
                    }
                });
            }
        });
        final int i2 = 0;
        this.e.f(new Callable(this) { // from class: ipq
            public final /* synthetic */ ipr a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                if (i2 == 0) {
                    ipr iprVar = this.a;
                    final Activity activity2 = activity;
                    final int i22 = 1;
                    return iprVar.b.a.a.a.Y(axzd.j).B().ab(iprVar.c).ax(new ayrs() { // from class: ipo
                        @Override // defpackage.ayrs
                        public final void a(Object obj) {
                            if (i22 == 0) {
                                Float f = (Float) obj;
                                View findViewById = activity2.findViewById(R.id.app_bar_layout);
                                if (findViewById != null) {
                                    findViewById.setElevation(f.floatValue());
                                    return;
                                }
                                return;
                            }
                            Activity activity32 = activity2;
                            Toolbar toolbar = (Toolbar) activity32.findViewById(R.id.toolbar);
                            if (!((Boolean) obj).booleanValue() || toolbar == null) {
                                return;
                            }
                            toolbar.y(activity32, wbs.R(activity32, R.attr.ytTextAppearanceDisplay1));
                        }
                    });
                }
                ipr iprVar2 = this.a;
                final Activity activity3 = activity;
                final int i3 = 0;
                return iprVar2.a.a.Y(gpd.l).Y(new ipp(activity3, 0)).ab(iprVar2.c).ax(new ayrs() { // from class: ipo
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        if (i3 == 0) {
                            Float f = (Float) obj;
                            View findViewById = activity3.findViewById(R.id.app_bar_layout);
                            if (findViewById != null) {
                                findViewById.setElevation(f.floatValue());
                                return;
                            }
                            return;
                        }
                        Activity activity32 = activity3;
                        Toolbar toolbar = (Toolbar) activity32.findViewById(R.id.toolbar);
                        if (!((Boolean) obj).booleanValue() || toolbar == null) {
                            return;
                        }
                        toolbar.y(activity32, wbs.R(activity32, R.attr.ytTextAppearanceDisplay1));
                    }
                });
            }
        });
    }
}
