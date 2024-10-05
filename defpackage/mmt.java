package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mmt implements ayrv {
    private final /* synthetic */ int v;
    public static final /* synthetic */ mmt u = new mmt(20);
    public static final /* synthetic */ mmt t = new mmt(19);
    public static final /* synthetic */ mmt s = new mmt(18);
    public static final /* synthetic */ mmt r = new mmt(17);
    public static final /* synthetic */ mmt q = new mmt(16);
    public static final /* synthetic */ mmt p = new mmt(15);
    public static final /* synthetic */ mmt o = new mmt(14);
    public static final /* synthetic */ mmt n = new mmt(13);
    public static final /* synthetic */ mmt m = new mmt(12);
    public static final /* synthetic */ mmt l = new mmt(11);
    public static final /* synthetic */ mmt k = new mmt(10);
    public static final /* synthetic */ mmt j = new mmt(9);
    public static final /* synthetic */ mmt i = new mmt(8);
    public static final /* synthetic */ mmt h = new mmt(7);
    public static final /* synthetic */ mmt g = new mmt(6);
    public static final /* synthetic */ mmt f = new mmt(5);
    public static final /* synthetic */ mmt e = new mmt(4);
    public static final /* synthetic */ mmt d = new mmt(3);
    public static final /* synthetic */ mmt c = new mmt(2);
    public static final /* synthetic */ mmt b = new mmt(1);
    public static final /* synthetic */ mmt a = new mmt(0);

    private /* synthetic */ mmt(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ayrv
    public final Object a(Object obj) {
        Integer num;
        switch (this.v) {
            case 0:
                return (aypy) obj;
            case 1:
                return (Boolean) ((Optional) obj).map(mjq.a).orElse(Boolean.FALSE);
            case 2:
                aakt aaktVar = ((aakz) obj).c;
                aaktVar.getClass();
                return aaktVar;
            case 3:
                return (aakt) ((ammv) obj).c();
            case 4:
                return (aakt) ((ammv) obj).c();
            case 5:
                return ((aakz) obj).c;
            case 6:
                return Boolean.valueOf(((ahcu) obj).a());
            case 7:
                ammv ammvVar = (ammv) obj;
                if (ammvVar.h()) {
                }
                return 17;
            case 8:
                return Boolean.valueOf(((fhg) obj).j());
            case 9:
                int i2 = nrn.c;
                aakt aaktVar2 = ((aakz) obj).c;
                aaktVar2.getClass();
                return aaktVar2;
            case 10:
                asyr asyrVar = (asyr) obj;
                agaj agajVar = new agaj();
                String panelId = asyrVar.getPanelId();
                if (panelId != null) {
                    agajVar.b = panelId;
                    agajVar.a = Integer.valueOf(asyrVar.getActiveItemIndex().intValue());
                    String str = agajVar.b;
                    if (str == null || (num = agajVar.a) == null) {
                        StringBuilder sb = new StringBuilder();
                        if (agajVar.b == null) {
                            sb.append(" panelId");
                        }
                        if (agajVar.a == null) {
                            sb.append(" itemIndex");
                        }
                        String valueOf = String.valueOf(sb);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                        sb2.append("Missing required properties:");
                        sb2.append(valueOf);
                        throw new IllegalStateException(sb2.toString());
                    }
                    return new ntw(str, num.intValue());
                }
                throw new NullPointerException("Null panelId");
            case 11:
                return Boolean.valueOf(!((fhg) obj).b());
            case 12:
                fhg fhgVar = (fhg) obj;
                return Boolean.valueOf((fhgVar == fhg.WATCH_WHILE_PICTURE_IN_PICTURE || fhgVar == fhg.VIRTUAL_REALITY_FULLSCREEN) ? false : true);
            case 13:
                aakt aaktVar3 = ((aakz) obj).c;
                aaktVar3.getClass();
                return aaktVar3;
            case 14:
                return Optional.of((ammw) obj);
            case 15:
                return (aakt) ((ammv) obj).c();
            case 16:
                return (nqg) ((ammv) obj).c();
            case 17:
                return ((nxv) obj).v();
            case 18:
                return ((nxv) obj).y();
            case 19:
                return Boolean.valueOf(((ammv) obj).h());
            default:
                return (aypn) obj;
        }
    }
}
