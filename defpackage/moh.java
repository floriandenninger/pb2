package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class moh implements ajom {
    mwz a;
    mpm b;
    ajom c;
    private final ViewGroup d;
    private final ogx e;
    private final akht f;

    public moh(Context context, akht akhtVar, ogx ogxVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f = akhtVar;
        this.e = ogxVar;
        this.d = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.drawer_list, (ViewGroup) null);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.d;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        mpm mpmVar = this.b;
        if (mpmVar != null) {
            mpmVar.b(ajosVar);
        }
        mwz mwzVar = this.a;
        if (mwzVar != null) {
            mwzVar.b(ajosVar);
        }
    }

    @Override // defpackage.ajom
    public final /* synthetic */ void oB(ajok ajokVar, Object obj) {
        auok auokVar = (auok) obj;
        auokVar.getClass();
        ajom ajomVar = this.c;
        if (ajomVar != null) {
            ajomVar.a().setVisibility(8);
        }
        if (ajokVar.j("is_horizontal_drawer_context", false)) {
            if (this.b == null) {
                ViewGroup viewGroup = (ViewGroup) ((ViewStub) this.d.findViewById(R.id.horizontal_drawer_stub)).inflate();
                ogx ogxVar = this.e;
                ((Context) ogxVar.b.get()).getClass();
                ajvb ajvbVar = (ajvb) ogxVar.a.get();
                ajvbVar.getClass();
                aahd aahdVar = (aahd) ogxVar.c.get();
                aahdVar.getClass();
                ajoy ajoyVar = (ajoy) ogxVar.d.get();
                ajoyVar.getClass();
                viewGroup.getClass();
                this.b = new mpm(ajvbVar, aahdVar, ajoyVar, viewGroup);
            }
            this.c = this.b;
        } else {
            if (this.a == null) {
                ViewGroup viewGroup2 = (ViewGroup) ((ViewStub) this.d.findViewById(R.id.vertical_drawer_stub)).inflate();
                akht akhtVar = this.f;
                Context context = (Context) ((axqs) akhtVar.b).a;
                context.getClass();
                ajut ajutVar = (ajut) akhtVar.a.get();
                ajutVar.getClass();
                ajvb ajvbVar2 = (ajvb) akhtVar.e.get();
                ajvbVar2.getClass();
                fte fteVar = (fte) akhtVar.c.get();
                ajoy ajoyVar2 = (ajoy) akhtVar.d.get();
                ajoyVar2.getClass();
                viewGroup2.getClass();
                this.a = new mwz(context, ajutVar, ajvbVar2, fteVar, ajoyVar2, viewGroup2);
            }
            this.c = this.a;
        }
        this.c.oB(ajokVar, auokVar);
        this.c.a().setVisibility(0);
    }
}
