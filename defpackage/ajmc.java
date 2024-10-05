package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajmc {
    public static final /* synthetic */ int f = 0;
    public final acrh a;
    public final View b;
    public final View c;
    public final View d;
    public boolean e;
    private final ajlw g;
    private final ajlw h;

    static {
        acsb.b(3832);
        acsb.b(6827);
    }

    public ajmc(Activity activity, SharedPreferences sharedPreferences, acrh acrhVar) {
        sharedPreferences.getClass();
        this.a = acrhVar;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.interaction_logging_overlay, (ViewGroup) null);
        this.b = inflate;
        View findViewById = inflate.findViewById(R.id.main_overlay);
        this.c = findViewById;
        final int i = 1;
        inflate.findViewById(R.id.hide_button).setOnClickListener(new View.OnClickListener(this) { // from class: ajlz
            public final /* synthetic */ ajmc a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (i == 0) {
                    ajmc ajmcVar = this.a;
                    ajmcVar.c.setVisibility(0);
                    ajmcVar.d.setVisibility(8);
                    ajmcVar.e = false;
                    return;
                }
                ajmc ajmcVar2 = this.a;
                ajmcVar2.d.setVisibility(0);
                ajmcVar2.c.setVisibility(8);
                ajmcVar2.e = true;
            }
        });
        View findViewById2 = inflate.findViewById(R.id.show_button);
        this.d = findViewById2;
        final int i2 = 0;
        findViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: ajlz
            public final /* synthetic */ ajmc a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (i2 == 0) {
                    ajmc ajmcVar = this.a;
                    ajmcVar.c.setVisibility(0);
                    ajmcVar.d.setVisibility(8);
                    ajmcVar.e = false;
                    return;
                }
                ajmc ajmcVar2 = this.a;
                ajmcVar2.d.setVisibility(0);
                ajmcVar2.c.setVisibility(8);
                ajmcVar2.e = true;
            }
        });
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.linear_layout_text);
        ScrollView scrollView = (ScrollView) inflate.findViewById(R.id.click_scroll_view);
        ajmf ajmfVar = new ajmf(linearLayout, activity);
        this.g = ajmfVar;
        ajmfVar.b.setId(R.id.ve_shown_view);
        ajmg ajmgVar = new ajmg(scrollView, activity);
        this.h = ajmgVar;
        ajmgVar.b.setId(R.id.explicit_click_view);
        findViewById2.setOnLongClickListener(new ajma());
        findViewById2.setOnDragListener(new ajmb(this));
        findViewById.setOnLongClickListener(new ajma());
        findViewById.setOnDragListener(new ajmb(this));
        wbs.Q(activity, R.attr.ytBrandRed);
        aih.d(activity, R.color.yt_light_green);
    }
}
