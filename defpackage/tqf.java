package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class tqf implements amml {
    private final /* synthetic */ int u;
    public static final /* synthetic */ tqf t = new tqf(19);
    public static final /* synthetic */ tqf s = new tqf(18);
    public static final /* synthetic */ tqf r = new tqf(17);
    public static final /* synthetic */ tqf q = new tqf(16);
    public static final /* synthetic */ tqf p = new tqf(15);
    public static final /* synthetic */ tqf o = new tqf(14);
    public static final /* synthetic */ tqf n = new tqf(13);
    public static final /* synthetic */ tqf m = new tqf(12);
    public static final /* synthetic */ tqf l = new tqf(11);
    public static final /* synthetic */ tqf k = new tqf(10);
    public static final /* synthetic */ tqf j = new tqf(9);
    public static final /* synthetic */ tqf i = new tqf(8);
    public static final /* synthetic */ tqf h = new tqf(7);
    public static final /* synthetic */ tqf g = new tqf(6);
    public static final /* synthetic */ tqf f = new tqf(5);
    public static final /* synthetic */ tqf e = new tqf(4);
    public static final /* synthetic */ tqf d = new tqf(3);
    public static final /* synthetic */ tqf c = new tqf(2);
    public static final /* synthetic */ tqf b = new tqf(1);
    public static final /* synthetic */ tqf a = new tqf(0);

    public /* synthetic */ tqf(int i2) {
        this.u = i2;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        switch (this.u) {
            case 0:
                aone builder = ((tlb) obj).toBuilder();
                builder.copyOnWrite();
                ((tlb) builder.instance).d = tlb.emptyProtobufList();
                return (tlb) builder.build();
            case 1:
                aone builder2 = ((tlb) obj).toBuilder();
                builder2.clear();
                return (tlb) builder2.build();
            case 2:
                return false;
            case 3:
                return false;
            case 4:
                return false;
            case 5:
                return false;
            case 6:
                return true;
            case 7:
                return true;
            case 8:
                return true;
            case 9:
                return true;
            case 10:
                return false;
            case 11:
                return false;
            case 12:
                return true;
            case 13:
                return true;
            case 14:
                return true;
            case 15:
                return true;
            case 16:
                aone builder3 = ((tlj) obj).toBuilder();
                builder3.clear();
                return (tlj) builder3.build();
            case 17:
                return ammv.j((InputStream) obj);
            case 18:
                return amlr.a;
            case 19:
                return amlr.a;
            default:
                ammv ammvVar = (ammv) obj;
                ammvVar.h();
                return ammvVar;
        }
    }
}
