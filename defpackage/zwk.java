package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zwk extends wv {
    final /* synthetic */ zwo t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zwk(zwo zwoVar, View view) {
        super(view);
        this.t = zwoVar;
        this.a.setOnClickListener(new View.OnClickListener() { // from class: zwj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                zwk zwkVar = zwk.this;
                if (zwkVar.t.d != null) {
                    int b = zwkVar.b();
                    if (zwkVar.t.C(b)) {
                        zwkVar.t.d.a();
                    } else if (b != -1) {
                        zwo zwoVar2 = zwkVar.t;
                        zwoVar2.d.b(zwoVar2, b);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zwp E() {
        View view = this.a;
        if (view instanceof zwp) {
            return (zwp) view;
        }
        return null;
    }
}
