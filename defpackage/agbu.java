package defpackage;

import android.content.Context;
import android.widget.RemoteViews;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class agbu implements ayrv {
    public final /* synthetic */ Context a;
    private final /* synthetic */ int b;

    public /* synthetic */ agbu(Context context, int i) {
        this.b = i;
        this.a = context;
    }

    @Override // defpackage.ayrv
    public final Object a(Object obj) {
        if (this.b == 0) {
            return new RemoteViews(this.a.getPackageName(), R.layout.notification_survey_five_options);
        }
        return Integer.valueOf(lux.aH(this.a, ((Boolean) obj).booleanValue()));
    }
}
