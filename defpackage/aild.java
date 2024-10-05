package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aild implements aijo, abdr {
    private final Context a;
    protected anhy b = anaf.O(false);
    public boolean c;
    public aila d;
    private final aifs e;
    private WeakReference f;

    public aild(Context context, aifs aifsVar) {
        this.a = context;
        this.e = aifsVar;
    }

    private final Boolean f() {
        if (!this.b.isDone()) {
            this.b = anaf.O(false);
            return false;
        }
        return (Boolean) ynm.h(this.b, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.aigr h(defpackage.aryi r14, java.lang.String r15) {
        /*
            int r0 = r14.c
            int r0 = defpackage.anaf.bG(r0)
            r1 = 1
            if (r0 != 0) goto La
            r0 = 1
        La:
            r2 = 2
            r3 = 0
            r4 = 3
            if (r0 != r2) goto L12
            r6 = 2
        L10:
            r7 = 0
            goto L32
        L12:
            if (r0 == r4) goto L30
            r5 = 7
            if (r0 != r5) goto L18
            goto L30
        L18:
            boolean r0 = defpackage.ahbx.m(r14)
            if (r0 == 0) goto L2e
            int r0 = r14.c
            int r0 = defpackage.anaf.bG(r0)
            r3 = 5
            if (r0 != 0) goto L28
            goto L2b
        L28:
            if (r0 != r3) goto L2b
            r3 = 6
        L2b:
            r6 = r3
            r7 = 1
            goto L32
        L2e:
            r6 = 1
            goto L10
        L30:
            r6 = 3
            goto L10
        L32:
            aigr r0 = new aigr
            aryg r3 = r14.f
            if (r3 != 0) goto L3a
            aryg r3 = defpackage.aryg.a
        L3a:
            int r3 = r3.b
            r5 = 109608350(0x6887d9e, float:5.134209E-35)
            if (r3 != r5) goto L5a
            aryg r3 = r14.f
            if (r3 != 0) goto L47
            aryg r3 = defpackage.aryg.a
        L47:
            int r8 = r3.b
            if (r8 != r5) goto L50
            java.lang.Object r3 = r3.c
            atwk r3 = (defpackage.atwk) r3
            goto L52
        L50:
            atwk r3 = defpackage.atwk.a
        L52:
            boolean r3 = r3.b
            if (r1 == r3) goto L58
            r8 = 3
            goto L5b
        L58:
            r8 = 2
            goto L5b
        L5a:
            r8 = 1
        L5b:
            java.lang.String r9 = r14.d
            aryh r1 = r14.g
            if (r1 != 0) goto L63
            aryh r1 = defpackage.aryh.a
        L63:
            int r1 = r1.b
            r2 = 58356580(0x37a7364, float:7.360086E-37)
            if (r1 != r2) goto L7c
            aryh r14 = r14.g
            if (r14 != 0) goto L70
            aryh r14 = defpackage.aryh.a
        L70:
            int r1 = r14.b
            if (r1 != r2) goto L79
            java.lang.Object r14 = r14.c
            atyq r14 = (defpackage.atyq) r14
            goto L7d
        L79:
            atyq r14 = defpackage.atyq.a
            goto L7d
        L7c:
            r14 = 0
        L7d:
            r13 = r14
            r10 = 0
            r12 = 0
            r5 = r0
            r11 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aild.h(aryi, java.lang.String):aigr");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(aryi aryiVar, ykl yklVar, String str) {
        aile.a(yklVar, h(aryiVar, str));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(aryi aryiVar, ykl yklVar, String str) {
        aila ailaVar = this.d;
        if (ailaVar == null) {
            aile.a(yklVar, h(aryiVar, str));
            return;
        }
        ailaVar.c = aryiVar.e;
        ailaVar.d = aryiVar.d;
        ailaVar.e = ahbx.i(aryiVar);
        aikz aikzVar = new aikz(ailaVar, new ailc(this, aryiVar, yklVar, str), ailaVar.b, ailaVar.e);
        ailaVar.f = new AlertDialog.Builder(ailaVar.a).setTitle(ailaVar.c).setMessage(ailaVar.d).setPositiveButton(R.string.confirm, aikzVar).setNegativeButton(R.string.cancel, aikzVar).setOnCancelListener(aikzVar).show();
        l(ailaVar);
    }

    protected void d() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e() {
    }

    public final aigr i(String str) {
        return new aigr(1, this.a.getString(R.string.unplayable_reason_unknown), str);
    }

    public final ailf j() {
        WeakReference weakReference = this.f;
        if (weakReference != null) {
            return (ailf) weakReference.get();
        }
        return null;
    }

    public final void k(aryi aryiVar, ykl yklVar, String str) {
        if (aryiVar == null) {
            aile.a(yklVar, i(str));
            return;
        }
        if (ahbx.l(aryiVar) || ahbx.k(aryiVar)) {
            aigf g = this.e.g();
            if (ahbx.j(aryiVar) || g != aigf.BACKGROUND) {
                yklVar.b(null, aile.a);
                d();
                return;
            } else {
                aile.a(yklVar, new aigr(13, this.a.getString(R.string.audio_unavailable), str));
                return;
            }
        }
        if (ahbx.m(aryiVar)) {
            ailf j = j();
            if (j != null) {
                j.b();
            }
            c(aryiVar, yklVar, str);
            return;
        }
        aile.a(yklVar, h(aryiVar, str));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void l(ailf ailfVar) {
        this.f = new WeakReference(ailfVar);
    }

    @Override // defpackage.abdr
    public final void no(abdu abduVar) {
        abduVar.E = f().booleanValue();
        abduVar.D = this.c;
    }

    @Override // defpackage.aijo
    public void qZ(aijr aijrVar) {
        final boolean booleanValue = f().booleanValue();
        aijrVar.u = booleanValue;
        aijrVar.t = this.c;
        aijrVar.d(new aijq() { // from class: ailb
            @Override // defpackage.aijq
            public final void a(afpi afpiVar) {
                aild aildVar = aild.this;
                boolean z = booleanValue;
                afpiVar.d("allowControversialContent", aildVar.c);
                afpiVar.d("allowAdultContent", z);
            }
        });
    }
}
