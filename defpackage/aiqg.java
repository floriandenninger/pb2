package defpackage;

import android.net.Uri;
import android.os.Looper;
import com.google.android.libraries.youtube.innertube.model.player.PlaybackLoggingPayloadModel;
import com.google.android.libraries.youtube.innertube.model.player.TrackingUrlModel;
import com.google.android.libraries.youtube.player.stats.PlaybackTrackingUrlPingClient$PlaybackTrackingUrlPingClientState;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiqg {
    public final amnv a;
    public final String b;
    public final acpl c;
    public final amnv d;
    public boolean e;
    public long f;
    private final afuh g;
    private final ysy h;
    private final afqj i;
    private final PriorityQueue j;
    private final PriorityQueue k;
    private final Executor l;
    private final aaea m;
    private final ahbx n;

    /* JADX INFO: Access modifiers changed from: protected */
    public aiqg(afuh afuhVar, ysy ysyVar, afqj afqjVar, amnv amnvVar, List list, List list2, String str, Executor executor, ahbx ahbxVar, acpl acplVar, aaea aaeaVar, amnv amnvVar2, byte[] bArr, byte[] bArr2) {
        this.g = afuhVar;
        this.h = ysyVar;
        this.i = afqjVar;
        this.a = amnvVar;
        this.j = new PriorityQueue(list);
        this.k = new PriorityQueue(list2);
        str.getClass();
        this.b = str;
        this.l = executor;
        this.n = ahbxVar;
        this.c = acplVar;
        this.m = aaeaVar;
        this.d = amnvVar2;
    }

    public final synchronized PlaybackTrackingUrlPingClient$PlaybackTrackingUrlPingClientState a() {
        return new PlaybackTrackingUrlPingClient$PlaybackTrackingUrlPingClientState(this.j, this.k, this.b);
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.Map, java.lang.Object] */
    public final void b(TrackingUrlModel trackingUrlModel, long j) {
        zhy b = zhy.b(trackingUrlModel.c());
        for (aaph aaphVar : trackingUrlModel.c) {
            yjk.e();
            aaph aaphVar2 = aaph.MS;
            int ordinal = aaphVar.ordinal();
            if (ordinal == 0) {
                for (Map.Entry entry : this.a.get().entrySet()) {
                    b.h((String) entry.getKey(), (String) entry.getValue());
                }
            } else if (ordinal == 2) {
                this.i.d(b);
            } else if (ordinal == 3) {
                b.h("cpn", this.b);
            } else if (ordinal == 4) {
                b.k("conn", this.h.a());
            } else if (ordinal == 5) {
                b.h("cmt", String.valueOf(j / 1000));
            }
        }
        Uri a = b.a();
        if (this.n.b(a)) {
            a = this.n.a(a);
        }
        acub acubVar = new acub(trackingUrlModel, 1);
        String.valueOf(String.valueOf(a)).length();
        afug d = afuh.d("remarketing");
        d.b(a);
        d.d = true;
        d.a(acubVar);
        this.g.a(d, afxi.a);
    }

    public final synchronized void c(aheg ahegVar) {
        PlaybackLoggingPayloadModel playbackLoggingPayloadModel;
        final TrackingUrlModel trackingUrlModel;
        if (ahegVar.j()) {
            this.f = ahegVar.e();
            while (this.j.size() > 0 && (trackingUrlModel = (TrackingUrlModel) this.j.peek()) != null) {
                long j = this.f;
                if (trackingUrlModel.b.length() <= 0 || trackingUrlModel.b(0) * 1000 > j) {
                    break;
                }
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    this.l.execute(new Runnable() { // from class: aiqe
                        @Override // java.lang.Runnable
                        public final void run() {
                            aiqg aiqgVar = aiqg.this;
                            aiqgVar.b(trackingUrlModel, aiqgVar.f);
                        }
                    });
                } else {
                    b(trackingUrlModel, this.f);
                }
                this.j.remove();
            }
            while (!this.k.isEmpty() && (playbackLoggingPayloadModel = (PlaybackLoggingPayloadModel) this.k.peek()) != null) {
                if (playbackLoggingPayloadModel.b * 1000 > this.f) {
                    break;
                }
                atwq a = atwr.a();
                String str = this.b;
                a.copyOnWrite();
                atwr.c((atwr) a.instance, str);
                aomf aomfVar = playbackLoggingPayloadModel.a;
                a.copyOnWrite();
                atwr.d((atwr) a.instance, aomfVar);
                atwr atwrVar = (atwr) a.build();
                arpn a2 = arpp.a();
                a2.copyOnWrite();
                ((arpp) a2.instance).dv(atwrVar);
                this.c.c((arpp) a2.build());
                this.k.remove();
            }
            if (!this.e) {
                atys atysVar = this.m.a().j;
                if (atysVar == null) {
                    atysVar = atys.a;
                }
                if (atysVar.p) {
                    this.e = true;
                    this.l.execute(new Runnable() { // from class: aiqd
                        /* JADX WARN: Type inference failed for: r1v14, types: [java.util.Map, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Map, java.lang.Object] */
                        @Override // java.lang.Runnable
                        public final void run() {
                            aiqg aiqgVar = aiqg.this;
                            aiqgVar.a.get();
                            String str2 = null;
                            if (aiqgVar.a.get().entrySet() != null) {
                                Iterator it = aiqgVar.a.get().entrySet().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    Map.Entry entry = (Map.Entry) it.next();
                                    if (entry != null && entry.getValue() != null && "ms".equalsIgnoreCase((String) entry.getKey())) {
                                        str2 = (String) entry.getValue();
                                        break;
                                    }
                                }
                            }
                            boolean z = true;
                            if (str2 != null) {
                                try {
                                    if (!((Boolean) aiqgVar.d.get()).booleanValue()) {
                                        atfu a3 = atfv.a();
                                        String str3 = aiqgVar.b;
                                        a3.copyOnWrite();
                                        atfv.c((atfv) a3.instance, str3);
                                        a3.copyOnWrite();
                                        atfv.d((atfv) a3.instance, str2);
                                        atfv atfvVar = (atfv) a3.build();
                                        arpn a4 = arpp.a();
                                        a4.copyOnWrite();
                                        ((arpp) a4.instance).dk(atfvVar);
                                        z = aiqgVar.c.c((arpp) a4.build());
                                    }
                                } catch (Exception unused) {
                                    z = false;
                                }
                            }
                            aiqgVar.e = z;
                        }
                    });
                }
            }
        }
    }
}
