package defpackage;

import android.os.Handler;
import com.google.protos.youtube.api.innertube.LiveChatAction;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abgr extends abgv {
    private Queue g;
    private final abgq h;
    private long i;
    private long j;
    private boolean k;

    public abgr(Handler handler, abge abgeVar, abgd abgdVar, abgq abgqVar) {
        super(handler, abgeVar, abgdVar);
        this.h = abgqVar;
    }

    @Override // defpackage.abgv, defpackage.abgg
    public final synchronized void a(List list, long j) {
        if (this.g == null) {
            return;
        }
        this.i = Long.MIN_VALUE;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            apxf apxfVar = (apxf) it.next();
            if (apxfVar.pY(LiveChatAction.ReplayChatItemAction.replayChatItemAction)) {
                LiveChatAction.ReplayChatItemAction replayChatItemAction = (LiveChatAction.ReplayChatItemAction) apxfVar.pX(LiveChatAction.ReplayChatItemAction.replayChatItemAction);
                this.g.add(replayChatItemAction);
                long j2 = replayChatItemAction.c;
                if (j2 > this.i) {
                    this.i = j2;
                }
            }
        }
        this.k = true;
        g(this.j);
    }

    public final synchronized void f(long j) {
        this.j = j;
        this.i = Long.MIN_VALUE;
        ((abht) this.a).d.mX();
        this.g.clear();
        abgq abgqVar = this.h;
        Runnable runnable = new Runnable() { // from class: abgp
            @Override // java.lang.Runnable
            public final void run() {
                ((abht) abgr.this.a).b.q();
            }
        };
        List<asrc> list = ((abht) abgqVar).f;
        if (list != null) {
            for (asrc asrcVar : list) {
                if ((asrcVar.b & 16) != 0) {
                    ((abht) abgqVar).f = null;
                    abhq abhqVar = ((abht) abgqVar).m;
                    auah auahVar = asrcVar.g;
                    if (auahVar == null) {
                        auahVar = auah.a;
                    }
                    abjp o = abhqVar.d.o();
                    if (o != null) {
                        o.A();
                    }
                    aone createBuilder = asox.a.createBuilder();
                    createBuilder.copyOnWrite();
                    asox asoxVar = (asox) createBuilder.instance;
                    asoxVar.b |= 2;
                    asoxVar.c = j;
                    asox asoxVar2 = (asox) createBuilder.build();
                    ajce o2 = ahbj.o(auahVar);
                    aayw d = abhqVar.d.j.d();
                    d.d(o2);
                    d.a = asoxVar2;
                    d.m(auahVar.d.I());
                    abhqVar.m(d, ((ajch) o2).b, runnable);
                    this.k = false;
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0154 A[Catch: all -> 0x0191, TryCatch #0 {, blocks: (B:4:0x0005, B:9:0x000b, B:11:0x001b, B:18:0x002b, B:20:0x0033, B:22:0x0040, B:26:0x0049, B:28:0x004f, B:30:0x005b, B:32:0x006e, B:34:0x00ea, B:37:0x00f3, B:39:0x0074, B:40:0x0080, B:42:0x0088, B:44:0x0098, B:46:0x00d8, B:54:0x0102, B:55:0x0105, B:59:0x010b, B:61:0x0113, B:62:0x0117, B:64:0x011d, B:67:0x0129, B:69:0x012d, B:70:0x012f, B:71:0x0135, B:73:0x013b, B:75:0x0143, B:79:0x014b, B:81:0x0154, B:82:0x0157, B:84:0x015e, B:85:0x0162, B:87:0x0168, B:90:0x0174, B:92:0x017c, B:93:0x017e, B:103:0x018c), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015e A[Catch: all -> 0x0191, TryCatch #0 {, blocks: (B:4:0x0005, B:9:0x000b, B:11:0x001b, B:18:0x002b, B:20:0x0033, B:22:0x0040, B:26:0x0049, B:28:0x004f, B:30:0x005b, B:32:0x006e, B:34:0x00ea, B:37:0x00f3, B:39:0x0074, B:40:0x0080, B:42:0x0088, B:44:0x0098, B:46:0x00d8, B:54:0x0102, B:55:0x0105, B:59:0x010b, B:61:0x0113, B:62:0x0117, B:64:0x011d, B:67:0x0129, B:69:0x012d, B:70:0x012f, B:71:0x0135, B:73:0x013b, B:75:0x0143, B:79:0x014b, B:81:0x0154, B:82:0x0157, B:84:0x015e, B:85:0x0162, B:87:0x0168, B:90:0x0174, B:92:0x017c, B:93:0x017e, B:103:0x018c), top: B:3:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void g(long r21) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abgr.g(long):void");
    }

    @Override // defpackage.abgv, defpackage.abgg, defpackage.abqd
    public final synchronized void mU() {
        this.k = false;
    }

    @Override // defpackage.abgg, defpackage.abqd
    public final synchronized void mV() {
        this.k = true;
    }

    @Override // defpackage.abgv, defpackage.abgg, defpackage.abqd
    public final synchronized void mW() {
        this.g = new ArrayDeque();
        this.j = 0L;
        this.k = true;
        this.i = Long.MIN_VALUE;
    }

    @Override // defpackage.abgv, defpackage.abgg, defpackage.abqd
    public final synchronized void mX() {
        this.g = null;
        this.k = false;
    }
}
