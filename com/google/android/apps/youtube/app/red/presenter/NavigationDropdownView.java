package com.google.android.apps.youtube.app.red.presenter;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.SmoothHeightResizeLayout;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.apps.youtube.app.red.presenter.NavigationDropdownView;
import com.google.android.youtube.R;
import defpackage.aqpj;
import defpackage.bvx;
import defpackage.bwh;
import defpackage.bwk;
import defpackage.fyj;
import defpackage.jw;
import defpackage.kzt;
import defpackage.kzu;
import defpackage.kzv;
import defpackage.kzw;
import defpackage.kzy;
import defpackage.whu;
import defpackage.yjk;
import defpackage.yny;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class NavigationDropdownView extends SmoothHeightResizeLayout {
    public TextView d;
    public TextView e;
    public ImageView f;
    public kzv g;
    public aqpj h;
    public ValueAnimator i;
    public kzw j;
    public kzu k;
    public boolean l;
    public boolean m;
    private ViewGroup n;
    private ViewGroup o;
    private RecyclerView p;
    private bwk q;
    private boolean r;

    public NavigationDropdownView(Context context) {
        super(context);
        f(yjk.p(context, null, 0), null);
    }

    private final void f(Context context, AttributeSet attributeSet) {
        if (this.n != null) {
            return;
        }
        inflate(context, R.layout.navigation_dropdown_layout, this);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.dropdown_wrapper);
        this.n = viewGroup;
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.dropdown_header);
        this.o = viewGroup2;
        this.d = (TextView) viewGroup2.findViewById(R.id.collapsed_title);
        this.e = (TextView) this.o.findViewById(R.id.expanded_title);
        this.f = (ImageView) this.o.findViewById(R.id.expand_button);
        this.p = (RecyclerView) this.n.findViewById(R.id.dropdown_items);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kzy.a);
        final int i = 0;
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
        final int i2 = 1;
        ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(1);
        obtainStyledAttributes.recycle();
        if (colorStateList == null) {
            colorStateList = this.d.getTextColors();
        }
        if (colorStateList2 == null) {
            colorStateList2 = this.e.getTextColors();
        }
        this.k = new kzu(new View.OnClickListener(this) { // from class: kzs
            public final /* synthetic */ NavigationDropdownView a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aqyg aqygVar;
                aqew aqewVar;
                apxf apxfVar;
                kzp kzpVar;
                ajwx ajwxVar;
                aqew aqewVar2;
                aqew aqewVar3;
                if (i2 == 0) {
                    this.a.d(true);
                    return;
                }
                NavigationDropdownView navigationDropdownView = this.a;
                int b = ((wfb) view.getTag()).b();
                navigationDropdownView.b(true);
                kzu kzuVar = navigationDropdownView.k;
                amkq.E(b >= 0 && b < kzuVar.d.size());
                aqpj aqpjVar = (aqpj) kzuVar.d.get(b);
                if (amkq.b(navigationDropdownView.h, aqpjVar)) {
                    return;
                }
                aqpj aqpjVar2 = navigationDropdownView.h;
                if (aqpjVar2 != null) {
                    aone builder = aqpjVar2.toBuilder();
                    builder.copyOnWrite();
                    aqpj aqpjVar3 = (aqpj) builder.instance;
                    aqpjVar3.b |= 4;
                    aqpjVar3.f = false;
                }
                navigationDropdownView.h = aqpjVar;
                aqpj aqpjVar4 = navigationDropdownView.h;
                if (aqpjVar4 != null) {
                    aone builder2 = aqpjVar4.toBuilder();
                    builder2.copyOnWrite();
                    aqpj aqpjVar5 = (aqpj) builder2.instance;
                    aqpjVar5.b |= 4;
                    aqpjVar5.f = true;
                    navigationDropdownView.h = (aqpj) builder2.build();
                    TextView textView = navigationDropdownView.d;
                    aqpj aqpjVar6 = navigationDropdownView.h;
                    if ((1 & aqpjVar6.b) != 0) {
                        aqygVar = aqpjVar6.e;
                        if (aqygVar == null) {
                            aqygVar = aqyg.a;
                        }
                    } else {
                        aqygVar = null;
                    }
                    textView.setText(ajcq.b(aqygVar));
                    kzv kzvVar = navigationDropdownView.g;
                    if (kzvVar != null) {
                        aqpj aqpjVar7 = navigationDropdownView.h;
                        if (aqpjVar7.c == 6) {
                            aqewVar = (aqew) aqpjVar7.d;
                        } else {
                            aqewVar = aqew.a;
                        }
                        if (!aqewVar.pY(aulm.b) || (ajwxVar = (kzpVar = (kzp) kzvVar).d) == null) {
                            if (aqpjVar7.c == 5) {
                                final kzp kzpVar2 = (kzp) kzvVar;
                                ammy ammyVar = new ammy() { // from class: kzo
                                    @Override // defpackage.ammy
                                    public final boolean a(Object obj) {
                                        return TextUtils.equals(etx.w((PaneDescriptor) obj), etx.w(kzp.this.b.d()));
                                    }
                                };
                                HashMap hashMap = new HashMap();
                                hashMap.put("replace_pane_predicate", ammyVar);
                                aahd aahdVar = kzpVar2.a;
                                if (aqpjVar7.c == 5) {
                                    apxfVar = (apxf) aqpjVar7.d;
                                } else {
                                    apxfVar = apxf.a;
                                }
                                aahdVar.c(apxfVar, hashMap);
                                return;
                            }
                            return;
                        }
                        if (ajwxVar instanceof ajss) {
                            kzpVar.c.c(false);
                            ajss ajssVar = (ajss) kzpVar.d;
                            if (aqpjVar7.c == 6) {
                                aqewVar3 = (aqew) aqpjVar7.d;
                            } else {
                                aqewVar3 = aqew.a;
                            }
                            aulm aulmVar = (aulm) aqewVar3.pX(aulm.b);
                            ajssVar.A();
                            ajssVar.k.b(ahbj.o(aulmVar));
                            ajssVar.lt(ahbj.o(aulmVar));
                            ajssVar.Q();
                            return;
                        }
                        if (aqpjVar7.c == 6) {
                            aqewVar2 = (aqew) aqpjVar7.d;
                        } else {
                            aqewVar2 = aqew.a;
                        }
                        ajwxVar.lz((aulm) aqewVar2.pX(aulm.b), null);
                    }
                }
            }
        }, colorStateList, colorStateList2);
        this.p.setNestedScrollingEnabled(false);
        this.p.af(new LinearLayoutManager());
        this.p.ac(this.k);
        this.o.setOnClickListener(new View.OnClickListener(this) { // from class: kzs
            public final /* synthetic */ NavigationDropdownView a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aqyg aqygVar;
                aqew aqewVar;
                apxf apxfVar;
                kzp kzpVar;
                ajwx ajwxVar;
                aqew aqewVar2;
                aqew aqewVar3;
                if (i == 0) {
                    this.a.d(true);
                    return;
                }
                NavigationDropdownView navigationDropdownView = this.a;
                int b = ((wfb) view.getTag()).b();
                navigationDropdownView.b(true);
                kzu kzuVar = navigationDropdownView.k;
                amkq.E(b >= 0 && b < kzuVar.d.size());
                aqpj aqpjVar = (aqpj) kzuVar.d.get(b);
                if (amkq.b(navigationDropdownView.h, aqpjVar)) {
                    return;
                }
                aqpj aqpjVar2 = navigationDropdownView.h;
                if (aqpjVar2 != null) {
                    aone builder = aqpjVar2.toBuilder();
                    builder.copyOnWrite();
                    aqpj aqpjVar3 = (aqpj) builder.instance;
                    aqpjVar3.b |= 4;
                    aqpjVar3.f = false;
                }
                navigationDropdownView.h = aqpjVar;
                aqpj aqpjVar4 = navigationDropdownView.h;
                if (aqpjVar4 != null) {
                    aone builder2 = aqpjVar4.toBuilder();
                    builder2.copyOnWrite();
                    aqpj aqpjVar5 = (aqpj) builder2.instance;
                    aqpjVar5.b |= 4;
                    aqpjVar5.f = true;
                    navigationDropdownView.h = (aqpj) builder2.build();
                    TextView textView = navigationDropdownView.d;
                    aqpj aqpjVar6 = navigationDropdownView.h;
                    if ((1 & aqpjVar6.b) != 0) {
                        aqygVar = aqpjVar6.e;
                        if (aqygVar == null) {
                            aqygVar = aqyg.a;
                        }
                    } else {
                        aqygVar = null;
                    }
                    textView.setText(ajcq.b(aqygVar));
                    kzv kzvVar = navigationDropdownView.g;
                    if (kzvVar != null) {
                        aqpj aqpjVar7 = navigationDropdownView.h;
                        if (aqpjVar7.c == 6) {
                            aqewVar = (aqew) aqpjVar7.d;
                        } else {
                            aqewVar = aqew.a;
                        }
                        if (!aqewVar.pY(aulm.b) || (ajwxVar = (kzpVar = (kzp) kzvVar).d) == null) {
                            if (aqpjVar7.c == 5) {
                                final kzp kzpVar2 = (kzp) kzvVar;
                                ammy ammyVar = new ammy() { // from class: kzo
                                    @Override // defpackage.ammy
                                    public final boolean a(Object obj) {
                                        return TextUtils.equals(etx.w((PaneDescriptor) obj), etx.w(kzp.this.b.d()));
                                    }
                                };
                                HashMap hashMap = new HashMap();
                                hashMap.put("replace_pane_predicate", ammyVar);
                                aahd aahdVar = kzpVar2.a;
                                if (aqpjVar7.c == 5) {
                                    apxfVar = (apxf) aqpjVar7.d;
                                } else {
                                    apxfVar = apxf.a;
                                }
                                aahdVar.c(apxfVar, hashMap);
                                return;
                            }
                            return;
                        }
                        if (ajwxVar instanceof ajss) {
                            kzpVar.c.c(false);
                            ajss ajssVar = (ajss) kzpVar.d;
                            if (aqpjVar7.c == 6) {
                                aqewVar3 = (aqew) aqpjVar7.d;
                            } else {
                                aqewVar3 = aqew.a;
                            }
                            aulm aulmVar = (aulm) aqewVar3.pX(aulm.b);
                            ajssVar.A();
                            ajssVar.k.b(ahbj.o(aulmVar));
                            ajssVar.lt(ahbj.o(aulmVar));
                            ajssVar.Q();
                            return;
                        }
                        if (aqpjVar7.c == 6) {
                            aqewVar2 = (aqew) aqpjVar7.d;
                        } else {
                            aqewVar2 = aqew.a;
                        }
                        ajwxVar.lz((aulm) aqewVar2.pX(aulm.b), null);
                    }
                }
            }
        });
        this.r = true;
        this.l = true;
        this.m = false;
    }

    public final void b(boolean z) {
        if (this.r) {
            return;
        }
        d(z);
    }

    public final void c(boolean z) {
        this.l = z;
        e();
    }

    public final void d(boolean z) {
        ViewGroup viewGroup;
        if (this.l && this.m) {
            this.r = !this.r;
            if (z) {
                ValueAnimator valueAnimator = this.i;
                if (valueAnimator != null && valueAnimator.isStarted()) {
                    this.i.cancel();
                }
                this.a = true;
                this.c = getMeasuredHeight();
                this.b = 0.0f;
                requestLayout();
                if (this.q == null) {
                    bwk bwkVar = new bwk();
                    this.q = bwkVar;
                    long j = bwkVar.b;
                    fyj fyjVar = new fyj();
                    fyjVar.z(this.f);
                    bvx bvxVar = new bvx();
                    bvxVar.z(this.d);
                    bvxVar.z(this.e);
                    bwk bwkVar2 = this.q;
                    bwkVar2.f(fyjVar);
                    bwkVar2.f(bvxVar);
                    bwkVar2.e(new kzt(this, j));
                }
                ViewParent parent = getParent();
                if (parent == null) {
                    viewGroup = this;
                } else {
                    ViewParent parent2 = parent.getParent();
                    if (true == (parent2 instanceof ViewGroup)) {
                        parent = parent2;
                    }
                    viewGroup = (ViewGroup) parent;
                }
                bwh.b(viewGroup, this.q);
            }
            this.f.setRotation(true != this.r ? 180.0f : 360.0f);
            this.f.setPressed(true);
            whu.I(this.d, this.r);
            whu.I(this.e, !this.r);
            if (this.k.b() > 1) {
                yny.z(this.p, yny.n(true != this.r ? -2 : 1), ViewGroup.LayoutParams.class);
            }
            RecyclerView recyclerView = this.p;
            jw.Y(recyclerView, recyclerView.getPaddingStart(), this.p.getPaddingTop(), this.p.getPaddingEnd(), this.r ? 0 : getResources().getDimensionPixelSize(R.dimen.navigation_dropdown_expanded_recyclerview_bottom_padding));
        }
    }

    public final void e() {
        boolean z = false;
        if (this.l && this.m) {
            z = true;
        }
        whu.I(this.p, z);
        whu.I(this.f, z);
        this.o.setClickable(z);
    }

    public NavigationDropdownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        f(yjk.p(context, attributeSet, 0), attributeSet);
    }

    public NavigationDropdownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        f(yjk.p(context, attributeSet, 0), attributeSet);
    }
}
