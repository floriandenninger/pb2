package defpackage;

import java.util.EnumMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sci implements seu, sey {
    private static final amxj g = amxj.l("com/google/android/libraries/ar/faceviewer/components/logging/LoggingManager");
    private static final amrz h;
    public final long a;
    public final sbx b;
    public sev c;
    public final Map f;
    private boolean i = false;
    public String d = "";
    public int e = 0;

    static {
        amrw amrwVar = new amrw();
        amrwVar.g(sex.ASSET, sch.ASSET);
        amrwVar.g(sex.RENDER_INIT, sch.RENDER_INIT);
        amrwVar.g(sex.CAMERA_INIT, sch.CAMERA_INIT);
        amrwVar.g(sex.ASSET_DOWNLOAD, sch.ASSET_DOWNLOAD);
        amrwVar.g(sex.PROTO_DOWNLOAD_AND_INIT, sch.PROTO_DOWNLOAD_AND_INIT);
        amrwVar.g(sex.ASSET_SWITCH, sch.ASSET_SWITCH);
        h = amrwVar.c();
    }

    public sci(sbx sbxVar) {
        EnumMap enumMap = new EnumMap(sch.class);
        this.f = enumMap;
        this.b = sbxVar;
        this.a = new Random().nextLong();
        enumMap.put((EnumMap) sch.STARTUP, (sch) amnp.b(amlo.a));
        enumMap.put((EnumMap) sch.EXPERIENCE, (sch) amnp.b(amlo.a));
    }

    private final int h(sch schVar) {
        long a = ((amnp) this.f.get(schVar)).a(TimeUnit.MILLISECONDS);
        this.f.remove(schVar);
        return (int) a;
    }

    @Override // defpackage.sey
    public final void a(ansj ansjVar) {
        if (this.f.containsKey(sch.ASSET)) {
            int i = this.e;
            ansjVar.copyOnWrite();
            ((ansk) ansjVar.instance).r(i);
            if (this.f.containsKey(sch.ASSET)) {
                int h2 = h(sch.ASSET);
                ansjVar.copyOnWrite();
                ((ansk) ansjVar.instance).l(h2);
            }
            ansb a = ansc.a();
            String str = this.d;
            a.copyOnWrite();
            ansc.e((ansc) a.instance, str);
            if (this.f.containsKey(sch.ASSET_SWITCH)) {
                int h3 = h(sch.ASSET_SWITCH);
                a.copyOnWrite();
                ansc.g((ansc) a.instance, h3);
            }
            ansk anskVar = (ansk) ansjVar.build();
            a.copyOnWrite();
            ansc.f((ansc) a.instance, anskVar);
            sbx sbxVar = this.b;
            aone g2 = g();
            g2.copyOnWrite();
            ansq ansqVar = (ansq) g2.instance;
            ansc anscVar = (ansc) a.build();
            ansq ansqVar2 = ansq.a;
            anscVar.getClass();
            ansqVar.d = anscVar;
            ansqVar.c = 5;
            sbxVar.a(g2);
        }
    }

    @Override // defpackage.seu
    public final void b() {
        ansl anslVar = ansl.LEFT_BY_UNKNOWN;
        if (this.i) {
            ((amxh) ((amxh) g.g()).i("com/google/android/libraries/ar/faceviewer/components/logging/LoggingManager", "logLeftExperience", 231, "LoggingManager.java")).q("Already logged leaving experience.");
            return;
        }
        if (((amnp) this.f.get(sch.EXPERIENCE)).a) {
            ((amnp) this.f.get(sch.EXPERIENCE)).g();
        }
        long a = ((amnp) this.f.get(sch.EXPERIENCE)).a(TimeUnit.MILLISECONDS);
        ansm a2 = ansn.a();
        a2.copyOnWrite();
        ansn.c((ansn) a2.instance, (int) a);
        a2.copyOnWrite();
        ansn.d((ansn) a2.instance, anslVar);
        ansn ansnVar = (ansn) a2.build();
        sbx sbxVar = this.b;
        aone g2 = g();
        g2.copyOnWrite();
        ansq ansqVar = (ansq) g2.instance;
        ansq ansqVar2 = ansq.a;
        ansnVar.getClass();
        ansqVar.d = ansnVar;
        ansqVar.c = 8;
        sbxVar.a(g2);
        this.i = true;
    }

    @Override // defpackage.seu
    public final void c(sev sevVar) {
        this.c = sevVar;
    }

    @Override // defpackage.sey
    public final void d() {
        if (this.f.containsKey(sch.STARTUP) || this.f.containsKey(sch.CAMERA_INIT)) {
            ansf a = ansg.a();
            if (this.f.containsKey(sch.STARTUP)) {
                int h2 = h(sch.STARTUP);
                a.copyOnWrite();
                ansg.c((ansg) a.instance, h2);
            }
            if (this.f.containsKey(sch.CAMERA_INIT)) {
                int h3 = h(sch.CAMERA_INIT);
                a.copyOnWrite();
                ansg.g((ansg) a.instance, h3);
            }
            if (this.f.containsKey(sch.ASSET_DOWNLOAD)) {
                int h4 = h(sch.ASSET_DOWNLOAD);
                a.copyOnWrite();
                ansg.f((ansg) a.instance, h4);
            }
            if (this.f.containsKey(sch.PROTO_DOWNLOAD_AND_INIT)) {
                int h5 = h(sch.PROTO_DOWNLOAD_AND_INIT);
                a.copyOnWrite();
                ansg.i((ansg) a.instance, h5);
            }
            if (this.f.containsKey(sch.RENDER_INIT)) {
                int h6 = h(sch.RENDER_INIT);
                a.copyOnWrite();
                ansg.h((ansg) a.instance, h6);
            }
            sev sevVar = this.c;
            if (sevVar != null) {
                ansd ansdVar = ((scj) sevVar.e.b()).a;
                boolean z = true;
                if (ansdVar != ansd.GRANTED && ansdVar != ansd.DENIED) {
                    z = false;
                }
                a.copyOnWrite();
                ansg.d((ansg) a.instance, z);
                a.copyOnWrite();
                ansg.e((ansg) a.instance, ansdVar);
            }
            sbx sbxVar = this.b;
            aone g2 = g();
            ansg ansgVar = (ansg) a.build();
            g2.copyOnWrite();
            ansq ansqVar = (ansq) g2.instance;
            ansq ansqVar2 = ansq.a;
            ansgVar.getClass();
            ansqVar.d = ansgVar;
            ansqVar.c = 3;
            sbxVar.a(g2);
        }
    }

    @Override // defpackage.sey
    public final void e(sex sexVar) {
        Map map = this.f;
        amrz amrzVar = h;
        if (!map.containsKey(amrzVar.get(sexVar))) {
            amxj amxjVar = g;
            ((amxh) ((amxh) amxjVar.g()).i("com/google/android/libraries/ar/faceviewer/components/logging/LoggingManager", "timedEventCompleted", 96, "LoggingManager.java")).q("Timer doesn't exist for event, nothing to complete: ");
            ((amxh) ((amxh) amxjVar.g()).i("com/google/android/libraries/ar/faceviewer/components/logging/LoggingManager", "timedEventCompleted", 97, "LoggingManager.java")).p(sexVar);
            return;
        }
        if (((amnp) this.f.get(amrzVar.get(sexVar))).a) {
            ((amnp) this.f.get(amrzVar.get(sexVar))).g();
        } else {
            amxj amxjVar2 = g;
            ((amxh) ((amxh) amxjVar2.g()).i("com/google/android/libraries/ar/faceviewer/components/logging/LoggingManager", "timedEventCompleted", 104, "LoggingManager.java")).q("Timer not running for event, nothing to stop: ");
            ((amxh) ((amxh) amxjVar2.g()).i("com/google/android/libraries/ar/faceviewer/components/logging/LoggingManager", "timedEventCompleted", 105, "LoggingManager.java")).p(sexVar);
        }
        if (sexVar != sex.CAMERA_INIT || this.f.containsKey(sch.STARTUP)) {
            return;
        }
        d();
    }

    @Override // defpackage.sey
    public final void f(sex sexVar) {
        Map map = this.f;
        amrz amrzVar = h;
        if (map.containsKey(amrzVar.get(sexVar))) {
            amxj amxjVar = g;
            ((amxh) ((amxh) amxjVar.g()).i("com/google/android/libraries/ar/faceviewer/components/logging/LoggingManager", "timedEventStarted", 83, "LoggingManager.java")).q("Event already exists, resetting timer: ");
            ((amxh) ((amxh) amxjVar.g()).i("com/google/android/libraries/ar/faceviewer/components/logging/LoggingManager", "timedEventStarted", 84, "LoggingManager.java")).p(sexVar);
            ((amnp) this.f.get(amrzVar.get(sexVar))).e();
            ((amnp) this.f.get(amrzVar.get(sexVar))).f();
            return;
        }
        this.f.put((sch) amrzVar.get(sexVar), amnp.b(amlo.a));
    }

    public final aone g() {
        aone createBuilder = ansq.a.createBuilder();
        long j = this.a;
        createBuilder.copyOnWrite();
        ansq ansqVar = (ansq) createBuilder.instance;
        ansqVar.b |= 1;
        ansqVar.e = j;
        return createBuilder;
    }
}
