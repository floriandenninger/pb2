package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class udo implements udm {
    public udp a;

    @Override // defpackage.udm
    public final udn a(String str, aoit aoitVar) {
        return this.a.a("/v1/batchupdatethreadstate", str, aoitVar, aoiu.a);
    }

    @Override // defpackage.udm
    public final udn b(String str, aoiv aoivVar) {
        return this.a.a("/v1/createusersubscription", str, aoivVar, aoiw.a);
    }

    @Override // defpackage.udm
    public final udn c(String str, aoix aoixVar) {
        return this.a.a("/v1/deleteusersubscription", str, aoixVar, aoiy.a);
    }

    @Override // defpackage.udm
    public final udn d(String str, aoiz aoizVar) {
        return this.a.a("/v1/fetchlatestthreads", str, aoizVar, aoja.a);
    }

    @Override // defpackage.udm
    public final udn e(String str, aojb aojbVar) {
        return this.a.a("/v1/fetchupdatedthreads", str, aojbVar, aojc.a);
    }

    @Override // defpackage.udm
    public final udn f(String str, aojd aojdVar) {
        return this.a.a("/v1/removetarget", str, aojdVar, aoje.a);
    }

    @Override // defpackage.udm
    public final udn g(String str, aojf aojfVar) {
        return this.a.a("/v1/setuserpreference", str, aojfVar, aojg.a);
    }

    @Override // defpackage.udm
    public final udn h(String str, aojh aojhVar) {
        return this.a.a("/v1/storetarget", str, aojhVar, aoji.a);
    }

    @Override // defpackage.udm
    public final udn i(aojj aojjVar) {
        return this.a.a("/v1/updatethreadstatebytoken", null, aojjVar, aojk.a);
    }
}
