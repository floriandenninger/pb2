package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aafj implements anfz {
    public final /* synthetic */ aafl a;
    public final /* synthetic */ tkf b;
    private final /* synthetic */ int c;

    public /* synthetic */ aafj(aafl aaflVar, tkf tkfVar, int i) {
        this.c = i;
        this.a = aaflVar;
        this.b = tkfVar;
    }

    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        tkg tkgVar;
        ammv ammvVar;
        Integer num;
        int i = this.c;
        if (i == 0) {
            aafl aaflVar = this.a;
            tkf tkfVar = this.b;
            tlk tlkVar = (tlk) aaflVar.b.get();
            tjz tjzVar = new tjz(null);
            aone builder = tkfVar.toBuilder();
            if ((tkfVar.b & 1024) != 0) {
                tkgVar = tkfVar.f;
                if (tkgVar == null) {
                    tkgVar = tkg.a;
                }
            } else {
                tkgVar = (tkg) tkd.a.e(tkg.a);
            }
            builder.copyOnWrite();
            tkf tkfVar2 = (tkf) builder.instance;
            tkgVar.getClass();
            tkfVar2.f = tkgVar;
            tkfVar2.b |= 1024;
            tkf tkfVar3 = (tkf) builder.build();
            if (tkfVar3 != null) {
                tjzVar.a = tkfVar3;
                tkf tkfVar4 = tjzVar.a;
                if (tkfVar4 == null) {
                    throw new IllegalStateException("Missing required properties: dataFileGroup");
                }
                return tlkVar.a(new tka(tkfVar4, tjzVar.b));
            }
            throw new NullPointerException("Null dataFileGroup");
        }
        if (i != 1) {
            aafl aaflVar2 = this.a;
            tkf tkfVar5 = this.b;
            aafk aafkVar = new aafk(aaflVar2);
            tlk tlkVar2 = (tlk) aaflVar2.b.get();
            tkm tkmVar = new tkm(null);
            tkmVar.g = 0;
            tkmVar.h = 2;
            String str = tkfVar5.c;
            if (str != null) {
                tkmVar.a = str;
                if ((tkfVar5.b & 1024) == 0) {
                    ammvVar = tkd.a;
                } else {
                    tkg tkgVar2 = tkfVar5.f;
                    if (tkgVar2 == null) {
                        tkgVar2 = tkg.a;
                    }
                    ammvVar = ammv.j(tkgVar2);
                }
                if (ammvVar != null) {
                    tkmVar.e = ammvVar;
                    tkmVar.f = ammv.j(aafkVar);
                    String str2 = tkmVar.a;
                    if (str2 == null || (num = tkmVar.g) == null || tkmVar.h == 0) {
                        StringBuilder sb = new StringBuilder();
                        if (tkmVar.a == null) {
                            sb.append(" groupName");
                        }
                        if (tkmVar.g == null) {
                            sb.append(" groupSizeBytes");
                        }
                        if (tkmVar.h == 0) {
                            sb.append(" showNotifications");
                        }
                        String valueOf = String.valueOf(sb);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                        sb2.append("Missing required properties:");
                        sb2.append(valueOf);
                        throw new IllegalStateException(sb2.toString());
                    }
                    tlkVar2.d(new tkn(str2, tkmVar.b, tkmVar.c, tkmVar.d, tkmVar.e, tkmVar.f, num.intValue(), tkmVar.h));
                    return anhv.a;
                }
                throw new NullPointerException("Null downloadConditionsOptional");
            }
            throw new NullPointerException("Null groupName");
        }
        aafl aaflVar3 = this.a;
        tkf tkfVar6 = this.b;
        if (((Boolean) obj).booleanValue()) {
            return anhv.a;
        }
        ((aafr) aaflVar3.d.get()).a(aqib.DATA_PUSH_CLIENT_EVENT_TYPE_ADD_FILE_GROUP_FAILED, tkfVar6.c);
        String valueOf2 = String.valueOf(tkfVar6.c);
        throw new IOException(valueOf2.length() != 0 ? "Unable to add filegroup: ".concat(valueOf2) : new String("Unable to add filegroup: "));
    }
}
