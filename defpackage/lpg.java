package defpackage;

import android.content.Context;
import android.widget.CheckBox;
import android.widget.TextView;
import com.google.android.apps.youtube.app.settings.presenter.TimeRangeView;
import com.google.protos.youtube.api.innertube.SettingRenderer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lpg {
    public final Context a;
    public TimeRangeView b;
    public TextView c;
    public CheckBox d;

    public lpg(Context context) {
        this.a = context;
    }

    public final void a(auqa auqaVar) {
        for (aulq aulqVar : auqaVar.d) {
            if (aulqVar.pY(SettingRenderer.a)) {
                this.d.getClass();
                aupu aupuVar = (aupu) aulqVar.pX(SettingRenderer.a);
                this.d.setChecked(aupuVar.f);
                CheckBox checkBox = this.d;
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
