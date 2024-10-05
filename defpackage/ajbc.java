package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajbc implements ajay {
    public final ajay a;
    final /* synthetic */ ajbf b;

    public ajbc(ajbf ajbfVar, ajay ajayVar) {
        this.b = ajbfVar;
        this.a = ajayVar;
    }

    @Override // defpackage.ajay
    public final void a() {
        ajbf ajbfVar = this.b;
        ajay ajayVar = this.a;
        ajayVar.getClass();
        ajbfVar.a(new ajaz(ajayVar, 1));
    }

    @Override // defpackage.ajay
    public final void b(final PlayerResponseModel playerResponseModel, final String str) {
        this.b.a(new Runnable() { // from class: ajbb
            @Override // java.lang.Runnable
            public final void run() {
                ajbc ajbcVar = ajbc.this;
                ajbcVar.a.b(playerResponseModel, str);
            }
        });
    }

    @Override // defpackage.ajay
    public final void c() {
        ajbf ajbfVar = this.b;
        ajay ajayVar = this.a;
        ajayVar.getClass();
        ajbfVar.a(new ajaz(ajayVar, 0));
    }

    @Override // defpackage.ajay
    public final void d() {
        this.b.a(new Runnable() { // from class: ajba
            @Override // java.lang.Runnable
            public final void run() {
                ajbc.this.a.d();
            }
        });
    }
}
