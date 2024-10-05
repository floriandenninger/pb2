package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.apps.youtube.app.settings.presenter.TimeRangeView;
import com.google.protos.youtube.api.innertube.SettingRenderer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lpk {
    public TimeRangeView a;
    public final Context b;
    public TextView c;
    public RadioButton d;
    public RadioButton e;
    public View f;
    public CheckBox g;
    public final ansv h;

    public lpk(Context context, ansv ansvVar, byte[] bArr) {
        this.b = context;
        this.h = ansvVar;
    }

    public final void a(auqa auqaVar) {
        for (aulq aulqVar : auqaVar.d) {
            if (aulqVar.pY(SettingRenderer.a)) {
                this.g.getClass();
                aupu aupuVar = (aupu) aulqVar.pX(SettingRenderer.a);
                this.g.setChecked(aupuVar.f);
                CheckBox checkBox = this.g;
                aqyg aqygVar = aupuVar.d;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
                checkBox.setText(ajcq.b(aqygVar));
                return;
            }
        }
    }
}
