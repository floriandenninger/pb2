package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oib extends ajxi {
    private final aasm a;
    private final azrw f;
    private final azrw g;
    private final azrw h;
    private final ohx i;
    private final Context j;
    private final ajfh k;
    private final ajfh l;
    private final ypa m;
    private final ajvb n;
    private final ammv o;
    private final agqo p;
    private final c q;
    private final ajyw r;
    private final ajyw s;

    public oib(Context context, jas jasVar, ypa ypaVar, ajvb ajvbVar, zaw zawVar, acra acraVar, azrw azrwVar, azrw azrwVar2, azrw azrwVar3, ohx ohxVar, agqo agqoVar, ajyw ajywVar, ajyw ajywVar2, ajfh ajfhVar, ajfh ajfhVar2, ammv ammvVar, c cVar, ajyw ajywVar3, ajti ajtiVar, ajti ajtiVar2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super(jasVar, ypaVar, ajvbVar, zawVar, acraVar, ajtiVar, ajtiVar2, ajywVar3, null);
        this.j = context;
        this.m = ypaVar;
        this.n = ajvbVar;
        this.a = jasVar;
        this.f = azrwVar;
        this.g = azrwVar2;
        this.h = azrwVar3;
        this.i = ohxVar;
        this.p = agqoVar;
        this.r = ajywVar;
        this.s = ajywVar2;
        this.k = ajfhVar;
        this.l = ajfhVar2;
        this.q = cVar;
        this.o = ammvVar;
    }

    @Override // defpackage.ajxi, defpackage.ajvd
    public final ajvc a(Object obj, ajxe ajxeVar, ajwx ajwxVar) {
        ajvj ajvjVar;
        if (obj instanceof aalz) {
            aalz aalzVar = (aalz) obj;
            if (xph.y(aalzVar)) {
                ajvjVar = this.p.a(this.a, this.d, ajxeVar);
            } else if (!ohq.r(aalzVar)) {
                if (aalzVar == null || !ofh.c(aalzVar.a)) {
                    ajvjVar = (ajvj) this.f.get();
                } else {
                    ajvjVar = (ajvj) this.h.get();
                }
            } else {
                ajvjVar = (ajvj) this.g.get();
            }
            ajvjVar.i(aalzVar);
            ajvjVar.lC().mK(new ajup(this.b));
            return ajvjVar;
        }
        if (obj instanceof auwd) {
            ohw a = this.i.a((auwd) obj);
            a.f();
            return a;
        }
        if (obj instanceof ausu) {
            ausu ausuVar = (ausu) obj;
            ausw auswVar = ausuVar.r;
            if (auswVar == null) {
                auswVar = ausw.a;
            }
            if ((auswVar.b & 2) != 0) {
                ausw auswVar2 = ausuVar.r;
                if (auswVar2 == null) {
                    auswVar2 = ausw.a;
                }
                arcz arczVar = auswVar2.d;
                if (arczVar == null) {
                    arczVar = arcz.a;
                }
                lto f = this.q.f(arczVar, this.c);
                if ((arczVar.b & 128) != 0) {
                    arda ardaVar = arczVar.f;
                    if (ardaVar == null) {
                        ardaVar = arda.a;
                    }
                    int dX = amkq.dX(ardaVar.b);
                    if (dX != 0 && dX == 4) {
                        return this.s.m(ausuVar, arczVar, f, ajxeVar);
                    }
                }
                ltq l = this.r.l(ausuVar, arczVar, f, ajxeVar);
                int dimensionPixelSize = this.j.getResources().getDimensionPixelSize(R.dimen.watch_next_horizontal_grid_padding);
                l.d.mK(new ajns(dimensionPixelSize, dimensionPixelSize));
                return l;
            }
        }
        if (obj instanceof aaly) {
            ausu ausuVar2 = ((aaly) obj).a;
            ajvb ajvbVar = this.n;
            ypa ypaVar = this.m;
            arfa h = akbc.h(ausuVar2);
            ajuo b = b(ausuVar2);
            ajfh ajfhVar = this.k;
            ammv ammvVar = this.o;
            Context context = this.j;
            int bu = aobq.bu(ausuVar2.s);
            if (bu == 0) {
                bu = 1;
            }
            return new ohl(ajvbVar, ypaVar, ausuVar2, h, b, ajfhVar, ammvVar, ajxeVar, new lya(context, bu, 0));
        }
        if (obj instanceof aamj) {
            ausu ausuVar3 = ((aamj) obj).a;
            return new ohp(this.n, this.m, ausuVar3, akbc.i(ausuVar3), this.l, ajxeVar);
        }
        return super.a(obj, ajxeVar, ajwxVar);
    }
}
