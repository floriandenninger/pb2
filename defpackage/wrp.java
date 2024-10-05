package defpackage;

import com.google.android.libraries.youtube.ads.model.InstreamAdImpl;
import java.util.concurrent.Executor;

/* compiled from: PG */
@wyr(b = apae.SLOT_TYPE_BELOW_PLAYER_IMMERSIVE, d = {xdw.class, xcx.class, xeg.class, xee.class})
/* loaded from: classes4.dex */
public final class wrp extends wqz {
    private final Executor a;
    private final Executor b;
    private final wyn c;
    private final xgh e;

    public wrp(wrd wrdVar, Executor executor, Executor executor2, wyn wynVar, xgh xghVar) {
        super(wrdVar);
        this.a = executor;
        this.b = executor2;
        this.c = wynVar;
        this.e = xghVar;
    }

    @Override // defpackage.wqz
    public final void a() {
        final anhy anhyVar = (anhy) this.e.d(xcx.class);
        final anhy anhyVar2 = (anhy) this.e.d(xcz.class);
        amml ammlVar = new amml() { // from class: wro
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                xgh xghVar = (xgh) obj;
                return wrp.this.b(xghVar, (InstreamAdImpl) xghVar.d(xds.class), anhyVar, anhyVar2, (anhy) xghVar.d(xeg.class), (anhy) xghVar.d(xee.class), (String) xghVar.d(xdw.class), (String) xghVar.d(xde.class), (xcf) xghVar.d(xcs.class));
            }
        };
        if (anhyVar2.isDone() || anhyVar.isDone()) {
            this.d.c(ammlVar);
        } else {
            this.d.a(ammlVar, this.a, this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x000f, code lost:
    
        if (true == defpackage.amkq.b(r2, defpackage.apxf.a)) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.xev b(defpackage.xgh r15, com.google.android.libraries.youtube.ads.model.InstreamAdImpl r16, defpackage.anhy r17, defpackage.anhy r18, defpackage.anhy r19, defpackage.anhy r20, java.lang.String r21, java.lang.String r22, defpackage.xcf r23) {
        /*
            r14 = this;
            r1 = r14
            r0 = 0
            java.lang.Object r2 = r19.get()     // Catch: java.lang.Throwable -> L14
            apxf r2 = (defpackage.apxf) r2     // Catch: java.lang.Throwable -> L14
            apxf r3 = defpackage.apxf.a     // Catch: java.lang.Throwable -> L12
            boolean r3 = defpackage.amkq.b(r2, r3)     // Catch: java.lang.Throwable -> L12
            r4 = 1
            if (r4 != r3) goto L12
            goto L14
        L12:
            r10 = r2
            goto L15
        L14:
            r10 = r0
        L15:
            java.lang.Object r2 = r20.get()     // Catch: java.lang.Throwable -> L1d
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Throwable -> L1d
            r11 = r2
            goto L1e
        L1d:
            r11 = r0
        L1e:
            java.lang.Object r2 = r18.get()     // Catch: java.util.concurrent.ExecutionException -> L60 java.lang.InterruptedException -> L62
            r9 = r2
            aplf r9 = (defpackage.aplf) r9     // Catch: java.util.concurrent.ExecutionException -> L60 java.lang.InterruptedException -> L62
            if (r9 != 0) goto L50
            java.lang.Object r2 = r17.get()     // Catch: java.util.concurrent.ExecutionException -> L47 java.lang.InterruptedException -> L49
            r9 = r2
            java.util.List r9 = (java.util.List) r9     // Catch: java.util.concurrent.ExecutionException -> L47 java.lang.InterruptedException -> L49
            if (r9 == 0) goto L46
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto L37
            goto L46
        L37:
            wyn r5 = r1.c
            r6 = r15
            r7 = r21
            r8 = r16
            r12 = r22
            r13 = r23
            xev r0 = r5.d(r6, r7, r8, r9, r10, r11, r12, r13)
        L46:
            return r0
        L47:
            r0 = move-exception
            goto L4a
        L49:
            r0 = move-exception
        L4a:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
            throw r2
        L50:
            wyn r5 = r1.c
            r6 = r15
            r7 = r21
            r8 = r16
            r12 = r22
            r13 = r23
            xev r0 = r5.c(r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        L60:
            r0 = move-exception
            goto L63
        L62:
            r0 = move-exception
        L63:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wrp.b(xgh, com.google.android.libraries.youtube.ads.model.InstreamAdImpl, anhy, anhy, anhy, anhy, java.lang.String, java.lang.String, xcf):xev");
    }
}
