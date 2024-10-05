package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public class amex extends BroadcastReceiver {
    public static final amxj a = amxj.l("com/google/apps/tiktok/receiver/IntentFilterAcledReceiver");
    private final Class b;

    /* JADX INFO: Access modifiers changed from: protected */
    public amex(Class cls) {
        this.b = cls;
    }

    public static final void b(anhy anhyVar) {
        if (anhyVar.isCancelled()) {
            return;
        }
        uqq.l(amjk.f(new amew(anhyVar, 3)));
    }

    /* JADX WARN: Finally extract failed */
    private final anhy c(Context context) {
        anhy N;
        amil l = amjw.l("getEntryPoint");
        try {
            try {
                N = anaf.O(alta.t(context, this.b));
            } catch (IllegalStateException e) {
                N = anaf.N(new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e));
            }
            l.a(N);
            l.close();
            getResultCode();
            l = amjw.l("handleBroadcast");
            try {
                anhy i = anfq.i(N, amjk.c(new anfz() { // from class: ameu
                    @Override // defpackage.anfz
                    public final anhy a(Object obj) {
                        anhy e2 = amex.this.a(obj).a.e();
                        e2.getClass();
                        return e2;
                    }
                }), angq.a);
                l.a(i);
                l.close();
                if (!i.isDone()) {
                    BroadcastReceiver.PendingResult goAsync = goAsync();
                    goAsync.getClass();
                    i.d(amjk.f(new amev(goAsync, 0)), angq.a);
                }
                return i;
            } finally {
                try {
                    l.close();
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public amgp a(Object obj) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0089, code lost:
    
        if (r0.activityInfo.exported != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008d, code lost:
    
        r3 = r9.getPackageManager();
        r5 = r10.setComponent(null).cloneFilter();
        r5.setSelector(null);
        r5.setPackage(r9.getPackageName());
        r3 = r3.queryBroadcastReceivers(r5, 64).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b1, code lost:
    
        if (r3.hasNext() == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b3, code lost:
    
        r5 = r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c1, code lost:
    
        if (r1.equals(r5.activityInfo.name) == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c3, code lost:
    
        r1 = r5.filter;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d0, code lost:
    
        if (r1.matchAction(r10.getAction()) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00da, code lost:
    
        if (r1.matchCategories(r10.getCategories()) != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00dc, code lost:
    
        r1 = r1.matchData(r10.getType(), r10.getScheme(), r10.getData());
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ed, code lost:
    
        if (r1 == (-1)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f0, code lost:
    
        if (r1 == (-2)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f8, code lost:
    
        throw new defpackage.uzn(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fe, code lost:
    
        throw new defpackage.uzn(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0104, code lost:
    
        throw new defpackage.uzn(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0105, code lost:
    
        r3 = r9.getPackageManager();
        r5 = defpackage.uzo.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010b, code lost:
    
        monitor-enter(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x010e, code lost:
    
        if (defpackage.uzo.b != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0110, code lost:
    
        r6 = new android.content.Intent();
        r6.setPackage(r9.getPackageName());
        defpackage.uzo.b = r3.queryBroadcastReceivers(r6, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0122, code lost:
    
        r3 = defpackage.uzo.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0124, code lost:
    
        monitor-exit(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0125, code lost:
    
        r3 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x012d, code lost:
    
        if (r3.hasNext() == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013d, code lost:
    
        if (r1.equals(((android.content.pm.ResolveInfo) r3.next()).activityInfo.name) != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0145, code lost:
    
        throw new defpackage.uzn(r10);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9, types: [amij, amir] */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceive(android.content.Context r9, android.content.Intent r10) {
        /*
            Method dump skipped, instructions count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amex.onReceive(android.content.Context, android.content.Intent):void");
    }
}
