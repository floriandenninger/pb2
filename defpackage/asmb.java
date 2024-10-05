package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asmb extends aonm implements aooz {
    private static volatile aopf B;
    public static final asmb a;
    public asmh A;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean i;
    public boolean j;
    public boolean m;
    public boolean n;
    public int o;
    public boolean s;
    public int t;
    public int v;
    public asmd w;
    public asmg x;
    public asmi y;
    public asmj z;
    public String f = "";
    public String g = "";
    public String h = "";
    public String k = "";
    public String l = "";
    public String p = "";
    public String q = "";
    public String r = "";
    public String u = "";

    static {
        asmb asmbVar = new asmb();
        a = asmbVar;
        aonm.registerDefaultInstance(asmb.class, asmbVar);
    }

    private asmb() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0017\u0000\u0003\u0001V\u0017\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0004\u0004ဈ\u0002\u0006ဇ\t\bဈ\u000b\tဇ\u000f\u000fင\u0017\u0011ဇ\u0011\u0013ဈ\u0019\u0016ဉ3\u0018ဉ5\u001fဈ\" ဇ#+င(,ဈ)6ဉ?7ဇ\u0005Gဌ.KဉFLဈ\u000eNဈ\u001bVဉG", new Object[]{"b", "c", "d", "e", asmn.a(), "f", "h", "g", "j", "k", "m", "o", "n", "p", "w", "x", "r", "s", "t", "u", "y", "i", "v", asje.d, "z", "l", "q", "A"});
            case NEW_MUTABLE_INSTANCE:
                return new asmb();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = B;
                if (aopfVar == null) {
                    synchronized (asmb.class) {
                        aopfVar = B;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            B = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
