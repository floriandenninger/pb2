package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import com.google.android.youtube.R;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afno implements afnm {
    public final akpi a;
    ajwi b;
    private final Context c;
    private final ajoy d;
    private final ajvb e;
    private final ajvq f;
    private final acqz g;
    private final zaw h;
    private final aaea i;
    private final aypn j;
    private final akpf k;
    private final ypa l;
    private final ajxi m;
    private final acpz n;
    private afnt o;
    private RecyclerView p;
    private String q;
    private final ajkn r;

    public afno(ajoy ajoyVar, ajvb ajvbVar, ajvq ajvqVar, ypa ypaVar, ajxj ajxjVar, acqz acqzVar, zaw zawVar, aaea aaeaVar, aypn aypnVar, akpq akpqVar, acpz acpzVar, ajkn ajknVar, Context context, akpf akpfVar, akpr akprVar, byte[] bArr) {
        this.c = context;
        this.d = ajoyVar;
        this.e = ajvbVar;
        this.f = ajvqVar;
        this.l = ypaVar;
        this.m = ajxjVar.a(aasm.n, acqzVar.mM());
        this.g = acqzVar;
        this.h = zawVar;
        this.i = aaeaVar;
        this.j = aypnVar;
        this.n = acpzVar;
        this.r = ajknVar;
        akpi b = akpqVar.b(akprVar);
        this.a = b;
        this.k = akpfVar;
        b.a().ay(new ayrs() { // from class: afnn
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                afno.this.i((akps) obj);
            }
        }, new zxi(11));
    }

    private static boolean j(akps akpsVar) {
        if (akpsVar == null || akpsVar.a() == null || akpsVar.a().a().isEmpty()) {
            return true;
        }
        if (akpsVar.a().a().size() == 1 && (akpsVar.a().a().get(0) instanceof aalz)) {
            return ((aalz) akpsVar.a().a().get(0)).b().isEmpty();
        }
        return false;
    }

    private final void k(int i) {
        l(i, -1);
    }

    private final void l(int i, int i2) {
        acpx acpxVar = new acpx(i - 1, 15);
        if (i2 != -1) {
            aone createBuilder = aqwx.a.createBuilder();
            aone createBuilder2 = ardr.a.createBuilder();
            createBuilder2.copyOnWrite();
            ardr ardrVar = (ardr) createBuilder2.instance;
            ardrVar.b |= 1;
            ardrVar.c = i2;
            createBuilder.copyOnWrite();
            aqwx aqwxVar = (aqwx) createBuilder.instance;
            ardr ardrVar2 = (ardr) createBuilder2.build();
            ardrVar2.getClass();
            aqwxVar.h = ardrVar2;
            aqwxVar.b |= 256;
            acpxVar.a = (aqwx) createBuilder.build();
        }
        this.n.c(acpxVar, aqxl.FLOW_TYPE_HASHTAG_SUGGESTIONS, this.q);
    }

    @Override // defpackage.afnm
    public final afnq a(int i) {
        if (i < 0 || i >= this.b.f.a()) {
            return null;
        }
        return new afnr(((ajds) this.b.f.c(i)).a);
    }

    @Override // defpackage.afnm
    public final void b(String str) {
        this.a.c(str);
        k(6);
    }

    @Override // defpackage.afnm
    public final void c(int i) {
        l(4, i);
    }

    /* JADX WARN: Type inference failed for: r14v0, types: [ajos, java.lang.Object] */
    @Override // defpackage.afnm
    public final void d(afnt afntVar, RecyclerView recyclerView) {
        this.o = afntVar;
        this.p = recyclerView;
        this.p.setPadding(0, this.c.getResources().getDimensionPixelSize(R.dimen.user_mention_suggestions_list_padding_top), 0, 0);
        this.p.setClipToPadding(false);
        this.p.ae(null);
        this.p.setMotionEventSplittingEnabled(false);
        this.b = new ajwi(null, this.p, this.d, this.f, aasm.n, this.l, this.m, this.h, this.g.mM(), this.e.get(), ajxa.WI, ajwk.d, this.i, this.j);
    }

    @Override // defpackage.afnm
    public final void e() {
        this.q = this.r.b(16);
        k(2);
        try {
            akps akpsVar = (akps) ((anhv) this.k.a("")).b;
            if (j(akpsVar)) {
                return;
            }
            i(akpsVar);
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // defpackage.afnm
    public final void f() {
        this.a.b();
        k(3);
    }

    @Override // defpackage.afnm
    public final boolean g() {
        return true;
    }

    @Override // defpackage.afnm
    public final boolean h() {
        return false;
    }

    public final void i(akps akpsVar) {
        boolean isEmpty = this.b.f.isEmpty();
        boolean j = j(akpsVar);
        if (j) {
            this.p.setVisibility(4);
            this.b.h();
        } else {
            this.p.setVisibility(0);
            this.b.M(akpsVar.a());
        }
        this.o.d(j);
        if (isEmpty && !j) {
            k(5);
        }
        k(7);
    }
}
