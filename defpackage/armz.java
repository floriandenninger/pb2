package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class armz extends aonm implements aooz {
    private static volatile aopf T;
    public static final armz a;
    public int A;
    public int B;
    public int C;
    public int D;
    public float E;
    public float F;
    public int G;
    public float H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public atgp f108J;
    public int K;
    public int L;
    public int M;
    public String N;
    public int O;
    public aomf P;
    public int Q;
    public long R;
    public atne S;
    private axbg U;
    public int b;
    public int c;
    public int d;
    public boolean g;
    public astw k;
    public aonu n;
    public aony o;
    public int p;
    public int q;
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;
    public String w;
    public int x;
    public arna y;
    public int z;
    public String e = "";
    public String f = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public String l = "";
    public String m = "";

    static {
        armz armzVar = new armz();
        a = armzVar;
        aonm.registerDefaultInstance(armz.class, armzVar);
    }

    private armz() {
        emptyIntList();
        this.n = emptyIntList();
        emptyIntList();
        emptyIntList();
        this.o = emptyProtobufList();
        this.r = "";
        this.s = "";
        this.t = "";
        this.u = "";
        this.v = "";
        this.w = "";
        this.N = "";
        this.P = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001*\u0000\u0003\u0001b*\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0003\bဈ\u0014\u000bဇ\u0002\fဈ\u001f\rဈ!\u0010ဌ\u0018\u0011ဈ\u001a\u0012ဈ$\u0013ဈ%\u0015ဈ\u0001\u0016ဈ\u0004\u0019ဈ\u0015\"ဈ\u0007#ဌ1%င3&င4'ခ7(ခ8)င9.ဌ?/ဉ\u001c1ဉ@2ငA4ဌD7င58င6=ဌ*>ဉ.@င\u0019Aခ:B\u0016CငFJဉ\nNဌMPဈGTညPV\u001b^ဌS_ဂTaဉUbဈ ", new Object[]{"b", "c", "d", "e", "h", "l", "g", "s", "u", "p", army.a(), "r", "v", "w", "f", "i", "m", "j", "z", armv.b, "A", "B", "E", "F", "G", "I", armx.a(), "U", "J", "K", "L", armw.a(), "C", "D", "x", apue.a(), "y", "q", "H", "n", "M", "k", "O", apew.d, "N", "P", "o", anrw.class, "Q", atmk.a(), "R", "S", "t"});
            case NEW_MUTABLE_INSTANCE:
                return new armz();
            case NEW_BUILDER:
                return new aone((float[][][]) null, (char[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = T;
                if (aopfVar == null) {
                    synchronized (armz.class) {
                        aopfVar = T;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            T = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
