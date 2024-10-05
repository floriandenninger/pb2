package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import j$.util.Optional;
import j$.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jgo {
    public static final String a = zga.a("MDX.AutonavController");
    public final fqu b;
    public final adlt c;
    public final adul d;
    public adlm e;
    public boolean f = false;
    public adub g;
    final jem h;
    public final adue i;
    private final RecyclerView j;

    public jgo(adlt adltVar, RecyclerView recyclerView, oix oixVar, adul adulVar) {
        this.c = adltVar;
        this.j = recyclerView;
        fqu fquVar = oixVar.c;
        fquVar.getClass();
        this.b = fquVar;
        this.h = new jem(new jgm(this));
        this.d = adulVar;
        this.i = new jgn(this);
        this.g = adulVar.i;
    }

    public final void b() {
        a();
        PlayerResponseModel playerResponseModel = this.g.k.a;
        if (playerResponseModel == null || ammx.e(playerResponseModel.y())) {
            this.h.c(false);
            return;
        }
        this.h.d(playerResponseModel, new jgk(this, playerResponseModel));
        this.h.c(true);
        Optional.ofNullable((LinearLayoutManager) this.j.n).ifPresent(new Consumer() { // from class: jgl
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                ((LinearLayoutManager) obj).aa(jgo.this.b.c.a() - 1, 0);
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void a() {
        int i = this.g.k.b;
        if (this.f) {
            if (i != 1) {
                this.h.b(true);
                boolean z = i == 2;
                this.h.a(z);
                if (z) {
                    return;
                }
                this.h.c(false);
                return;
            }
        }
        this.h.b(false);
    }
}
