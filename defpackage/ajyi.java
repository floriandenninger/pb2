package defpackage;

import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajyi implements View.OnClickListener {
    public String a;
    private final ajyo b;

    public ajyi(ajyo ajyoVar) {
        this.b = ajyoVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int length;
        ajyo ajyoVar = this.b;
        if (ajyoVar != null) {
            String str = this.a;
            if (ajyoVar.g.getSelectionEnd() >= 0) {
                length = ajyoVar.g.getSelectionEnd();
            } else {
                length = ajyoVar.g.getText().length();
            }
            ajyoVar.g.getEditableText().insert(length, ajyoVar.c.e(str));
            aqss aqssVar = (aqss) ajyoVar.c.a.get(str);
            if (aqssVar == null || !aqssVar.g) {
                ajyoVar.e.clear();
                ajyoVar.d.e();
                ajyoVar.d.a(ajyoVar.c.e(str), ajyoVar.c.b(str), ajyoVar.a.getResources().getDimension(R.dimen.emoji_height), str, ajyoVar.g.getId(), ajyoVar.e, null);
            } else {
                ajyoVar.j = true;
                ajyoVar.e(ajyoVar.g.getEditableText());
                ajyoVar.j = false;
            }
        }
    }
}
