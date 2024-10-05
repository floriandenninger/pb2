package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lql implements ajom {
    public final Context a;
    public final osm b;
    public final View c;
    public final TextView d;
    public final Switch e;
    private final ajop f;
    private final ayqi g;
    private final TextView h;
    private final ayqw i;

    public lql(Context context, gma gmaVar, osm osmVar, ayqi ayqiVar, ViewGroup viewGroup) {
        this.a = context;
        this.f = gmaVar;
        this.b = osmVar;
        this.g = ayqiVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.setting_boolean_with_dialog_layout, viewGroup, false);
        this.c = inflate;
        this.h = (TextView) inflate.findViewById(R.id.title);
        this.d = (TextView) inflate.findViewById(R.id.summary);
        this.e = (Switch) inflate.findViewById(R.id.switch_button);
        this.i = new ayqw();
        gmaVar.c(inflate);
        gmaVar.d(new View.OnClickListener() { // from class: lqi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final lql lqlVar = lql.this;
                AlertDialog.Builder builder = new AlertDialog.Builder(lqlVar.a);
                final ory oryVar = new ory(lqlVar.a);
                oryVar.e(orz.a, orz.b);
                int a = lqlVar.b.a();
                oryVar.c(a / 60);
                oryVar.d(a % 60);
                builder.setView(oryVar);
                builder.setTitle(R.string.bollard_setting_dialog_title);
                builder.setNegativeButton(R.string.cancel, hgs.f);
                builder.setPositiveButton(R.string.done, new DialogInterface.OnClickListener() { // from class: lqh
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        lql lqlVar2 = lql.this;
                        ory oryVar2 = oryVar;
                        int a2 = oryVar2.a();
                        int b = oryVar2.b();
                        if (a2 == 0) {
                            if (b == 0) {
                                lqlVar2.b.d(false);
                                lqlVar2.e(lqlVar2.e, false);
                                lqlVar2.d();
                            }
                            a2 = 0;
                        }
                        lqlVar2.b.d(true);
                        lqlVar2.b.e((a2 * 60) + b);
                        lqlVar2.e(lqlVar2.e, true);
                        lqlVar2.d();
                    }
                });
                AlertDialog create = builder.create();
                if (create != null) {
                    create.show();
                }
            }
        });
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.f).b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.e.setOnCheckedChangeListener(null);
        this.c.setOnClickListener(null);
        this.i.c();
    }

    public final void d() {
        if (this.b.g()) {
            whu.G(this.d, orz.a(this.a.getResources(), this.b.a()));
        } else {
            whu.G(this.d, this.a.getResources().getString(R.string.watch_break_setting_summary_off));
        }
    }

    public final void e(Switch r2, boolean z) {
        r2.setOnCheckedChangeListener(null);
        r2.setChecked(z);
        r2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: lqj
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                lql lqlVar = lql.this;
                lqlVar.b.d(z2);
                if (z2) {
                    lqlVar.c.performClick();
                } else {
                    lqlVar.d();
                }
            }
        });
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        whu.G(this.h, this.a.getResources().getString(R.string.bollard_setting_title));
        d();
        e(this.e, this.b.g());
        final int i = 1;
        this.i.d(this.b.c.ab(this.g).ax(new ayrs(this) { // from class: lqk
            public final /* synthetic */ lql a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj2) {
                if (i == 0) {
                    lql lqlVar = this.a;
                    whu.G(lqlVar.d, orz.a(lqlVar.a.getResources(), ((Integer) obj2).intValue()));
                } else {
                    lql lqlVar2 = this.a;
                    lqlVar2.e(lqlVar2.e, ((Boolean) obj2).booleanValue());
                    lqlVar2.d();
                }
            }
        }));
        final int i2 = 0;
        this.i.d(this.b.d.ab(this.g).ax(new ayrs(this) { // from class: lqk
            public final /* synthetic */ lql a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj2) {
                if (i2 == 0) {
                    lql lqlVar = this.a;
                    whu.G(lqlVar.d, orz.a(lqlVar.a.getResources(), ((Integer) obj2).intValue()));
                } else {
                    lql lqlVar2 = this.a;
                    lqlVar2.e(lqlVar2.e, ((Boolean) obj2).booleanValue());
                    lqlVar2.d();
                }
            }
        }));
        this.f.e(ajokVar);
    }
}
