package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayly extends aybs {
    public final aybl b;
    private aybq c;

    public ayly(aybl ayblVar) {
        this.b = ayblVar;
    }

    @Override // defpackage.aybs
    public final void a(Status status) {
        aybq aybqVar = this.c;
        if (aybqVar != null) {
            aybqVar.b();
            this.c = null;
        }
        this.b.b(ayae.TRANSIENT_FAILURE, new aylv(aybm.b(status)));
    }

    @Override // defpackage.aybs
    public final void b(aybp aybpVar) {
        List list = aybpVar.a;
        aybq aybqVar = this.c;
        if (aybqVar == null) {
            aybl ayblVar = this.b;
            aybi aybiVar = new aybi();
            amkq.F(!list.isEmpty(), "addrs is empty");
            aybiVar.a = Collections.unmodifiableList(new ArrayList(list));
            aybj aybjVar = new aybj(aybiVar.a, aybiVar.b, aybiVar.c);
            aykk aykkVar = (aykk) ayblVar;
            aykkVar.c.o.d();
            amkq.O(!aykkVar.c.C, "Channel is being terminated");
            aybq aybqVar2 = new aybq(aykkVar.c, aybjVar, aykkVar);
            aylu ayluVar = new aylu(this, aybqVar2);
            aybqVar2.j.o.d();
            amkq.O(!aybqVar2.g, "already started");
            amkq.O(!aybqVar2.h, "already shutdown");
            amkq.O(!aybqVar2.j.C, "Channel is being terminated");
            aybqVar2.g = true;
            List list2 = aybqVar2.a.a;
            String b = aybqVar2.j.b();
            aykx aykxVar = aybqVar2.j;
            String str = aykxVar.r;
            aygi aygiVar = aykxVar.j;
            ScheduledExecutorService b2 = aygiVar.b();
            aydh aydhVar = aybqVar2.j.o;
            ayjj ayjjVar = new ayjj(aybqVar2, ayluVar);
            aykx aykxVar2 = aybqVar2.j;
            ayjp ayjpVar = new ayjp(list2, b, str, aygiVar, b2, aydhVar, ayjjVar, aykxVar2.H, aykxVar2.U.a(), aybqVar2.c, aybqVar2.d);
            ayfv ayfvVar = aybqVar2.j.F;
            ayau ayauVar = new ayau();
            ayauVar.a = "Child Subchannel started";
            ayauVar.b = ayav.CT_INFO;
            ayauVar.b(aybqVar2.j.n.a());
            ayauVar.c = ayjpVar;
            ayfvVar.b(ayauVar.a());
            aybqVar2.f = ayjpVar;
            ayay.a(aybqVar2.j.H.c, ayjpVar);
            aybqVar2.j.v.add(ayjpVar);
            this.c = aybqVar2;
            this.b.b(ayae.CONNECTING, new aylv(aybm.c(aybqVar2)));
            aybqVar2.a();
            return;
        }
        aybqVar.j.o.d();
        ayjp ayjpVar2 = aybqVar.f;
        list.getClass();
        ayjp.j(list);
        amkq.F(true ^ list.isEmpty(), "newAddressGroups is empty");
        ayjpVar2.e.execute(new ayjd(ayjpVar2, Collections.unmodifiableList(new ArrayList(list))));
    }

    @Override // defpackage.aybs
    public final void c() {
        aybq aybqVar = this.c;
        if (aybqVar != null) {
            aybqVar.b();
        }
    }
}
