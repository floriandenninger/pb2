package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akgx extends ajpc {
    public final CheckBox a;
    public String b;
    private final View c;

    public akgx(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.subscription_notification_secondary_option, (ViewGroup) null);
        this.c = inflate;
        CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.checkbox);
        this.a = checkBox;
        checkBox.setClickable(false);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: akgv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                akgx.this.a.toggle();
            }
        });
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.b = null;
        this.a.setOnCheckedChangeListener(null);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        avaj avajVar = (avaj) obj;
        int i = avajVar.b;
        String str = (i & 32) != 0 ? avajVar.f : null;
        str.getClass();
        this.b = str;
        if ((i & 4) != 0) {
            aqygVar = avajVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        Spanned b = ajcq.b(aqygVar);
        this.a.setText(b);
        this.a.setContentDescription(b);
        final akgr akgrVar = (akgr) ajokVar.c(akgr.o);
        this.a.setOnCheckedChangeListener(null);
        if (akgrVar.d()) {
            this.c.setEnabled(false);
            this.c.setAlpha(0.5f);
            this.a.setEnabled(false);
            this.a.setChecked(false);
        } else {
            this.c.setEnabled(true);
            this.c.setAlpha(1.0f);
            this.a.setEnabled(true);
            this.a.setChecked(akgrVar.e(this.b));
        }
        this.a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: akgw
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                akgrVar.a(akgx.this.b, z);
            }
        });
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((avaj) obj).c.I();
    }
}
