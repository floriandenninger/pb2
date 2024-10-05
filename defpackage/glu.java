package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class glu extends glw {
    public final TextView a;
    final /* synthetic */ glx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public glu(glx glxVar, View view) {
        super(glxVar, view);
        this.b = glxVar;
        this.a = (TextView) view.findViewById(R.id.description);
    }

    @Override // defpackage.glw
    public final void a(int i) {
        Map map;
        super.a(i);
        gou gouVar = this.g;
        gouVar.getClass();
        if (this.a != null && (map = this.b.b.b) != null && map.containsKey(gouVar)) {
            this.a.setText(((Integer) this.b.b.b.get(gouVar)).intValue());
        }
        if (this.c != null) {
            if (this.b.b.a() == gouVar) {
                this.d.setBackgroundColor(wbs.Q(this.b.b.getContext(), R.attr.yt10PercentLayer));
            }
            int dimension = (int) this.b.b.getResources().getDimension(R.dimen.upload_activity_privacy_popup_vertical_padding);
            int i2 = i == 0 ? dimension : 0;
            if (i != this.b.getCount() - 1) {
                dimension = 0;
            }
            this.c.setPadding(0, i2, 0, dimension);
        }
    }
}
