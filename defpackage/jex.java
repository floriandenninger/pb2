package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class jex implements adue {
    protected final Context a;
    protected final azrw b;
    protected ViewGroup c;
    protected TextView d;
    protected TextView e;
    protected boolean f;
    protected adub g = adub.a().a();

    /* JADX INFO: Access modifiers changed from: protected */
    public jex(Context context, azrw azrwVar) {
        this.a = context;
        this.b = azrwVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String b(adub adubVar) {
        int i = adubVar.e;
        int i2 = adubVar.d;
        return (i >= i2 || i2 == 0) ? "" : this.a.getString(R.string.mdx_minibar_queue_status, String.valueOf(i + 1), String.valueOf(adubVar.d));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(ViewGroup viewGroup) {
        throw null;
    }
}
