package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class leu extends ajsu implements ypd {
    public final ajpd a;
    public final Handler b;
    public final Resources c;
    awcd d;
    public final RecyclerView e;
    public final ajwx f;
    public int g;
    public int h;
    public int i = 0;
    final View.OnClickListener j;
    private final ajoc k;
    private final ajnb l;
    private final int m;
    private final int n;
    private final int o;
    private final ajpd p;
    private final ajpd q;
    private final ldb r;
    private final lfu s;
    private final ypa t;
    private final Context u;
    private final ajun v;
    private boolean w;
    private boolean x;
    private boolean y;
    private final ajun z;

    /* JADX WARN: Removed duplicated region for block: B:155:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0349  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public leu(android.content.Context r1, defpackage.ajvb r2, defpackage.ypa r3, android.os.Handler r4, defpackage.ajun r5, defpackage.ajun r6, defpackage.awcd r7, android.support.v7.widget.RecyclerView r8, defpackage.ajwx r9, byte[] r10, byte[] r11, byte[] r12, byte[] r13) {
        /*
            Method dump skipped, instructions count: 979
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.leu.<init>(android.content.Context, ajvb, ypa, android.os.Handler, ajun, ajun, awcd, android.support.v7.widget.RecyclerView, ajwx, byte[], byte[], byte[], byte[]):void");
    }

    public static boolean d(awcc awccVar) {
        int Q;
        return awccVar.b == 122814739 && (Q = awxr.Q(((awcl) awccVar.c).k)) != 0 && Q == 3;
    }

    public final void b(boolean z) {
        if (this.r == null) {
            return;
        }
        if (z && zev.e(this.u)) {
            this.f.r().lX(new les(this));
        }
        if (this.d.pY(awbr.c) && ((Boolean) this.d.pX(awbr.c)).booleanValue()) {
            this.r.a = 1;
            this.l.h(Integer.MAX_VALUE);
        } else {
            this.r.a = 0;
            this.l.h(this.m);
        }
        this.q.l();
    }

    public final void c() {
        if (this.w) {
            boolean z = this.n == 0 || (this.d.pY(awbr.c) && ((Boolean) this.d.pX(awbr.c)).booleanValue()) || this.o > 0;
            if (z == this.p.isEmpty()) {
                if (z) {
                    this.p.add(this.s);
                } else {
                    this.p.clear();
                }
                this.p.l();
            }
        }
    }

    @Override // defpackage.ajsu, defpackage.zfk
    public final void j() {
        awcn awcnVar;
        awcn awcnVar2;
        this.t.m(this);
        awcj awcjVar = this.d.d;
        if (awcjVar == null) {
            awcjVar = awcj.a;
        }
        if (awcjVar.b == 122710540) {
            awcnVar = (awcn) awcjVar.c;
        } else {
            awcnVar = awcn.a;
        }
        if ((awcnVar.b & 512) != 0) {
            ajun ajunVar = this.z;
            awcj awcjVar2 = this.d.d;
            if (awcjVar2 == null) {
                awcjVar2 = awcj.a;
            }
            if (awcjVar2.b == 122710540) {
                awcnVar2 = (awcn) awcjVar2.c;
            } else {
                awcnVar2 = awcn.a;
            }
            String str = awcnVar2.l;
            if (str != null) {
                ajunVar.a.remove(str);
            }
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        awcx awcxVar;
        awcx awcxVar2;
        awcx awcxVar3;
        awce awceVar;
        awcx awcxVar4;
        int i2 = 0;
        if (i == -1) {
            return new Class[]{lda.class};
        }
        if (i == 0) {
            lda ldaVar = (lda) obj;
            int size = this.d.e.size();
            int i3 = this.g;
            if (size <= i3) {
                return null;
            }
            awda awdaVar = (awda) this.d.e.get(i3);
            if (awdaVar.b == 147633782) {
                awcxVar = (awcx) awdaVar.c;
            } else {
                awcxVar = awcx.a;
            }
            if (awcxVar.c.size() == 0 || this.h == ldaVar.a()) {
                return null;
            }
            awda awdaVar2 = (awda) this.d.e.get(this.g);
            if (awdaVar2.b == 147633782) {
                awcxVar2 = (awcx) awdaVar2.c;
            } else {
                awcxVar2 = awcx.a;
            }
            if (awcxVar2.c.size() <= ldaVar.a()) {
                return null;
            }
            awda awdaVar3 = (awda) this.d.e.get(this.g);
            if (awdaVar3.b == 147633782) {
                awcxVar3 = (awcx) awdaVar3.c;
            } else {
                awcxVar3 = awcx.a;
            }
            awcq awcqVar = (awcq) awcxVar3.c.get(ldaVar.a());
            if (awcqVar.b == 117337765) {
                awceVar = (awce) awcqVar.c;
            } else {
                awceVar = awce.a;
            }
            awcc[] awccVarArr = (awcc[]) awceVar.c.toArray(new awcc[0]);
            ArrayList arrayList = new ArrayList();
            for (awcc awccVar : awccVarArr) {
                arrayList.add(awccVar);
            }
            this.b.removeCallbacksAndMessages(null);
            this.a.m(juz.j);
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                int dimensionPixelSize = this.c.getDimensionPixelSize(R.dimen.watch_card_item_padding_top_bottom);
                int i5 = dimensionPixelSize + dimensionPixelSize;
                if (((awcc) arrayList.get(i4)).b != 153515154) {
                    if (d((awcc) arrayList.get(i4))) {
                        this.a.add(frd.a((int) (this.c.getDimensionPixelSize(R.dimen.watch_card_list_item_compact_thumbnail_width) / this.c.getFraction(R.fraction.rounded_aspect_ratio_16_9, 1, 1))));
                        if (i4 < arrayList.size() - 1) {
                            this.a.add(frd.a(this.c.getDimensionPixelSize(R.dimen.line_separator_height) + i5));
                        }
                    } else {
                        this.a.add(frd.a(((int) (this.c.getDimensionPixelSize(R.dimen.watch_card_list_item_thumbnail_width) / this.c.getFraction(R.fraction.rounded_aspect_ratio_16_9, 1, 1))) + i5));
                    }
                } else {
                    this.a.add(frd.a(((int) (this.c.getDimensionPixelSize(R.dimen.list_item_thumbnail_width) / this.c.getFraction(R.fraction.rounded_aspect_ratio_16_9, 1, 1))) + i5));
                }
            }
            int i6 = awceVar.b;
            if ((i6 & 2) != 0 && (i6 & 4) != 0) {
                ajpd ajpdVar = this.a;
                aqyg aqygVar = awceVar.e;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
                apxf apxfVar = awceVar.d;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                ajpdVar.add(new lfk(aqygVar, apxfVar));
            }
            int i7 = 0;
            while (i2 < arrayList.size()) {
                this.b.postDelayed(new leq(this, arrayList, i2, i7), i2 * 100);
                if (d((awcc) arrayList.get(i2)) && i2 < arrayList.size() - 1) {
                    i7++;
                }
                i2++;
                i7++;
            }
            this.h = ldaVar.a();
            aong aongVar = (aong) this.d.toBuilder();
            aongVar.e(awbr.b, Integer.valueOf(ldaVar.a()));
            awcd awcdVar = (awcd) aongVar.build();
            this.d = awcdVar;
            aone builder = ((awda) awcdVar.e.get(this.g)).toBuilder();
            awda awdaVar4 = (awda) builder.instance;
            if (awdaVar4.b == 147633782) {
                awcxVar4 = (awcx) awdaVar4.c;
            } else {
                awcxVar4 = awcx.a;
            }
            aong aongVar2 = (aong) awcxVar4.toBuilder();
            aongVar2.e(awbs.b, Integer.valueOf(this.h));
            aongVar2.e(awbs.c, true);
            awcx awcxVar5 = (awcx) aongVar2.build();
            builder.copyOnWrite();
            awda awdaVar5 = (awda) builder.instance;
            awcxVar5.getClass();
            awdaVar5.c = awcxVar5;
            awdaVar5.b = 147633782;
            this.a.o(awcxVar4, (awcx) awdaVar5.c);
            aong aongVar3 = (aong) this.d.toBuilder();
            aongVar3.cC(this.g, builder);
            this.d = (awcd) aongVar3.build();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.ajvc
    public final ajng lC() {
        return this.k;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void h(defpackage.awcq r8) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.leu.h(awcq):void");
    }
}
