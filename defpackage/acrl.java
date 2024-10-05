package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class acrl extends aahi {
    private final aahd a;
    private final String d;
    private final aong e;

    public acrl(aahd aahdVar, apxf apxfVar, String str) {
        super(aahdVar, null, apxfVar, false);
        this.a = aahdVar;
        this.e = apxfVar != null ? (aong) apxfVar.toBuilder() : null;
        this.d = str;
    }

    @Override // defpackage.aahi, android.text.style.ClickableSpan
    public final void onClick(View view) {
        if (this.e != null) {
            if (this.d != null) {
                aone createBuilder = atmc.a.createBuilder();
                String str = this.d;
                createBuilder.copyOnWrite();
                atmc atmcVar = (atmc) createBuilder.instance;
                str.getClass();
                atmcVar.b |= 1;
                atmcVar.c = str;
                this.e.e(atmb.b, (atmc) createBuilder.build());
            }
            this.a.c((apxf) this.e.build(), null);
        }
    }
}
