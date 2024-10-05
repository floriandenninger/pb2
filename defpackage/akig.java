package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akig implements akky {
    public final ajjz a;
    public final List b;
    private final akif c;

    public akig(Context context, ajut ajutVar, ajjz ajjzVar, View view, View view2) {
        context.getClass();
        ajutVar.getClass();
        ajjzVar.getClass();
        this.a = ajjzVar;
        view.findViewById(R.id.select_message_shadow);
        this.c = new akif(this, view2);
        this.b = new ArrayList();
    }

    @Override // defpackage.akky
    public final void a(akkz akkzVar) {
        String str = akkzVar.e;
        if (TextUtils.equals(this.c.a.getText(), str)) {
            return;
        }
        this.c.a.setText(str);
    }
}
