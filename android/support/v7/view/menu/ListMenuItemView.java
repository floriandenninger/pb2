package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.jw;
import defpackage.nx;
import defpackage.qq;
import defpackage.qt;
import defpackage.rf;
import defpackage.yk;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements AbsListView.SelectionBoundsAdjuster, rf {
    public qt a;
    public ImageView b;
    public boolean c;
    public boolean d;
    public boolean e;
    private ImageView f;
    private RadioButton g;
    private TextView h;
    private CheckBox i;
    private TextView j;
    private ImageView k;
    private LinearLayout l;
    private Drawable m;
    private int n;
    private Context o;
    private Drawable p;
    private LayoutInflater q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listMenuViewStyle);
    }

    private final LayoutInflater b() {
        if (this.q == null) {
            this.q = LayoutInflater.from(getContext());
        }
        return this.q;
    }

    private final void c(View view) {
        d(view, -1);
    }

    private final void d(View view, int i) {
        LinearLayout linearLayout = this.l;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    @Override // defpackage.rf
    public final qt a() {
        return this.a;
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.b;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.b.getLayoutParams();
        rect.top += this.b.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // defpackage.rf
    public final boolean e() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [rf, android.support.v7.view.menu.ListMenuItemView, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.widget.CheckBox] */
    /* JADX WARN: Type inference failed for: r4v7, types: [android.widget.CompoundButton] */
    /* JADX WARN: Type inference failed for: r4v9, types: [android.widget.RadioButton] */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.widget.CheckBox] */
    @Override // defpackage.rf
    public final void f(qt qtVar) {
        ?? r4;
        RadioButton radioButton;
        CheckBox checkBox;
        ImageView imageView;
        String sb;
        this.a = qtVar;
        setVisibility(true != qtVar.isVisible() ? 8 : 0);
        CharSequence f = qtVar.f(this);
        if (f != null) {
            this.h.setText(f);
            if (this.h.getVisibility() != 0) {
                this.h.setVisibility(0);
            }
        } else if (this.h.getVisibility() != 8) {
            this.h.setVisibility(8);
        }
        boolean isCheckable = qtVar.isCheckable();
        if (isCheckable || this.g != null || this.i != null) {
            if (this.a.p()) {
                if (this.g == null) {
                    RadioButton radioButton2 = (RadioButton) b().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                    this.g = radioButton2;
                    c(radioButton2);
                }
                r4 = this.g;
                ?? r5 = this.i;
                radioButton = r5;
                checkBox = r5;
            } else {
                if (this.i == null) {
                    CheckBox checkBox2 = (CheckBox) b().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                    this.i = checkBox2;
                    c(checkBox2);
                }
                r4 = this.i;
                radioButton = this.g;
                checkBox = r4;
            }
            if (isCheckable) {
                r4.setChecked(this.a.isChecked());
                if (r4.getVisibility() != 0) {
                    r4.setVisibility(0);
                }
                if (radioButton != null && radioButton.getVisibility() != 8) {
                    radioButton.setVisibility(8);
                }
            } else {
                if (checkBox != null) {
                    checkBox.setVisibility(8);
                }
                RadioButton radioButton3 = this.g;
                if (radioButton3 != null) {
                    radioButton3.setVisibility(8);
                }
            }
        }
        boolean t = qtVar.t();
        qtVar.e();
        int i = (t && this.a.t()) ? 0 : 8;
        if (i == 0) {
            TextView textView = this.j;
            qt qtVar2 = this.a;
            char e = qtVar2.e();
            if (e == 0) {
                sb = "";
            } else {
                Resources resources = qtVar2.j.a.getResources();
                StringBuilder sb2 = new StringBuilder();
                if (ViewConfiguration.get(qtVar2.j.a).hasPermanentMenuKey()) {
                    sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i2 = qtVar2.j.x() ? qtVar2.i : qtVar2.g;
                qt.g(sb2, i2, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                qt.g(sb2, i2, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                qt.g(sb2, i2, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                qt.g(sb2, i2, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                qt.g(sb2, i2, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                qt.g(sb2, i2, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                if (e == '\b') {
                    sb2.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (e == '\n') {
                    sb2.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (e == ' ') {
                    sb2.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                } else {
                    sb2.append(e);
                }
                sb = sb2.toString();
            }
            textView.setText(sb);
        }
        if (this.j.getVisibility() != i) {
            this.j.setVisibility(i);
        }
        Drawable icon = qtVar.getIcon();
        qq qqVar = this.a.j;
        boolean z = this.e;
        if ((z || this.c) && ((imageView = this.f) != null || icon != null || this.c)) {
            if (imageView == null) {
                ImageView imageView2 = (ImageView) b().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f = imageView2;
                d(imageView2, 0);
            }
            if (icon != null || this.c) {
                ImageView imageView3 = this.f;
                if (true != z) {
                    icon = null;
                }
                imageView3.setImageDrawable(icon);
                if (this.f.getVisibility() != 0) {
                    this.f.setVisibility(0);
                }
            } else {
                this.f.setVisibility(8);
            }
        }
        setEnabled(qtVar.isEnabled());
        boolean hasSubMenu = qtVar.hasSubMenu();
        ImageView imageView4 = this.k;
        if (imageView4 != null) {
            imageView4.setVisibility(true != hasSubMenu ? 8 : 0);
        }
        setContentDescription(qtVar.l);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        jw.O(this, this.m);
        TextView textView = (TextView) findViewById(R.id.title);
        this.h = textView;
        int i = this.n;
        if (i != -1) {
            textView.setTextAppearance(this.o, i);
        }
        this.j = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.k = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.p);
        }
        this.b = (ImageView) findViewById(R.id.group_divider);
        this.l = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (this.f != null && this.c) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        yk l = yk.l(getContext(), attributeSet, nx.q, i, 0);
        this.m = l.h(5);
        this.n = l.f(1, -1);
        this.c = l.p(7, false);
        this.o = context;
        this.p = l.h(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.d = obtainStyledAttributes.hasValue(0);
        l.o();
        obtainStyledAttributes.recycle();
    }
}
