package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ufu {
    public final ufh a;
    public final ujf b;
    public final aoso c;
    public final aoso d;
    public final ujx e;
    public final uht f;

    public ufu(ufh ufhVar, ujf ujfVar, aoso aosoVar, ujx ujxVar, uht uhtVar) {
        this.a = ufhVar;
        this.b = ujfVar;
        aosn aosnVar = (aosn) aosoVar.toBuilder();
        aost aostVar = aost.WILL_SWITCH_TO_A_DIFFERENT_ACCOUNT_EVENT;
        aosnVar.copyOnWrite();
        ((aoso) aosnVar.instance).n(aostVar);
        this.c = (aoso) aosnVar.build();
        aosn aosnVar2 = (aosn) aosoVar.toBuilder();
        aost aostVar2 = aost.SWITCHED_TO_A_DIFFERENT_ACCOUNT_EVENT;
        aosnVar2.copyOnWrite();
        ((aoso) aosnVar2.instance).n(aostVar2);
        this.d = (aoso) aosnVar2.build();
        this.e = ujxVar;
        this.f = uhtVar;
    }
}
